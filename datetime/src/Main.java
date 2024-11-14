import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/8/docs/api/index.html?java/time/format/DateTimeFormatter.html
        LocalDate d01 = LocalDate.now();
        LocalDate d02 = LocalDate.of(2020, 1, 1);
        LocalDateTime d03 = LocalDateTime.now();
        Instant d04 = Instant.now();

        LocalDate d05 = LocalDate.parse("2024-11-12");
        LocalDateTime d06 = LocalDateTime.parse("2024-11-12T22:36:26");
        Instant d07 = Instant.parse("2024-11-12T22:36:26Z");

        Instant d08 = Instant.parse("2024-11-12T22:36:26-03:00");

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07.toString());
        System.out.println(d08.toString());

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d09 = LocalDate.parse("20/02/1997", fmt01);

        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d10 = LocalDateTime.parse("20/02/1997 01:03", fmt02);

        System.out.println(d09.toString());
        System.out.println("D10: "+ d10.toString());

        LocalDate d11 = LocalDate.of(2024, 11, 13);
        System.out.println("D11: "+ d11.toString());


        System.out.println("-=-=-=-= Formatar data em texto =-=-=-=-=");
        LocalDate d12 = LocalDate.parse("2024-11-13");
        System.out.println(d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy G")));
        // Passando a hora dentro do DateTimeFormatter
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a").format(LocalDateTime.now()));
        // Imprimindo do instant
        // Horário Zulu formatando no padrão para texto
        System.out.println("Instant: " +
                DateTimeFormatter
                        .ofPattern("dd/MM/yyyy hh:mm a")
                        .withZone(ZoneId.systemDefault())
                        .format(Instant.parse("2024-01-24T06:20:22Z"))
        );

        System.out.println("Usando fomato já predefinido: "+ DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now()));


        System.out.println("\n\nOperações com data hora");

        LocalDate d13 = LocalDate.parse("2024-11-01");
        LocalDateTime d14 = LocalDateTime.parse("2024-11-01T22:26:30");
        Instant d15 = Instant.parse("2024-11-02T01:26:30Z");

        LocalDateTime pastWeek = d14.minusDays(7);
        LocalDateTime nextWeek = d14.plusDays(7);

        System.out.println("Data: " + d14.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a")));
        System.out.println("Semana Passada: " + pastWeek.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("Semana que vem: " + nextWeek.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        Instant pastWeekInstant = d15.plus(50, ChronoUnit.DAYS);
        System.out.println("Com o instant: "+
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm G")
                        .withZone(ZoneId.systemDefault())
                        .format(pastWeekInstant));

        System.out.println("Duração de datas");
        Duration duration01 = Duration.between(pastWeek, nextWeek);
        System.out.println("Duração entre as datas: " + duration01.toDays());

        Duration durationInstant = Duration.between(d15, pastWeekInstant);
        System.out.println("Duração entre as datas usando instant: " + durationInstant.toHours());

        Duration durationDateTime = Duration.between(d13.atTime(0,0, 5), d13.minusDays(6).atTime(2, 39, 14));
        System.out.println("Duração entre datas usando LocalDate com time: " + durationDateTime.toHours());

    }
}
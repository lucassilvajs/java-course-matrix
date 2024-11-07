package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area () {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c) );
    }

    public static class Employee {
        private String Name;
        private double GrossSalary;
        private final double Tax = 1000;

        public double NetSalary() {
            return  this.GrossSalary - this.Tax;
        }

        public void IncreaseSalary(double percentage) {
            this.GrossSalary = this.GrossSalary * (1 + percentage / 100);
        }

        public double getGrossSalary() {
            return GrossSalary;
        }

        public void setGrossSalary() {
            GrossSalary = grossSalary;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public double getTax() {
            return Tax;
        }
    }
}

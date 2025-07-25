package PersonelMaas;

public class MaasApp {
    public static void main(String[] args) {
        Employee ep1 = new Employee("Sukran", 2000, 1995, 45);
        Employee ep2= new Employee("Ishak", 1000, 2021, 30);
        Employee ep3 = new Employee("Kerem", 2500, 1970, 30);
        System.out.println(ep1.toString());
        System.out.println(ep2.toString());
        System.out.println(ep3.toString());
    }

    static class Employee {
        private final String name;
        private double salary;
        private final int workHours;
        private final int hireYear;
        private final int currentYear = 2021;

        public Employee(String name, double salary, int hireYear, int workHours) {
            this.name = name;
            this.salary = salary;
            this.hireYear = hireYear;
            this.workHours = workHours;
            raiseSalary();
            bonus();
            tax();
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", workHours=" + workHours +
                    ", hireYear=" + hireYear +

                    '}';
        }

         double tax() {
            if (this.salary >= 1000) {
                this.salary = this.salary*(1.03);
            }

            return this.salary;
        }

        double bonus() {
            if (this.workHours > 40) {
                this.salary += (this.workHours-40)*(30);
            }

            return this.salary;
        }

        double raiseSalary() {
            int workYear= this.currentYear-this.hireYear;
            if (workYear<10) {
                this.salary *= 1.05;
            } else if (workYear>=10 && workYear<20) {
                this.salary *= 1.1;
            }else {
                this.salary *= 1.15;
            }
            return 0;
        }
    }
}

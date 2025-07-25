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


}

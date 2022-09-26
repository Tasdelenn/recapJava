package OOP2Odev._09_Inheritence;

public class Main {

    public static void main(String[] args) {

        Customer customer013 = new Customer();
        Employee employee105 = new Employee();

        customer013.firstName = "Ali";
        customer013.lastName = "Karaca";
        customer013.id = 13;
        customer013.age = 35;
        customer013.phone = "555 435 67 67";
        customer013.email = "ali.karaca@gmail.com";

        employee105.firstName = "Ayşe" ;
        employee105.lastName = "Tuna";
        employee105.salary = 20000;

        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.Anket();
        customerManager1.List();
        customerManager1.Add();
        customerManager1.Remove();
        System.out.println("*************************************");

        EmployeeManager employeeManager1 = new EmployeeManager();
        employeeManager1.TheBestEmloyee();
        employeeManager1.List();
        employeeManager1.Add();
        employeeManager1.Remove();
        System.out.println("*************************************");

        PersonManager personManager1 = new PersonManager();
        personManager1.List();
        personManager1.Add();
        personManager1.Remove();
        System.out.println("*************************************");


    }
}

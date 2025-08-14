import domain.Employee;
import domain.Manager;
import domain.Saleman;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        printEmployee(new Manager());
//        printEmployee(new Saleman());


        Employee employee = new Employee();
        Manager manager = new Manager();
        Saleman saleman = new Saleman();

        System.out.println(saleman instanceof Saleman);
    }

//    public static void printEmployee(Employee employee){
//        System.out.printf("=====%s======\n", employee.getClass().getCanonicalName());
//        if (employee instanceof Manager manager){
//            employee.setCode("123");
//            employee.setName("joao");
//            manager.setLogin("joao");
//            manager.setSalary(5000.00);
//            manager.setPassword("123456");;
//            manager.setComission(150.00);
//            System.out.println(manager.getCode());
//            System.out.println(manager.getName());
//            System.out.println(manager.getLogin());
//            System.out.println(manager.getPassword());
//            System.out.println(manager.getSalary());
//            System.out.println(manager.getComission());
//        }
//        if (employee instanceof Saleman saleman){
//            saleman.setCode("1234");
//            saleman.setName("Lucas");
//            saleman.setSalary(2800.00);
//            saleman.setPercentPersoled(10);
//            saleman.setSoldAmount(1000);
//            System.out.println(saleman.getCode());
//            System.out.println(saleman.getName());
//            System.out.println(saleman.getSalary());
//            System.out.println(saleman.getPercentPersoled());
//            System.out.println(saleman.getSoldAmount());
//        }
//        System.out.println(employee.getFullSalary());
//        System.out.println(employee.getFullSalary(500));
//        System.out.println("=============");
//    }
}
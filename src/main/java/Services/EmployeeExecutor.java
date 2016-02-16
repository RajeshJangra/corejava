package Services;

import EntityModels.*;
import org.apache.log4j.Logger;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by kchoudhary on 25-Jan-16.
 */
public class EmployeeExecutor {
    final static Logger log = Logger.getLogger(ContactHandler.class);
    public EmployeeExecutor() throws ExecutionException, InterruptedException {

        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);

        ContactHandler contactHandler = new ContactHandler();
        Future<List<Contact>> contactFuture = poolExecutor.submit(contactHandler);
        List<Contact> contacts = contactFuture.get();

        PersonalDetailsHandler personalDetailsHandler = new PersonalDetailsHandler();
        Future<List<PersonalDetails>> personalDetailsFuture = poolExecutor.submit(personalDetailsHandler);
        List<PersonalDetails> personalDetails = personalDetailsFuture.get();

        SalaryHandler salaryHandler = new SalaryHandler();
        Future<List<Salary>> salaryFuture = poolExecutor.submit(salaryHandler);
        List<Salary> salary = salaryFuture.get();

        DepartmentHandler departmentHandler = new DepartmentHandler();
        Future<List<Department>> departmentFuture = poolExecutor.submit(departmentHandler);
        List<Department> departments = departmentFuture.get();

        ProjectHandler projectHandler = new ProjectHandler();
        Future<List<Project>> projectFuture = poolExecutor.submit(projectHandler);
        List<Project> projects = projectFuture.get();

    }

    public void printEmployeeData() throws Exception {

        System.out.println("Enter the employee id:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        List dataOfEmployee1 = new ArrayList();
        dataOfEmployee1.add(new ContactHandler().call().get(0));
        dataOfEmployee1.add(new PersonalDetailsHandler().call().get(0));
        dataOfEmployee1.add(new DepartmentHandler().call().get(0));
        dataOfEmployee1.add(new SalaryHandler().call().get(0));
        dataOfEmployee1.add(new ProjectHandler().call().get(0));
        dataOfEmployee1.add(new ProjectHandler().call().get(1));
        dataOfEmployee1.add(new ProjectHandler().call().get(2));

        List dataOfEmployee2 = new ArrayList();
        dataOfEmployee2.add(new ContactHandler().call().get(1));
        dataOfEmployee2.add(new PersonalDetailsHandler().call().get(1));
        dataOfEmployee2.add(new DepartmentHandler().call().get(1));
        dataOfEmployee2.add(new SalaryHandler().call().get(1));
        dataOfEmployee2.add(new ProjectHandler().call().get(3));


        Map<Integer, List> map = new HashMap<Integer, List>();
        map.put(1, dataOfEmployee1);
        map.put(2, dataOfEmployee2);

        if (id == 001) {
            List value = map.get(1);
            System.out.print("Employee " + new PersonalDetailsHandler().call().get(0).getId() + " age is : ");
            new AgeCalculator(new PersonalDetailsHandler().call().get(0).getDob());

            for (Object val : value) {
                log.info("Data of Employee with employee id " + id + " : " + val+
                        "\n-------------------------------------------------------------");
            }
        } else if (id == 002){
            List value = map.get(2);
            System.out.print("Employee " + new PersonalDetailsHandler().call().get(1).getId() + " age is : ");
            new AgeCalculator(new PersonalDetailsHandler().call().get(1).getDob());

            for (Object val : value) {
                log.info("Data of Employee with employee id " + id + " : " + val+
                        "\n-------------------------------------------------------------");
            }
        }else
        log.info("Invalid Employee ID");

        System.exit(0);

    }
}

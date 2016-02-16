package Main;

import Services.EmployeeExecutor;
import org.apache.log4j.BasicConfigurator;

/**
 * Created by kchoudhary on 27-Jan-16.
 */
public class EmployeeApplication {

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        EmployeeExecutor employeeExecutor = new EmployeeExecutor();
        employeeExecutor.printEmployeeData();
    }
}
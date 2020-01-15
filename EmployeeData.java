import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by admin on 10-Feb-19.
 */
public class EmployeeData {
    int salary, id;
    String name, department;
}

/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the
   standard library */

/* Do not add a namespace declaration */
class Main {
    public static Map<String,Integer> processData(ArrayList<String> array) {
        /*
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the appropriate value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
        Map<String,Integer> retVal = new HashMap<String,Integer>();
        Map<String, EmployeeData> values = new HashMap<String, EmployeeData>();

        for (int i=0; i<array.size(); i++) {
            String[] arr = array.get(i).split(", ");
            EmployeeData emp = new EmployeeData();
            emp.id = Integer.parseInt(arr[0]);
            emp.name = arr[1];
            emp.department = arr[2];
            emp.salary = Integer.parseInt(arr[3]);

            //System.out.println(emp.department + ": " + emp.salary);
            if (values.containsKey(emp.department)) {
                EmployeeData emp1 = values.get(emp.department);
                if (emp.id > emp1.id) {
                    values.replace(emp.department, emp);
                }
            } else {
                values.put(emp.department, emp);
            }
        }

        for(Map.Entry<String,EmployeeData> e: values.entrySet()) {
            EmployeeData employeeData = e.getValue();
            retVal.put(employeeData.department, employeeData.salary);
        }

        return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            //Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            Scanner in = new Scanner(System.in);
            //while(in.hasNextLine())
            for (int i=0; i<6; i++)
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                ///output.println(e.getKey() + ": " + e.getValue());
                System.out.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}

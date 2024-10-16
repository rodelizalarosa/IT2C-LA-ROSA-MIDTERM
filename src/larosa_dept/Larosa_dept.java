
package larosa_dept;

import static larosa_dept.config.connectDB;
import java.util.Scanner;
import Department.dept;

public class Larosa_dept {

    public static void main(String[] args) {

            Scanner sc = new Scanner (System.in);
            String response;
            
        do{
                
            Larosa_dept Dept = new Larosa_dept();    
                
            System.out.println("-------------------------------");
            System.out.println("        DEPARTMENT             ");
            System.out.println("-------------------------------");
            System.out.println("          1. ADD               ");
            System.out.println("          2. VIEW              ");
            System.out.println("          3. UPDATE            ");
            System.out.println("          4. DELETE            ");
            System.out.println("          5. EXIT              ");
            System.out.println("-------------------------------");    
             
            System.out.print("Select option: ");
            int opt = sc.nextInt();
            
            switch(opt){
                case 1: 
                    dept add = new dept();
                    add.addDept();
                    break;
                case 2:
                    dept view = new dept();
                    view.viewDept();
                    break;
                case 3:
                    dept upd = new dept();
                    upd.updateDept();
                    break;
                case 4:
                    dept delete = new dept();
                    delete.deleteDept();
                    break;   
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    return;
            }
                
            System.out.print("\nDo you want to continue? (yes/no): ");
            response = sc.next();
            
        } while (response.equalsIgnoreCase("yes"));
       
    }
    
}

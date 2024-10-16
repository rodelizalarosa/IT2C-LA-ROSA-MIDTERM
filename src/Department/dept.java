
package Department;

import java.util.Scanner;
import larosa_dept.config;

public class dept {
    
    public void addDept(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("\n");
        System.out.print("Department Name: ");
        String dname = sc.next();
        System.out.print("Department Head: ");
        String dhead = sc.next();
        System.out.print("Location: ");
        String loc = sc.next();
        System.out.print("Contact Number: ");
        String contnum = sc.next();
        System.out.print("Email: ");
        String email = sc.next();

        String sql = "INSERT INTO tbl_department (department_name, department_head, location, phone_number, email) VALUES (?, ?, ?, ?, ?)";

        conf.addRecord(sql, dname, dhead, loc, contnum, email);
    }
    
    public void viewDept() {
        config conf = new config();
        
        String rodeQuery = "SELECT * FROM tbl_department";
        String[] rode_deptHeaders = {"ID", "Deparment Name", "Department Head", "Location", "Contact Number", "Email"};
        String[] rode_deptColumns = {"department_id", "department_name", "department_head", "location", "phone_number", "email"};

        conf.viewRecords(rodeQuery, rode_deptHeaders, rode_deptColumns);
    }
    
    public void updateDept(){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Department ID to update: ");
        int id = sc.nextInt();
        
        System.out.print("\n");
        System.out.print("Enter new Department Name: ");
        String upddname = sc.next();
        
        System.out.print("Enter new Department Head: ");
        String upddhead= sc.next();
        
        System.out.print("Enter new Location: ");
        String updloc = sc.next();
        
        System.out.print("Enter new Contact Number : ");
        String updnum = sc.next();
        
        System.out.print("Enter new Email : ");
        String updemail = sc.next();
        
        String update = "UPDATE tbl_department SET department_name = ?, department_head = ?, location = ?, phone_number = ?, email = ?  WHERE department_id = ?";
        
        config cnf = new config();
        cnf.updateRecord(update, upddname, upddhead, updloc, updnum, updemail, id);
    }
    
    public void deleteDept(){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Department ID to delete: ");
        int id = sc.nextInt();
        
        String delete = "DELETE FROM tbl_department WHERE department_id = ?";
        
        config cnf = new config();
        cnf.deleteRecord(delete, id);
    }
    
}

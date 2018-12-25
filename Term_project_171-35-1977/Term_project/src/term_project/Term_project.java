//Nusrat Jahan Anika
//171-35-1977
//properties
// first 5 are name, id,cell_number, email, address
// last 6 are work_hours,period, salary,age, paid leave, maternity leave, money withdraw 

// Vc salary 400000
// Dean salary 300000
// Professor salary 250000
// Associate Professor Salary 200000
// Assistant Professor salary 150000
// Senior lceturer salary 100000
// lecturer salary 75000
// cashier salary 100000
// staff salary 15000
// paid leve 20 days/year
// maternity leave 3 months
// bonus 100% if period is more than or equal 12 months
// bonus 75 for the perid in between 6 to 12 months
// bonus is not paid for the period of less than 6 months
// minimun working hours is 8, less than this will accuse you for a penalty of 10%

package term_project;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Term_project {

    public static void main(String[] args) {
       ArrayList<String> nums = new ArrayList<String>();
        nums.add("Chairman");
        nums.add("VC");
        nums.add("Pro VC");
        nums.add("Dean");
        nums.add("Professor");
        nums.add("Associate Professor");
        nums.add("Assistant Professor");
        nums.add("Senior Lecturer");
        nums.add("Lecturer");
        nums.add("Cashier");
        nums.add("Staff");
        
        System.out.println("DIU overall rank");
        System.out.println(nums);
        
        System.out.println("\n");                 // override the bonus, hours and leave
        Users s= new Users();
        s.work_hours();
        s.bonus();
        s.leave();
        
        System.out.println("\n");                 // encapsulation the salary
        salary_encap obj = new salary_encap();
        obj.setVC_salary(400000);
        obj.setDean_salary(300000);
        obj.setPro_salary(250000);
        obj.setAsso_pro_salary(200000);
        obj.setAssi_pro_salary(150000);
        obj.setSenior_lec_salary(100000);
        obj.setLec_salary(75000);
        obj.setCashier_salary(100000);
        obj.setStaff_salary(15000);
        
        System.out.println("VC's salary is " + obj.getVC_salary()+ " Tk");
        System.out.println("Dean's salary is " + obj.getDean_salary()+ " Tk");
        System.out.println("Professor's salary is " + obj.getPro_salary()+ " Tk");
        System.out.println("Associate Professor's salary is " + obj.getAsso_pro_salary()+ " Tk");
        System.out.println("Assistant's salary is " + obj.getAssi_pro_salary()+ " Tk");
        System.out.println("Senior lecturer's salary is " + obj.getSenior_lec_salary()+ " Tk");
        System.out.println("Lecturer's salary is " + obj.getlec_salary()+ " Tk");
        System.out.println("Cashier's salary is " + obj.getCashier_salary()+ " Tk");
        System.out.println("Staff's salary is " + obj.getstaff_salary()+ " Tk");
        
        System.out.println("\n");
        ArrayList<String> flow = new ArrayList<String>();
        flow.add("User->");                       // loop rotate this nmber of time
        flow.add("Choose options->");
        flow.add("Withdra/paid leave/ maternity leave->");
        flow.add("Yes, to use same users \n no to switch user->");
        System.out.println("Overall flow of the codes");
        System.out.println(flow);
        System.out.println("\n");
        
        Scanner reader = new Scanner(System.in);  // Number of users reading 
        System.out.println("Now enter the number of users: ");
        int users = reader.nextInt();
        for( int i = 0; i < users; i++)
         
        {
        // Choices i have 
        System.out.println(" 1.VC\n 2.Deans\n 3.Professor\n 4.Associate Professor\n 5.Assistant Professor\n 6.Senior Lecturer\n 7.Lecturer\n 8.Cashier\n 9.Staff: ");
        System.out.println("Enter your choices: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
            {
        Scanner kbd = new Scanner (System.in);
        String decision;
        boolean yn=true;
        while(yn){
             
        Diu_VC sm1=new Diu_VC("","","01816548921","vc@gmail.com","address1",7,9, obj.getVC_salary(),45,0,0,0); // DIU VC's different properties
        sm1.salary();                                                                                          // first 5 are name, id,cell_number, email, address
        sm1.withdraw();                                                                                        // last 6 are work_hours,period (how many months they work), salary,age, paid leave, maternity leave, money withdraw 
        sm1.bonus();
        sm1.fined();
        sm1.lev();
        sm1.pat_mat_lev();
        System.out.println("\n");
        System.out.println("Type: 'yes' to use same user");
        System.out.println("Type: 'no' to switch user");
        decision = kbd.nextLine();
        switch(decision){
        case "yes":
        yn = true;
        break;
        case "no": 
        yn = false;
        break;
        default : 
        System.out.println("please enter your choice again ");
        }
        }
        break;
            }
            case 2:
            {
        Scanner kbd = new Scanner (System.in);
        String decision;
        boolean yn=true;
        while(yn){
        Diu_dean sm1=new Diu_dean("","","01816548921","dean@gmail.com","address2",6,13, obj.getDean_salary(),40,0,0,0);
        sm1.salary();
        sm1.withdraw();
        sm1.bonus();
        sm1.fined();
        sm1.lev();
        sm1.pat_mat_lev();
        System.out.println("\n");
        System.out.println("Type: 'yes' to use same user");
        System.out.println("Type: 'no' to switch user");
        decision = kbd.nextLine();
        switch(decision){
        case "yes":
        yn = true;
        break;
        case "no": 
        yn = false;
        break;
        default : 
        System.out.println("please enter your choice again ");
        }
        }
        break;
            }
        case 3:
            {
        Scanner kbd = new Scanner (System.in);
        String decision;
        boolean yn=true;
        while(yn){
                
        Diu_Professor sm1=new Diu_Professor("","","01816548921","professor@gmail.com","address3",9,13, obj.getPro_salary(),40,0,0,0);
        sm1.salary();
        sm1.withdraw();
        sm1.bonus();
        sm1.fined();
        sm1.lev();
        sm1.pat_mat_lev();
        System.out.println("\n");
        System.out.println("Type: 'yes' to use same user");
        System.out.println("Type: 'no' to switch user");
        decision = kbd.nextLine();
        switch(decision){
        case "yes":
        yn = true;
        break;
        case "no": 
        yn = false;
        break;
        default : 
        System.out.println("please enter your choice again ");
        }
        }
        break;
            }
        
        case 4:
            {
        Scanner kbd = new Scanner (System.in);
        String decision;
        boolean yn=true;
        while(yn){
                
        Diu_asso_prof sm1=new Diu_asso_prof("","","01816548921","assoprof@gmail.com","address4",6,12, obj.getAsso_pro_salary(),35,0,0,0);
        sm1.salary();
        sm1.withdraw();
        sm1.bonus();
        sm1.fined();
        sm1.lev();
        sm1.pat_mat_lev();
        System.out.println("\n");
        System.out.println("Type: 'yes' to use same user");
        System.out.println("Type: 'no' to switch user");
        decision = kbd.nextLine();
        switch(decision){
        case "yes":
        yn = true;
        break;
        case "no": 
        yn = false;
        break;
        default : 
        System.out.println("please enter your choice again ");
        }
        }
        break;
            }
        case 5:
            {
        Scanner kbd = new Scanner (System.in);
        String decision;
        boolean yn=true;
        while(yn){
                
        Diu_Assistant_prof sm1=new Diu_Assistant_prof("","","01816548921","assis_prof@gmail.com","address5",8,13, obj.getAssi_pro_salary(),30,0,0,0);
        sm1.salary();
        sm1.withdraw();
        sm1.bonus();
        sm1.fined();
        sm1.lev();
        sm1.pat_mat_lev();
        System.out.println("\n");
        System.out.println("Type: 'yes' to use same user");
        System.out.println("Type: 'no' to switch user");
        decision = kbd.nextLine();
        switch(decision){
        case "yes":
        yn = true;
        break;
        case "no": 
        yn = false;
        break;
        default : 
        System.out.println("please enter your choice again ");
        }
        }
        break;
            }
        case 6:
            {
        Scanner kbd = new Scanner (System.in);
        String decision;
        boolean yn=true;
        while(yn){
                
        Diu_Senior_lecturer sm1=new Diu_Senior_lecturer("","","01816548921","senior_lect@gmail.com","address6",6,13, obj.getSenior_lec_salary(),27,0,0,0);
        sm1.salary();
        sm1.withdraw();
        sm1.bonus();
        sm1.fined();
        sm1.lev();
        sm1.pat_mat_lev();
        System.out.println("\n");
        System.out.println("Type: 'yes' to use same user");
        System.out.println("Type: 'no' to switch user");
        decision = kbd.nextLine();
        switch(decision){
        case "yes":
        yn = true;
        break;
        case "no": 
        yn = false;
        break;
        default : 
        System.out.println("please enter your choice again ");
        }
        }
        break;
            }
        case 7:
        {
        Scanner kbd = new Scanner (System.in);
        String decision;
        boolean yn=true;
        while(yn){
                
        Diu_lecturer sm1=new Diu_lecturer("","","01816548921","lecturer@gmail.com","address7",8,5,obj.getlec_salary(),25,0,0,0);
        sm1.salary();
        sm1.withdraw();
        sm1.bonus();
        sm1.fined();
        sm1.lev();
        sm1.pat_mat_lev();
        System.out.println("\n");
        System.out.println("Type: 'yes' to use same user");
        System.out.println("Type: 'no' to switch user");
        decision = kbd.nextLine();
        switch(decision){
        case "yes":
        yn = true;
        break;
        case "no": 
        yn = false;
        break;
        default : 
        System.out.println("please enter your choice again ");
        }
        }
        break;
            }
        case 8:
            {
        Scanner kbd = new Scanner (System.in);
        String decision;
        boolean yn=true;
        while(yn){
                
        Diu_cashier sm1=new Diu_cashier("","","01816548921","cashier@gmail.com","address8",7,6, obj.getCashier_salary(),47,0,0,0);
        sm1.salary();
        sm1.withdraw();
        sm1.bonus();
        sm1.fined();
        sm1.lev();
        sm1.pat_mat_lev();
        System.out.println("\n");
        System.out.println("Type: 'yes' to use same user");
        System.out.println("Type: 'no' to switch user");
        decision = kbd.nextLine();
        switch(decision){
        case "yes":
        yn = true;
        break;
        case "no": 
        yn = false;
        break;
        default : 
        System.out.println("please enter your choice again ");
        }
        }
        break;
            }
        case 9:
        {
        Scanner kbd = new Scanner (System.in);
        String decision;
        boolean yn=true;
        while(yn){
                
        Diu_staff sm1=new Diu_staff("","","01816548921","staff@gmail.com","address9",8,13, obj.getstaff_salary(),30,0,0,0);
        sm1.salary();
        sm1.withdraw();
        sm1.bonus();
        sm1.fined();
        sm1.lev();
        sm1.pat_mat_lev();
        System.out.println("\n");
        System.out.println("Type: 'yes' to use same user");
        System.out.println("Type: 'no' to switch user");
        decision = kbd.nextLine();
        switch(decision){
        case "yes":
        yn = true;
        break;
        case "no": 
        yn = false;
        break;
        default : 
        System.out.println("please enter your choice again ");
        }
        }
        break;
            }
        }
             
         }
          
    }
}
    



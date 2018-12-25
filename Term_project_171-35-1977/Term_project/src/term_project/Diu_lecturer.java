
package term_project;

import java.io.*;
import java.util.Scanner;
public class Diu_lecturer extends Project_variables {
    
    float bonus=0;
    float fined=0;
   
    Diu_lecturer(String name,String id,String cell_number,String email,String address,float work_hours,float period,int salary,int age,int leave, int pat_mat_leave, int withdraw)
    {
        
        System.out.println("1. Withdraw money \n2. Take paid leave \n3. Take maternity leave\nEnter your choice:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
            {   
                System.out.println("Your salary is "+salary+" TK ");
                Scanner reader = new Scanner(System.in);  // Reading from System.in
                System.out.println("Enter your amount to draw: ");
                withdraw = reader.nextInt();
                
             break;
            }
            case 2:
            {
                System.out.println("Your paid leave is "+(int)(20-leave)+" days ");
                Scanner reader = new Scanner(System.in);  // Reading from System.in
                System.out.println("Enter number of leave: ");
                leave = reader.nextInt();
                
             break;
             }
            case 3:
            {
                System.out.println("Your paid maternity leave is "+(int)(90-pat_mat_leave)+" days ");
                Scanner reader = new Scanner(System.in);  // Reading from System.in
                System.out.println("Enter number of leave: ");
                pat_mat_leave= reader.nextInt();
                
        
             break;
            }       
    }
        super.name=name;
        super.id=id;
        super.age=age;
        super.cell_number=cell_number;
        super.email=email;
        super.address=address;
        super.work_hours=work_hours;
        super.period=period;
        super.salary=salary;
        super.leave=leave;
        super.pat_mat_leave=pat_mat_leave;
        super.withdraw=withdraw;
        
    }
        void salary()
    {
        System.out.println("Your salary is "+salary+" TK ");
    }
    
        void withdraw()
    {
        if (withdraw<=salary)  // perid is in months
            System.out.println("Your salary left "+(int)(salary-withdraw)+" TK ");
        
        else
            System.out.println("You have not that much in your account ");
        
    }
        
    void bonus()
    {
        if (period>=12)  // perid is in months
            System.out.println("You have the bounus of "+(float)(salary*1)+" TK ");
        
        else if (period<12 && period>6)  // perid is in months
            System.out.println("You have the bounus of "+(float)(salary*.75)+" TK ");
        
        else
        {
            System.out.println("You are not eligible for bonus");
        }
    }
    void fined()
    {
        if (work_hours>=8)
            System.out.println("You have no fine");
        else
        {
            fined=(float) (salary*.1);
            System.out.println("You are fined "+fined+" TK");
        }
    }
    
    void lev()
    {
        if (leave<=20)  // leave in days
            System.out.println("Your paid leave left "+(int)(20-leave)+ " days");
        else 
        {
            System.out.println("You are not going to be paid for further leave");
        }
    }
     void pat_mat_lev()
    {
        if (pat_mat_leave<=90)  // leave in days
            System.out.println("Your paternity leave left "+(int)(90-pat_mat_leave) + " days");
        else 
        {
            System.out.println("You are not going to be paid for further leave");
        }  
    }
}


package term_project;

public class Users implements userinterface {

    @Override
    public void work_hours() {
        System.out.println("Less then 8 working hours accuse a penalty of 10%");
    }

    @Override
    public void bonus() {
        System.out.println("Bonus is only given after 12 months of working period");
    }

    @Override
    public void leave() {
        
        System.out.println("You can take 20 leave, more than 20 leave may accuse you for penalty");
    }
    
}

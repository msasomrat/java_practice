package Java_Practice;

public class manager extends employee {
    String sector;
    private int salary;

    void set_sal(int salary)
    {
        this.salary = salary;
    }

    // here we override our display method
    // for overriding name parameter must be same
    // it has to be superclass to child
    // we cannot override final or static
    
    @Override
    void display()
    {
        
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
        System.out.println("Sector :"+sector);
        //super.disp_info();
    }
}

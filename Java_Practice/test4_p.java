package Java_Practice;

public class test4_p {
    //final can only intilize using constructor
    // or when declare
    final String u_name; // this is blank final variable
    

    //also for static final variable it can only
    //initilize by static block
    // or when declare
    static final String location;

    //if we initilize like that
    // u_name = "Hello";
    //it show error
    
    test4_p()
    {
        u_name = "Hello";
    }

    static
    {
        location = "Dhaka";
    }
    void display()
    {
        System.out.println(u_name);
        System.out.println(location);
    }

    void display_demo()
    {
        System.out.println("Testing final");
    }

    final void display_demo2()
    {
        System.out.println("Testing final");
    }

    //here we see that if we declare a variable with
    //final keyword we cannot change in other
    //same for classes and method
    // if we final a class it cant be inherited
    // for method it cant be overridden




}

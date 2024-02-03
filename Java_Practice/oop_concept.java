package Java_Practice;

public class oop_concept {
    // though this two variable is not private we can
    // access from by creating object

    String name;
    int age;


    // for private value
    // this is encapsulation
    private String name_1;
    private int age_1;

    void set_info(String name_1, int age_1)
    {
        this.age_1 = age_1;
        this.name_1 = name_1;
    }
    void display()
    {
        System.out.println("name: "+name);
        System.out.println("Age: "+age);
    }
        void display_info()
    {
        System.out.println("name: "+name_1);
        System.out.println("Age: "+age_1);
    }
}

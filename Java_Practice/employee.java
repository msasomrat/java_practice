package Java_Practice;

public class employee {
    //we cannot inherit private but we can use
    // set and get method
    private String info;
    String name;
    int age;
    void setinfo(String info)
    {
        this.info = info;
    }
    void display()
    {
        
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
    void disp_info()
    {
        
        System.out.println("Info : "+ info);
    }
}

package Java_Practice;

public class oop {
    //variable
    String name,gender;
    int n;
    static String u_name = "MU";
    int count =0;

    static int count1 = 0;

    oop(String s){
        count++;
    }

    oop(int s){
        count1++;
    }

    // for using static we dont need to create object
    //cause its related to class
    // we can se static variable by calling class
    // its same for variable and method


    //overloading constructor means same name but 
    // parameter different i.e it can be no of parameter
    // position of paramter etc

    //here for testing static
    oop(String str, int num){
        name = str;
        n = num;
    }

    oop(String str, String gen){
        name = str;
        gender = gen;
    }
    oop(){

    }
    // constructor automatically call hoi and no return type
    // name exactly same as class name
    //can be parameterized or no parameter

    oop(String s, String gen, int num){
        name = s;
        gender = gen;
        n = num;
    }

    //method for set info
    void set_info(String s, String gen, int num){
        name = s;
        gender = gen;
        n = num;
    }

    //method for display 

    void dispinfo(){
        System.out.println("Name " + name);
        System.out.println("Gender " + gender);
        System.out.println("N " + n);
    }

    void disp_info(){
        System.out.println("Name " + name);
        System.out.println("N " + n);
        System.out.println("University " +u_name);
    }

    int sum(int x, int y){
        return x+y;
    }

    void disp_demo(){
        System.out.println("Non static method");
    }

    static void disp_demo1(){
        System.out.println("static method");
    }

    void display()
    {
        System.out.println("This is non static");
        System.out.println("access "+u_name);
        System.out.println("count "+ count);
        //non static can call static and non static variable

    }

    static void display1()
    {
        System.out.println("This is static");
        System.out.println("Access2 "+u_name);
        //System.out.println("count "+count);
        //this thrown an error cause static cannot call
        // non static variable
    }

    static int p;
    static String str;

    static{
        //System.out.println("testing");
        p= 12;
        str = "PHP";
    }
    static void display_test()
    {
        System.out.println("p = "+p);
        System.out.println("String :" +str);
    }

    //instance variable hiding
    //we know that local variable priority higher
    // so if we give local and instant variable same name
    //and assign then it assign value itself
    //so for variable hiding and separate we use 
    // this keyword
    double height, width, depth;
    oop(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    void display_vol()
    {
        System.out.println("Volume = "+ height*width*depth);
    }

    // method overloading same as constructor overloading
    // same name but parameter different
    void add (int i, int j){
        System.out.println(i+j);
    }
    void add (double i, double j){
        System.out.println(i+j);
    }
    void add (){
        System.out.println("no parameter");
    }
    

    //variable length argument
    //in this we can send as much as as we want 
    // as a parameters in method
    int sum_1 = 0;
    void add_demo(int ... num)
    {
        for (int i : num) {
            sum_1 += i;
        }
    }

    void display_sum(){
    System.out.println("summation "+ sum_1);
    }

    int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
            
    }
}
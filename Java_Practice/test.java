
package Java_Practice;

import java.util.*;
import java.lang.*;

public class test {
    public static void main(String[] args) {


        System.out.println("Static Check "+ oop.u_name);
        oop demo1;              // object declare
        
        demo1 = new oop();          //object create

        demo1.name= "Hey";
        demo1.gender = "male";
        demo1.n = 12;

        demo1.dispinfo();

        oop demo2 = new oop();

        demo2.name= "Hey there";
        demo2.gender = "male";
        demo2.n = 30;

        demo2.dispinfo();

        /*System.out.println("Name " + demo2.name);
        System.out.println("Gender " + demo2.gender);
        System.out.println("N " + demo2.n); */

        /*  here if we create so many object then 
        we also print it every time then 
        we have to call it again and again. 
        by using method we can resolve this problem
         */ 
         
        oop demo3 = new oop();
        demo3.set_info("Hello World", "Female", 18);
        demo3.dispinfo();
      
    // if we have constructor we can pass when we declare

        oop demo4 = new oop("hello hello", "male", 23);
        demo4.dispinfo();

        oop demo5 = new oop("Hi there", "Male");
        demo5.dispinfo();

        oop demo6 = new oop();
        int p = demo6.sum(12, 13);
        System.out.println(p);

        oop demo7 = new oop("statics", 20);
        demo7.disp_info();

        oop demo8 = new oop("static check", 25);
        demo8.disp_info();

        oop demo9 = new oop("hello");
        System.out.println("first demo(without static) "+ demo9.count);
        
        oop demo10 = new oop("hello");
        System.out.println("first demo(without static) "+ demo10.count);
        
        oop demo11 = new oop("hello");
        System.out.println("first demo(without static) "+ demo11.count);

        oop demo12 = new oop(12);
        System.out.println("first demo(with static) "+ demo12.count1);

        oop demo13 = new oop(13);
        System.out.println("first demo(with static) "+ demo13.count1);
        
        oop demo14 = new oop(14);
        System.out.println("first demo(with static) "+ demo14.count1);


        //for non static we need to create object

        oop demo15 = new oop();
        demo15.disp_demo();

        //for static no need for create objects
        oop.disp_demo1();

        oop.display1();
        //we can directly call static method without
        //creating objects
        oop demo16 = new oop();
        demo16.display();

        oop.display_test();

        oop demo17 = new oop(10, 10, 10);

        oop demo18 = new oop(12, 12, 12);

        demo17.display_vol();
        demo18.display_vol();


        System.out.println(Math.abs(-9));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.floor(22.9));
        System.out.println(Math.log10(1.0));
        System.out.println(Math.exp(10));
        System.out.println(Math.PI);
        System.out.println(Math.round(22.7));

        System.out.println("Method overloading");
        oop demo19 = new oop();
        demo19.add(10, 11);
        demo19.add(12.5, 12.5);
        demo19.add();


        System.out.println("Call by value test");

        call_value ob = new call_value();
        int x= 10;
        System.out.println("Before call "+x);
        ob.change(x);
        System.out.println("After change "+x);

        System.out.println("Call by reference test");

        MyClass ob1 = new MyClass(x);
        ob1.modifyReference(ob1);
        System.out.println(ob1.value);


        System.out.println("Call by reference test");
        ob.n = 10;
        ob.change_ref(ob);// here we send object

        System.out.println("after change "+ob.n);

        // here we can send as many argument as we want
        demo1.add_demo(10,10,10,10,10,10,11);
        demo1.display_sum();

        int fact = demo1.fact(5);
        System.out.println("Factorial "+fact);
        
    }
}

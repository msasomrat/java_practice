package Java_Practice;

public class test2 {
    public static void main(String[] args) {
        oop_concept demo1 = new oop_concept();
        demo1.name = "hello";
        demo1.age = 20;

        demo1.display();

        //if we want to access we cannot access
        //private variable
        demo1.set_info("Hello World", 22);
        demo1.display_info();

        // inheritance 
        manager demo2 = new manager();
        demo2.name = "Here we test inheritance";
        demo2.age = 23;
        demo2.sector = "Middle level";
        //demo2.display();
        //demo2.disp_info();
        demo2.set_sal(100000);
        demo2.setinfo("High class");

         demo2.display();
        

    }
}

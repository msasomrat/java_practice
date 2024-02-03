package Java_Practice;

public class test4 {
    public static void main(String[] args) {
        test4_p demo = new test4_p();
        demo.display();
        test4_p_i demo2 = new test4_p_i();
        demo2.display_demo();


        person p = new person();
        person2 p2 = new person2();
        person3 p3 = new person3();
        

        System.out.println("\n\n");

        System.out.println(" ");
        System.out.println("\n");
        p.display();
        p2.display();
        p3.display();

        //here we can reference from parent class to 
        //inherit class,
        System.out.println("\n\n");
        System.out.println("Polymorphism Testing");
        System.out.println("\n");
        p = new person2();
        p.display();
        p = new person3();
        p.display();
    }
}

package Java_Practice;

public class test4_p_i extends test4_p {
    void display_demo()
    {
        super.display_demo();
        System.out.println("Testing final");
    }
    /*final void display_demo2()
    {
        System.out.println("Testing final");
    }
    */
    // this show error cause final method cannot 
    //be override

}

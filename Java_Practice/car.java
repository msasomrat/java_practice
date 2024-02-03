package Java_Practice;

public class car extends vehicle{
    int gear;

    car(String c, double w, int g)
    {
        // just super then parameter cause constructor 
        // called automatically
        super(c, w);
        gear =g;
        //super(c, w);
        // we cannot call superclass constructor in 
        //extend 
    }
    @Override
    void display()
    {
        super.display();
        //System.out.println("Color :"+color);
        //System.out.println("Weight :"+weight);
        System.out.println("Gear :"+gear);
    }
}

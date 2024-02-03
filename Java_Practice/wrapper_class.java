package Java_Practice;
import java.util.*;
public class wrapper_class {


    //wrapper class use to convert primitive to object 
    //and object to primitive
    public static void main(String[] args){
        int n = 12;
        Integer p = Integer.valueOf(n);
        System.out.println(p);
        Integer z = n; //Integer.valueOf() will automatically this called autoboxing
        System.out.println(z);

        Double d= new Double(10.25);
        System.out.println(d);

        double e = d.doubleValue();
        System.out.println(e);

        String s = Integer.toString(n);
        System.out.println(s);

        String str = "88";
        int i = Integer.parseInt(str);
        System.out.println(i);

        double j = Double.parseDouble(str);
        System.out.println(j);

        int k = Integer.valueOf(str);
        System.out.println(k);


        String bin = "101011";
        int deci = Integer.parseInt(bin, 2);
        System.out.println(deci);
        
        String oct = "676";
        int deci1 = Integer.parseInt(oct, 8);
        System.out.println(deci1);

        String hexa = "A";
        int deci3 = Integer.parseInt(hexa, 16);
        System.out.println(deci3);

        int decimal = 15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);

         
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);

        String Hexa = Integer.toHexString(decimal);
        System.out.println(Hexa);



    }
}

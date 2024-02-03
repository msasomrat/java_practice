import java.util.*;
public class index_bound {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        try{
            array[10]= 20;

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occur With "+e);
        }
    }
}

package Java_Practice;
import java.util.*;
//import java.util.Iterator;
public class Array_List{
    public static void main(String[] args)
    {
        ArrayList<Integer> array_list = new ArrayList<>();
        ArrayList<Integer> array_list2 = new ArrayList<>();

        array_list.add(80);
        array_list.add(20);
        array_list.add(30);
        array_list.add(40);
        Collections.sort(array_list);
        


        array_list2.addAll(array_list);

        // using iterator
        Iterator itr = array_list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
        // for each 
        for (int x : array_list) {
            System.out.print(x+" ");
        }

        //just passing the arraylist name
        System.out.println(array_list);
        System.out.println("Size : "+array_list.size());

        array_list.set(1, 100);
        //checking a numer has in list
        System.out.println(array_list.contains(30));

        //find index
        System.out.println(array_list.get(2));
        System.out.println("Printing index");
        System.out.println(array_list.indexOf(40));

        System.out.println(array_list.isEmpty());
        array_list.remove(2);
        System.out.println(array_list);
        System.out.println("Size : "+array_list.size());

         array_list.removeAll(array_list);
        System.out.println(array_list);
        System.out.println("Size : "+array_list.size());
        System.out.println(array_list.isEmpty());




    System.out.println(array_list2);
    System.out.println(array_list.equals(array_list2));

    Collections.sort(array_list2);
    System.out.println(array_list2);
    Collections.reverse(array_list2);
    
    Collections.sort(array_list2,Collections.reverseOrder(null));

    System.out.println(array_list2);

    }
}
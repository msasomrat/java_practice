package Java_Practice;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;



public class data_time {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);
        DateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(dateformat.format(date));

        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(time.format(formatter));

        Random rand = new Random();
        int random_num = rand.nextInt(10);
        System.out.println(random_num);

        int random_number = (int) (Math.random()*10);
        System.out.println(random_number);
    }
}

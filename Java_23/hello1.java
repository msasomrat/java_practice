
import java.util.Scanner;
public class hello1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //System.out.print("Enter the Number: ");
        //int x= scan.nextInt();
        int x = 10;
        int[] a = new int[100];
        int i=0, o=0, z=0;
        while(x!=0)
        {
            a[i]= x%2;
            x=x/2;
            if(a[i]==1)
            {
                o++;
            }
            else
                z++;
            i++;
        }
            int j=o+z;//5
            for(int k = 0; k < j; k++)
            {
                System.out.print(a[k]);
            }
            //System.out.print("\n");
            //System.out.println("Number of Zero " + z);
            //System.out.println("Number of One " + o);
    int p = hello2.summ(25,5);
    System.out.print("Multiplication " + p);
    hello3.concatanation("Hello World");
    }
    
}
class hello2{
    public static int summ(int m, int n){
        int sum =0;
    
        for(int i = 0; i<n; i++)
            sum = sum+m;

    return sum;
    }
    

}
class hello4{
    public static void rev(String s){
         //System.out.println("\n");
        int size_s= s.length();
        for(int x=size_s-1; x>=0; x--)
        {
            
                System.out.print(s.charAt(x));    
            
        }
        
    }
}
class hello3{
    public static void concatanation(String s){
         System.out.println("\n");
        int size_s= s.length();
        String word ="";
        for(int x=size_s-1; x>=0; x--)
        {
            char ch = s.charAt(x);
            if(ch ==' ')
            {
                //System.out.print(word);
                hello4.rev(word);
                word= "";
            }
            else{
                word = word+ch;
            }
            
        }
        System.out.print(" ");
         hello4.rev(word);
        
    }
}



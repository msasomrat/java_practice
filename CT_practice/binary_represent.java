
import java.util.Scanner;
public class binary_represent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x= scan.nextInt();
        //int x = 10;
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
            for(int k = j-1; k >=0; k--)
            {
                System.out.print(a[k]);
            }
            System.out.print("\n");
            System.out.println("Number of Zero " + z);
            System.out.println("Number of One " + o);
    
    }
    
}
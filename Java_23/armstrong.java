import java.util.Scanner;
public class armstrong {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int m,n, count = 0;
        m= input.nextInt();
        n= input.nextInt();
        for(int i =m; i<=n; i++)
        {
            int temp= i, sum = 0;
            while(temp!=0)
            {
                int r= temp%10;
                sum = sum+r*r*r;
                temp = temp/10;
            }
            if(sum == i)
            {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
    // wrong logic
}

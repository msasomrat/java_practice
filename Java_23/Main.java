import java.util.Scanner;

class StudentRecordManager{
    public static double calculateAverage(int[] marks)
    {
        int i;
        int n = marks.length;
        double sum = 0, avg = 0;
        for(i= 0; i<n; i++)
        {
            sum = sum + marks[i];
        }
        avg = sum/n;
        return avg;
    }
    public static int findMax(int[] marks)
    {
        int i;
        int n = marks.length;
        int max = marks[0];
        for( i=0; i<n; i++)
        {
            if(marks[i]<max)
            {
                max = marks[i];
            }
        }
        return max;
    }
    public static int findMin(int[] marks)
    {
        int i;
        int n = marks.length;
        int min = marks[0];
        for( i=0; i<n; i++)
        {
            if(marks[i]<min)
            {
                min = marks[i];
            }
        }
        return min;
    }
    public static void displayStudentDetails(int studentId, String name, int[] marks)
    {
        double avg = calculateAverage(marks);
        int max = findMax(marks);
        int min = findMin(marks);
        System.out.println("Student Details: ");
        System.out.println("ID: "+ studentId);
        System.out.println("Average Marks "+ avg);
        System.out.println("Maximum Marks "+ max);
        System.out.println("Minimum "+ min);
    }


}

public class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers of students");
        int p = scan.nextInt();

        for(int i=0; i<p; i++){
            
            //int n;
            System.out.println("How many subjects? ");
            int n= scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();
            int roll = scan.nextInt();
        
            
            int[] marks = new int[n];
            for(int j=0; j<n; j++)
            {
                marks[j]= scan.nextInt();
            }
            StudentRecordManager.displayStudentDetails(roll, s, marks);


        }
        
    }
}

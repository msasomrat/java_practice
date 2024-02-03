package helloworld2;

public class StudentRecordManager {
	int id;
	int[] marks;
	String name;
	public StudentRecordManager(int id,int[] marks,String name) {
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	public static double calculateAverage(int[] marks)
	{
		int sum =0 ;
		for(int i = 0; i< marks.length; i++)
		{
			sum +=marks[i];
		}
		return sum/marks.length;
	}
	public static double findMax(int[] marks)
	{
		int max = marks[0];
		for(int i = 0; i< marks.length; i++)
		{
			if(marks[i]>max)
			{
				max = marks[i];
			}
		}
		return max;
	}
	public static double findMin(int[] marks)
	{
		int min = marks[0];
		for(int i = 0; i< marks.length; i++)
		{
			if(marks[i]<min)
			{
				min = marks[i];
			}
		}
		return min;
	}
	
	public static void display(int id, String name, int[] marks)
	{
		double avg = calculateAverage(marks);
		double max = findMax(marks);
		double min = findMin(marks);
		System.out.println("StudentId :"+id);
		System.out.println("Name :"+name);
		System.out.print("Marks: ");
		System.out.print("[");
		
		for (int i = 0; i < marks.length; i++) {
	        System.out.print(marks[i]);
	        if (i < marks.length - 1) {
	            System.out.print(", ");
	        }
	    }
		System.out.print("]");
		System.out.print("\n");
		
		System.out.println("Average MArks :"+avg);
		System.out.println("MAx MArks :"+max);
		System.out.println("min MArks :"+min);
		
	}
	public static void main(String[] args)
	{
		int [] marks1 = {80,85,90,75,95};
		int [] marks2 = {70,65,80,75,60};
		StudentRecordManager.display(101, "Alice", marks1);
		StudentRecordManager.display(102, "Bob", marks2);
	}

}

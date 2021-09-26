import java.util.Scanner;
class Student {
		public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int StudentId = in.nextInt();
		System.out.println("Enter Student Name :");
		String name = in.next();
		String arg1 = args[0];
		String arg2 = args[1];
		String arg3 = args[2];
		String arg4 = args[3];
		String arg5 = args[4];
		String arg6 = args[5];
		int m1 = Integer.parseInt(arg1);
		int m2 = Integer.parseInt(arg2);
		int m3 = Integer.parseInt(arg3);
		int m4 = Integer.parseInt(arg4);
		int m5 = Integer.parseInt(arg5);
		int m6 = Integer.parseInt(arg6);
		int TotalMarks = (m1+m2+m3+m4+m5+m6);
		double AverageMarks = (double) (m1+m2+m3+m4+m5+m6)/6;
		System.out.println("The student id is : "+StudentId);
		System.out.println("The student name is : "+name);
		System.out.println("Marks of all subjects are : "+m1+"  "+m2+"  "+m3+"  "+m4+"  "+m5+"  "+m6);
		System.out.println("The total marks are : " +TotalMarks);
		System.out.println("The average marks are : "+AverageMarks);
	}
}

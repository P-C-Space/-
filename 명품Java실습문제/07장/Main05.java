import java.util.*;
class Student{
	private String name; // 이름
	private String Department; // 학과
	private int StudentID; // 학번
	private double Score; // 학점
	Student(String name, String Department,int StudentID, double Score){
		this.name = name;
		this.Department = Department;
		this.StudentID = StudentID;
		this.Score = Score;
	}
	public void Print(){
		System.out.println("학생 이름 : "+name);
		System.out.println("학과 이름 : "+Department);
		System.out.println("학번 : "+StudentID);
		System.out.println("학점 : "+Score);
	}
	
}
public class Main05 {
	public static void main(String[] args)
	{
		ArrayList<Student> student = new ArrayList<Student>();
		Scanner s = new Scanner(System.in);
		System.out.println("학생 5명의 정보를 입력하시오");
		for(int i = 0;i<5;i++)
		{
			System.out.print("학생 이름 : ");
			String name = s.nextLine();
			System.out.print("학과 이름 : ");
			String department = s.nextLine();
			System.out.print("학번 : ");
			int studentID = s.nextInt();
			System.out.print("학점 : ");
			double score = s.nextDouble();
			s.nextLine();
			Student temp = new Student(name,department,studentID,score);
			student.add(temp);
		}
		Iterator<Student> it = student.iterator();
		int i = 1;
		while(it.hasNext()) {
        	System.out.println();
			System.out.println(i+"번 학생");
			it.next().Print();
			i++;
		}
        s.close();
	}
}
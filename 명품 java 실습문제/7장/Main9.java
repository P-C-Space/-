import java.util.HashMap;
import java.util.Scanner;

class Student{
	private String name;
	private String department;
	private double Score;
	Student(String name,String department,double Score){
		this.name = name;
		this.department = department;
		this.Score = Score;
	}
	public void Print(){
		System.out.println("학생 이름 : "+name);
		System.out.println("학과 이름 : "+department);
		System.out.println("학점 : "+Score);
	}
}

public class Main9 {
	public static void main(String[] args) {
		HashMap<String, Student> dept = new HashMap<String,Student>();
		Scanner s = new Scanner(System.in);
		System.out.println("학생 5명의 정보를 입력하시오");
		for(int i = 0;i<5;i++)
		{
			System.out.print("학생 이름 : ");
			String name = s.nextLine();
			System.out.print("학과 이름 : ");
			String department = s.nextLine();
			System.out.print("학번 : ");
			String studentID = s.nextLine();
			System.out.print("학점 : ");
			double score = s.nextDouble();
			s.nextLine();
			Student temp = new Student(name,department,score);
			dept.put(studentID,temp);
		}
		
		System.out.print("검색할 학생의 학번을 입력하시오 : ");
		String find = s.nextLine();
		
        System.out.println();
       	
		if(dept.containsKey(find)) {
			System.out.println("학번 : " + find);
			dept.get(find).Print();
		}
		else {
			System.out.println("학생이 존재하지 않습니다.");
		}
		s.close();
	}

}
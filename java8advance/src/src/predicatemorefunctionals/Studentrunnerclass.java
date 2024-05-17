package src.predicatemorefunctionals;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Studentrunnerclass {

	public static void main(String[] args) {
		
		//Student st1=new Student("amalesh",20);
		//Student st2=new Student("gupta", 10);
		//Student std3=new Student("amaleshgupta", 80);
		
		List<Student> student=new ArrayList<Student>();
		//we have list values in two methods method1
		//student.add(std3);
		//method2
		student.add(new Student("bala", 30));
		student.add(new Student("amalesh", 10));
		student.add(new Student("gupta", 20));
		
		
		Predicate<Student>stdpri= input->input.getPercentage()<30;
		for (Student student2 : student) {
			if(stdpri.test(student2)) {
				System.out.println(student2.getName()); 
			}
			
		}
		
		
	}

}

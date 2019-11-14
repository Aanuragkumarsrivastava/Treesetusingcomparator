package pack2;

import java.util.Comparator;
import java.util.TreeSet;
import pack2.Student;

public class Studenttreesetusingcomparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Student> tw=new TreeSet<Student>(new Comparator<Student>() 
		{
			public int compare(Student o1,Student o2)
			{
			String stu1=o1.getName();
			String stu2=o2.getName();
			return stu1.compareTo(stu2);
			}
		});
		tw.add(new Student(200,"ramesh",8));
		tw.add(new Student(201,"suresh",8));
		tw.add(new Student(202,"mahesh",8));
		tw.add(new Student(203,"lokesh",9));
		
		System.out.println(tw);

	}

}

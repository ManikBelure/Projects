package Customsorting;

import java.util.Comparator;

import sdbms.Student;

public class SortStudentById implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return x.getId().compareTo(y.getId());
	}

}

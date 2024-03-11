package com;
import java.util.Comparator;

public class SortStudentByName implements Comparator<Student>
{
	@Override
	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return x.name.compareTo(y.name); // y.name.compareTo(.name)
	}
}

//x->object to be inserted 
//y->already existing object
// to compare string object, we are using compareTo() of string class->line-9
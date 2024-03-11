package com;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student>
{
	@Override
	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return x.age-y.age; //return y.age-x.age
	}
}

//x->object to be inserted 
//y->already existing object

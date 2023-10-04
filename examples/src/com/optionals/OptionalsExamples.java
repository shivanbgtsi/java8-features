package com.optionals;

import com.utility.Student;

import java.util.List;
import java.util.Optional;

public class OptionalsExamples {
	
	public static void main(String[] args) {
//		optionalWithString();
//		optionalWithObjects();
		optionalWithMethodReference();
	}
	
	static void optionalWithString() {
		String str = "shivan";
//		String str = null;
		Optional<String> optString = Optional.ofNullable(str);
		// orElse
		String output = optString.orElse("String is null");
		System.out.println(output);
		// orElseThrow
		String orElseThrow = optString.orElseThrow(()-> new RuntimeException("String is null"));
		System.out.println(orElseThrow);
	}

	static void optionalWithMethodReference(){
		String name = "Shivan";
		Optional<String> optStr = Optional.ofNullable(name);
		String nameInUpperCase = optStr.orElseThrow(RuntimeException::new).toUpperCase();
		System.out.println(nameInUpperCase);

		String nameInLoweCase = optStr.orElseThrow(RuntimeException::new).toLowerCase();
		System.out.println(nameInLoweCase);
	}


	static void optionalWithObjects(){
		List<Student> students = Student.getListOfStudents();
		Optional<Student> optStudent = Optional.ofNullable(students.get(0));
		Student stud = optStudent.orElseThrow(()-> new RuntimeException("Student not fount"));
		System.out.println(stud);
	}

}

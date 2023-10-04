package com.utility;

import java.util.List;

public class Student {

    private Integer rollNumber;
    private String universityNumber;
    private String firstName;
    private String lastName;
    private String departmentName;
    private Double percentage;

    public Student(Integer rollNumber, String universityNumber, String firstName, String lastName, String departmentName, Double percentage) {
        this.rollNumber = rollNumber;
        this.universityNumber = universityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.percentage = percentage;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public String getUniversityNumber() {
        return universityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", universityNumber='" + universityNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    private static List<Student> LIST_OF_STUDENTS;

    static {
        Student studentEC1 = new Student(101,"101EC101","Shivan","G","EC",75.0);
        Student studentEC2 = new Student(102,"101EC102","Ravi","H","EC",75.5);
        Student studentEC3 = new Student(103,"101EC103","Rahul","D","EC",80.5);

        Student studentCS1 = new Student(104,"101CS101","Basu","G","CS",75.0);
        Student studentCS2 = new Student(105,"101CS102","Vinay","H","CS",75.5);
        Student studentCS3 = new Student(106,"101CS103","Lohith","D","CS",80.5);

        Student studentME1 = new Student(107,"101ME101","Ravi","T","CS",75.0);
        Student studentME2 = new Student(108,"101ME102","Rudra","HA","CS",75.5);
        Student studentME3 = new Student(109,"101ME103","Santosh","DA","CS",80.5);
        LIST_OF_STUDENTS = List.of(studentEC1,studentEC2,studentEC3,studentME1,studentME2,studentME3,studentCS2,studentCS1,studentCS3);
    }

    public static List<Student> getListOfStudents() {
        return LIST_OF_STUDENTS;
    }

}

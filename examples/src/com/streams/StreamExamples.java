package com.streams;

import com.utility.BasicInfo;
import com.utility.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {

    static void groupByDepartment(List<Student> students) {

        Map<String, List<Student>> deptGroup = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName));
        System.out.println(deptGroup);
    }

    static void groupByDepartmentAndCount(List<Student> students) {
        Map<String, Long> deptGroupCount = students.stream()
                .filter(student -> student.getDepartmentName().equals("CS"))
                .collect(Collectors.groupingBy(Student::getDepartmentName, TreeMap::new, Collectors.counting()));
        System.out.println(deptGroupCount);
    }

    static void streamWithFilter(List<Student> students) {
        List<Student> csStudents = students.stream()
                .filter(student -> student.getDepartmentName().equals("CS"))
                .collect(Collectors.toList());
        System.out.println(csStudents);
    }

    static void streamWithFindAny(List<Student> students) {
        Optional<Student> findBy = students.stream()
                .filter(student -> student.getFirstName().equalsIgnoreCase("shivan")).findAny();
        Student student = findBy.orElseThrow(() -> new RuntimeException("Student not found"));
        System.out.println(student);
    }

    static void streamWithMax(List<Student> students) {
        Student student = students.stream().max(Comparator.comparing(Student::getPercentage))
//                students.stream().min(Comparator.comparing(Student::getPercentage))
                .orElseThrow(() -> new RuntimeException("Student not found"));
        System.out.println(student);
    }

    static void streamMap(List<Student> students) {
        List<BasicInfo> basicInfo = students.stream()
                .map(student -> new BasicInfo(student.getFirstName(), student.getLastName(), student.getDepartmentName()))
                .collect(Collectors.toList());
        System.out.println(basicInfo);
    }

    public static void main(String[] args) {
        List<Student> students = Student.getListOfStudents();
//        groupByDepartmentAndCount(students);
//        groupByDepartment(students);
//        streamWithFilter(students);
//        streamWithFindAny(students);
//        streamWithMax(students);
        streamMap(students);
    }
}

package com.utility;

public class BasicInfo {

    private String firstName;
    private String lastName;
    private String departmentName;

    public BasicInfo(String firstName, String lastName, String departmentName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
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

    @Override
    public String toString() {
        return "BasicInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}

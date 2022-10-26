package com.company;

public class Student {
    private String lastName;
    private String firstName;
    private String phone;
    private String email;
    private int yearRegistered;
    private String studentNumber;

    public Student(String lastName, String firstName, String phone, String email, int yearRegistered, String studentNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.yearRegistered = yearRegistered;
        this.studentNumber = studentNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearRegistered() {
        return yearRegistered;
    }

    public void setYearRegistered(int yearRegistered) {
        this.yearRegistered = yearRegistered;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", yearRegistered=" + yearRegistered +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }

    public double averageGPA(){

    }

    public void listSubjectsWithNoGrade(){

    }

}

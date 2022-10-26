package com.company;

public class Subject {
    private String subjectCode;
    private String subjectDescription;
    private double grade;

    public Subject(String subjectCode, String subjectDescription, double grade) {
        this.subjectCode = subjectCode;
        this.subjectDescription = subjectDescription;
        this.grade = grade;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectDescription='" + subjectDescription + '\'' +
                ", grade=" + grade +
                '}';
    }

    public double averageGrade(String subjectCode){

    }

    public double averageGradePerSubjectAndDepartment(){

    }
}

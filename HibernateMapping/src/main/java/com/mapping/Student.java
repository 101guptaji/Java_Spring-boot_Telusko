package com.mapping;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;

import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    private int rollNo;

    @Column(name = "name")
    private String sName;

    @Column(name = "email")
    private String sEmail;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Courses> courses;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                ", sEmail='" + sEmail + '\'' +
                ", courses=" + courses +
                '}';
    }
}

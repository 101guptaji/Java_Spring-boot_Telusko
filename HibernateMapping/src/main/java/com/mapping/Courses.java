package com.mapping;

import jakarta.persistence.*;

@Entity
public class Courses {

    @Id
    @Column(name = "cid")
    private int cId;

    @Column(name = "cname")
    private String cName;
    private int credits;

    @ManyToOne
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "cName='" + cName + '\'' +
                ", cId=" + cId +
                ", credits=" + credits +
                '}';
    }
}

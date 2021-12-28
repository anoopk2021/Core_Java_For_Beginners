package model;

import java.util.Objects;

public class StudentModel {
    String name;
    int age;
    String branch;
    int rollno;

    public StudentModel(String name, int age, String branch, int rollno) {
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.rollno = rollno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentModel that = (StudentModel) o;
        return
                rollno == that.rollno;
    }

    @Override
    public int hashCode() {
        return  rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
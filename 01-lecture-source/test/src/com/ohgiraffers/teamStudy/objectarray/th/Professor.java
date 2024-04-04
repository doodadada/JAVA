package com.ohgiraffers.teamStudy.objectarray.th;

public class Professor {
    private int age;
    private String major;

    public Professor(int age, String major) {
        this.age = age;
        this.major = major;
    }

    public Professor() {
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}

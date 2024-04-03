package com.ohgiraffers.teamStudy.objectarray.jb.ex1;

public class Member {
    private String id;
    private String pwd;

    private String name;
    private int age;
    private char gender;

    public Member(String id, String pwd, String name, int age, char ch) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.gender = ch;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public Member() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

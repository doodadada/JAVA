package com.ohgiraffers.teamStudy.objectarray.th;

public class University {
    public University() {
    }
    private Student[] students;
    private Professor[] professors;


    public University(Student[] students, Professor[] professors) {
        this.students = students;
        this.professors = professors;
    }

    public void showStudent(Student[] st){
        for(Student s : st){
            System.out.print("학생 나이 : "+s.getAge());
            System.out.print(", ");
            System.out.print("학생 이름 : "+s.getName());
            System.out.println();
        }
    }

    public void showProfessor(Professor[] pr){
        for(Professor s : pr){
            System.out.print("교수 나이 : "+s.getAge());
            System.out.print(", ");
            System.out.print("교수 전공 : "+s.getMajor());
            System.out.println();
        }
    }
}

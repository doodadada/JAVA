package com.ohgiraffers.teamStudy.objectarray.jb.ex2;

public class Run {
    public static void main(String[] args) {
        //객체 배열 크기 3으로 할당
        Employee[] employees = new Employee[3];

        //0번 인덱스에는 기본생성자를 통해서 객체 생성
        employees[0] = new Employee();

        //1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
        employees[1] = new Employee(2,"자바만",30,'남',"010-1234-5678","서울시 종로구");
        //1번인덱스 부족한 요소 4개 : dept, job, salary, bonusPoint
        //2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
        employees[2] = new Employee(3,"사장임","임원진","대표이사",55,'여',100000,0.5,"010-7777-7777","서울시 강남구");
        for(Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println("=================================");
        //3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로)

        //0번인덱스
        employees[0].setEmpNo(1);
        employees[0].setEmpName("막내야");
        employees[0].setDept("영업팀");
        employees[0].setJob("사원");
        employees[0].setAge(24);
        employees[0].setGender('남');
        employees[0].setSalary(20000);
        employees[0].setBonusPoint(0.1);
        employees[0].setPhone("010-0000-1313");
        employees[0].setAddress("서울시 강서구");

        //1번인덱스
        employees[1].setDept("기획팀");
        employees[1].setJob("과장");
        employees[1].setSalary(50000);
        employees[1].setBonusPoint(0.2);
        System.out.println("=================================");

        //직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        for(int i =0;i<employees.length;i++){
            int sal = employees[i].getSalary();
            double bonus = employees[i].getBonusPoint();
            double money = (sal+(sal*bonus)*12);
            System.out.println(employees[i].getEmpName()+"의 연봉 : "+money);
        }
        System.out.println("=================================");
        //3명 직원의 연봉 평균을 구하여 출력
        double sum =0;
        for(int i =0;i<employees.length;i++){
            int sal = employees[i].getSalary();
            double bonus = employees[i].getBonusPoint();
            double money = (sal+(sal*bonus)*12);
            sum+=money;
        }
        double avg = sum/employees.length;
        System.out.println("직원들의 연봉의 평균 : "+avg+"원");

    }
}

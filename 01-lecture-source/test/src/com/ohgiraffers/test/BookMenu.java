package com.ohgiraffers.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private BookManager bookManager = new BookManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() { //s Application에서 객체 생성후 musicMenu 클래스의 mainMenu 함수를 호출했습니다.

        mainMenu:
        // label이라는 것입니다(저도 처음 알음)
        while (true) { //s 무한루프입니다, break문이 없으면 계속 반복문이 돌아갑니다.
            System.out.println("========== 메뉴 =========="); //line 25까지 메뉴판을 호출합니다.
            System.out.println("1. 책 추가");
            System.out.println("2. 책 전체 조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 저자명으로 검색");
            System.out.println("5. 책 제목으로 검색");
            System.out.println("6. 책 정보 수정");
            System.out.println("7. 책 삭제");
            System.out.println("0. 프로그램 종료");


            System.out.print("메뉴 선택 : "); //s 메뉴선택 하라고 유도구문 출력
            int menu = sc.nextInt(); //s int menu를 선언하고 콘솔에 입력받은 값을 nextInt()를 통해 정수값으로 초기화합니다.
            sc.nextLine(); //s 콘솔창에 보기 좋게 출력할라고 한줄 enter를 합니다.

            switch (menu) { //s 위에서 생성한 변수 menu에 대해 switch문으로 처리합니다.
                case 1: //s 받은 값이 1이면 책추가
                    addList(); //s 위 기능을 하는 함수 실행
                    break;
                case 2: //s 받은 값이 2이면(곡 전체 조회)
                    selectList();
                    break;
                case 3: //s 받은 값이 3이면(정렬하여 조회)
                    sortMenu();
                    break;
                case 4: //s 받은 값이 4이면(가수명으로 조회)
                    searchAuthor();
                    break;
                case 5: //s 받은 값이 5이면(곡명으로 조회)
                    searchTitle();
                    break;
                case 6: //s 받은 값이 6이면(곡 정보 수정)
                    updateBook();
                    break;
                case 7: //s 받은 값이 7이면(곡 삭제)
                    removeBook();
                    break;
                case 0: //s 받은 값이 0이면(프로그램 종료)
                    System.out.println("프로그램을 종료합니다.");
                    break mainMenu; //s 일반적으로 break는 break가 있는 반복문
                default:
                    System.out.println("잘못 선택하셨습니다. 번호를 다시 입력해주세요.");
                    break; //s 여기 default에 대한 break, 위에 case번호말고 다른 값을 입력받았을때에는 switch문만 탈출해서 while처음으로 다시 돌아갑니다
            }
        }
    }

        public void addList() {
            System.out.println("===== 책 추가 =====");
            System.out.print("저자명 입력 : ");
            String artist = sc.nextLine();
            System.out.print("책 제목 입력 : ");
            String title = sc.nextLine();

            bookManager.addList(new BookDTO(artist, title));
        }

        public void selectList(){
            System.out.println("===== 책 전체 조회 =====");
            List<BookDTO> bookList = bookManager.selectList();

            if (!bookList.isEmpty()) { //s 만약 책 목록이 빈값이 아니라면(!) 즉, 뭐라도 하나 들어있다면 (isEmpty는 원래 있던 함수)
                for (BookDTO book : bookList) { //s 반복문(여기서는 향상된 for문 사용)을 통해 각 book들을 출력합니다
                    System.out.println("등록된 도서 ID : "+book.getId()+", 책 저자 : "+book.getAuthor()+", 도서명 : "+book.getTitle());                }
            } else { //s bookList가 빈값이라면
                System.out.println("도서 목록이 없습니다.");
            }
        }

        public void searchAuthor(){
            System.out.println("===== 저자명으로 검색 =====");
            System.out.print("저자명 입력 : ");
            List<BookDTO> searchList = bookManager.searchAuthor(sc.nextLine());

            if (!searchList.isEmpty()) {
                for (int i = 0; i < searchList.size(); i++) {
                    System.out.println("등록된 도서 ID : "+searchList.get(i).getId()+", 책 저자 : "+searchList.get(i).getAuthor()+", 도서명 : "+searchList.get(i).getTitle());
                }
            } else {
                System.out.println("검색 결과가 없습니다.");
            }
        }

        public void searchTitle(){
            System.out.println("===== 책 제목으로 검색 =====");
            System.out.print("책 제목 입력 : ");
            List<BookDTO> searchList = bookManager.searchTitle(sc.nextLine());

            if (!searchList.isEmpty()) {
                for (int i = 0; i < searchList.size(); i++) {
                    System.out.println("등록된 도서 ID : "+searchList.get(i).getId()+", 책 저자 : "+searchList.get(i).getAuthor()+", 도서명 : "+searchList.get(i).getTitle());
                }
            } else {
                System.out.println("검색 결과가 없습니다.");
            }
        }

    public void sortMenu() { //s 정렬기능입니다 정렬은 무엇을 기준으로 정렬할지 선택지가 많아서 사용자가 그 기준을 정하도록 한번더 물어보는 구문을 출력하고 원하는 기준을 입력받습니다.
        System.out.println("===== 정렬 메뉴 ====="); //s 정렬 기준들 출력
        System.out.println("1. 저자명 오름차순 정렬");
        System.out.println("2. 도서명 오름차순 정렬");
        System.out.println("3. 저자명 내림차순 정렬");
        System.out.println("4. 도서명 내림차순 정렬");
        System.out.print("메뉴 선택 : ");
        int menu = sc.nextInt();

        sortCase(menu); //정렬 함수
    }

    public void sortCase(int menu){


        sortMenu:
        while(true) {
            System.out.println("===정렬하여 조회===");
            List<BookDTO> bookList = bookManager.selectList();

            if(bookList.isEmpty()){
                System.out.println("도서 목록이 없습니다.");
                return;
            }

            List<BookDTO> sortList = new ArrayList<>();
            sortList.addAll(bookList);
            switch (menu) {
                case 1:
                    sortList.sort(new AscAuthor());
                    for (int i = 0; i < sortList.size(); i++) {
                        System.out.println(sortList.get(i));
                    }
                    break sortMenu;
                case 2:
                    sortList.sort(new AscTitle());
                    for (int i = 0; i < sortList.size(); i++) {
                        System.out.println(sortList.get(i));
                    }
                    break sortMenu;
                case 3:
                    sortList.sort(new Comparator<BookDTO>() {
                        @Override
                        public int compare(BookDTO o1, BookDTO o2) {
                            return o2.getAuthor().compareTo(o1.getAuthor());
                        }
                    });
                    for (int i = 0; i < sortList.size(); i++) {
                        System.out.println(sortList.get(i));
                    }
                    break sortMenu;
                case 4:
                    sortList.sort(new Comparator<BookDTO>() {
                        @Override
                        public int compare(BookDTO o1, BookDTO o2) {
                            return o2.getTitle().compareTo(o1.getTitle());
                        }
                    });
                    for (int i = 0; i < sortList.size(); i++) {
                        System.out.println(sortList.get(i));
                    }
                    break sortMenu;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break sortMenu;
            }
        }

    }

    public void updateBook(){
        System.out.println("===== 책 정보 수정 =====");
        System.out.print("수정할 곡의 id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("수정할 저자명 : ");
        String updateAuthor = sc.nextLine();
        System.out.print("수정할 책 제목 : ");
        String updateTitle = sc.nextLine();

        BookDTO updateBook = new BookDTO(id, updateAuthor, updateTitle);

        if (bookManager.updateBook(updateBook)) {
            System.out.println("성공적으로 수정되었습니다.");
        } else {
            System.out.println("수정할 도서를 찾지 못했습니다.");
        }
    }

    public void removeBook(){
        System.out.println("===== 도서 삭제 =====");
        System.out.print("삭제할 도서의 id : ");
        if (bookManager.removeBook(sc.nextInt())) {
            System.out.println("성공적으로 삭제 되었습니다.");
        } else {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
        sc.nextLine();
    }










}

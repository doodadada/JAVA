package com.ohgiraffers.section04.uses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MusicMenu {

    private MusicManager musicManager = new MusicManager(); //s musicMenu에서 몇몇 기능을 관리하는 musicManager를 호출합니다. 보통 프로젝트 때 dto(자료구조들)따로, menu따로, 어떤 기능을 하는 함수들 따로 클래스를 정리해서 관리합니다(for 유지보수성)
    private Scanner sc = new Scanner(System.in); //콘솔에서 사용자의 값을 입력받기 위한 Scanner 객체 생성

    public void mainMenu() { //s Application에서 객체 생성후 musicMenu 클래스의 mainMenu 함수를 호출했습니다. (위에 두줄 보고오기)

        mainMenu: //s 이건 수업시간에 안배운 것 같은데 label이라는 것입니다(저도 처음 알음) 밑에서 사용처를 알려드릴께요 (이거만 궁금하면 line : 56 아니면 쭉 내려가기)
        while (true) { //s 무한루프입니다, break문이 없으면 계속 반복문이 돌아갑니다.
            System.out.println("========== 메뉴 =========="); //line 25까지 메뉴판을 호출합니다.
            System.out.println("1. 곡 추가");
            System.out.println("2. 곡 전체 조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 가수명으로 검색");
            System.out.println("5. 곡명으로 검색");
            System.out.println("6. 곡 정보 수정");
            System.out.println("7. 곡 삭제");
            System.out.println("0. 프로그램 종료");


            System.out.print("메뉴 선택 : "); //s 메뉴선택 하라고 유도구문 출력
            int menu = sc.nextInt(); //s int menu를 선언하고 콘솔에 입력받은 값을 nextInt()를 통해 정수값으로 초기화합니다.
            sc.nextLine(); //s 콘솔창에 보기 좋게 출력할라고 한줄 enter를 합니다.

            switch (menu) { //s 위에서 생성한 변수 menu에 대해 switch문으로 처리합니다.
                case 1: //s 받은 값이 1이면(곡추가)
                    addList(); //s 위 기능을 하는 함수 실행(아래 case들 역시 동일합니다, ctrl누른채로 함수명을 클릭해서 각 함수들에 대해 알아봅시다.)
                    break;
                case 2: //s 받은 값이 2이면(곡 전체 조회)
                    selectList();
                    break;
                case 3: //s 받은 값이 3이면(정렬하여 조회)
                    sortMenu();
                    break;
                case 4: //s 받은 값이 4이면(가수명으로 조회)
                    searchArtist();
                    break;
                case 5: //s 받은 값이 5이면(곡명으로 조회)
                    searchTitle();
                    break;
                case 6: //s 받은 값이 6이면(곡 정보 수정)
                    updateMusic();
                    break;
                case 7: //s 받은 값이 7이면(곡 삭제)
                    removeMusic();
                    break;
                case 0: //s 받은 값이 0이면(프로그램 종료)
                    System.out.println("프로그램을 종료합니다.");
                    break mainMenu; //s 일반적으로 break는 break가 있는 반복문(여기서는 switch문이 해당)을 탈출하는 구문인데, break label명;으로 만들면 해당 라발 반복문을 탈출합니다.(line 59)
                default:
                    System.out.println("잘못 선택하셨습니다. 번호를 다시 입력해주세요.");
                    break; //s 여기 default에 대한 break, 위에 case번호말고 다른 값을 입력받았을때에는 switch문만 탈출해서 while처음으로 다시 돌아갑니다 (line 16)
            }
        }

    }

    public void addList() { //s 곡추가 기능입니다 추가기능을 데에 return값은 필요없기에 함수 타입은 void입니다.
        System.out.println("===== 곡 추가 ====="); //s 곡추가기능이라고 인지시키기 위한 구문 출력
        System.out.print("가수 입력 : "); //s 추가할 곡의 가수 명 입력 유도구문 출력
        String artist = sc.nextLine(); //s 입력받은 값을 nextLine()으로
        System.out.print("제목 입력 : ");
        String title = sc.nextLine();

        musicManager.addList(new MusicDTO(artist, title));
    }

    public void selectList() {
        System.out.println("===== 곡 전체 조회 =====");
        List<MusicDTO> musicList = musicManager.selectList();

        if (!musicList.isEmpty()) { //s 만약 음악 목록이 빈값이 아니라면(!) 즉, 뭐라도 하나 들어있다면 (isEmpty는 원래 있던 함수)
            for (MusicDTO music : musicList) { //s 반복문(여기서는 향상된 for문 사용)을 통해 각 music들을 출력합니다
                System.out.println(music);
            }
        } else { //s musicList가 빈값이라면
            System.out.println("목록이 존재하지 않습니다.");
        }
    }

    public void sortMenu() { //s 정렬기능입니다 정렬은 무엇을 기준으로 정렬할지 선택지가 많아서 사용자가 그 기준을 정하도록 한번더 물어보는 구문을 출력하고 원하는 기준을 입력받습니다.
        System.out.println("===== 정렬 메뉴 ====="); //s 정렬 기준들 출력
        System.out.println("1. 가수명 오름차순 정렬");
        System.out.println("2. 곡명 오름차순 정렬");
        System.out.println("3. 가수명 내림차순 정렬");
        System.out.println("4. 곡명 내림차순 정렬");
        System.out.print("메뉴 선택 : ");
        int menu = sc.nextInt();

        ascDesc(menu); //정렬 함수
    }

    public void ascDesc(int menu) { //s 정렬 함수 호출했습니다
        System.out.println("===== 정렬하여 조회 ====="); //s 이 구문 아래 입력받은 기준으로 정렬해서 출력될 예정입니다.
        List<MusicDTO> musicList = musicManager.selectList(); //s 일단 정렬할 musicList를 호출합니다

        if (musicList.isEmpty()) { //s 만약 musicList가 비어있다면
            System.out.println("목록이 존재하지 않습니다."); //s 출력
            return; // void함수인데 'return;'을 사용하면 해당함수를 빠져나옵니다.
        }

        /* 정렬 시 원본 데s이터를 변경하므로 사본 데이터를 별도로 생성한다. */
        List<MusicDTO> sortList = new ArrayList<>();
        sortList.addAll(musicList);

        if (menu == 1) { //s if문으로 썼는데 switch문+break로도 만들면 만들수 있겠죠? 근데 반복요소가 없으니 굳이,,?
            /* 익명 클래스를 사용할 수도 있다. */
            sortList.sort(new Comparator<MusicDTO>() {

                @Override
                public int compare(MusicDTO o1, MusicDTO o2) {
                    return o1.getArtist().compareTo(o2.getArtist());
                }

            });
        } else if (menu == 2) {
            /* Comparator를 상속한 클래스를 사용할 수도 있다. */
            sortList.sort(new AscTitle());
        } else if (menu == 3) {
            sortList.sort(new DescArtist());
        } else {
            sortList.sort(new DescTitle());
        }

        for (int i = 0; i < sortList.size(); i++) {
            System.out.println(sortList.get(i));
        }
    }


    public void searchArtist() {
        System.out.println("===== 가수명으로 검색 =====");
        System.out.print("가수명 입력 : ");
        List<MusicDTO> searchList = musicManager.searchArtist(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void searchTitle() {
        System.out.println("===== 곡명으로 검색 =====");
        System.out.print("곡명 입력 : ");
        List<MusicDTO> searchList = musicManager.searchTitle(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }


    public void updateMusic() {
        System.out.println("===== 곡 정보 수정 =====");
        System.out.print("수정할 곡의 id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("수정할 가수명 : ");
        String updateArtist = sc.nextLine();
        System.out.print("수정할 제목명 : ");
        String updateTitle = sc.nextLine();

        MusicDTO updateMusic = new MusicDTO(id, updateArtist, updateTitle);

        if (musicManager.updateMusic(updateMusic)) {
            System.out.println("성공적으로 수정되었습니다.");
        } else {
            System.out.println("수정할 곡을 찾지 못했습니다.");
        }
    }

    public void removeMusic() {
        System.out.println("===== 곡 삭제 =====");
        System.out.print("삭제할 곡의 id : ");
        if (musicManager.removeMusic(sc.nextInt())) {
            System.out.println("성공적으로 삭제 되었습니다.");
        } else {
            System.out.println("삭제할 곡을 찾지 못했습니다.");
        }
        sc.nextLine();
    }

}



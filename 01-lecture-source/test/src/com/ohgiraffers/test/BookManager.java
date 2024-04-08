package com.ohgiraffers.test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List<BookDTO> bookList = new ArrayList<>();

    public void addList (BookDTO book){
        bookList.add(book);//s List의 함수, 괄호안의 값을 List 요소에 추가합니다.
    }

    public List<BookDTO> selectList(){
        return bookList;
    }

    public List<BookDTO> searchAuthor(String author){
        List<BookDTO> searchList = new ArrayList<>();
        for(BookDTO book : bookList){
            if(book.getAuthor().contains(author)){
                searchList.add(book);
            }
        }
        return searchList;
    }

    public List<BookDTO> searchTitle(String title) {

        /* 제목을 검색해서 해당 키워드가 포함되는 곡을 리턴하기 위한 리스트 */
        List<BookDTO> searchList = new ArrayList<>();

        for(BookDTO book : bookList) {
            if(book.getTitle().contains(title)) {
                searchList.add(book);
            }
        }

        return searchList;
    }

    public boolean updateBook(BookDTO updateBook){

        BookDTO old = null;

        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getId() == updateBook.getId()) {
                old = bookList.set(i, updateBook);
            }
        }
        return old != null;
    }


    public boolean removeBook(int id) {

        BookDTO old = null;

        for(int i = 0; i < bookList.size(); i++) {
            /* musicList에서 id가 일치하는 music 객체를 찾는다. */
            if(bookList.get(i).getId() == id) {
                old = bookList.remove(i);
            }
        }

        return old != null;
    }






}

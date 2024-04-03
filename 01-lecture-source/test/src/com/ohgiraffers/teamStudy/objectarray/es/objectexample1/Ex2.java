package com.ohgiraffers.teamStudy.objectarray.es.objectexample1;


public class Ex2 {
    private int orderNum;
    private String id;
    private String orderDate;
    private String name;
    private String productNum;
    private String address;

    public Ex2(int orderNum, String id, String orderDate, String name, String productNum, String address) {
        this.orderNum = orderNum;
        this.id = id;
        this.orderDate = orderDate;
        this.name = name;
        this.productNum = productNum;
        this.address = address;
    }

    public Ex2() {
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public String getId() {
        return id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getName() {
        return name;
    }

    public String getProductNum() {
        return productNum;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return
                "주문번호 : " + orderNum +"\n"+
                "주문자 아이디 : " + id + "\n" +
                "주문 날짜 : " + orderDate +"\n"+
                "주문자 이름 : " + name + "\n" +
                "주문 상품 번호 : " + productNum + "\n" +
                "배송 주소 : " + address;
    }
}

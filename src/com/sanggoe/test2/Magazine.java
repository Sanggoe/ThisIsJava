package com.sanggoe.test2;

public class Magazine extends Book {
    String date;

    public Magazine(String title, int pages, String writer, String date) {
        super(title, pages, writer);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Magazine magazineA = new Magazine("잡지A", 10, "기자A", "2010년 2월 25일");
        Magazine magazineB = new Magazine("잡지B", 20, "기자B", "2010년 3월 8일");

        System.out.println(magazineA.toString() + "\n발매일 : " + magazineA.getDate());
        System.out.println(magazineB.toString() + "\n발매일 : " + magazineB.getDate());
    }
}

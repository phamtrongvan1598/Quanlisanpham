package com.codegym.model;

public class Customer {
    private int id;
    private String name;
    private int giaca;
    private int soluong;
    public String category;
    public int idCategory;

    public Customer() {

    }

    public Customer(int id, String name, int giaca, int soluong,String category,int idCategory) {
        this.id = id;
        this.name = name;
        this.giaca = giaca;
        this.soluong = soluong;
        this.category = category;
        this.idCategory=idCategory;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGiaca() {
        return giaca;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiaca(int giaca) {
        this.giaca = giaca;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int tonkho) {
        this.soluong = soluong;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }
}

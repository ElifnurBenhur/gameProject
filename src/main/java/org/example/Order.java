package org.example;

import java.util.Date;

public class Order {
    private int id;
    private Date date;
    private Buyable[] buyables;
    private  Gamer gamer;
    private double totalCost;
    private  boolean isDeleted;

    public Order(int id, Date date, Buyable[] buyables, Gamer gamer, double totalCost, boolean isDeleted) {
        this.id = id;
        this.date = date;
        this.buyables = buyables;
        this.gamer = gamer;
        this.totalCost = totalCost;
        this.isDeleted = isDeleted;
    }
    public Order(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Buyable[] getBuyables() {
        return buyables;
    }

    public void setBuyables(Buyable[] buyables) {
        this.buyables = buyables;
    }

    public Gamer getGamer() {
        return gamer;
    }

    public void setGamer(Gamer gamer) {
        this.gamer = gamer;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}

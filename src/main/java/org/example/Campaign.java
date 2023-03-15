package org.example;

import java.util.Date;

public class Campaign {
   private int id;
    private int discountPercentage;
    private String description;
    private Buyable[] buyables;
    private Date startDate;
    private Date endDate;

    private  boolean isDeleted;

 public Campaign(int id, int discountPercentage, String description, Buyable[] buyables, Date startDate, Date endDate, boolean isDeleted) {
  this.id = id;
  this.discountPercentage = discountPercentage;
  this.description = description;
  this.buyables = buyables;
  this.startDate = startDate;
  this.endDate = endDate;
  this.isDeleted = isDeleted;
 }
 public Campaign(){

 }
 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public int getDiscountPercentage() {
  return discountPercentage;
 }

 public void setDiscountPercentage(int discountPercentage) {
  this.discountPercentage = discountPercentage;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public Buyable[] getBuyables() {
  return buyables;
 }

 public void setBuyables(Buyable[] buyables) {
  this.buyables = buyables;
 }

 public Date getStartDate() {
  return startDate;
 }

 public void setStartDate(Date startDate) {
  this.startDate = startDate;
 }

 public Date getEndDate() {
  return endDate;
 }

 public void setEndDate(Date endDate) {
  this.endDate = endDate;
 }

 public boolean isDeleted() {
  return isDeleted;
 }

 public void setDeleted(boolean deleted) {
  isDeleted = deleted;
 }
}

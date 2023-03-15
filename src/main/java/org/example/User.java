package org.example;

public class User {
    private int id;
    private String password;
    private String userName;
    private  boolean isDeleted;

    public User(int id, String password, String userName, boolean isDeleted) {
        this.id = id;
        this.password = password;
        this.userName = userName;
        this.isDeleted = isDeleted;
    }
    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}

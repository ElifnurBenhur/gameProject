package org.example;

import java.util.Date;

public class Gamer extends User{

    private int id;
    private String password;
    private String userName;

    private Game[] games;


    public Gamer(String nationalityId, String firstName, String lastName, Date birthDate, int id, String password, String userName, Game[] games) {
        super(nationalityId, firstName, lastName, birthDate);
        this.id = id;
        this.password = password;
        this.userName = userName;
        this.games = games;
    }

    public Gamer() {
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



    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }
}

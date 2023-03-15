package org.example;

import java.util.Date;

public class Gamer extends User{
    private String nationalityId;
    private  String firstName;
    private  String lastName;
    private Date birthDate;
    private Game[] games;

    public Gamer(int userID, String password, String username, boolean isDeleted, String nationalityId, String firstName, String lastName, Date birthDate, Game[] games) {
        super(userID, password, username, isDeleted);
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.games = games;
    }

    public Gamer() {
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }
}

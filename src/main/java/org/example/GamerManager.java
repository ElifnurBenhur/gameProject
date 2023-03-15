package org.example;
import java.util.List;
public class GamerManager{
    List<Gamer> gamers;
    UserManager userManager;

    public GamerManager(List<Gamer> gamers, UserManager userManager) {
        this.gamers = gamers;
        this.userManager = userManager;
    }

    void create(Gamer gamer){
        gamers.add(gamer);
    }
    void update(Gamer gamer){
        for (Gamer g:gamers
        ) {
            g.setBirthDate(gamer.getBirthDate());
            g.setGames(gamer.getGames());
            g.setFirstName(gamer.getFirstName());
            g.setLastName(gamer.getLastName());
            g.setNationalityId(gamer.getNationalityId());
            g.setPassword(gamer.getPassword());
            g.setUserName(gamer.getUserName());
        }
    }
    void delete(int id){
        for (Gamer gamer:gamers
        ) {
            if(gamer.getId()==id){
                gamer.setDeleted(true);
            }
        }
    }
}
/*


 */
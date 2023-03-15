package org.example;

import java.util.List;
public class GameManager {
    List<Game> games;

    public GameManager(List<Game> games) {
        this.games = games;
    }

    void create(Game game){
        games.add(game);

    }
    void update(Game game){
        for (Game g:games
             ) {
            if(g.getId()==game.getId()){
                g.setName(game.getName());
                g.setPrice(game.getPrice());

            }

        }

    }
    void delete(int id){
        for (Game game:games
             ) {
            if(game.getId()==id) {
                game.setDeleted(true);
            }
        }

    }
}

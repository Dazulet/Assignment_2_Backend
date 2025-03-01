package org.example;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
 public class PlayerRepository {
    private final Map<String, Player> players = new HashMap<>();

    public Player createPlayer(String name, String role) {
        Player player = new Player(name, role);
        players.put(name, player);
        return player;
    }
}

package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
class AdventureGameService implements GameService {
    private final PlayerRepository playerRepository;
    private Player player;

    @Autowired
    public AdventureGameService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public void startGame() {
        System.out.println("Starting Adventure Game");
        player = playerRepository.createPlayer("Daulet", "Hero");
        System.out.println("Player Created : " + player);
    }

    @Override
    public void attack() {
        System.out.println(player.getName() + " attacks the enemy!");
    }

    @Override
    public void levelUp() {
        player.levelUp();
        System.out.println(player.getName() + " leveled up! New level: " + player.getLevel());
    }
}
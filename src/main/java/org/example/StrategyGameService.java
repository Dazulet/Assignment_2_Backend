package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("strategyGame")
class StrategyGameService implements GameService {
    @Override
    public void startGame() {
        System.out.println("Starting Game");
    }

    @Override
    public void attack() {
        System.out.println("Strategy game attack");
    }

    @Override
    public void levelUp() {
        System.out.println("Strategy game level-up ");
    }
}

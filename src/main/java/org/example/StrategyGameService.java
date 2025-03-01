package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("strategyGame")
class StrategyGameService implements GameService {
    @Override
    public void startGame() {
        System.out.println("Starting Strategy Game...");
    }

    @Override
    public void attack() {
        System.out.println("Strategy game attack simulation.");
    }

    @Override
    public void levelUp() {
        System.out.println("Strategy game level-up mechanics.");
    }
}

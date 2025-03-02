package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        GameService primaryGameService = context.getBean(GameService.class);
        primaryGameService.startGame();
        primaryGameService.attack();
        primaryGameService.levelUp();

//        GameService strategyGameService = context.getBean(StrategyGameService.class);
//        strategyGameService.startGame();
//        strategyGameService.attack();
//        strategyGameService.levelUp();
//

//        context.getBean("lazyInitializer", GameInitializer.class);

        context.close();
    }
}
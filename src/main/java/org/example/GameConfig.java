package org.example;

import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import java.util.*;

@Configuration
@ComponentScan("org.example")
public class GameConfig {
    @Bean
    @Lazy
    public GameInitializer lazyInitializer() {
        return new GameInitializer();
    }

    @Bean
    public GameInitializer eagerInitializer() {
        return new GameInitializer();
    }
}
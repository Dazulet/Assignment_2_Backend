package org.example;

public class Player {
    private final String name;
    private final String role;
    private int level;

    public Player(String name, String role) {
        this.name = name;
        this.role = role;
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        level++;
    }

    @Override
    public String toString() {
        return "[ name = " + name + "', role = " + role + " level = " + level +" ]";
    }
}

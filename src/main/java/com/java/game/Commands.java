package com.java.game;

public enum Commands {
    PAPER("2");
    private final String value;

    Commands(String value) {
        this.value = value;
    }

    public static Commands of(String value) {
        for (Commands command : values()) {
            if (command.value.equals(value)) {
                return command;
            }
        }
        throw new IllegalArgumentException("Wrong command" + value);

    }
}
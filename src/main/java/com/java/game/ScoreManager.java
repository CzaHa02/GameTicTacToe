package com.java.game;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ScoreManager {
    private static final String SCORES_FILE= "scores.txt";
    private Map<String, Integer>scores;

    public ScoreManager(){
        this.scores=new HashMap<>();
        loadScores();
    }
    public void addScore(String playerName, int points) {
        int currentPoints = scores.getOrDefault(playerName, 0);
        scores.put(playerName, currentPoints + points);
        saveScores();
    }

    public void displayScores() {
        System.out.println("Previous games score: ");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("Player "+ entry.getKey() + ": " + entry.getValue() + " points");
        }
    }

    private void saveScores() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SCORES_FILE))) {
            oos.writeObject(scores);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadScores() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SCORES_FILE))) {
            Object readObject = ois.readObject();
            if (readObject instanceof HashMap) {
                scores = (HashMap<String, Integer>) readObject;
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }



}

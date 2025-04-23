package com.vardhan.collectionsframework;

import java.util.*;

public class StudentExamAnalyzer {
    private Map<String, Integer> studentScores = new HashMap<>();

    public void addOrUpdateScore(String name, int score) {
        studentScores.put(name, score);
    }

    public void printScoresSortedByName() {
        Map<String, Integer> sorted = new TreeMap<>(studentScores);
        System.out.println("Student Scores (sorted by name):");
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void printTopScorer() {
        int maxScore = Collections.max(studentScores.values());
        System.out.println("Top Scorer(s):");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            if (entry.getValue() == maxScore) {
                System.out.println(entry.getKey() + " → " + maxScore);
            }
        }
    }

    public void printAverageScore() {
        if (studentScores.isEmpty()) {
            System.out.println("No scores to analyze.");
            return;
        }
        int total = 0;
        for (int score : studentScores.values()) {
            total += score;
        }
        double average = (double) total / studentScores.size();
        System.out.printf("Average Score: %.2f\n", average);
    }

    public static void main(String[] args) {
        StudentExamAnalyzer analyzer = new StudentExamAnalyzer();
        analyzer.addOrUpdateScore("Alice", 85);
        analyzer.addOrUpdateScore("Bob", 92);
        analyzer.addOrUpdateScore("Charlie", 77);
        analyzer.addOrUpdateScore("David", 92); // Same top score as Bob

        analyzer.printScoresSortedByName();
        System.out.println();
        analyzer.printTopScorer();
        analyzer.printAverageScore();
    }
}

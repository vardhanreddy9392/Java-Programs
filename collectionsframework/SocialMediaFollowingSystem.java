package com.vardhan.collectionsframework;

import java.util.*;

public class SocialMediaFollowingSystem {
    private Map<String, Set<String>> followingMap = new HashMap<>();
    private Map<String, Set<String>> followersMap = new HashMap<>();

    public void follow(String follower, String followee) {
        followingMap.putIfAbsent(follower, new HashSet<>());
        followersMap.putIfAbsent(followee, new HashSet<>());
        followingMap.get(follower).add(followee);
        followersMap.get(followee).add(follower);
    }

    public void unfollow(String follower, String followee) {
        if (followingMap.containsKey(follower)) {
            followingMap.get(follower).remove(followee);
        }
        if (followersMap.containsKey(followee)) {
            followersMap.get(followee).remove(follower);
        }
    }

    public void printFollowing(String user) {
        Set<String> following = new TreeSet<>(followingMap.getOrDefault(user, new HashSet<>()));
        System.out.println(user + " is following:");
        Iterator<String> it = following.iterator();
        while (it.hasNext()) {
            System.out.println(" - " + it.next());
        }
    }

    public void printFollowers(String user) {
        Set<String> followers = new TreeSet<>(followersMap.getOrDefault(user, new HashSet<>()));
        System.out.println(user + " has followers:");
        Iterator<String> it = followers.iterator();
        while (it.hasNext()) {
            System.out.println(" - " + it.next());
        }
    }

    public static void main(String[] args) {
        SocialMediaFollowingSystem sm = new SocialMediaFollowingSystem();
        sm.follow("Alice", "Bob");
        sm.follow("Alice", "Charlie");
        sm.follow("David", "Bob");
        sm.follow("Bob", "Alice");

        sm.printFollowing("Alice");
        sm.printFollowers("Bob");

        sm.unfollow("Alice", "Bob");
        System.out.println("\nAfter Alice unfollows Bob:");
        sm.printFollowing("Alice");
        sm.printFollowers("Bob");
    }
}

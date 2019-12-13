package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    Statistics stats;
    int usersCount;
    int postsCount;
    int commentsCount;
    int avgPostsPerUser;
    int avgCommentsPerUser;
    int avgCommentsPerPost;

    public ForumStatistics(Statistics stats) {
        this.stats = stats;
        calculateAdvStatistics(stats);
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount != 0) {
            avgPostsPerUser = postsCount / usersCount;
            avgCommentsPerUser = commentsCount / usersCount;
        } else {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        }
        if (postsCount != 0)
            avgCommentsPerPost = commentsCount / postsCount;
        else
            avgCommentsPerPost = 0;
    }

    public String showStatistics() {
        return "Liczba użytkowników: " + usersCount +"\n" +
                "Liczba postów: " + postsCount + "\n" +
                "Liczba komentarzy: " + commentsCount + "\n" +
                "Srednia liczba postów na użytkownika: " + avgPostsPerUser + "\n" +
                "Srednia liczba komentarzy na użytkownika: " + avgCommentsPerUser + "\n" +
                "Srednia liczba komentarzy na post: " + avgCommentsPerPost + "\n";
    }
}

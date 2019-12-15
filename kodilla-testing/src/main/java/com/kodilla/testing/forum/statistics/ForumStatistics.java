package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    Statistics stats;
    int usersCount;
    int postsCount;
    int commentsCount;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;

    public ForumStatistics(Statistics stats) {
        this.stats = stats;
        calculateAdvStatistics(stats);
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount != 0) {
            avgPostsPerUser = postsCount / (double)usersCount;
            avgCommentsPerUser = commentsCount / (double)usersCount;
        } else {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        }
        if (postsCount != 0)
            avgCommentsPerPost = commentsCount / (double)postsCount;
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

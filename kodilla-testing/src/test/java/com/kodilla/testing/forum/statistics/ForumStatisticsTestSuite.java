package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMock() {
        Statistics statsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<String>();
        usersList.add("pierwszy");
        usersList.add("drugi");
        usersList.add("trzeci");
        usersList.add("czwarty");
        usersList.add("piaty");
        when(statsMock.usersNames()).thenReturn(usersList);
        //liczba postów = 0
        when(statsMock.postsCount()).thenReturn(0);
        ForumStatistics forumStats = new ForumStatistics(statsMock);
        Assert.assertEquals(0, forumStats.avgPostsPerUser);
        //liczba postów = 1000git
        when(statsMock.postsCount()).thenReturn(1000);
        forumStats = new ForumStatistics(statsMock);
        Assert.assertEquals(200, forumStats.avgPostsPerUser);
        //liczba komentarzy < liczba postów
        when(statsMock.commentsCount()).thenReturn(100);
        Assert.assertEquals(0, forumStats.avgCommentsPerPost);
        //liczba komentarzy > liczba postów
        when(statsMock.commentsCount()).thenReturn(10000);
        forumStats = new ForumStatistics(statsMock);
        Assert.assertEquals(10, forumStats.avgCommentsPerPost);
        //liczba użytkowników = 0
        usersList.clear();
        forumStats = new ForumStatistics(statsMock);
        Assert.assertEquals(0, forumStats.avgCommentsPerUser);
        //liczba użytkowników = 100, liczba komentarzy = 10000
        for (int i = 0; i < 100; i++) {
            usersList.add("user" + i);
        }
        forumStats = new ForumStatistics(statsMock);
        Assert.assertEquals(100, forumStats.avgCommentsPerUser);
    }
}

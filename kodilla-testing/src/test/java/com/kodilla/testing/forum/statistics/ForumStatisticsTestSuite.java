package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testCaseNoPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<String>();
        usersList.add("pierwszy");
        usersList.add("drugi");
        usersList.add("trzeci");
        usersList.add("czwarty");
        usersList.add("piaty");
        when(statsMock.usersNames()).thenReturn(usersList);
        //When
        when(statsMock.postsCount()).thenReturn(0);
        ForumStatistics forumStats = new ForumStatistics(statsMock);
        //Then
        Assert.assertEquals(0, forumStats.avgPostsPerUser, 0);
    }
    @Test
    public void testCase1000Posts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<String>();
        usersList.add("pierwszy");
        usersList.add("drugi");
        usersList.add("trzeci");
        usersList.add("czwarty");
        usersList.add("piaty");
        when(statsMock.usersNames()).thenReturn(usersList);
        //When
        when(statsMock.postsCount()).thenReturn(1000);
        ForumStatistics forumStats = new ForumStatistics(statsMock);
        //Then
        Assert.assertEquals(200, forumStats.avgPostsPerUser, 0);
    }
    @Test
    public void testCaseNoComments() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<String>();
        usersList.add("pierwszy");
        usersList.add("drugi");
        usersList.add("trzeci");
        usersList.add("czwarty");
        usersList.add("piaty");
        when(statsMock.usersNames()).thenReturn(usersList);
        //When
        when(statsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStats = new ForumStatistics(statsMock);
        //Then
        Assert.assertEquals(0, forumStats.avgCommentsPerUser, 0);
    }
    @Test
    public void testCaseLessCommentsThanPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        //When
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(100);
        ForumStatistics forumStats = new ForumStatistics(statsMock);
        //Then
        Assert.assertEquals(0.1, forumStats.avgCommentsPerPost, 0);
    }
    @Test
    public void testCaseMoreCommentsThanPosts() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        //When
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(10000);
        ForumStatistics forumStats = new ForumStatistics(statsMock);
        //Then
        Assert.assertEquals(10, forumStats.avgCommentsPerPost, 0);
    }
    @Test
    public void testCaseNoUsers() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<String>();
        when(statsMock.usersNames()).thenReturn(usersList);
        //When
        when(statsMock.postsCount()).thenReturn(10);
        ForumStatistics forumStats = new ForumStatistics(statsMock);
        //Then
        Assert.assertEquals(0, forumStats.avgPostsPerUser, 0);
    }
    @Test
    public void testCase100Users() {
        //Given
        Statistics statsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user" + i);
        }
        when(statsMock.usersNames()).thenReturn(usersList);
        //When
        when(statsMock.postsCount()).thenReturn(200);
        ForumStatistics forumStats = new ForumStatistics(statsMock);
        //Then
        Assert.assertEquals(2, forumStats.avgPostsPerUser, 0);
    }
}

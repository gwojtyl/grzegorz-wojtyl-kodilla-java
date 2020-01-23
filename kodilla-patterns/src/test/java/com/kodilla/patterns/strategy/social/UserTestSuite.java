package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        User adam = new Millenials("Adam");
        User chris = new YGeneration("Chris");
        User jessica = new ZGeneration("Z-Gen");

        String adamShare = adam.shareMedia();
        System.out.println("Adam shares media to " + adamShare);
        String chrisShare = chris.shareMedia();
        System.out.println("Chris shares media to " + chrisShare);
        String jessicaShare = jessica.shareMedia();
        System.out.println("Jessica shares media to " + jessicaShare);

        Assert.assertEquals("Facebook", adamShare);
        Assert.assertEquals("Twitter", chrisShare);
        Assert.assertEquals("Snapchat", jessicaShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        User adam = new Millenials("Adam");

        String adamShare = adam.shareMedia();
        System.out.println("Adam shares media to " + adamShare);
        adam.setSocialPublisher(new TwitterPublisher());
        adamShare = adam.shareMedia();
        System.out.println("Adam now shares media to " + adamShare);

        Assert.assertEquals("Twitter", adamShare);
    }
}

package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void log() {
        Logger.getInstance().log("data");
    }

    @Test
    public void getLastLog() {
        String data = Logger.getInstance().getLastLog();
        System.out.println(data);
        Assert.assertEquals("data", data);
    }
}

package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "marek", 'm',
                LocalDate.of(1990, Month.APRIL, 2), 4));
        usersList.add(new ForumUser(2, "marianna", 'f',
                LocalDate.of(2000, Month.AUGUST, 30), 0));
        usersList.add(new ForumUser(3, "czarek", 'm',
                LocalDate.of(1995, Month.MARCH, 12), 5));
        usersList.add(new ForumUser(4, "franek", 'm',
                LocalDate.of(1991, Month.DECEMBER, 15), 0));
        usersList.add(new ForumUser(5, "frania", 'f',
                LocalDate.of(1999, Month.NOVEMBER, 22), 1));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(usersList);
    }
}

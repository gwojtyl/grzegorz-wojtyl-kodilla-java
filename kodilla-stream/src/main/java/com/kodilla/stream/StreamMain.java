package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Witam", (text -> text + "ABC"));
        poemBeautifier.beautify("Siema", (text -> "***" + text + "***"));
        poemBeautifier.beautify("Nudny tekst", (text -> "Bardzo " + text.toLowerCase()));
        poemBeautifier.beautify("hello", (text -> text.toUpperCase() + "!"));


        Forum forum = new Forum();

        Map<Integer, ForumUser> mapOfUsers = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> Period.between(forumUser.getBirthDate(),LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements: " + mapOfUsers.size());
        mapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

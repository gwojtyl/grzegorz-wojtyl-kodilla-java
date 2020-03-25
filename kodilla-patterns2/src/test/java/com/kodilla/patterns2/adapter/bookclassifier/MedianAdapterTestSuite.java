package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        Book toKillAMockingbird = new Book("Harper Lee", "To Kill a Mockingbird", 1960, "0738095236881");
        Book greatGatsby = new Book("F. Scott Fitzgerald", "Great Gatsby", 1925, "178236");
        Book prideAndPrejudice = new Book("Jane Austen", "Pride and Prejudice", 1813, "4920839");
        Set<Book> books = new HashSet<>(Arrays.asList(toKillAMockingbird, greatGatsby, prideAndPrejudice));
        MedianAdapter medianAdapter = new MedianAdapter();

        int median = medianAdapter.publicationYearMedian(books);

        assertEquals(1925, median, 0);
    }
}

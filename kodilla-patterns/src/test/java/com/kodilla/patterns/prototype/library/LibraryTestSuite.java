package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Library booksLibrary = new Library("Adventure books");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> booksLibrary.getBooks()
                        .add(new Book("Book" + n, "Author" + n, LocalDate.of(1990 + n, n, n))));

        //shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = booksLibrary.shallowCopy();
            clonedLibrary.setName("Fantasy books");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = booksLibrary.deepCopy();
            deepClonedLibrary.setName("Action books");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        booksLibrary.getBooks().add(new Book("Book11", "Auhor11", LocalDate.of(2001, 11, 11)));

        System.out.println(booksLibrary);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(11, booksLibrary.getBooks().size());
        Assert.assertEquals(11, clonedLibrary.getBooks().size());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), booksLibrary.getBooks());
    }
}

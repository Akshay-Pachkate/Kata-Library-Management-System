package com.kata.lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    void testBookCreation() {
        Book book = new Book("1234567890", "Test Book", "Test Author", 2023);
        assertNotNull(book);
        assertEquals("1234567890", book.getIsbn());
        assertEquals("Test Book", book.getTitle());
        assertEquals("Test Author", book.getAuthor());
        assertEquals(2023, book.getPublicationYear());
    }

    @Test
    void testInvalidIsbn() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("", "Test Book", "Test Author", 2023);
        });
    }

    @Test
    void testInvalidTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("1234567890", "", "Test Author", 2023);
        });
    }

    @Test
    void testInvalidAuthor() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("1234567890", "Test Book", "", 2023);
        });
    }

    @Test
    void testInvalidPublicationYear() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("1234567890", "Test Book", "Test Author", -1);
        });
    }
}

package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {
    App app;

    @BeforeEach
    void setup() {
        app = new App();
    }

    @Test
    void testAddTask() {
        app.add("Do your homework");
        assertEquals(1, app.getTaskCount());
    }

    @Test
    void testCompleteTask() {
        app.add("Restock the store");
        app.complete(0);
        assertTrue(app.isTaskComplete(0));
    }

    @Test
    void testClearList() {
        app.add("Task number 2");
        app.add("Task 5");
        app.clear();
        assertEquals(0, app.getTaskCount());
    }

    @Test
    void testInvalidComplete() {

        app.complete(99);
        assertEquals(0, app.getTaskCount());
    }
}
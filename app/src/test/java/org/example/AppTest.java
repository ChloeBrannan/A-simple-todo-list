package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {
    TodoList list;

    @BeforeEach
    void setup() {
        list = new TodoList();
    }

    @Test
    void testAddTask() {
        list.add("Do your homework");
        assertEquals(1, list.getTaskCount());
    }

    @Test
    void testCompleteTask() {
        list.add("Restock the store");
        list.complete(0);
        assertTrue(list.isTaskComplete(0));
    }

    @Test
    void testClearList() {
        list.add("Task number 2");
        list.add("Task 5");
        list.clear();
        assertEquals(0, list.getTaskCount());
    }

    @Test
    void testInvalidComplete() {
        list.complete(99);
        // Task count should still be 0 if nothing was added
        assertEquals(0, list.getTaskCount());
    }
}
package wk8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularQueueTest {
    private PureQueue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new CircularQueue<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void offer() {
    }

    @Test
    void poll() {
    }

    @Test
    void peek() {
    }

    @Test
    void size() {
        Assertions.assertEquals(0, queue.size());
        queue.offer(3);
        queue.offer(3);
        queue.offer(3);
        queue.poll();
        queue.poll();
        queue.offer(3);
        queue.offer(3);
        queue.offer(3);
        queue.poll();
        queue.poll();
        queue.poll();
        Assertions.assertEquals(1, queue.size());
    }
}
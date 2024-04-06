package org.eclipse.jakarta.hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

    @Test
    void getHello() {
        var hello = new Hello("myname");
        assertEquals("myname", hello.getHello());
    }
}

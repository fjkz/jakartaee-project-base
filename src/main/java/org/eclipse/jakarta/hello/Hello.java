package org.eclipse.jakarta.hello;

/** Response to hello. */
public class Hello {

    private String name;
    
    public Hello(String name) {
        this.name = name;
    }

    public String getHello() {
        return name;
    }
}

package org.eclipse.jakarta.hello;

import lombok.AllArgsConstructor;

/** Response to hello. */
@AllArgsConstructor
public class Hello {

    private String name;

    public String getHello() {
        return name;
    }
}

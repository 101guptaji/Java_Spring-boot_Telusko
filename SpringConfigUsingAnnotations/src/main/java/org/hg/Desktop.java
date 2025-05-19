package org.hg;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    @Override
    public void print() {
        System.out.println("Desktop is printing.");
    }
}

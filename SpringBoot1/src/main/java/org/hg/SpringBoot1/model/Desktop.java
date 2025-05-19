package org.hg.SpringBoot1.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop has built.");
    }

    @Override
    public void compile() {
        System.out.println("Desktop is compiling.");
    }
}

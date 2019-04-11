package net.java.main.io;

import java.io.IOException;

public class ConsoleWriter implements net.java.main.interfaces.OutputWriter {


    @Override
    public void writeLine(String line) throws IOException {
        System.out.println(line);
    }
}

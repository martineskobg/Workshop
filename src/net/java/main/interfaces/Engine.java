package net.java.main.interfaces;

import net.java.main.exceptions.NotEnoughEnergyException;

import java.io.IOException;

public interface Engine {
    void start() throws IOException, NotEnoughEnergyException;
}

package net.java.main.interfaces;

import net.java.main.exceptions.GameException;
import net.java.main.exceptions.NotEnoughEnergyException;

public interface Command {
    String execute(String[] args) throws GameException, NotEnoughEnergyException;

}

package net.java.main;

import net.java.main.core.GameEngine;
import net.java.main.dispachers.CommandDispatcher;
import net.java.main.exceptions.NotEnoughEnergyException;
import net.java.main.interfaces.*;
import net.java.main.io.ConsoleReader;
import net.java.main.io.ConsoleWriter;
import net.java.main.models.BattlegroundImpls;
import net.java.main.models.units.Marine;
import net.java.main.repository.UnitRepository;

import java.io.IOException;

public class Main {
    private static final int ROWS = 5;
    private static final int COLS = 5;

    public static void main(String[] args) throws IOException, NotEnoughEnergyException {

        InputReader reader = new ConsoleReader();
        OutputWriter writer = new ConsoleWriter();
        Battleground battleground = new BattlegroundImpls(ROWS, COLS);
        Repository<Unit> unitRepository =new UnitRepository();

        CommandDispatcher commandDispatcher = new CommandDispatcher(battleground, unitRepository);
        Engine gameEngine = new GameEngine(reader, writer, commandDispatcher);
        gameEngine.start();


    }
}

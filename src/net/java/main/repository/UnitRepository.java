package net.java.main.repository;

import net.java.main.constants.ExceptionMessagesConstants;
import net.java.main.exceptions.GameException;
import net.java.main.exceptions.NoUnitToRemoveException;
import net.java.main.interfaces.Repository;
import net.java.main.interfaces.Unit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UnitRepository implements Repository<Unit> {

   private Map<String, Unit> units;

    public UnitRepository() {
        this.units = new HashMap<>();
    }

    @Override
    public void save(Unit unit) {
        this.units.putIfAbsent(unit.getName(), unit);


    }

    @Override
    public void remove(Unit unit) throws GameException {
        if (!this.units.containsKey(unit.getName())) {
            throw new NoUnitToRemoveException(ExceptionMessagesConstants.NO_UNIT_TO_REMOVE_EXCEPTION_MESSAGE);
        }
    }

    @Override
    public Collection<Unit> findAll() {
        return this.units.values();
    }

    @Override
    public Unit findByName(String name) {
        return this.units.get(name);
    }
}

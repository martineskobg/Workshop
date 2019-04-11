package net.java.main.interfaces;

import net.java.main.exceptions.GameException;

import java.util.Collection;

public interface Repository<T>{
    void save(T element);
    void remove(T element) throws GameException;
    Collection<Unit> findAll();
    T findByName(String name);

}

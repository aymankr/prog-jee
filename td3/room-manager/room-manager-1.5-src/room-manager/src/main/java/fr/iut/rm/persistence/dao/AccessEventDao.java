package fr.iut.rm.persistence.dao;

import fr.iut.rm.persistence.domain.AccessEvent;
import fr.iut.rm.persistence.domain.Room;

import java.util.List;

public interface AccessEventDao {

    void addEntry(Room room, String name);

    void addExit(Room room, String name);

    List<AccessEvent> findAll();

    List<AccessEvent> findPersonsEvents(String name);
}

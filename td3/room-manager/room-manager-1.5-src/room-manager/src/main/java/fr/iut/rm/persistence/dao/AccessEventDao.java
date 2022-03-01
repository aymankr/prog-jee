package fr.iut.rm.persistence.dao;

import fr.iut.rm.persistence.domain.AccessEvent;
import fr.iut.rm.persistence.domain.Room;

import java.util.List;

public interface AccessEventDao {
    void saveOrUpdate(AccessEvent accessEvent);
    void deleteAccessEvent(final String name);

    List<AccessEvent> findAll();
    AccessEvent findByName(final String name);
    void addEntry(Room room, String person);
    void addExit(Room room, String person);
}


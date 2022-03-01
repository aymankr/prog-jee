package fr.iut.rm.persistence.dao.impl;

import com.google.inject.Singleton;
import fr.iut.rm.persistence.dao.AccessEventDao;
import fr.iut.rm.persistence.domain.AccessEvent;
import fr.iut.rm.persistence.domain.Room;

import java.util.List;

@Singleton
public class AccessEventDaoImpl implements AccessEventDao {
    @Override
    public void addEntry(Room room, String name) {

    }

    @Override
    public void addExit(Room room, String name) {

    }

    @Override
    public List<AccessEvent> findAll() {
        return null;
    }

    @Override
    public List<AccessEvent> findPersonsEvents(String name) {
        return null;
    }
}

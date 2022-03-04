package fr.iut.rm.persistence.dao;

import fr.iut.rm.persistence.domain.AccessEvent;
import fr.iut.rm.persistence.domain.Room;

import java.util.List;

public interface AccessEventDao {

    List<AccessEvent> findAll();

    List<AccessEvent> findByPerson(String name);

    void saveOrUpdate(final AccessEvent ae);
}

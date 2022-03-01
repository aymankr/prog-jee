package fr.iut.rm.control;

import com.google.inject.Inject;
import com.google.inject.persist.UnitOfWork;
import fr.iut.rm.persistence.dao.AccessEventDao;
import fr.iut.rm.persistence.domain.AccessEvent;
import fr.iut.rm.persistence.domain.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ControlAccessEvent {
    /**
     * Logger
     */
    private static final Logger logger = LoggerFactory.getLogger(ControlAccessEvent.class);


    @Inject
    UnitOfWork unitOfWork;


    @Inject
    AccessEventDao accessEventDao;

    public void addEntry(String name) {
        unitOfWork.begin();


        unitOfWork.end();
    }

    public void removeExit(String name) {
        unitOfWork.begin();


        unitOfWork.end();
    }

    public void showAccessEvents() {
        unitOfWork.begin();

        List<AccessEvent> accessEvents = accessEventDao.findAll();
        if (accessEvents.isEmpty()) {
            System.out.println("No access events");
        } else {
            System.out.println("Access events :");
            System.out.println("--------");
            for (AccessEvent accessEvent : accessEvents) {
                System.out.println(String.format("   [%d], name '%s'", accessEvent.getId(), accessEvent.getName()));
            }
        }

        unitOfWork.end();
    }

}

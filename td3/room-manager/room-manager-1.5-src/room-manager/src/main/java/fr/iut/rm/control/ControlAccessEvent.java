package fr.iut.rm.control;

import com.google.inject.Inject;
import com.google.inject.persist.UnitOfWork;
import fr.iut.rm.persistence.dao.AccessEventDao;
import fr.iut.rm.persistence.dao.RoomDao;
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

    /**
     * Unit of work is used to drive DB Connection
     */
    @Inject
    UnitOfWork unitOfWork;

    /**
     * Data Access Object for rooms
     */
    @Inject
    AccessEventDao accessEventDao;

    RoomDao roomDao;

    public void showEvents() {
        unitOfWork.begin();

        List<AccessEvent> rooms = accessEventDao.findAll();
        if (rooms.isEmpty()) {
            System.out.println("No room");
        } else {
            System.out.println("Rooms :");
            System.out.println("--------");
            for (AccessEvent ae : rooms) {
                System.out.println(String.format("   [%d], room: '%s'   person: '%s',     date'%s'", ae.getId(), ae.getRoom(),ae.getPersonName(), ae.getDate().toString()));
            }
        }
        unitOfWork.end();
    }

    public void followEvents(String person) {

    }

    public void exitRoom(String[] val) {
    }

    public void enterRoom(String[] val) {
    }

}

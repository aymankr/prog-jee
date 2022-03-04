package fr.iut.rm.control;

import com.google.inject.Inject;
import com.google.inject.persist.UnitOfWork;
import fr.iut.rm.persistence.dao.AccessEventDao;
import fr.iut.rm.persistence.dao.RoomDao;
import fr.iut.rm.persistence.domain.AccessEvent;
import fr.iut.rm.persistence.domain.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    /**
     *
     */
    @Inject
    RoomDao roomDao;


    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void showEvents() {
        unitOfWork.begin();

        List<AccessEvent> events = accessEventDao.findAll();
        if (events.isEmpty()) {
            System.out.println("No room");
        } else {
            System.out.println("Rooms :");
            System.out.println("--------");
            for (AccessEvent ae : events) {
                System.out.println(String.format("   [%d], room: '%s'   person: '%s' got in:'%b'", ae.getId(), ae.getRoom().getName(),
                        ae.getPersonName(), ae.getEvent()) + "   at " + formatter.format(ae.getDate()));
            }
        }
        unitOfWork.end();
    }

    public void followEvents(String person) {
        unitOfWork.begin();

        List<AccessEvent> events = accessEventDao.findByPerson(person);
        if (events.isEmpty()) {
            System.out.println("No events");
        } else {
            System.out.println("Events :");
            System.out.println("--------");
            for (AccessEvent ae : events) {
                System.out.println(String.format("   [%d], room: '%s'   person: '%s' got in:'%b'", ae.getId(), ae.getRoom().getName(),
                        ae.getPersonName(), ae.getEvent()) + "   at " + formatter.format(ae.getDate()));
            }
        }
        unitOfWork.end();
    }

    public void createAccessEvent(String[] val, boolean event) {
        unitOfWork.begin();

        if (roomDao.findByName(val[0])!=null) {
            Room room = roomDao.findByName(val[0]);
            AccessEvent ae = new AccessEvent();
            ae.setEvent(event);
            ae.setPersonName(val[1]);
            ae.setRoom(room);
            ae.setDate(new Date());
            accessEventDao.saveOrUpdate(ae);
        }
        unitOfWork.end();
    }

}

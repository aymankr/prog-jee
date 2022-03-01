package fr.iut.rm.control;

import com.google.inject.Inject;
import com.google.inject.persist.UnitOfWork;
import fr.iut.rm.persistence.dao.RoomDao;
import fr.iut.rm.persistence.domain.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by cjohnen on 02/02/17.
 */
public class ControlRoom {
    /**
     * Logger
     */
    private static final Logger logger = LoggerFactory.getLogger(ControlRoom.class);

    /**
     * Unit of work is used to drive DB Connection
     */
    @Inject
    UnitOfWork unitOfWork;

    /**
     * Data Access Object for rooms
     */
    @Inject
    RoomDao roomDao;

     /*
     * * Displays all the rooms content in DB
     */
    public void showRooms() {
        unitOfWork.begin();

        List<Room> rooms = roomDao.findAll();
        if (rooms.isEmpty()) {
            System.out.println("No room");
        } else {
            System.out.println("Rooms :");
            System.out.println("--------");
            for (Room room : rooms) {
                System.out.println(String.format("   [%d], name '%s'", room.getId(), room.getName()));
            }
        }

        unitOfWork.end();
    }

    /**
     * Creates a room in DB
     *
     * @param String[] args
     */
    public void createRoom(final String[] args) {
        unitOfWork.begin();

        if (roomDao.findByName(args[0]) == null) {
            Room room = new Room();
            room.setName(args[0]);
            if (args.length > 1 && args[1].length() <= 10) {
                room.setDescription(args[1]);
            }
            roomDao.saveOrUpdate(room);
        }
        unitOfWork.end();
    }

    public void deleteRoom(final String name) {
        unitOfWork.begin();

        Room room = roomDao.findByName(name);
        if (room!=null) {
            roomDao.deleteRoom(name);
        }
        roomDao.saveOrUpdate(room);
        unitOfWork.end();
    }
}

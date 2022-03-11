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

<<<<<<< HEAD
     /*
=======
    /*
>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092
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
                System.out.println(String.format("   [%d], name: '%s'   description: '%s'", room.getId(), room.getName(),room.getDescription()));
            }
        }

        unitOfWork.end();
    }

    /**
     * Creates a room in DB
     *
     * @param val the name of the room and the description
     */
    public void createRoom(final String[] val) {
        unitOfWork.begin();

        if (roomDao.findByName(val[0])==null) {
            Room room = new Room();
            room.setName(val[0]);
            if (val.length > 1)
                if (val[1].length() <= 10)
                    room.setDescription(val[1]);

            roomDao.saveOrUpdate(room);
        }
        unitOfWork.end();
    }

    public void deleteRoom(final String name){
        unitOfWork.begin();

        Room room = roomDao.findByName(name);
        if (room!=null){
            roomDao.delete(name);
        }else{
            System.out.println("Salle non existente: "+ name);
        }
        unitOfWork.end();
    }
}

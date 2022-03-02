package fr.iut.rm.persistence.dao.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import fr.iut.rm.persistence.dao.AccessEventDao;
import fr.iut.rm.persistence.domain.AccessEvent_;
import fr.iut.rm.persistence.domain.Room;
import fr.iut.rm.persistence.domain.AccessEvent;
import fr.iut.rm.persistence.domain.Room_;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Provider;
import javax.persistence.EntityManager;
import java.util.List;

@Singleton
public class AccessEventDaoImpl implements AccessEventDao {

    private static final Logger logger = LoggerFactory.getLogger(AccessEventDaoImpl.class);

    @Inject
    private Provider<EntityManager> em;


    @Override
    @Transactional
    public void saveOrUpdate(final AccessEvent ae) {
        this.em.get().persist(ae);
        logger.debug("AccessEvent '{}' saved", ae.getId());
    }


    @Override
    @Transactional
    public List<AccessEvent> findAll() {
        StringBuilder query = new StringBuilder("from ");
        query.append(AccessEvent.class.getName());
        List<AccessEvent> ae = em.get().createQuery(query.toString()).getResultList();
        logger.debug("{} accessEvent found", ae);
        return ae;
    }

    @Override
    @Transactional
    public List<AccessEvent> findByPerson(String name) {
        StringBuilder query = new StringBuilder("from ");
        query.append(AccessEvent.class.getName()).append(" as accessEvent");
        query.append(" where accessEvent.").append(AccessEvent_.personName.getName()).append(" = :name");

        List<AccessEvent> resultList = em.get().createQuery(query.toString()).setParameter("name", name).getResultList();

        if (resultList.size() > 0) {
            logger.debug("Room  with name '{}' found", name);
            return resultList;
        }
        logger.debug("No room with name '{}' found", name);
        return null;
    }
}

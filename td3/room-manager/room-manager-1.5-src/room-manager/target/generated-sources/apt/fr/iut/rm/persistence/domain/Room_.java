package fr.iut.rm.persistence.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Room.class)
public abstract class Room_ {

	public static volatile SingularAttribute<Room, String> name;
	public static volatile SingularAttribute<Room, String> description;
	public static volatile SingularAttribute<Room, Long> id;

}


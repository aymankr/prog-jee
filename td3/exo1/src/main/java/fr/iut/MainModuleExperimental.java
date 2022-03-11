package fr.iut;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import fr.iut.club.Club;
<<<<<<< HEAD
import fr.iut.club.PutterExperimental;
import fr.iut.club.Wood;

public class MainModuleExperimental extends AbstractModule {

=======
import fr.iut.club.ExperimentalPutter;
import fr.iut.club.Wood;

public class MainModuleExperimental extends AbstractModule {
>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092
    @Override
    protected final void configure() {
        bind(Caddy.class);
        bind(Club.class)
                .annotatedWith(Names.named("Putter"))
<<<<<<< HEAD
                .to(PutterExperimental.class);
=======
                .to(ExperimentalPutter.class);
>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092
        bind(Club.class)
                .annotatedWith(Names.named("Wood"))
                .to(Wood.class);
    }
}

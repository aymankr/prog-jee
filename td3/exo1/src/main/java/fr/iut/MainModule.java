package fr.iut;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
<<<<<<< HEAD
import fr.iut.club.*;

=======
import fr.iut.club.Club;
import fr.iut.club.Putter;
import fr.iut.club.Wood;
>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092

/**
 * The Guice driven Container
 */
public class MainModule extends AbstractModule {
<<<<<<< HEAD

=======
>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092
    @Override
    protected final void configure() {
        bind(Caddy.class);
        bind(Club.class)
                .annotatedWith(Names.named("Putter"))
                .to(Putter.class);
        bind(Club.class)
                .annotatedWith(Names.named("Wood"))
                .to(Wood.class);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092

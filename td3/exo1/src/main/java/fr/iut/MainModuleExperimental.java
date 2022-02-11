package fr.iut;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import fr.iut.club.Club;
import fr.iut.club.ExperimentalPutter;
import fr.iut.club.Wood;

public class MainModuleExperimental extends AbstractModule {
    @Override
    protected final void configure() {
        bind(Caddy.class);
        bind(Club.class)
                .annotatedWith(Names.named("Putter"))
                .to(ExperimentalPutter.class);
        bind(Club.class)
                .annotatedWith(Names.named("Wood"))
                .to(Wood.class);
    }
}

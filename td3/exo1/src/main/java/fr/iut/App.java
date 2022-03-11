package fr.iut;

import com.google.inject.Guice;
import com.google.inject.Injector;

<<<<<<< HEAD
/**
 * Basic implementation
 */
public class App {

=======
public class App {
>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MainModuleExperimental());

        Caddy caddy = injector.getInstance(Caddy.class);
<<<<<<< HEAD

        Player player = new Player("John", caddy);
=======
        Player player = new Player("John", caddy);

>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092
        System.out.println(player);
        player.play(0.8, Math.PI / 2, Conditions.FAIRWAY);
        System.out.println(player);
        player.play(0.1, Math.PI / 2, Conditions.GREEN);
        System.out.println(player);
    }
}
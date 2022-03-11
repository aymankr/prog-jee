package fr.iut.rm;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import fr.iut.rm.control.ControlAccessEvent;
import fr.iut.rm.control.ControlRoom;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Entry point for command-line program. It's mainly a dumb main static method.
 */
public final class App {
    /**
     * quit constant
     */
    private static final String QUIT = "q";
    /**
     * help constant
     */
    private static final String HELP = "h";
    /**
     * creat constant
     */
    private static final String CREATE = "cr";
    /**
     * delete constant
     */
    private static final String DELETE = "d";
    /**
     * list constant
     */
    private static final String LIST = "lr";
    /**
     * list constant
     */
    private static final String ENTER = "ee";
    /**
     * list constant
     */
    private static final String EXIT = "ex";
    /**
     * list constant
     */
    private static final String LISTE = "le";
    /**
     * list constant
     */
    private static final String FOLLOW = "lef";

    /**
     * standard logger
     */
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    /**
     * the available options for CLI management
     */
    private final Options options = new Options();

    @Inject
<<<<<<< HEAD
     ControlRoom cr;
=======
    ControlRoom cr;
>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092

    @Inject
    ControlAccessEvent cae;

    /**
     * Invoked at module initialization time
     */
    public App() {
        // build options command line options
        options.addOption(OptionBuilder.withDescription("List all rooms").create(LIST));
        options.addOption(OptionBuilder.withDescription("List all events").create(LISTE));
        options.addOption(OptionBuilder.hasArg().withArgName("person").withDescription("List all events for a specific person").create(FOLLOW));
        options.addOption(OptionBuilder.withArgName("name> <description").hasArgs(2).withDescription("Create new room").create(CREATE));
        options.addOption(OptionBuilder.hasArg().withArgName("name").withDescription("Delete").create(DELETE));
        options.addOption(OptionBuilder.hasArgs(2).withArgName("room's name> <person's name").withDescription("Enter").create(ENTER));
        options.addOption(OptionBuilder.hasArgs(2).withArgName("room's name> <person's name").withDescription("Exit").create(EXIT));
        options.addOption(OptionBuilder.withDescription("Display help message").create(HELP));
        options.addOption(OptionBuilder.withDescription("Quit").create(QUIT));
    }



    /**
     * Displays help message
     */
    private void showHelp() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("room-manager.jar", options);
    }

    public void run() {
        CommandLineParser parser = new BasicParser();
        CommandLine cmd = null;
        Scanner sc = new Scanner(System.in);
        do {
            String str = sc.nextLine();
            try {
                cmd = parser.parse(options, str.split(" "));
                if (cmd.hasOption(HELP)) {
                    showHelp();
                } else if (cmd.hasOption(LIST)) {
                    cr.showRooms();
                } else if (cmd.hasOption(CREATE)) {
                    //String name = cmd.getOptionValue(CREATE);
                    String val[]= cmd.getOptionValues(CREATE);
                    if (val[0] != null && !val[0].isEmpty())
                        cr.createRoom(val);
<<<<<<< HEAD
                    }else if (cmd.hasOption(DELETE)){
                        String name = cmd.getOptionValue(DELETE);
                        cr.deleteRoom(name);
                    }else if (cmd.hasOption(EXIT)){
                        String val[] = cmd.getOptionValues(EXIT);
                        cae.createAccessEvent(val,false);
                    }else if (cmd.hasOption(ENTER)){
                        String val[]= cmd.getOptionValues(ENTER);
                        cae.createAccessEvent(val,true);
                    }else if (cmd.hasOption(LISTE)){
                        cae.showEvents();
                    }else if (cmd.hasOption(FOLLOW)){
                        String person = cmd.getOptionValue(FOLLOW);
                        cae.followEvents(person);
                    }
=======
                }else if (cmd.hasOption(DELETE)){
                    String name = cmd.getOptionValue(DELETE);
                    cr.deleteRoom(name);
                }else if (cmd.hasOption(EXIT)){
                    String val[] = cmd.getOptionValues(EXIT);
                    cae.createAccessEvent(val,false);
                }else if (cmd.hasOption(ENTER)){
                    String val[]= cmd.getOptionValues(ENTER);
                    cae.createAccessEvent(val,true);
                }else if (cmd.hasOption(LISTE)){
                    cae.showEvents();
                }else if (cmd.hasOption(FOLLOW)){
                    String person = cmd.getOptionValue(FOLLOW);
                    cae.followEvents(person);
                }
>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092

            } catch (ParseException e) {
                e.printStackTrace();
                showHelp();
            }
        } while (!cmd.hasOption(QUIT));
    }

    /**
     * Main program entry point
     *
     * @param args main program args
     */
    public static void main(final String[] args) {
        logger.info("Room-Manager version {} started", Configuration.getVersion());
        logger.debug("create guice injector");
        Injector injector = Guice.createInjector(new JpaPersistModule("room-manager"), new MainModule());
        logger.info("starting persistency service");
        PersistService ps = injector.getInstance(PersistService.class);
        ps.start();

        App app =  injector.getInstance(App.class);

        app.showHelp();
        app.run();

        logger.info("Program finished");
        System.exit(0);
    }


}

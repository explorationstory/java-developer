import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;


@Slf4j
public class MainMenu {
    private String separator = "-".repeat(75);

    public void printMenu() {
        System.out.println(separator);
        System.out.println("Welkom bij applicatienaam");
        System.out.println(separator);

        System.out.println("Kies 1 als je een nieuwe gebruiker bent.");
        System.out.println("Kies 2 als je een account hebt");
        System.out.println("Kies 3 om te stoppen");
    }
}

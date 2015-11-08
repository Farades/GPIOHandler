package ru.entel;


import ru.entel.gpiohandler.util.ContactsTable;
import ru.entel.gpiohandler.util.DryContact;
import ru.entel.gpiohandler.util.DryContactService;

import java.util.Set;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("SMIU GPIO Listener ... started.");

        System.out.println(ContactsTable.smiuPitable);

        Set<DryContact> dryContacts = DryContactService.getDryContacts();

        // keep program running until user aborts (CTRL-C)
        for (;;) {
            Thread.sleep(500);
        }

        // stop all GPIO activity/threads by shutting down the GPIO controller
        // (this method will forcefully shutdown all GPIO monitoring threads and scheduled tasks)
//         gpio.shutdown();
    }
}

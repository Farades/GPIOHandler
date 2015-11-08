package ru.entel.gpiohandler.util;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinPullResistance;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by farades on 08.11.15.
 */
public class DryContactService {
    private static final GpioController gpio = GpioFactory.getInstance();

    public static GpioController getGpio() {
        return gpio;
    }

    public static Set<DryContact> getDryContacts() {
        Set<DryContact> res = new HashSet<>();

        for (Map.Entry<SmiuGPIO, Pin> entry : ContactsTable.smiuPitable.entrySet()) {
            res.add(new DryContact(entry.getKey(), entry.getValue(), PinPullResistance.OFF));
        }

        return res;
    }
}

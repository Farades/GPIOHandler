package ru.entel.gpiohandler.util;

import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.RaspiPin;

import java.util.HashMap;
import java.util.Map;

public class ContactsTable {
    public static Map<SmiuGPIO, Pin> smiuPitable;

    static {
        smiuPitable = new HashMap<>();
        smiuPitable.put(SmiuGPIO.INPUT_1, RaspiPin.GPIO_00);
        smiuPitable.put(SmiuGPIO.INPUT_2, RaspiPin.GPIO_01);
        smiuPitable.put(SmiuGPIO.INPUT_3, RaspiPin.GPIO_02);
        smiuPitable.put(SmiuGPIO.INPUT_4, RaspiPin.GPIO_03);
        smiuPitable.put(SmiuGPIO.INPUT_5, RaspiPin.GPIO_04);
        smiuPitable.put(SmiuGPIO.INPUT_6, RaspiPin.GPIO_05);
        smiuPitable.put(SmiuGPIO.INPUT_7, RaspiPin.GPIO_06);
        smiuPitable.put(SmiuGPIO.INPUT_8, RaspiPin.GPIO_07);
        smiuPitable.put(SmiuGPIO.INPUT_9, RaspiPin.GPIO_08);
        smiuPitable.put(SmiuGPIO.INPUT_10, RaspiPin.GPIO_09);
        smiuPitable.put(SmiuGPIO.INPUT_11, RaspiPin.GPIO_10);
        smiuPitable.put(SmiuGPIO.INPUT_12, RaspiPin.GPIO_11);
    }
}

package ru.entel.gpiohandler.util;

import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

/**
 * Created by farades on 08.11.15.
 */
public class DryContact {
    private GpioPinDigitalInput gpio;
    private SmiuGPIO smiuGPIO;

    public DryContact(SmiuGPIO smiuGPIO, Pin raspiPin, PinPullResistance pinPullResistance) {
        this.gpio = DryContactService.getGpio().provisionDigitalInputPin(raspiPin, pinPullResistance);
        this.smiuGPIO = smiuGPIO;

        gpio.addListener(new GpioPinListenerDigital() {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
                System.out.println(smiuGPIO.toString() + " changed state: " + event.getState());
            }
        });
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DryContact that = (DryContact) o;

        if (gpio != null ? !gpio.equals(that.gpio) : that.gpio != null) return false;
        return smiuGPIO == that.smiuGPIO;

    }

    @Override
    public int hashCode() {
        int result = gpio != null ? gpio.hashCode() : 0;
        result = 31 * result + (smiuGPIO != null ? smiuGPIO.hashCode() : 0);
        return result;
    }
}

package creationalDesignPattern;

import creationalDesignPattern.phone.OS;
import creationalDesignPattern.phone.OperatingSystemFactory;

public class FactoryMain {

    public static void main (String[] args) {
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS os = operatingSystemFactory.getInstance("android");
        os.spec();

        os = operatingSystemFactory.getInstance("ios");
        os.spec();
    }

}

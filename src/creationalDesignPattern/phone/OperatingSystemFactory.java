package creationalDesignPattern.phone;

public class OperatingSystemFactory {

    public OS getInstance(String typeOfOS) {
        if (typeOfOS.equals("android")){
            return new Android();
        } else if (typeOfOS.equals("ios")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }

}

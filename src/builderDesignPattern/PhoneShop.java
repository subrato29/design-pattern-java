package builderDesignPattern;

public class PhoneShop {

    public static void main (String[] args) {
        PhoneBuilder phoneShop = new PhoneBuilder()
                .setOs("android")
                .setPrice(1000)
                .setRam(4);
        System.out.println(phoneShop);
    }

}

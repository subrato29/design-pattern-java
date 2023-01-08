package singleTonPattern;

/**
 * A class that can have only one object at a time
 *
 * How to design a Singleton class:
 * 1. Make constructor as private
 * 2. Write a public static method that has return type as the object of the Singleton class. Also called as
 * Lazy initialization
 *
 * For normal class, constructor is used to initialize the object of the class. Whereas for Singleton class,
 * getInstance() is used to initialize the object of the Singleton class.
 */

public class SingleTon {

    private static SingleTon singleTon = null;
    public String string;

    private SingleTon() {
        string = "This is a singleton pattern";
    }

    public static SingleTon getInstance() {
       if (singleTon == null)
           singleTon = new SingleTon();
       return singleTon;
    }

    public static void main(String[] args) {
        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();
        SingleTon singleTon3 = SingleTon.getInstance();

        singleTon1.string = (singleTon1.string).toUpperCase();

        System.out.println(singleTon1.string);
        System.out.println(singleTon2.string);
        System.out.println(singleTon3.string);
    }

}

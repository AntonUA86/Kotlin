package Lesson_4.Test.java;

public class Singleton {
    private  Singleton(){}

    private static Singleton singleton;

    public  static  Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void Main(String[] args){
        Singleton instance = Singleton.getInstance();
    }
}

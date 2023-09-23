public class Singleton {
    private static Singleton instance;

    Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    protected void displayName(String str) {
        System.out.println("Hello " + str);
    }
}

class Hello {

    public static void main(String[] args) {
        Singleton singleton =Singleton.getInstance();
        singleton.displayName("Ansu");

    }
}
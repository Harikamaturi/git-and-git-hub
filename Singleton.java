package p2;
public class Singleton {
    private static Singleton s;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(s==null) {
            s = new Singleton();
        }
        return s;

        }
        public void single(){
        System.out.println("single");
    }
}

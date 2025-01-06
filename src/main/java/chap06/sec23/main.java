package chap06.sec23;

public class main {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main(): x = " + d.x); //x = 10

        change(d.x);
        System.out.println("after change");
        System.out.println("main(): x = " + d.x); //x = 10

    }
    static void change(int x){
        x = 1000;
        System.out.println("change(): x = " + x); //x = 1000
    }
}


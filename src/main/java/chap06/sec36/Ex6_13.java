package chap06.sec36;

public class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color = " + c1.color + ", c1의 gearType = " + c1.gearType + ", c1의 door = " + c1.door );
        System.out.println("c2의 color = " + c2.color + ", c2의 gearType = " + c2.gearType + ", c2의 door = " + c2.door );


    }
}

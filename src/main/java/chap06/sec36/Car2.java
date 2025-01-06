package chap06.sec36;

public class Car2 {
    String color;
    String gearType;
    int door;

    /* 1번 생성자 */
    Car2(){
        this("white", "auto", 4); //3번 생성자 호출
    }

    /* 2번 생성자 */
    Car2(String color){
        this(color, "auto", 4);  //3번 생성자 호출
    }

    /* 3번 생성자 */
    Car2(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

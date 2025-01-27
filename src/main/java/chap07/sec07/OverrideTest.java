package chap07.sec07;

public class OverrideTest { //extends Object
    public static void main(String[] args) {
        MyPorint myPorint = new MyPorint(1, 2);
        System.out.println(myPorint); //x: 1, y: 2
        System.out.println(myPorint.toString()); //x: 1, y: 2
        //다시 한 번~~ 인스턴스를 출력 할 때 toString()을 쓰고 싶을 떄 인스턴스명만 써도 된다.
    }
}

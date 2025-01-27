package chap07.sec11;

public class Point3D extends Point{
    int z;

    public Point3D(int x, int y, int z){
        super(x, y); //선언된 변수의 초기화는 해당 클래스에서 책임지는것이 좋다.
        this.z = z;

        /*
         만약 첫 줄에 super이 없으면 에러가 난다.
         이유는 모든 생성자는 첫 줄에 다른 생성자를 (this(), super()) 호출해야 하는데
         그렇지 않으면 컴파일러가 첫 줄에 기본 부모 생성자 호출 super()을 컴파일러가 자동으로 넣는다.
         해당 클래스의 부모클래스에서는 기본 생성자가 없으므로 에러가난다.
        */
    }
}

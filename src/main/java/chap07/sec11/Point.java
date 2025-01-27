package chap07.sec11;

public class Point {
    int x, y;

    Point(int x, int y){
        //컴파일러가 여기에 super()을 자동 추가, Object 객체의 생성자를 호출한다.
        this.x = x;
        this.y = y;
    }
}

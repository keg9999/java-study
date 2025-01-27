package chap07.sec07;

public class MyPorint {
    int x;
    int y;

    MyPorint(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override //Object 클래스의 toSTring 오버라이딩
    public String toString(){
        return "x: " + x + ", y: " + y;
    }
}

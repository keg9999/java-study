package chap07.sec10.ex1;

public class Child extends Parent{
    int x = 20; // this.x로 접근한다.

    void method(){
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}

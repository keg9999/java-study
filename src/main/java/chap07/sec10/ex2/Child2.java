package chap07.sec10.ex2;

public class Child2 extends Parent2{
    void method(){
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x); //이것도 부모의 x
        System.out.println("super.x=" + super.x); // 부모의 x
    }
}

package chap07.sec06;

public class B { //컴파일러가 자동으로 'extends Object'를 붙여 줌.
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a); //chap07.sec06.A@7ad041f3
        System.out.println(a.toString()); //chap07.sec06.A@7ad041f3
        //결과 같음
    }
}

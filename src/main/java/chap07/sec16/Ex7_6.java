// static import문
package chap07.sec16;

import static java.lang.System.out; //out은 static 변수임
import static java.lang.Math.*;
public class Ex7_6 {
    public static void main(String[] args) {
//        System.out.println(Math.random());
        out.println(random());

//        System.out.println("Math.PI : " + Math.PI);
        out.println("Math.PI : " + PI);
    }
}

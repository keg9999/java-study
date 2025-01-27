package chap07.sec02;

/**
 * Smart Tv에는 tv에 자막을 보여주는 기능 추가
 */
public class SmartTv extends Tv {
    boolean caption;
    void display(String text){
        if(caption){  //caption 상태가 true일때만 text를 보여준다.
            System.out.println(text);
        }
    }
}

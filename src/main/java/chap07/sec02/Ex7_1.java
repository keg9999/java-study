package chap07.sec02;


public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;   // 조상클래스로부터 상속받은 멤버
        stv.channelUp();    // 조상클래스로부터 상속받은 멤버
        System.out.println(stv.channel);
        stv.display("hello, world");
        stv.caption = true;
        stv.display("hello, world");
    }
}

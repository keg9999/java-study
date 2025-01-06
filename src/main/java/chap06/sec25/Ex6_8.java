package chap06.sec25;

public class Ex6_8 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x); //d.x = 10
        System.out.println("d2.x = " + d2.x); //d2.x = 10
    }

    static Data3 copy(Data3 d){
        Data3 tmp = new Data3();
        tmp.x = d.x; //d.x의 값을 tmp.x에 반환.

        return tmp; //복사한 객체의 주소를 반환.

        /*
        tmp는 스택 메모리에서 제거되지만, 반환된 객체는 여전히 d2가 참조하고 있으므로 힙 메모리에 남아 있음.
        더이상 참조하는 변수가 없을 떄 가비지 콜렉터가 tmp를 힙 메모리에서 제거한다.
         */
    }

}

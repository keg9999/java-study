package chap11.sec09_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        //길이가 10인 ArrayList 생성
        ArrayList list1 = new ArrayList(10);

        list1.add(Integer.valueOf(5)); //new Integer 대신 Integer.valueOf(int i) 권장
        list1.add(4); //원래 객체를 넣어야 하지만 편의상 컴파일러가 autoboxing으로 Integer로 감싸준다.
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1,4)); //list1.subList(1,4) 자체는 읽기 전용
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("정렬된 배열");
        print(list1, list2);

        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));

        list2.add("B");
        list2.add("A");
        list2.add(3, "A"); //인덱스가 3인곳에 A를 추가. 기존 데이터는 뒤로 밀려난다.
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        //교집합: list1에서 list2와 겹치는 부분만 남기고 나머지 삭제
        System.out.println("list1.retainAll(list2): "+ list1.retainAll(list2));
        print(list1, list2);

        //차집합
        for(int i = list2.size() -1; i >= 0; i--){ //삭제는 끝에서부터 하는것을 권장 (삭제시 앞 데이터 밀림)
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();
    }
}

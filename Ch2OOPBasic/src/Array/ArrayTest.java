package Array;

//Ch2-20 배열 Array
public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10}; //이렇게도 가능
        int total = 0;

        for(int i=0, num=1; i<arr.length ; i++) {
            System.out.println(arr[i]);
            // 0 10개 찍힘
//            배열은 new 하면 초기값이 initialize 된다.
//            integer는 0, double은 0.0, 객체는 null로 초기화 된다.
            arr[i] = num++;
        }

//        enhanced for 문
//        element 0부터 n-1 까지 순회할때 처음부터 끝까지 돌때
        for (int num : arr) {
            total += num;
        }
        System.out.println(total);
//        처음부터끝깍지 다 쓸때 사용. 중간에 자른다거나 하면 i같은 인덱스 연산 핸들링을 해야됨.
//        그렇지않고 처음부터 끝까지 쭉쓰면 보통 enhanced for문 쓴다.



    }
}

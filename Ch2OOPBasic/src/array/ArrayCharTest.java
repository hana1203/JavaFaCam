package array;

//문자 배열
public class ArrayCharTest {
    public static void main(String[] args) {

        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i=0; i<alphabets.length; i++) {
            alphabets[i] = ch++;
            System.out.println(alphabets[i]);
        }

        for (char alpha : alphabets) {
            System.out.println(alpha +" in enhanced for statement");
        }

    }
}

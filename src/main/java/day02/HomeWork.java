package day02;

/**
 * 写一段程序分别求出0到100之间所有的偶数的和以及奇数的和
 */
public class HomeWork {

    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i <=100 ; i++) {
            if (i%2 == 0 ) {
                oddSum+=i;
            }else {
                evenSum+=i;
            }
        }
        System.out.println("偶数的和"+oddSum);
        System.out.println("奇数的和"+evenSum);
    }



}

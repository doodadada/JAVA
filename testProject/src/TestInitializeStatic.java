import java.util.Scanner;

public class TestInitializeStatic {
    // int max; // Non-static field 'max' cannot be referenced from a static context
    // int min; // Non-static field 'min' cannot be referenced from a static context

    static int max;
    static int min;
    public static void main(String[] args) {
        int[] iarr = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i =0; i< iarr.length; i++){
            System.out.print((i+1)+"번째 정수를 입력하세요 : ");
            iarr[i] = sc.nextInt();
        }



        // System.out.println("max = " + max);
        for(int i =0; i<iarr.length; i++){
            if(iarr[i] > max){
                max = iarr[i];
            }
            if(iarr[i] < min){
                min = iarr[i];
            }
        }
        System.out.println("최댓값 : "+max);
        System.out.println("최솟값 : "+min);

    }
}

import java.util.Scanner;

public class TestInitializeNonStatic {
    int max;
    int min;
    public void getMaxMin(){
        int[] iarr = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i =0; i< iarr.length; i++){
            System.out.print((i+1)+"번째 정수를 입력하세요 : ");
            iarr[i] = sc.nextInt();
        }



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

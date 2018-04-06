import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int i = 0;
        int j =0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int N =  input.nextInt();
	Integer list[] = new Integer[N];
        for (i=0;i<N;i++){
            input.nextLine();
            list[i]=input.nextInt();
        }
        Integer num[] = new Integer[N];
        for (i=0;i<N;i++){
            if (list[i]!=0){
                num[j] = list[i];
                j++;
            } 
            else {
                j--;
                num[j] = list[i];
            }
        }
        
        for (i=0;i<j;i++){
            sum += num[i];
        }
        System.out.print(sum);
    }
}
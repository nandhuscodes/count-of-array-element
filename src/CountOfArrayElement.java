import java.util.Scanner;

public class CountOfArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Array elements: ");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(countMax(array));
    }

    static int countMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]==max){
                count++;
            }
        }
        return array.length - count;
    }
}

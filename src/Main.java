import java.lang.reflect.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                long sum = 0;
                for (int j = 1; j <= 1_000_000; j++) {
                    sum += j;
                }
            });
        }


    }

    public static String printEvens(int[] array){
        String result = "";
        for(int i= 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                result += array[i] + " ";
            }
        }

        return result;
    }
}
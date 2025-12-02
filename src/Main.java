import java.lang.reflect.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] array = {1,2,3,4,5};
        System.out.println(printEvens(array));

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
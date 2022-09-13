import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
            /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */

    public static void main(String[] args) {
        int[] input = {3, 4, 2, 7};
        int target = 10;


        List inputList = Arrays.stream(input).boxed().sorted().collect(Collectors.toList());

        if (!inputList.isEmpty()) {
            int j = 0;
            for (int i = 1; i < inputList.size(); i++) {
                int k = target - input[i-1];
                if (inputList.contains(k) && k != input[i]) {
                    int[] output = {input[i-1], k};
                    System.out.println(Arrays.toString(output));
                    j = 1;
                    break;
                }
            }
            if (j == 0) {
                System.out.println("Пара не найдена");
            }
        } else {
            System.out.println("На вход подали пустой массив");
        }

    }
}
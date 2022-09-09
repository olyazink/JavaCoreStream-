import java.util.stream.IntStream;

public class Task2 {
            /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */

    public static void main(String[] args) {
        int[] input = {3, 4, 2, 7};
        int target = 10;

        IntStream.range(0,  input.length)
                .forEach(i -> IntStream.range(i,  input.length)
                        .filter(j -> i != j && input[i] + input[j] == target)
                        .forEach(j -> System.out.println("[" + input[i] + " , " + input[j] + "]"))
                );
    }
}

import java.util.List;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        // SplitString
        String text = "Разбиение строки на слова и символы";
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + ",");
        }
        System.out.println("");

        String[] letters = text.split("");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + ",");
        }
        System.out.println("");

        List<Character> charList = text.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println(charList);

        // FibonacciNumbers
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946 ...
        int num = 1;
        int lastNum = 1;
        int sum = 0;
        System.out.print(0 + " " + "1 ");
        for (int i = 0; i < 20; i++) {
            sum = num + lastNum;
            num = lastNum;
            lastNum = sum;
            System.out.print(num + " ");
        }
        System.out.println("");

        // ReverseArray
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // вывод массива в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        // разворот массива
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
            System.out.print(array[tmp] + " ");
        }
    }

    class CalculateFactorial {
        // нерекурсивно
        public static int getFactorial(int f) {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result = result * i;
            }
            return result;
        }

        //  рекурсивно
        public static int getFactorialRec(int f) {
            if (f <= 1) {
                return 1;
            } else {
                return f * getFactorial(f - 1);
            }
        }

    }
}



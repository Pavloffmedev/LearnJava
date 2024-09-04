import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         task20();
    }

    /**
     * Задание 1: Пользователь вводит целое число.
     * Программа должна вывести, является ли это число четным или нечетным
     */
    static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        System.out.printf((number % 2 == 0)  ? "Четное" : "Нечетное");
        scanner.close();
    }


    /**
     * Задание 2: Пользователь вводит три целых числа.
     * Программа должна найти и вывести минимальное из них
     */
    static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        System.out.println("Минимальное число: " + Math.min(num1, Math.min(num2, num3)));

        scanner.close();
    }


    /**
     * Задание 3: Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).
     */
    static void task3() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }


    /**
     * Задание 4: Пользователь вводит целое число N.
     * Программа должна вывести сумму всех чисел от 1 до N.
     */
    static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел от 1 до " + N + " равна " + sum);

        scanner.close();
    }


    /**
     * Задание 5: Пользователь вводит целое число N.
     * Программа должна вывести первые N чисел Фибоначчи
     */
    static void task5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Введите число больше 0.");
        } else {
            int first = 0;
            int second = 1;

            for (int i = 1; i <= N; i++) {
                System.out.println(first);

                int next = first + second;
                first = second;
                second = next;
            }
        }

        scanner.close();
    }


    /**
     * Задание 6: Пользователь вводит целое число.
     * Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).
     */
    static void task6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println((isPrime) ? number + " является простым числом" : number + " не является простым числом");

        scanner.close();
    }


    /**
     * Задание 7: Пользователь вводит целое число N.
     * Программа должна вывести числа от N до 1 в обратном порядке.
     */
    static void task7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();

        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }

        scanner.close();
    }


    /**
     * Задание 8: Пользователь вводит два целых числа A и B.
     * Программа должна найти сумму всех четных чисел в диапазоне от A до B
     */
    static void task8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число A: ");
        int A = scanner.nextInt();

        System.out.print("Введите целое число B: ");
        int B = scanner.nextInt();

        int sum = 0;

        int start = Math.min(A, B);
        int end = Math.max(A, B);

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма всех четных чисел в диапазоне от " + A + " до " + B + " равна " + sum);

        scanner.close();
    }


    /**
     * Задание 9: Пользователь вводит строку.
     * Программа должна вывести эту строку в обратном порядке.
     */
    static void task9() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        System.out.println("Строка в обратном порядке: " + reversed);

        scanner.close();
    }


    /**
     * Задание 10: Пользователь вводит целое число.
     * Программа должна вывести количество цифр в этом числе
     */
    static void task10() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        System.out.println("Количество цифр в числе: " + scanner.next().length());
    }


    /**
     * Задание 11: Пользователь вводит целое число N.
     * Программа должна вычислить факториал этого числа (N!).
     */
    static void task11() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("Факториал определен только для неотрицательных чисел.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }

            System.out.println("Факториал числа " + N + " равен " + factorial);
        }

        scanner.close();
    }


    /**
     * Задание 12: Пользователь вводит целое число.
     * Программа должна найти сумму всех цифр этого числа
     */
    static void task12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Сумма всех цифр числа равна " + sum);

        scanner.close();
    }


    /**
     * Задание 13: Пользователь вводит строку.
     * Программа должна проверить, является ли эта строка палиндромом
     * (читается одинаково слева направо и справа налево)
     */
    static void task13() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(input);

        reversed.reverse();

        if (input.contentEquals(reversed)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }

        scanner.close();
    }


    /**
     * Задание 14: Пользователь вводит размер массива и элементы массива.
     * Программа должна найти и вывести максимальное число в массиве.
     */
    static void task14() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите " + size + " элементов массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Максимальное число в массиве: " + max);

        scanner.close();
    }


    /**
     * Задание 15: Пользователь вводит размер массива и его элементы.
     * Программа должна вычислить и вывести сумму всех элементов массива.
     */
    static void task15() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите " + size + " элементов массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println("Сумма всех элементов массива: " + sum);

        scanner.close();
    }


    /**
     * Задание 16: Пользователь вводит размер массива и его элементы.
     * Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.
     */
    static void task16() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите " + size + " элементов массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);

        scanner.close();
    }


    /**
     * Задание 17: Пользователь вводит два целых числа A и B.
     * Программа должна вывести все простые числа в этом диапазоне (включительно)
     */
    static void task17() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число A: ");
        int A = scanner.nextInt();

        System.out.print("Введите целое число B: ");
        int B = scanner.nextInt();

        int start = Math.min(A, B);
        int end = Math.max(A, B);

        System.out.println("Простые числа в диапазоне от " + start + " до " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }


    /**
     * Задание 18: Пользователь вводит строку.
     * Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.
     */
    static void task18() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        String vowels = "аеёиоуыэюя";
        String consonants = "бвгджзклмнопрстфхцчшщ";

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            } else if (consonants.indexOf(c) != -1) {
                consonantCount++;
            }
        }

        System.out.println("Количество гласных букв: " + vowelCount);
        System.out.println("Количество согласных букв: " + consonantCount);

        scanner.close();
    }


    /**
     * Задание 19: Пользователь вводит строку, состоящую из нескольких слов.
     * Программа должна вывести слова в обратном порядке
     */
    static void task19() {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод строки
        System.out.print("Введите строку, состоящую из нескольких слов: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        ArrayList<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, words);

        Collections.reverse(wordList);

        System.out.println("Слова в обратном порядке:");
        for (String word : wordList) {
            System.out.println(word);
        }

        scanner.close();
    }


    /**
     * Задание 20: Пользователь вводит целое число.
     * Программа должна проверить, является ли это число числом Армстронга
     * (сумма цифр в степени, равной количеству цифр, равна самому числу).
     */
    static void task20() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;


        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, numDigits);
            number /= 10;
        }

        // Проверяем, равно ли число сумме
        if (sum == originalNumber) {
            System.out.println(originalNumber + " является числом Армстронга");
        } else {
            System.out.println(originalNumber + " не является числом Армстронга");
        }

        scanner.close();
    }


    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }


}
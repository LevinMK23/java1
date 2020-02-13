package lesson3.homework;
import java.util.Random;
import java.util.Scanner;
public class HomeWork {
    /* Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    */
    public static String[] words;
    public static void main(String[] args) {
        int game = getNumberFromScanner("Какую игру Вы хотите запустить? 0 – Угадай число / 1 – Угадай слово", 0, 1);
        if (game == 0) {
            System.out.println("Вас приветсвует игра УГАДАЙ ЧИСЛО. Вам даеться три попытки.");
            guessNumber();
        }
        else {
            words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            System.out.println("Вас приветсвует игра УГАДАЙ СЛОВО. Компьютер загадал одно из следующих слов: ");
            for (int i = 0; i < 25; i++) System.out.println(words[i]);
            guessWord();
        }

        }


    public static int getNumberFromScanner(String message, int min, int max) {
        int numberFromScaner;
        do {
            System.out.println(message);
            Scanner sc = new Scanner(System.in);
            numberFromScaner = sc.nextInt();
        } while (numberFromScaner < min || numberFromScaner > max);
        return numberFromScaner;
    }
    public static void guessNumber() {
        Random rand = new Random();
        int x = rand.nextInt(10);
        for (int count = 1; count <= 3; count++) {
            int number = getNumberFromScanner("Введите число в пределах от 0 до 9", 0, 9);
            String alert = number > x ? "Загаданное число меньше." : (number < x ? "Загаданное число больше." : "Поздравляю!!! Вы угадали!");
            if (number == x) {
                System.out.println(alert);
                break;
            }
            String attempt = count == 3 ? " попыток" : (count == 2 ? " попытка" : " попытки");
            if (count == 3) System.out.println("Попытки закончились. Вы проиграли. Загаданое число " + x);
            else System.out.println(alert + " У Вас осталось " + (3 - count) + attempt);
        }
        int q = getNumberFromScanner("Повторить игру еще раз? 1 – да / 0 – нет", 0, 1);
        if (q == 1) guessNumber();
        else return;

    }

    /*
     * Создать массив из словString[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно можно пользоваться:
    String str = "apple";
    char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово.
    Используем только маленькие буквы.
    */


    public static void guessWord() {
        Random rand = new Random();
        int x = rand.nextInt(25);
        String word = words[x];
        for( ; ;) {
            System.out.println(" Введите слово:");
            Scanner sc = new Scanner(System.in);
            String wordFromScaner = sc.next();
            wordFromScaner = wordFromScaner.toLowerCase();
            if (wordFromScaner.equals(word)) {
                System.out.println("Поздравляю Вы угадали слово!!!!");
                return;
            } else {
                System.out.println("Вы не угадали(. Попробуйте еще раз. Воспользуйтесь подсказкой - ");
                int minWordLenght = Math.min(wordFromScaner.length(), word.length());
                for (int i = 0; i < minWordLenght; i++) {
                    char character = wordFromScaner.charAt(i) == word.charAt(i) ? wordFromScaner.charAt(i) : '#';
                    System.out.print(character);
                }
                for (int y = 1; y < 15 - minWordLenght; y++) {
                    System.out.print("#");
                }

            }
        }


    }
}
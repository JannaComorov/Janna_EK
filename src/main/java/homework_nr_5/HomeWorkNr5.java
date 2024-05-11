package homework_nr_5;

// Класс HomeWorkNr5
public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 - i;
        }


        System.out.println("Массив numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // elementele pare si impare
        int sumOfEven = 0;
        int productOfOdd = 1;
        for (int number : numbers) {
            if (number % 2 == 0) { // divizibil la 2
                sumOfEven += number; // daca e par, adaug la suma
            } else {
                productOfOdd *= number; // daca e impar inmultesc
            }
        }


        System.out.println("Сумма четных элементов: " + sumOfEven);
        System.out.println("Произведение нечетных элементов: " + productOfOdd);

        // crearea si copierea in noul masiv
        int[] copyNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
    }
}

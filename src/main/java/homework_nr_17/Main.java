package homework_nr_17;

public class Main {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        // Создание и запуск двух потоков для печати алфавита
        Thread thread1 = new Thread(() -> printLetters());
        Thread thread2 = new Thread(() -> printLetters());
        thread1.start();
        thread2.start();

        Thread sleepThread1 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Primul flux a fost întrerupt de somn.");
            }
        });

        Thread sleepThread2 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Al doilea flux a fost întrerupt de somn.");
            }
        });

        sleepThread1.start();
        sleepThread2.start();

        // Прерывание первого спящего потока
        sleepThread1.interrupt();
    }

    public static void printLetters() {
        synchronized (lock) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.print(c + " ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Tiparul alfabetului a fost intrerupt.");
                    return;
                }
            }
            System.out.println();
        }
    }
}
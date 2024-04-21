package homework_nr_8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> tasksList = new ArrayList<>();
        tasksList.add("To get to work at 8 o'clock");
        tasksList.add("To answer all emails");
        tasksList.add("To answer in the bitrix chats and from the service number");
        tasksList.add("To transmit the accounts and offers");
        tasksList.add("Enter the commands in PrintEffect");
        tasksList.add("To send the orders in print");
        tasksList.add("To transmit the accounts and offers");
        tasksList.add("To check the finalization of the orders and to notify the customers");
        tasksList.add("To prepare the contracts and sign them");


        System.out.println(tasksList.get(0));
        System.out.println(tasksList.get(1));
        System.out.println(tasksList.get(2));
        System.out.println(tasksList.get(3));
        System.out.println(tasksList.get(4));
        System.out.println(tasksList.get(5));
        System.out.println(tasksList.get(6));
        System.out.println(tasksList.get(7));
        System.out.println(tasksList.get(8));

        System.out.println("_____________________________");

        Set<String> uniqueTasks = new HashSet<>(tasksList);

        // Afișarea task-urilor unice
        System.out.println("Unique tasks:");
        for (String task : uniqueTasks) {
            System.out.println(task);
            System.out.println("_____________________________");
        }

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "mar");
        dictionary.put("book", "carte");
        dictionary.put("cat", "pisica");
        dictionary.put("dog", "caine");
        dictionary.put("house", "casa");
        dictionary.put("car", "masina");
        dictionary.put("tree", "arbore");
        dictionary.put("sun", "soare");
        dictionary.put("moon", "luna");
        dictionary.put("star", "stea");

        // Afisarea listei din dictionar
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }

    }
}

package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String add = scanner.nextLine();
            String[] first = add.split("\s");
            String firstWord = first[0];
            String lastWord = add.replaceFirst(firstWord + "\s", "");

            switch (firstWord) {
                case ("ADD") -> {
                    todoList.add(lastWord);
                    System.out.println("Добавлено дело" + todoList.getTodos());
                }
                case ("DELETE") -> {
                    todoList.delete(Integer.parseInt(lastWord));
                    System.out.println("Дело удалено" + todoList.getTodos());
                }
                case ("EDIT") ->{
                    String finalWord = first[1];
                    lastWord = lastWord.replaceFirst(finalWord,"");
                    todoList.edit(Integer.parseInt(finalWord),lastWord);
                    System.out.println("Дело " + firstWord + " Заменено на" + lastWord);}
                case ("LIST") ->{
                    System.out.println("Список дел: " +todoList.getTodos());
                }
            }
        }
    }
}

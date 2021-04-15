package lab2;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date deadline1 = new Date(System.currentTimeMillis() + 20000000);
        Date deadline2 = new Date(System.currentTimeMillis() + 86400000);
        Date deadline3 = new Date(System.currentTimeMillis() + 10800000);
        Date deadline4 = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(91));
        Date deadline5 = new Date(System.currentTimeMillis() + 1209600000);

        lab2.Task task1 = new lab2.Task("Nauka na angielski", "godzina nauki", lab2.taskCategory.NEW,  deadline1.toString());
        lab2.Task task2 = new lab2.Task("Zadanie na wf", "Przebiec 3km", lab2.taskCategory.IN_PROGRESS, deadline2.toString());
        lab2.Task task3 = new lab2.Task("Jedzenie", "Zjedzenie kanapki", lab2.taskCategory.DONE, deadline3.toString());
        lab2.Task task4 = new lab2.Task("Spanie", "Spac 8h", lab2.taskCategory.NEW, deadline4.toString());
        lab2.Task task5 = new lab2.Task("Serwis", "Naprawa kontaktu", lab2.taskCategory.NEW, deadline5.toString());

        List<lab2.Task> taskList = new ArrayList<lab2.Task>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        taskList.add(task5);

        for (lab2.Task task : taskList) {
            System.out.println(task.toString());
        }

    }
}


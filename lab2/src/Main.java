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

        Task task1 = new Task("Nauka na angielski", "godzina nauki", taskCategory.NEW,  deadline1.toString());
        Task task2 = new Task("Zadanie na wf", "Przebiec 3km", taskCategory.IN_PROGRESS, deadline2.toString());
        Task task3 = new Task("Jedzenie", "Zjedzenie kanapki", taskCategory.DONE, deadline3.toString());
        Task task4 = new Task("Spanie", "Spac 8h", taskCategory.NEW, deadline4.toString());
        Task task5 = new Task("Serwis", "Naprawa kontaktu", taskCategory.NEW, deadline5.toString());

        List<Task> taskList = new ArrayList<Task>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        taskList.add(task5);

        for (Task task : taskList) {
            System.out.println(task.toString());
        }

    }
}


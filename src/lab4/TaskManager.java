package lab4;

import lab2.Task;
import lab2.taskCategory;

public interface TaskManager {
    Task addTask(Task t);
    void removeTask(Task t);
    Task[] getAllTasks();
    Task getTaskByName(String taskName);
    public static final Task [] tasks = {
            new Task("Spacer", "Iść na spacer", taskCategory.NEW),
            new Task("Wysyłka", "Przygotować paczkę do wysyłki", taskCategory.DONE),
            new Task("Zakupy", "Jechać do miasta na zakupy",taskCategory.NEW),
            new Task("Paczkomat", "Odebrać paczkę z paczkomatu", taskCategory.IN_PROGRESS),
            new Task("Spotkanie", "Pojechać do Radka po głośnik",taskCategory.DONE),
            new Task("Siłownia", "Iść zrobic trening na siłowni", taskCategory.NEW),
            new Task("Warsztat", "Naprawić konsolę Xbox", taskCategory.IN_PROGRESS),
            new Task("Odpoczynek", "Odpocząć przy filmie/serialu", taskCategory.DONE),
            new Task("Studia", "Wykonać sprawozdanie-Optoelektronika", taskCategory.NEW),
            new Task("Zajęcia", "Zalogować się na angielski w piątek", taskCategory.IN_PROGRESS),

    };

}
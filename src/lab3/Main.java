package Lab3;

import lab2.Task;
import lab2.taskCategory;


public class Main {
    public static void main(String[] args) {
        Task zad1 = new Task("Warsztat", "Wlutować switche do pada", taskCategory.IN_PROGRESS);
        Subtask zad2 = (Subtask) new Task("Spacer", "Pójść na spacer z pieskami", taskCategory.DONE);
        Task zad3 = (Task) new Object();
        Subtask zad4 = (Subtask) new Object();
    }

    public void getDetailInfo(Object o);






}
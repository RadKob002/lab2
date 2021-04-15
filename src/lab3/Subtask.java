package Lab3;

import lab2.Task;




public class Subtask extends Task {
    private String subtaskName;
    String getSubtaskName() {
        return null;
    }

    void SubtaskName(String subtaskName) {

    }

    @Override
    public String toString() {
        return "Subtask{" +
                "subtaskName='" + subtaskName + '\'' +
                '}';
    }



    public Subtask(String taskName, String taskDescription, lab2.taskCategory taskCategory, String taskDateTimeStop, String subtaskName) {
        super(taskName, taskDescription, taskCategory);
        this.subtaskName = subtaskName;
    }

}
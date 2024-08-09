/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import Taks.Task;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Project {

    private int id;
    private String name;
    private ArrayList<Task> tasks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
        this.tasks = new ArrayList<Task>();
    }

    public Project() {
        this(0, "");
    }

    public int NumTasks() {
        return tasks.size();
    }

    public int NumTaskCompleted() {
        int num = 0;

        for (Task task : tasks) {
            if (task.isComplete()) {
                num += 1;
            }
        }
        return num;
    }

    public int TaskCompletedPorcent() {
        int num;

        num = (100 / tasks.size()) * NumTaskCompleted();

        return num;
    }
}

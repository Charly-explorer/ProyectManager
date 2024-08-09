package Taks;

import Comments.Comment;
import Users.User;
import java.util.ArrayList;

public class Task {
   private  int id;
   private String description;
   private boolean complete;
   private User user;
   private ArrayList<Comment> list;

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }

    public User getUser() {
        return user;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
   
   
   
    public int getId() {
        return id;
    }

    public Task(int id, String description, boolean complete, User user ) {
        this.id = id;
        this.description = description;
        this.complete = complete;
        this.user = user;
        this.list = new ArrayList<Comment>();
    }
    public Task(){
        this(0,"",false, new User());
    }
   
}


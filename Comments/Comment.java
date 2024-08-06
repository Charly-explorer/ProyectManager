
package Comments;

import Users.User;

public class Comment {
    
    private int id;
    private User user;
    private String comment;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public Comment(int id, User user, String comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    public Comment() {
        this(0,new User(),"");
    }
    
    
    
}

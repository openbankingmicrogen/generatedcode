package test.model;


public class UpdateUserP {

    private String username;
    private User body;

    public UpdateUserP() {

    }

    public UpdateUserP(String username,User body) {
        this.username = username;
        this.body = body;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }
    public User getBody () {
        return body;
    }

    public void setBody (User body) {
        this.body = body;
    }

}

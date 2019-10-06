package test.model;

import test.model.User;

public class GetUserByNameP {

    private String username;

    public GetUserByNameP() {

    }

    public GetUserByNameP(String username) {
        this.username = username;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

}

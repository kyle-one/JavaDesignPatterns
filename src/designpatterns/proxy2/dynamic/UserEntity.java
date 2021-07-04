package designpatterns.proxy2.dynamic;

import java.util.ArrayList;
import java.util.List;

public class UserEntity {
    private int userid;
    private String information;

    public int getId() {
        return userid;
    }

    public void setId(int id) {
        this.userid = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

}

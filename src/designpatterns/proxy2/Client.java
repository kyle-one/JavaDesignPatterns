package designpatterns.proxy2;

import designpatterns.proxy2.dynamic.DataBase;

public class Client {
    public static void main(String[] args) {
        DataBase db=new DataBase();
        //Permission pm=new GuestPermission(db);
        Permission pm;
        pm=(Permission) XMLUtil.getBean();
        pm.setDb(db);
        pm.show();
    }
}

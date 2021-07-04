package designpatterns.proxy2;

import designpatterns.proxy2.dynamic.DataBase;

public interface Permission {
    public void show();
    public void setDb(DataBase d);
}

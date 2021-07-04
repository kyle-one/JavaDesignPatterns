package designpatterns.proxy2;

import designpatterns.proxy2.dynamic.DataBase;

public class GuestPermission implements Permission{
    private DataBase db;
    public void show(){
        System.out.println(db.getPosts().size());
        for(int i=0;i<db.getPosts().size();i++){
            System.out.println("postID:"+db.getPosts().get(i).getPostID()+"   parentID:"+db.getPosts().get(i).getParentId()+"   title:"+db.getPosts().get(i).getTitle());
        }
    }
    public void setDb(DataBase d){
        db=d;
    }
}

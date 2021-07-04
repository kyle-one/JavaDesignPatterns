package designpatterns.proxy2;

import designpatterns.proxy2.dynamic.DataBase;
import designpatterns.proxy2.dynamic.PostEnity;
import designpatterns.proxy2.dynamic.UserEntity;

public class ProxyPermission implements Permission{
    private DataBase db;
    private GuestPermission gp=new GuestPermission();
    public void show(){
        gp.show();
    }
    public void createPost(String title,int parentId){
        PostEnity posttemp=new PostEnity();
        posttemp.setParentId(parentId);
        posttemp.setTitle(title);
        posttemp.setPostID(db.getPosts().size());
        db.addPost(posttemp);
    }
    public void modifyPost(String title,int postId){
        PostEnity posttemp=db.getPosts().get(postId);
        posttemp.setTitle(title);
        db.delPost(postId);
        db.addPost(posttemp);
    }
    public void modifyUser(String information,int userId){
        UserEntity usertemp=db.getUsers().get(userId);
        usertemp.setInformation(information);
        db.delUser(userId);
        db.addUser(usertemp);
    }

    public void setDb(DataBase d){
        db=d;
    }
}

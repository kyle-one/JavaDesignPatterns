package designpatterns.proxy2.dynamic;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<PostEnity> posts=new ArrayList();
    private List<UserEntity> users=new ArrayList();

    public List<PostEnity> getPosts() {
        return posts;
    }

    public void setPosts(List<PostEnity> posts) {
        this.posts = posts;
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    public DataBase(){
        PostEnity posttemp=new PostEnity();
        PostEnity posttemp2=new PostEnity();
        UserEntity usertemp=new UserEntity();

        posttemp.setParentId(1);
        posttemp.setTitle("�ൺ����ѧ����181������������");
        posttemp.setPostID(0);
        posttemp2.setParentId(1);
        posttemp2.setTitle("�ൺ����ѧ����181�������ĵڶ�������");
        posttemp2.setPostID(1);


        usertemp.setId(0);
        usertemp.setInformation("�����ൺ����ѧ");

        posts.add(posttemp);
        posts.add(posttemp2);
        users.add(usertemp);
    }
    public void addPost(PostEnity p){
        posts.add(p);
    }
    public void addUser(UserEntity u){
        users.add(u);
    }
    public void delPost(int pid){
        posts.remove(pid);
    }
    public void delUser(int uid){
        users.remove(uid);
    }


}

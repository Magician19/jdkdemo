/**
 * @author duwen
 * @className User
 * @date 2018/12/21 15:06
 * @description
 */
public class User implements Cloneable{
    private String username;
    private int age;
    User(String username,int age){
        this.username = username;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        User user = new User("zhangsan",18);
        try {
            User user1 = (User)user.clone();
            System.out.println(user1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(user);
    }


}


import java.util.List;

public class MyUser extends User implements IUser {

    @Override
    public int f1(List<User> t) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < t.size(); i++) {
            if(Character.isDigit(t.get(i).getName().charAt(1))){
                if(t.get(i).getStatus()>max){
                    max = t.get(i).getStatus();
                }
            }
        }
        return max;

    }

    @Override
    public void f2(List<User> t) {
        User a = t.get(3);
        t.set(3,t.get(5));
        t.set(5,a);
            
    }

    @Override
    public void f3(List<User> t) {
        User maxUser = null;
        int max = 0;
        for (User u:t){
            if (u.getStatus()>=max){
                max = u.getStatus();
                maxUser = u;
            }
        }
        t.set(0, maxUser);
    }

}

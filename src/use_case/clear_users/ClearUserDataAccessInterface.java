package use_case.clear_users;
import java.util.ArrayList;
import entity.User;

public interface ClearUserDataAccessInterface {
    void clear();
    String getUsers(ArrayList<String> users);
}
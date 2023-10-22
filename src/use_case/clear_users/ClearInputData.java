package use_case.clear_users;
import java.util.ArrayList;
public class ClearInputData {
    final private ArrayList<String> users;

    public ClearInputData(ArrayList<String> users) {
        this.users = users;
    }

    public ArrayList<String> getUsers() {
        return users;
    }
}

package use_case.clear_users;
import java.util.ArrayList;

public class ClearOutputData {
    private ArrayList<String> users;
    private boolean useCaseFailed;

    public ClearOutputData(ArrayList<String> users, boolean useCaseFailed) {
        this.users = users;
        this.useCaseFailed = useCaseFailed;

    }

    public ArrayList<String> getDeletedUsers(){
        return users;
    }
}

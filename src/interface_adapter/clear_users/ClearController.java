package interface_adapter.clear_users;

import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInputBoundary;
import java.util.ArrayList;

public class ClearController {

    final ClearInputBoundary clearUseCaseInteractor;

    public ClearController(ClearInputBoundary clearUseCaseInteractor){
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute(ArrayList<String> users){
        ClearInputData clearInputData = new ClearInputData(users);

        clearUseCaseInteractor.execute(clearInputData);
    }
}

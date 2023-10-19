package interface_adapter.clear_users;

import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInputBoundary;

public class ClearController {

    final ClearInputBoundary clearUseCaseInteractor;

    public ClearController(ClearInputBoundary clearUseCaseInteractor){
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute(String username, String password) {
        ClearInputData clearInputData = new ClearInputData(username, password);

        clearUseCaseInteractor.execute(clearInputData);
    }
}

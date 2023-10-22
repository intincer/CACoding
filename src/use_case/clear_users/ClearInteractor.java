package use_case.clear_users;
import data_access.FileUserDataAccessObject;
import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface clearDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.clearDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

   // public CleanInteractor() {
   // }

    @Override
    public void execute(ClearInputData clearInputData) {
        ArrayList<String> users = clearInputData.getUsers();
        clearDataAccessObject.clear();
        clearPresenter.prepareSuccessView(clearInputData);
    }
}

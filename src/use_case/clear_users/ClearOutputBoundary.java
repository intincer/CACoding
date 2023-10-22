package use_case.clear_users;

public interface ClearOutputBoundary {
    void prepareSuccessView (ClearInputData users);

    void prepareSuccessView (ClearOutputData users);

}

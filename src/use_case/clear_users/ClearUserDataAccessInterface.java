package use_case.clear_users;

import entity.User;

public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);

    void clear();

    void remove(User user);

    User get(String username);
}
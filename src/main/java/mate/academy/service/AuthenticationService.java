package mate.academy.service;

import mate.academy.model.User;

public class AuthenticationService {
    /**
     * Imagine that some user wants to login to your site.
     * You should check if user credentials (login and password) are valid or not.
     * All users are stored in <code>UserService</code> class.
     * @param email - user's email
     * @param password - user's password
     * @return true if user by email exists and passed password is equal to user's password.
     * Return false in any other cases.
     */
    public boolean login(String email, String password) {
        UserService userService = new UserService();
        User user = userService.findByEmail(email);
        if (user == null) {
            System.out.println("Error, no such email address");
            return false;
        }
        if (user.getPassword().equals(password)) {
            return true;
        } else {
            System.out.println("Error, wrong password");
            return false;
        }
    }
}

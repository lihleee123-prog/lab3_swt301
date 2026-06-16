package traltb.example;

import java.util.logging.Logger;

public class InsecureLoginFixed {

    private static final Logger logger = Logger.getLogger(InsecureLoginFixed.class.getName());

    public static void login(String username, String password) {
        if (username.equals("admin") && password.equals(System.getenv("ADMIN_PASSWORD"))) {
            logger.info("Login successful");
        } else {
            logger.warning("Login failed");
        }
    }

    public void printUserInfo(String user) {
        if (user != null && !user.isEmpty()) {
            logger.info("User: " + user);
        }
    }
}

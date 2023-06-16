public class UserData {

    public static void userDataCheck(String login, String password, String confirmPassword) {

        if (login.length() > 20 ) {
            throw new WrongLoginException("Логин должен быть меньше или равен 20 символов");
        }

        if (password.length() > 20 ) {
            throw new WrongPasswordException("Пароль должен быть меньше или равен 20 символов");
        }

        if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongLoginException("Логин может содержать только латинские буквы, цифры и _");
        }

        if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongPasswordException("Пароль может содержать только латинские буквы, цифры и _");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}



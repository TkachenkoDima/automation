package homework12_Exception.Task5_Validator;

public class main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Validator validator = new Validator();
        validator.loginUser("Kek", "123", "123");
    }
}

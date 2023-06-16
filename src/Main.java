public class Main {

    public static void main(String[] args) {
        System.out.println();


        try {
            UserData.userDataCheck("Artem", "code1", "code");
        } catch (WrongLoginException ex) {
            System.out.println(ex.getMessage());
        } catch (WrongPasswordException x) {
            System.out.println(x.getMessage());
        }
    }
}

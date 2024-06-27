import java.nio.file.attribute.UserPrincipal;

public class Mexa {
    private static int letOtRodu;
    private static String from;
    private static UserPrincipal userPrincipal;
    public static void main(String[] args) {
        from = "Uzbekistan";
        System.out.println(from);
        userPrincipal = new UserPrincipal() {
            @Override
            public String getName() {
                return "Zero";
            }
        };
    }
}

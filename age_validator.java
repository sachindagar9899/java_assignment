package whapper;
public class age_validator {
    public static boolean isValidAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test examples
        System.out.println(isValidAge("20"));  // true
        System.out.println(isValidAge("17"));  // false
        System.out.println(isValidAge("abc")); // false
    }


}

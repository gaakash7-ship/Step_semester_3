package Assignment_problems;

class PasswordChecker {
    private final String password;

    PasswordChecker(String password) {
        this.password = password;
    }

    public String getStrength() {
        int length = password.length();

        if (length < 6) {
            return "Weak";
        } else if (length <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker("abcd");
        System.out.println("Password 1 Strength: " + pc.getStrength());

        PasswordChecker pc2 = new PasswordChecker("abcdefgh");
        System.out.println("Password 2 Strength: " + pc2.getStrength());

        PasswordChecker pc3 = new PasswordChecker("abcdefghijkl");
        System.out.println("Password 3 Strength: " + pc3.getStrength());
    }
}
public class PhoneMask {

    static String maskPhoneNumber(String phone) {

        if (phone.length() != 10)
            return "Invalid phone number";

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i)))
                return "Invalid phone number";
        }

        String last4 = phone.substring(6);

        StringBuilder sb = new StringBuilder("XXXXXX");
        sb.insert(6, "-");
        sb.append(last4);

        return sb.toString();
    }

    public static void main(String[] args) {

        String phone = "9876543210";

        System.out.println(maskPhoneNumber(phone));
    }
}

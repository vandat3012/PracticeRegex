public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[] {"adcfrs","______","0000000"};
    public static final String[] inValidAccount = new String[] {"@4adcfrs","4___","*******"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String e : validAccount) {
            boolean isValid = accountExample.validate(e);
            System.out.println("Account is " + e + " is Valid " + isValid);
        }
        for (String e : inValidAccount) {
            boolean isValid = accountExample.validate(e);
            System.out.println("Account is " + e + " is Valid " + isValid);
        }
    }
}

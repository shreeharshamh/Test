public class ImmutableAccounts {
    private String accountId;

    ImmutableAccounts(String accountId) {
        this.accountId = accountId;
    }

    public ImmutableAccounts modify(String accountId) {
        if(this.accountId == accountId) { return this; }
        else { return new ImmutableAccounts(accountId); }
    }

    public static void main(String[] args) {
        ImmutableAccounts i1 = new ImmutableAccounts("BRRPG1730L");
        ImmutableAccounts i2 = i1.modify("ASDFG1234M");
        ImmutableAccounts i3 = i1.modify("BRRPG1730L");

        System.out.println(i1 == i2);   // false
        System.out.println(i1 == i3);   // true
    }
}
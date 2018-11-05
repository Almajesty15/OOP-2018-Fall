public class Customer {
    private String name, memberType;
    private boolean member;

    public Customer(String name) { this.name = name; }

    public String getName() { return name; }

    public boolean isMember() { return member; }

    public void setMember(boolean member) { this.member = member; }

    public String getMemberType() { return memberType; }

    public void setMemberType(String memberType) { this.memberType = memberType; }

    public String toString() {
        if (member) return name + " is a member of club\n";
        else return name + " is not a member of club\n";
    }
}

public class Tester {
    public static void main(String[] args) {
        Customer cst = new Customer("Bob");
        cst.setMember(true);
        cst.setMemberType("Gold");
        if (cst.isMember()) System.out.println(cst.getName());

        Visit vs = new Visit(cst, "13:10:2018");
        vs.setProductExpence(5000);
        vs.setServiceExpence(1000);

        System.out.println(vs.getProductExpence());
        System.out.println(vs.getServiceExpence());
        System.out.println(vs.getTotalExpence());

        System.out.println(vs.toString());

        Customer poorCst = new Customer("Jack");
        cst.setMember(false);

        vs.setProductExpence(3000);
        vs.setServiceExpence(2000);

        System.out.println(vs.getProductExpence());
        System.out.println(vs.getServiceExpence());
        System.out.println(vs.getTotalExpence());

        System.out.println(poorCst.toString());
    }
}

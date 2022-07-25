public class BuilderDemo {
    public static void main(String[] args) {
        Customer customer = Customer.builder()
                .phonenumber("0595448776")
                .Email("Ahmad@gmail.com")
                .ID(1)
                .name("Ahmad")
                .build();
        System.out.println(customer.toString());
    }
}

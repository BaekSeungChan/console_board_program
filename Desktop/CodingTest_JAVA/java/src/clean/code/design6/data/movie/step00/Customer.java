package clean.code.design6.data.movie.step00;

public class Customer {
    private String name;
    private String id;
    private static int generationId = 1;

    private Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private static int getNextId() {
        return generationId++;
    }

    public static Customer createCustomer(String name) {
        return new Customer(String.valueOf(getNextId()), name);
    }
}

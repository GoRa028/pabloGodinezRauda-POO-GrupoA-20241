public class Main {
    public static void main(String[] args) {

        Product prd1 = new Product("Gum",8.5F);
        Product prd2 = new Product("Soda",10,5);

        System.out.println("1st product values:");
        System.out.println(prd1.getName());
        System.out.println(prd1.getPrice());
        System.out.println(prd1.getStock());

        System.out.println("\n2nd Product values:");
        System.out.println(prd2.getName());
        System.out.println(prd2.getPrice());
        System.out.println(prd2.getStock());

        System.out.println("\n1st product set name:");
        prd1.setName("");
        prd1.setName("BubbleGum");
        System.out.println(prd1.getName());

        System.out.println("\n2nd product set price:");
        prd2.setPrice(0);
        prd2.setPrice(-1);
        prd2.setPrice(12.5F);
        System.out.println(prd2.getPrice());

        System.out.println("\n1st product set stock:");
        prd1.setStock(-1);
        prd1.setStock(7);
        System.out.println(prd1.getStock());

        System.out.println("\n1st product add stock:");
        System.out.println("Initial stock: " + prd1.getStock());
        prd1.addStock(0);
        prd1.addStock(3);
        System.out.println("Final stock: " + prd1.getStock());

        System.out.println("\n2nd product reduce stock:");
        System.out.println("Initial stock: " + prd2.getStock());
        prd2.reduceStock(0);
        prd2.reduceStock(8);
        prd2.reduceStock(3);
        System.out.println("Final stock: " + prd2.getStock());

    }
}
public class Main {
    public static void main(String[] args) {
        Product product = new Product("Matebook", "Huawei", 1);

        product.setName("Matebook");
        product.setId(1);
        product.setBrand("Huawei");
        product.setRam(8);
        product.setPrice(11000);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }

}

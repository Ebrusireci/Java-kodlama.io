public class Product {
    public Product(String name, String brand, int id) {

    }

    public Product (){
        System.out.println("Yapıcı blok çalıştı");
    }

    private int id;
    private String name;
     private String brand;
    private int ram;
     private double price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 12000){;
        this.price = price;

    }else {
            System.out.println("Girilemez! Fiyat sınırının altında kaldı.");
        }}}




public class Main {
    public static void main(String[] args) {
        CustomerManager urunSayisi = new CustomerManager();
        urunSayisi.bluz = 2500;
        urunSayisi.gomlek = 1200;
        urunSayisi.kazak = 1800;
        System.out.println(urunSayisi.bluz);

        CustomerManager siparissayisi = new CustomerManager();
        siparissayisi.bluz = 2390;
        siparissayisi.gomlek = 479;
        siparissayisi.kazak = 1387;
        System.out.println(siparissayisi.kazak);

    }
}





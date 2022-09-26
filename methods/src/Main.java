public class Main {
    static void yaz(){
        System.out.println("Cevap: ");
    }
    static int f(int x){
        return 8*x+15;
    }
    static int g(int x, int y){
        return f(y*x+35);
    }
    public static void main(String[] args) {
        yaz();
        System.out.println(g(5, 8));
        int toplam = topla2(5,9,6,2);
        System.out.println(toplam);
    }
public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi: sayilar){
            toplam= toplam+sayi;
        }
        return  toplam;
}
    }

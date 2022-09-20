public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] {1,4,7,6,9};
        int aranacak = 9;

        boolean VarMı = false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                VarMı= true;
                break;
            }
        }
        if (VarMı){
            System.out.println("sayı mevcuttur");
        }else {
            System.out.println("sayı mevcut değildir");
        }


    }
}
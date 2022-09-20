import java.lang.invoke.SwitchPoint;

public class Main {
    public static void main(String[] args) {
      char grade = 'D';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel:Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok iyi:Geçtiniz");
                break;
            default:
                System.out.println("Geçersiz!");

        }
    }
}

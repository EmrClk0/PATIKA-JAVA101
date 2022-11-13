import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String password = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sifre Gir: ");
        String Userpassword = scanner.next();

        if(!password.equals(Userpassword)){
            System.out.print("Sifre Resetlemek istermisin: evet için 1 hayır için 2: ");
            int reset = scanner.nextInt();

            if(reset==1){
                String newPassword;
                do {
                    System.out.print("yeni şifre  Gir: ");
                    newPassword = scanner.next();
                    if(newPassword.equals(Userpassword) || newPassword.equals(password)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. ");
                    }else{
                        System.out.println("Şifre oluşturuldu.");
                        password = newPassword;
                        break;
                    }

                }while(!newPassword.equals(Userpassword) || !newPassword.equals(password));



            }

        }

    }
}

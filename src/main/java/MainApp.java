import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı Giriniz: ");
        var name = scanner.next();
        System.out.println("Maaş bilginizi giriniz: ");
        var s = scanner.nextDouble();
        System.out.println("Haftalık çalışma saatinizi Giriniz: ");
        var scn = scanner.nextDouble();
        System.out.println("İşe Başlangıç Yılınız: ");
        var year = scanner.nextInt();

        Employee employee = new Employee(name,s,scn,year);


        System.out.println(employee);



    }
}

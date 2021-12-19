import java.util.Scanner;
public class Purch {
    public void purchase(Client[] a1) throws InnException {
        String fio1;
        int inn1=-1;
        int inn2;
        Scanner n = new Scanner(System.in);
        Scanner n1 = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        fio1=n.nextLine();
        for (int i=0;i<3;i++) {
            if (fio1.equals(a1[i].fio)) inn1=a1[i].inn;

        }
        System.out.println("Введите ИНН: ");
        inn2=n1.nextInt();
        if (inn2!=inn1) {
            throw new InnException("INN is incorrect");
        }
        else System.out.println("ИНН совпал");
    }
}

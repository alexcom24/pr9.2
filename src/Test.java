import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Client [] a=new Client[3];
        InnSolution r=new InnSolution();
        a[0]=new Client("twet",345);
        a[1]=new Client("tweta",346);
        a[2]=new Client("twety",347);
        int k=-1;
        while (k!=0) {
            System.out.println("Для вызова метода оформления заказа нажать единицу");
            System.out.println("Для завершения работы нажать ноль");
            System.out.print("Ввод цифры: ");
            k= sn.nextInt();
            if (k==0) break;
            else r.Solution(a);


        }
    }



}

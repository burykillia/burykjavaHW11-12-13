import java.util.Scanner;

public class SumNum {
    public static void main(String[] args){
        int num = (int) (Math.random() * (100011 - 11) + 11);
        System.out.println("Задане рандоине число: " + num);
        int c = 0;
        int sumNum = 0;
        int tmp = num;
        while(tmp !=0){
            sumNum += tmp % 10;
            tmp /=10;
            c++;
        }
        System.out.println("Сума цифр введеного числа: " + sumNum + ", кількість розрядів: " + c);
    }
}

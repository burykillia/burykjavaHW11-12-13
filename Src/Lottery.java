import java.util.Arrays;

public class Lottery {
    public static void main(String[] args){
        int winNum[] = new int[7];
        int lotNum[] = new int[7];
        int count = 0;
        for (int i = 0; i < 7; i++) {
            winNum[i] = (int) (Math.random() * 9);
            lotNum[i] = (int) (Math.random() * 9);
        }
        Arrays.sort(winNum);
        Arrays.sort(lotNum);
        for (int i = 0; i < 7; i++) {
            if(winNum[i] == lotNum[i]){
                count++;
            }
        }
        System.out.println(Arrays.toString(winNum));
        System.out.println(Arrays.toString(lotNum));
        System.out.println("Кількість збігів: " + count);
    }
}

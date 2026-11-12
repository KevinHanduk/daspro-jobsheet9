import java.util.Arrays;
public class ArrayBilangan04 {
    public static void main(String[] args) {
        int[] bil = {5, 13, -7, 17};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println("nilai = " + nilai);
        }
        System.out.println("bil = " + Arrays.toString(bil));
    }
}
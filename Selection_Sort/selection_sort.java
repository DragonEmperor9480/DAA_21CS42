import java.util.Random;

public class selection_sort {
    public static void main(String[] args) {
        Random ran = new Random();
        int a, i, j, min, temp;
        long start, end;
        a = 15000;
        int b[] = new int[a];
        int c[] = new int[a];
        int d[] = new int[a];

        for (i = 0; i < a; i++) {
            b[i] = ran.nextInt(5000);
            c[i] = b[i];
        }
        // Average case
        start = System.currentTimeMillis();
        for (i = 0; i < a - 1; i++) {
            sorting(a, i, b);
        }
        end = System.currentTimeMillis();
        long avgCaseTime = end - start;
        // Best case
        start = System.currentTimeMillis();
        for (i = 0; i < a - 1; i++) {
            sorting(a, i, b);
        }
        end = System.currentTimeMillis();
        long bestCaseTime = end - start;
        // Worst case
        for (i = 0; i < a; i++) {
            b[i] = i + 1; 
            d[i] = b[i];
        }
        for (i = 0; i < a - 1; i++) {
            for (j = i + 1; j < a; j++) {
                temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
        }
        start = System.currentTimeMillis();
        for (i = 0; i < a - 1; i++) {
            sorting(a, i, b);
        }
        end = System.currentTimeMillis();
        long worstCaseTime = end - start;

        System.out.println("The Array before sorting is:");
        for (i = 0; i < a; i++)
            System.out.print(c[i] + " ");
        System.out.println("\n");

        System.out.println("The Sorted Array is:");
        for (i = 0; i < a; i++)
            System.out.println(b[i] + "  ");
        System.out.println();

        System.out.println("Best case: " + bestCaseTime + "ms");
        System.out.println("Average case: " + avgCaseTime + "ms");
        System.out.println("Worst case: " + worstCaseTime + "ms");
    }

    static void sorting(int a, int i, int[] b) {
        int j, temp, min;
        min = i;

        for (j = i + 1; j < a; j++) {
            if (b[j] < b[min])
                min = j;
        }

        temp = b[min];
        b[min] = b[i];
        b[i] = temp;
    }
}

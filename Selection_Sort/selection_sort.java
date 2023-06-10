import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a,i,j,min,temp;
    System.out.println("Enter the number of elements in array");
    a = scn.nextInt();
    int b[] = new int[a];
    System.out.println("Enter the Array elements");
    for(i = 0; i < a; i++)
    b[i] = scn.nextInt();
     for( i = 0; i < a - 1; i++)
    {
    min = i;

    for(j = i+1; j < a; j++)
    {
        if(b[j] < b[min])
        min = j;
    }
        temp = b[min];
        b[min] = b[i];
        b[i] = temp;
    }
    System.out.println("The Sorted Array is:");
        for(i = 0; i < a; i++)
        System.out.print(b[i] + " ");
    
    }
    
}

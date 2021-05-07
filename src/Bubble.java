public class Bubble {
    public void b_sort(int array[]) {
        int temp;
        int change = 1;
        while (change > 0) {
            change = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    change++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

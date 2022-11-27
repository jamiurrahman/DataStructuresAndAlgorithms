public class Array {

    int[] array;
    int currentIndex;

    public Array(int length) {
        array = new int[length];
    }

    public void print() {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public void copyArray(int[] from, int[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    public void insert(int item) {
        if (currentIndex >= array.length) {
            int[] newArray = new int[array.length];
            copyArray(array, newArray);
            array = new int[array.length + 1];
            copyArray(newArray, array);
        }

        array[currentIndex] = item;
        currentIndex++;

    }

    public void removeAt(int indexOf) {
        if (indexOf >= array.length) {
            System.out.println("Out of bound index.");
            return;
        }

        int[] newArray = new int[array.length - 1];
        for ( int i = 0; i < indexOf; i++ ) {
            newArray[i] = array[i];
        }
        for ( int i = (indexOf + 1); i < array.length; i++) {
            newArray[i - 1] = array[i];
        }

        array = new int[array.length - 1];
        copyArray(newArray, array);
        currentIndex--;
    }
}

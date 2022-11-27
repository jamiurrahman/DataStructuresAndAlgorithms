public class Array {

    int[] array;
    int currentIndex;

    public Array(int length) {
        array = new int[length];
    }

    public void print() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(array[i]);
        }
    }

    public void copyArray(int[] from, int[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    public void insert(int item) {
        if (currentIndex >= array.length) {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[currentIndex] = item;
        currentIndex++;

    }

    public void removeAt(int index) {
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException();
        }

        for ( int i = (index + 1); i < array.length; i++) {
            array[i - 1] = array[i];
        }

        currentIndex--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                return i;
            }
        }

        return -1;
    }
}

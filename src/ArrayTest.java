public class ArrayTest {

    public static void main(String[] args) {


        int[] tablica1 = {1,2,3,4};
        int[] tablica2 = {1,2,3,5};

        ArrayComparator compare = new ArrayComparator();
        boolean porownanie = compare.compare(tablica1, tablica2);
        System.out.println(porownanie);
    }
}

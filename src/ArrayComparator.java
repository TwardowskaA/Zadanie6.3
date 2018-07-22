public class ArrayComparator {

    boolean compare(int[] tab1, int[] tab2) {

        for (int i = 0; i < tab1.length; i++) {

            if (tab1[i] != tab2[i]) {
                return false;
            }

            if (tab1.length != tab2.length) {
                return false;

            }
        }
        return true;
    }
}


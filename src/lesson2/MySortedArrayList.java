package lesson2;

public class MySortedArrayList<T extends Comparable<T>> extends MyArrayList<T> {

    @Override
    public void add(T item) {
        int i = 0;
        while (i < size() && item.compareTo(get(i)) >= 0) {
            i++;
        }

        super.add(i, item);
    }

    @Override
    public void add(int index, T item) {
        add(item);
    }

    public int binaryFind(T item) {
        int lo = 0;
        int hi = size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;  //(lo + hi) / 2
            if (item.compareTo(get(mid)) < 0) {
                hi = mid - 1;
            } else if (item.compareTo(get(mid)) > 0) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int recBinaryFind(T item){
        return recBinaryFind(item, 0, size()-1);
    }

    private int recBinaryFind(T item, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;
        if (item.compareTo(get(mid)) == 0) {
            return mid;
        } else if (lo == hi) {
            return -1;
        } else if (item.compareTo(get(mid)) < 0) {
            return recBinaryFind(item, lo, mid);
        } else {
            return recBinaryFind(item, mid + 1, hi);
        }
    }
}

package Array;

public class SortArrayOfStrings {
    // public static void sort(String arr[], int n) {
    // for (int i = 0; i < n - 1; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if (arr[i].compareTo(arr[j]) > 0) {
    // String temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }
    // }
    // }
    // }

    public static void merge(String arr[], int s, int m, int e) {
        String temp[] = new String[e - s + 1];
        int i = s;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= e) {
            if (arr[i].compareTo(arr[j]) < 0) {

                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= m) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= e) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for (k = 0, i = s; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void mergerSort(String arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int m = s + (e - s) / 2;
        mergerSort(arr, s, m);
        mergerSort(arr, m + 1, e);
        merge(arr, s, m, e);
    }

    public static void main(String args[]) {
        String[] countries = { "Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark",
                "France", "Netherlands", "Italy", "Germany" };

        mergerSort(countries, 0, countries.length - 1);
        for (int i = 0; i < countries.length; i++) {
            System.out.print(countries[i] + " ");
        }

    }
}

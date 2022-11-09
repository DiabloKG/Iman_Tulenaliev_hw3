import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static void swap(double[] array, int ind1, int ind2) {
        double tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;}

    public static void main(String[] args) {
        List<Double> pstvnums = new ArrayList();
        List ngtvlist = new ArrayList();
        boolean ngtvnums = false;

        double[] nums1 = {12.6, 254.21, -45.2, 69.5, -144.21, 78.36, -34.26, 64.12, -788.365, 546.21, 25.456, -785.21,
                126.123, 723.4, 1.25};
        for (double nums2 : nums1) {
            if (ngtvnums == false && nums2 > 0){
                continue;
            } if (ngtvnums == true && nums2 > 0){
                pstvnums.add(nums2);
            } if (ngtvnums == false && nums2 < 0){
                ngtvnums = true;
                ngtvlist.add(nums2);
            }
            }
        double average = 0.0;
        double sum = 0;
        for (double num: pstvnums) {
            sum += num;
        }
        average = sum/pstvnums.size();
        System.out.println("\n1. Среднее число = " + average);


        for (int left = 0; left < nums1.length; left++) {
            int minInd = left;
            for (int i = left; i < nums1.length; i++) {
                if (nums1[i] < nums1[minInd]) {
                    minInd = i;
                }
            }
            swap(nums1, left, minInd);
        }
        System.out.println("\n2. От меньшего к большему = " + Arrays.toString(nums1));
    }
    }

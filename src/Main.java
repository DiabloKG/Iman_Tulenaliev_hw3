public class Main {
    public static void main(String[] args) {
        double sum = 0.0;
        double num = 0;
        double ngtv = 0.0;
        double[] nums1 = {12.6, 254.21, -45.2, 69.5, -144.21, 78.36, -34.26, 64.12, -788.365, 546.21, 25.456, -785.21,
                126.123, 723.4, 1.25};
        for (double nums2 : nums1) {
            if (nums2 > 0 && ngtv == 0) {
                continue;
            }
            if (nums2 < 0) {
                ngtv++;
            }
            if (nums2 > 0) {
                num++;
                sum = sum + nums2;
            }
        }
        System.out.println("Среднее число: " + sum / num);
        for (int i = 0; i < nums1.length; i++){
            int min = i;
            for (int j = i + 1; j < nums1.length; j++){
                if (nums1[j] < nums1[min]) {
                    min = j;
                }
            }
            if (min != i){
                double temp = nums1[i];
                nums1[i] = nums1[min];
                nums1[min] = temp;
            }
            System.out.print(nums1[i] + ", " );
        }
    }
}



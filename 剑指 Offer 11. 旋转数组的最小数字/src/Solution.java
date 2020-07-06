class Solution {
    //二分法
    public int minArray(int[] numbers) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j){
            int mid = (i + j) / 2;
            if (numbers[mid] < numbers[j]) {
                j = mid;
            } else if (numbers[mid] > numbers[j]){
                i = mid + 1;
            } else {
                j--;
            }
        }
        return numbers[i];
    }
}
import java.util.*;
//怎么就越界了？
public class Main {

    public  int partion (int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int key = arr[i];
        int start = i;
        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }
            while (i < j && arr[i] <= key) {
                i++;
            }
            swap(arr, i, j);
        }
        //跳出循环leftright相遇
        //中间相遇的和最开始交换
        swap(arr, i, start);
        return i;
    }

    private void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = partion(arr, left, right);
            quickSort(arr, left, mid - 1);
            quickSort(arr, mid + 1, right);
        }
    }

/*    public static void quickSortNoR (int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        //用栈来记录空间
        Stack<Integer> st = new Stack<>();
        if (left < right) {
            st.push(left);
            st.push(right);
        }
        while (!st.isEmpty()) {
            //取出栈顶的一组区间
            int right1 = st.pop();
            int left1 = st.pop();
            //分组
            int mid = partion(arr, left1, right1);
            //新的分组进行压栈
            if (mid - 1 > left1) {
                st.push(left1);
                st.push(mid - 1);
            }
            if (mid + 1 < right1) {
                st.push(mid + 1);
                st.push(right1);
            }
        }
    }*/

    public  int findKth(int[] a, int n, int K) {
        quickSort(a, 0, n - 1);
        return a[n - K];
    }

/*    public  void main(String[] args) {
        int[] a = {1, 3, 5, 2, 2};
        System.out.println(findKth(a, 5, 3));

        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
        }
    }*/
}









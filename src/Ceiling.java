public class Ceiling {
    public static void main(String[] args) {
        int array[] = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87,88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100

        };
        int target = 88 ,start = 0 , end = array.length-1 , mid =0;
        boolean isAscending = array[start] > array[end] ? false : true;

        int answer = ceilingNumber(array,target,start,end,mid,isAscending);
        System.out.println("The BinarySearch Answer is : "+answer);
        int pointerAnswer = twoPointer(array,target,start,end);
        System.out.println("The TwoPointer Answer is : "+pointerAnswer);


    }

    static int ceilingNumber(int[] array, int target, int start, int end, int mid,boolean isAscending) {
        int steps =0;
        while(start <= end){
            mid = (start+end)/2;
            steps++;
            if(array[mid] == target){
                System.out.println("The BinarySearch Steps : "+steps);
                return mid;
            }
            else if (array[mid] > target) {
                if(isAscending){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            } else if (array[mid] < target) {
                if(isAscending){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return isAscending?array[start]:array[end];
    }

    static int twoPointer(int[] array,int target ,int start , int end){
        int steps =0;
        for(int i = start , j = end ; i <= j ; i++,j--){
            steps++;
            if(array[i] == target){
                System.out.println("The TwoPointer Steps : "+steps);
                return i;
            } else if (array[j] == target) {
                System.out.println("The TwoPointer Steps : "+steps);
                return j;
            }
        }
        return -1;

    }

}

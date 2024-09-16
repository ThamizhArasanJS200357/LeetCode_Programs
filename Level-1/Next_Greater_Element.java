public class Next_Greater_Element {
    public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.
        int []res=new int[n];
        for(int i=0;i<n;i++){
            int max=-1;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    max=arr[j];
                    break;
                }
            }
            res[i]=max;
        }
        return res;
    }
}
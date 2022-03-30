public class OpenClosedEx1 {
    public static void main(String args[])
    {
        int arr[]={1,5,4,2,3};
        ArrayUtil.sort(arr, new AscComparator());
        System.out.println("Values in array are");
        for(int ele: arr)
        {
            System.out.println(ele);
        }
    }
}

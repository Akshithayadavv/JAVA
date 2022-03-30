public class ArrayUtil {
    public static void sort(int a[],ValueComparator Comparator)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(Comparator.compare(a[i],a[j])>0)
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}

public class Program_VII_4_PatternB {
    public static void main(String[] args) {
    int n=9;
    int k=0;
    for(int i=1;i<=3;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(k+" ");
            k+=1;
        }
        System.out.println();
    }
        for(int i=4;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(n+" ");
                n-=1;
            }
            System.out.println();
        }
    }
}

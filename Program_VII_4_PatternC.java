public class Program_VII_4_PatternC {
    public static void main(String[] args) {
    int x=1;
    int n=4;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(x+" ");
           
        }
        System.out.println();
        x++;
    }
        for(int i=4;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(n+" ");
               
            }
            System.out.println();
            n--;
        }
    }
}

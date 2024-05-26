class Program_VII_4_PatternA {
    public static void main(String[] args) {
        int k=0;
        int n = 5;
        for(int i=1 ; i<= 4;i++)
        {
            for(int j= 1 ; j<=i ; j++) {
            System.out.print(k+" ");
            k +=1;
            }
            System.out.println();
        }
        for(int i = 3; i>=1;i--)
        {
            for(int j =i; j>=1;j--)
            {
                System.out.print(n + " ");
                n-=1;
            }
            System.out.println();
        }
        
        

    }
}
class pattern14
{
    public static void main(String args[])
    {
        int i,j;
        int n=5;
    
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}

package qp;
class Abc{
    public static void main(String[] args) {
        //increasing triangle and p to show increasing number
        int n=5;
        for(int i=1,p=1;i<=n;i++,p++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(p+" ");
            }

            System.out.println();
        }
    
    }
}


/*output
 1 
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */
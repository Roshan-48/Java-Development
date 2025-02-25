class Pattern54 {
    public static void main(String[] args) {
        int n = 5;
        /*for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "*");
            }
			 for (int j = i; j >= 1; j--) {
                System.out.print(j + "*");
            }
            System.out.println();
        }*/

		for (int i=5;i>=1;i--)
		{
			for (int k=1;k<=2;k++)
			{
				int a = i;
				for(int j=1;j<=i;j++)
					System.out.print(a-- +"*");
			}
			System.out.println();
		}
    } 
}

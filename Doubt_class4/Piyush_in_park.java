import java.util.*;
public class Main {

    public static void main(String args[]) {
        // Your Code Here

		Scanner s= new Scanner(System.in);

        int n= s.nextInt();
	   int m= s.nextInt();

	   int k= s.nextInt();
	   int S= s.nextInt();

       char [][] arr= new char[n][m];

	   for(int i=0; i<n;i++){

		   for(int j=0; j<m;j++){

			   arr[i][j]=s.next().charAt(0);
		   }
	   }

	   for(int i=0; i<n;i++){

		   for(int j=0; j<m;j++){

			   if(S<k){
				   System.out.println("No");
				   return;
			   }

			   if(arr[i][j]=='.'){
				   S-=2;
			   }else if(arr[i][j]=='*'){
				   S+=5;
			   }
			   
			    if(arr[i][j]=='#'){
					break;
				}
				
				if(j!=m-1){
					S-=1;
				}
		   }
	   }

	   System.out.println("Yes");
	   System.out.println(S);



    }
}

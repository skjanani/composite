package janani;
import java.util.Scanner;
public class Composiet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,count=0;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
for(i=1;i<n;i++){
	if(n%i==0){
		count ++;
	}
}
if(count>2){
	System.out.println("yes");
}
else{
	System.out.println("no");
}
	}

}

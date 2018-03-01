import java.util.*;
import java.util.*;
public class Arrayslesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("How many marks are you going to enter?");
		
		int input=in.nextInt();
		
		int [] marks=new int[input];
		for (int x=0; x<marks.length;x++){
			System.out.println("Enter mark#"+(x+1));
			marks[x]=in.nextInt();
		}
		Arrays.sort(marks);

		double average=0;
		for (int x=0; x<marks.length; x++){
			average=average+marks[x];
		}
		average=average/marks.length;
		System.out.println("Your average is "+average);

		double median;
		if (marks.length%2==1){
			median=marks[marks.length/2];
		}else{
			median=(marks[marks.length/2]+marks[marks.length/2-1])/2.0;
		}
		System.out.println("The median is "+median);


		//value current streak best value current streak
		int cValue=0, cStreak=0, bValue=0, bStreak=0;
		for (int x=0;x<marks.length; x++){
			if (x==0){
				cValue=marks[x];
				cStreak=1;
			}else{
				if (cValue==marks[x]){
					cStreak++;
				}else if (cStreak>bStreak){
					bValue=cValue;
					bStreak=cStreak;
				}
				cValue=marks[x];
				cStreak=1;
			}
		}if (cStreak>bStreak){
			bValue=cValue;
			bStreak=cStreak;
		}
	}
}




// WAP to input to count total number of notes of given amount
import java.util.*;
public class notesamnt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int note500=0,note100=0,note200=0,note50=0,note20=0,note10=0,note5=0,note2=0,note1=0;
		int amt = sc.nextInt();
		//5980
		//500,200,100,50,10,5,2,1
		if(amt >= 500){
            note500 = amt/500;
            amt -= note500 * 500;
	    }
	    if(amt>=200){
	        note200 = amt/200;
	        amt -= note200*200;
	    }
        if(amt >= 100){
            note100 = amt/100;
            amt -= note100 * 100;
        }
        if(amt >= 50){
            note50 = amt/50;
            amt -= note50 * 50;
        }
        if(amt >= 20){
            note20 = amt/20;
            amt -= note20 * 20;
        }
        if(amt >= 10){
            note10 = amt/10;
            amt -= note10 * 10;
        }
        if(amt >= 5){
            note5 = amt/5;
            amt -= note5 * 5;
        }
        if(amt >= 2){
            note2 = amt /2;
            amt -= note2 * 2;
        }
        if(amt >= 1){
            note1 = amt;
        }
 
        System.out.println("Total number of notes = \n");
        System.out.println("500 = "+ note500);
        System.out.println("200 = "+ note200);
        System.out.println("100 = "+ note100);
        System.out.println("50 = "+ note50);
        System.out.println("20 = "+ note20);
        System.out.println("10 = "+ note10);
        System.out.println("5 = "+ note5);
        System.out.println("2 = "+ note2);
        System.out.println("1 = "+ note1);
 
		
		
		    
	}
}

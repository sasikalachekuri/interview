package Interview_topics;

import org.testng.annotations.Test;

public class TesngPractice {
    @Test(priority=1,description="this os a bul method")
	public void bul(){
		System.out.println("Hi this is meathod mul");
	}
    @Test(priority=2,description="this os a cub method")
	public void cubb(){
		System.out.println("Hi this is meathod sub");
	}	
    @Test
    public void dadd(){
		System.out.println("Hi this is meathod add");
	}	
}

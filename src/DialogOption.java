/**
 * Contains necessary data for Dialog Options.
 * 
 * @author Prokop Sva�ina
 */
public class DialogOption {	
	
	String write;
	String gotoID;
	boolean isBattle = false;
	
	public DialogOption(String Message, String gotoOptionID, boolean isbattle){	
		write = Message;
		isBattle = isbattle;
		gotoID = gotoOptionID;
	}
	
}

//Diagram on umlet
package chat.model;
import java.util.ArrayList;
public class Chatbot
{
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	private String content;
	private String currentUser;
	private String joke;
	//____________________________________________
	public Chatbot()
	{
		this.joke = "Why was Timmy sad?";
		this.content = new String("Practical real talk from a friendly computer");
		this.currentUser = new String("Very handsome man!");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	//------------------------
	private void buildTheLists()
	{
		responseList.add("Good evening!");
		responseList.add("Farewell...");
		responseList.add("What do you call yourself?");
		responseList.add("Tee Hee");
		responseList.add("Delicious");
		responseList.add("You don't make the sense");
		responseList.add("You're welcome!");
		responseList.add("Don't talk to me, peasent!");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		
		spookyList.add("Boooooooooooooooooooooooooo!");
		spookyList.add("Give me candy!");
		spookyList.add("Caaaaarrrrrrrrlllll");
		spookyList.add("Corl");
		spookyList.add("*Consuumes candy*");
		spookyList.add("Take all the Kit-Kats!");
		spookyList.add("Punkins");
		spookyList.add("Spookay");
		spookyList.add("What are YOU supposed to be?");
		
	}
	//------------------------
	public Chatbot(String content)
	{
		
	}
	//----------------------------
	public String processText(String userText)
	{
		String answer = "";//Declares answer variable
		answer += "You said: " + userText;//Adds this text to answer
		return answer;//What will show up when method is called
	}
	//______________________________________________
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	//---------------------------
	public String getContent()
	{
		return content;
	}
	//-----------------------------
	public String getCurrentUser()
	{
		return currentUser;
	}
	//-------------------------
	public String getJoke()
	{
		return joke;
	}
	//_______________________________________
	public void setResponseList(ArrayList<String> responseList)
	{
		this.responseList = responseList;
	}
	//--------------------------------
	public void setContent(String content)
	{
		this.content = content;
	}
	//--------------------------------
	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}
	//--------------------------------
	public void setJoke(String joke)
	{
		this.joke = joke;
	}
}
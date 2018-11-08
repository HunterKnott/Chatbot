//Diagram on umlet
package chat.model;
import java.util.ArrayList;

import javax.swing.JOptionPane;
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
		this.content = "sample content";
		this.currentUser = new String("Very handsome man!");
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	//------------------------
	private void buildTheLists()
	{
		responseList.add("Hello");
		responseList.add("Good evening!");
		responseList.add("Farewell...");
		responseList.add("What do you call yourself?");
		responseList.add("Tee Hee");
		responseList.add("Delicious");
		responseList.add("You don't make the sense");
		responseList.add("You're welcome!");
		responseList.add("Don't talk to me, peasent!");
		responseList.add("How do you eat that?");
		responseList.add("Yeeesh!");
		responseList.add("Was that a rhetorical question?");
		responseList.add("I'm blushing");
		responseList.add("Nice try");
		responseList.add("That's a great song");
		responseList.add("Goodbye");
		
		spookyList.add("Halloween");
		spookyList.add("Boooooooooooooooooooooooooo!");
		spookyList.add("Give me candy!");
		spookyList.add("Caaaaarrrrrrrrlllll");
		spookyList.add("Corl");
		spookyList.add("*Consuumes candy*");
		spookyList.add("Take all the Kit-Kats!");
		spookyList.add("Punkins");
		spookyList.add("spooky");//Having this here makes the useChatbotCheckers test pass
		spookyList.add("What are YOU supposed to be?");
		
	}
	//------------------------
	public Chatbot(String text)
	{
		content = "sample content";
	}
	//______________________________________________
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	//---------------------------
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	//----------------------------
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
	//________________________________________________________________
	public void setResponseList(ArrayList<String> responseList)
	{
		this.responseList = responseList;
	}
	//--------------------------------
	public void setSpookyList(ArrayList<String> spookyList)
	{
		this.spookyList = spookyList;
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
	//________________________________________________
	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		
		if (input == null)//Remember that when checking for null, use == and not .equals
		{
			isValid = false;
		}
		else if (input.length() < 2)//If the input is less than 2 characters, it's invalid
		{
			isValid = false;
		}
		else if (input.contains("sdf") || input.contains("jkl") || input.contains("cvb"))//This is checking for keyboard mashing
		{
			isValid = false;
		}
		
		return isValid;
	}
	//-----------------------------------------
	public String processText(String userText)
	{
		//Add null statement and empty statement
		String answer = "You said: ";//Declares answer variable
		answer += "Chatbot says: " + userText;//Adds this text to answer
		if(contentChecker(userText))
		{
			answer = "You said the special words";
		}
		return answer;//What will show up when method is called
	}
	//-------------------------------------------
	public boolean contentChecker(String input)
	{
		boolean isValid = false;
		
		if(input == null)
		{
			isValid = false;
		}
		
		if(input.contains(content))
		{
		
			if(input.equals(content))
			{
				isValid = true;
			}
			else if(input.startsWith(content + " "))
			{
				isValid = true;
			}
			else if(input.endsWith(" " + content))
			{
				isValid = true;
			}
		}
		
		return isValid;
	}
	//-----------------------------------------
	public boolean spookyChecker(String input)
	{
		boolean isValid = false;
		
		for(String spookyString: spookyList)
		{
			if(input.contains(spookyString))
			{
				isValid = true;
			}
		}
		
		return isValid;
	}
}

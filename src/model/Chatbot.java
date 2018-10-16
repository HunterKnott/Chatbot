package model;

import java.util.ArrayList;

public class Chatbot
{
	private ArrayList<String> responseList = new ArrayList<>();
	private String content;
	private String currentUser;
	private String joke;
	//____________________________________________
	public Chatbot()
	{
		
	}
	//------------------------
	public Chatbot(String content)
	{
		
	}
	//______________________________________________
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

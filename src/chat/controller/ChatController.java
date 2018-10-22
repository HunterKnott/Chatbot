package chat.controller;

//import model.ArrayList;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import chat.model.Chatbot;

//_______________________________________________________
public class ChatController
{
	private Chatbot simplebot;
	
	//_________________________________________________________
	public ChatController()
	{
		simplebot = new Chatbot();
	}
	//---------------------------------------------
	//-----------------------------------------------
	public void start()
	{
		String userInput = "";
		while(!userInput.equalsIgnoreCase("quit") || !userInput.equalsIgnoreCase("q"))
		{
			userInput = JOptionPane.showInputDialog(null, "Do you want to continue?");
		}
	}
	//-----------------------------------------------
	public String interactWithChatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "why hello there");
		output = simplebot.processText(userResponse);
		return output = "";
	}
	//___________________________________________
	public Chatbot getChatbot()
	{
		return simplebot;
	}
}

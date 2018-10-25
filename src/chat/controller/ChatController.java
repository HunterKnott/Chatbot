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
	public void start()
	{
		String continueInput = JOptionPane.showInputDialog(null, "Type 'Yes' to run the program again");
		while(continueInput.equals("Yes") || continueInput.equals("yes") || continueInput.equals("Y") || continueInput.equals("y"))
		{
			start();
			continueInput = "";//Prevents an infinite loop in the program running
		}
	}
	//-----------------------------------------------
	public String interactWithChatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "why hello there");
		output = simplebot.processText(userResponse);
		return output;
	}
	//___________________________________________
	public Chatbot getChatbot()
	{
		return simplebot;
	}
	//____________________________________________
	public String useChatbotCheckers(String input)
	{
		String output = "";
		
		return output;
	}
}

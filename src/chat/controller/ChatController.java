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
	public Chatbot getChatbot()
	{
		return simplebot;
	}
	//---------------------------------------------
	public void start()
	{
		String userResponse = JOptionPane.showInputDialog(null, "Why hello there");
		useChatbotCheckers(userResponse);
		JOptionPane.showMessageDialog(null, interactWithChatbot(userResponse));
		String continueInput = JOptionPane.showInputDialog(null, "Type 'Yes' to run the program again");
		String userInput = JOptionPane.showInputDialog(null, "q to quit");
		{
			useChatbotCheckers(userInput);
		}
	}
	//__________________________________________________
	public String interactWithChatbot(String userInput)
	{
		String output = "";
		if(userInput == null)
		{
			output = "It returned null!";
		}
		else
		{
			output = userInput;
		}
		output = "Chatbot says: " + simplebot.processText(userInput);
		return output;
	}
	//____________________________________________
	public String useChatbotCheckers(String input)
	{
		String output = "";
		if (simplebot.spookyChecker(input))//Use the object simplebot, not the class Chatbot
		{
			output = "You said a spooky word. Halloween";
		}
		return output;
	}
}

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
		if(continueInput.equals("Yes") || continueInput.equals("yes") || continueInput.equals("Y") || continueInput.equals("y"))
		{
			start();
		}
	}
	//__________________________________________________
	public String interactWithChatbot(String userInput)
	{
		String output = "Chatbot says: " + simplebot.processText(userInput);
		return output;
	}
	//____________________________________________
	public String useChatbotCheckers(String input)
	{
		String output = "";
		simplebot.legitimacyChecker(input);//It's simplebot because that's the object
		simplebot.contentChecker(input);
		simplebot.spookyChecker(input);
		return output;
	}
}

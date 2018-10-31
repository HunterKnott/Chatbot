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
		JOptionPane.showMessageDialog(null, "Type 'Yes' to run the program again");
		while(continueInput.equals("Yes") || continueInput.equals("yes") || continueInput.equals("Y") || continueInput.equals("y"))
		{
			start();
			continueInput = "";//Prevents an infinite loop in the program running
		}
	}
	//__________________________________________________
	public String interactWithChatbot(String userInput)
	{
		String userResponse = JOptionPane.showInputDialog(null, "Why hello there");
		String output = "Chatbot says: " + simplebot.processText(userResponse);
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

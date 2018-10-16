package controller;

//import model.ArrayList;
import java.util.ArrayList;
import model.Chatbot;
import javax.swing.JOptionPane;

//_______________________________________________________
public class Controller
{
	private Chatbot simplebot;
	
	//_________________________________________________________
	public Controller()
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
}

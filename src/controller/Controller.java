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
		
	}
	//---------------------------------------------
	//-----------------------------------------------
	public void start()
	{
		String userInput = "";
		while(!userInput.equals("quit"))
		{
			userInput = JOptionPane.showInputDialog(null, "Do you want to continue?");
		}
	}
	//-----------------------------------------------
	String response;
	public String interactWithChatbot()
	{
		return response;
	}
}

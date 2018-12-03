//_____________________________________________________________
//-------------------------------------------------------------
package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//-------------------------------------------------------------
public class ChatPanel extends JPanel
{
	private ChatController appController;
	private SpringLayout appLayout;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	//_____________________________________________________________
	public ChatPanel(ChatController appController)
	{
		super();
		//-------------------------------------------------------------
		this.appController = appController;
		appLayout = new SpringLayout();
		//-------------------------------------------------------------
		setupPanel();
		setupLayout();
		setupListeners();
	}
	//_____________________________________________________________
	private void setupPanel()
	{
		this.add(chatButton);
		this.add(inputField);
		this.add(chatArea);
		this.add(chatPane);
	}
	//-------------------------------------------------------------
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -87, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, chatArea);
		appLayout.putConstraint(SpringLayout.NORTH, chatArea, 73, SpringLayout.NORTH, this);
	}
	//-------------------------------------------------------------
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				System.out.println("*Chat*");
			}
		});
	}
}

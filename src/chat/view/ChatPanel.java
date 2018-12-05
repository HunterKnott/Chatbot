//_____________________________________________________________
//-------------------------------------------------------------
package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
//-------------------------------------------------------------
public class ChatPanel extends JPanel
{
	private ChatController appController;
	private SpringLayout appLayout;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	private JTextField chatField;
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
		chatButton = new JButton("Chat");
		appLayout.putConstraint(SpringLayout.WEST, chatButton, 64, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -145, SpringLayout.SOUTH, this);
		loadButton = new JButton("Load");
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -56, SpringLayout.WEST, loadButton);
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, 0, SpringLayout.SOUTH, chatButton);
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 0, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, loadButton, 239, SpringLayout.WEST, this);
		saveButton = new JButton("Save");
		appLayout.putConstraint(SpringLayout.EAST, loadButton, -32, SpringLayout.WEST, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 0, SpringLayout.NORTH, saveButton);
		//-------------------------------------------------------------
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 399, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -145, SpringLayout.SOUTH, this);
		//("Text", rows, columns)
		chatPane = new JScrollPane();
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatPane, -773, SpringLayout.EAST, this);
		//-------------------------------------------------------------
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	//_____________________________________________________________
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.GREEN);
		this.add(chatButton);
		this.add(loadButton);
		this.add(saveButton);
		this.add(chatPane);
		checkerButton = new JButton("Check Text");
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 569, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, -145, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, checkerButton, -103, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, checkerButton);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -42, SpringLayout.WEST, checkerButton);
		add(checkerButton);
		//-------------------------------------------------------------
		chatField = new JTextField("Talk to the bot here", 50);
		appLayout.putConstraint(SpringLayout.SOUTH, chatPane, -275, SpringLayout.NORTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, chatField, 304, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatField, -255, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 731, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatField, -103, SpringLayout.EAST, this);
		add(chatField);
		chatArea = new JTextArea("Chat Area", 20, 50);
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 75, SpringLayout.SOUTH, chatArea);
		add(chatArea);
	}
	//-------------------------------------------------------------
	private void setupLayout()
	{
		
	}
	//-------------------------------------------------------------
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = chatField.getText();
				String output = "";
				output = appController.interactWithChatbot(input);
				chatArea.append(output);
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
		});
	}
	//-------------------------------------------------------------
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		chatPane.setViewportView(chatArea);
	}
}

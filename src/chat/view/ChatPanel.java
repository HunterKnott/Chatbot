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
		loadButton = new JButton("Load");
		saveButton = new JButton("Save");
		//("Text", rows, columns)
		chatPane = new JScrollPane();
		//-------------------------------------------------------------
		chatField = new JTextField("Talk to the bot here", 50);
		chatPane.setViewportView(chatField);
		//-------------------------------------------------------------
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
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
		add(checkerButton);
		chatArea = new JTextArea("Chat Area", 20, 50);
		add(chatArea);
	}
	//-------------------------------------------------------------
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 341, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatButton, 36, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -155, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, 155, SpringLayout.WEST, this);
		//-------------------------------------------------------------
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 341, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, loadButton, 23, SpringLayout.EAST, chatButton);
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, -155, SpringLayout.SOUTH, this);
		//-------------------------------------------------------------
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 328, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -344, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, loadButton, -22, SpringLayout.WEST, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -155, SpringLayout.SOUTH, this);
		//-------------------------------------------------------------
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatPane, -460, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatPane, 790, SpringLayout.WEST, this);
		//-------------------------------------------------------------
		appLayout.putConstraint(SpringLayout.NORTH, chatField, 219, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 145, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatField, -50, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.EAST, chatField, -536, SpringLayout.EAST, this);
		//-------------------------------------------------------------
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 0, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 14, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, 0, SpringLayout.SOUTH, chatButton);
		appLayout.putConstraint(SpringLayout.EAST, checkerButton, 142, SpringLayout.EAST, saveButton);
		//-------------------------------------------------------------
		appLayout.putConstraint(SpringLayout.NORTH, chatArea, 6, SpringLayout.SOUTH, chatPane);
		appLayout.putConstraint(SpringLayout.WEST, chatArea, 0, SpringLayout.WEST, chatPane);
		appLayout.putConstraint(SpringLayout.SOUTH, chatArea, -65, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.EAST, chatArea, 0, SpringLayout.EAST, chatPane);
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
	//-------------------------------------------------------------
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
}

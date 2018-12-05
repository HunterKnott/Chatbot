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
		//-------------------------------------------------------------
		chatField = new JTextField("Talk to the bot here", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);
		//("Text", rows, columns)
		chatPane = new JScrollPane();
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
		this.add(chatField);
		this.add(chatPane);
	}
	//-------------------------------------------------------------
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
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
		//-------------------------------------------------------------
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		checkerButton = new JButton("Check Text");
		chatPane.setColumnHeaderView(checkerButton);
	}
}

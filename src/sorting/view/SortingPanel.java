package sorting.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import sorting.control.SortingController;
import sorting.control.SortingController;
import sorting.view.SortingFrame;

public class SortingPanel extends JPanel
{
	
	/**
	 * connects app controller to base controller
	 */
	private SortingController baseController;
	
	/**
	 * adds a button to the panel
	 */
	private JButton sortButton;
	
	private JButton loadButton;
	
	private JButton saveButton;
	
	private JButton searchButton; 
	
	/**
	 * adds a text field to the panel
	 */
	private JTextField inputField;
	
	/**
	 * changes layout of the panel
	 */
	private SpringLayout baseLayout;
	
	/**
	 * adds scroll bars to the chatPane
	 */
	private JScrollPane textPane;
	
	/**
	 * declares the chatArea
	 */
	private JTextArea displayArea;
	
	
	/**
	 * connects chatbot panel to base controller
	 * @param baseController on the panel is the same as baseController on the appController
	 */
	public SortingPanel(SortingController baseController)
	{
		this.baseController = baseController;
		
		sortButton = new JButton("Sort");
		searchButton = new JButton("Search");
		loadButton = new JButton("Load");
		saveButton = new JButton("Save");
		inputField = new JTextField(20);
		baseLayout = new SpringLayout();
		
		
		displayArea = new JTextArea(15,35);
		textPane = new JScrollPane(displayArea);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -6, SpringLayout.WEST, textPane);
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * sets up window pane
	 */
	private void setupPane()
	{
		displayArea.setLineWrap(true);
		displayArea.setWrapStyleWord(true);
		displayArea.setEditable(false);
		displayArea.setBackground(Color.BLACK);
		displayArea.setForeground(Color.WHITE);
	}
	
	/**
	 * sets up the panel view
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.YELLOW);
		this.add(textPane);
		this.setSize(700, 400);
		this.add(sortButton);
		this.add(searchButton);
		this.add(inputField);
		this.add(loadButton);
		this.add(saveButton);
		inputField.setBackground(Color.RED);
			
	}
	
	/**
	 * sets up the layout view
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 150, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textPane, -100, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 270, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortButton, 41, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, sortButton, -500, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sortButton, -61, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, loadButton, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, loadButton, 200, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, saveButton, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, saveButton, 350, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, searchButton, 14, SpringLayout.NORTH, sortButton);
		baseLayout.putConstraint(SpringLayout.WEST, searchButton, 6, SpringLayout.EAST, sortButton);
		baseLayout.putConstraint(SpringLayout.EAST, searchButton, 306, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 16, SpringLayout.SOUTH, loadButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, 165, SpringLayout.NORTH, this);
	}
	
	/**
	 * listens for a button click
	 */
	private void setupListeners()
	{
		
	}
	
	/**
	 * sends user text to the chatArea for processing and response
	 * @param userInput - user specified text
	 * @return - the user specified text
	 */
}

package sorting.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import sorting.control.SortingController;
import sorting.model.Gui;
import sorting.view.SortingFrame;

public class SortingPanel extends JPanel
{

	Color aColor = new Color(669900);
	Color bColor = new Color(0xFF9900);
	Color cColor = new Color(660099);

	/**
	 * connects app controller to base controller
	 */
	private SortingController baseController;

	/**
	 * adds a button to the panel
	 */
	private JButton sortButton;

	/**
	 * adds a button to the panel
	 */
	private JButton searchButton;

	private JButton sort2Button;
	
	private JButton sort3Button;
	
	private JButton sort4Button;

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

	private JScrollPane textPane2;

	private JScrollPane textPane3;

	/**
	 * declares the chatArea
	 */
	private JTextArea displayArea;

	private JTextArea displayArea2;

	private JTextArea displayArea3;

	/**
	 * connects panel to base controller
	 * 
	 * @param baseController
	 *            on the panel is the same as baseController on the
	 *            appController
	 */
	public SortingPanel(SortingController baseController)
	{
		this.baseController = baseController;
		sortButton = new JButton("SortInt");
		searchButton = new JButton("Search");
		sort2Button = new JButton("SortABC");
		sort3Button = new JButton("SortDouble");
		sort4Button = new JButton("SortGui");
		inputField = new JTextField(20);
		baseLayout = new SpringLayout();
		displayArea = new JTextArea(15, 35);
		displayArea2 = new JTextArea(8, 15);
		displayArea3 = new JTextArea(15, 35);
		textPane = new JScrollPane(displayArea);
		textPane2 = new JScrollPane(displayArea2);
		textPane3 = new JScrollPane(displayArea3);

		setupPane();
		setupPane2();
		setupPane3();
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
		displayArea.setBackground(bColor);
		displayArea.setForeground(Color.BLACK);
	}

	private void setupPane2()
	{
		displayArea2.setLineWrap(true);
		displayArea2.setWrapStyleWord(true);
		displayArea2.setEditable(false);
		displayArea2.setBackground(bColor);
		displayArea2.setForeground(Color.BLACK);
	}

	private void setupPane3()
	{
		displayArea3.setLineWrap(true);
		displayArea3.setWrapStyleWord(true);
		displayArea3.setEditable(false);
		displayArea3.setBackground(bColor);
		displayArea3.setForeground(Color.BLACK);
	}

	/**
	 * sets up the panel view
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(aColor);
		this.add(textPane3);
		this.add(textPane2);
		this.add(textPane);
		this.setSize(1000, 600);
		this.add(sortButton);
		this.add(sort2Button);
		this.add(sort3Button);
		this.add(sort4Button);
		this.add(searchButton);
		this.add(inputField);
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane2.setBackground(Color.LIGHT_GRAY);
		textPane3.setBackground(Color.LIGHT_GRAY);

		inputField.setBackground(Color.WHITE);

	}

	/**
	 * sets up the layout view
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 280, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 25, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, searchButton, 350, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, searchButton, 180, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sort2Button, 350, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sortButton, 350, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane2, 330, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textPane2, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane3, 25, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textPane3, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sort4Button, 350, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sort4Button, 380, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sort3Button, 350, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sort3Button, 265, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sort2Button, 85, SpringLayout.WEST, this);
	}

	/**
	 * listens for a button click
	 */
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String rawArray = "";
				String rawArray2 = "";
				String rawArray3 = "";
				for (int number : baseController.getWholeNumbers())
				{
					rawArray += number + " ";
				}
				baseController.getMySorter().selectionSort(baseController.getWholeNumbers());
				rawArray2 += baseController.getMySorter().sortingTime(baseController.getMySorter().getSortTime());
				for (int number : baseController.getWholeNumbers())
				{
					rawArray3 += number + " ";
				}

				displayArea.setText(rawArray);
				displayArea2.setText(rawArray2);
				displayArea3.setText(rawArray3);
			}
		});

		sort2Button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String rawArray = "";
				String rawArray2 = "";
				String rawArray3 = "";
				for (String number : baseController.getWordage())
				{
					rawArray += number + " ";
				}
				baseController.getMySorter().selectionSort2(baseController.getWordage());
				rawArray2 += baseController.getMySorter().sortingTime(baseController.getMySorter().getSortTime());
				for (String number : baseController.getWordage())
				{
					rawArray3 += number + " ";
				}

				displayArea.setText(rawArray);
				displayArea2.setText(rawArray2);
				displayArea3.setText(rawArray3);
			}
		});

		sort3Button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String rawArray = "";
				String rawArray2 = "";
				String rawArray3 = "";
				for (double number : baseController.getRealNumbers())
				{
					rawArray += number + " ";
				}
				baseController.getMySorter().selectionSort3(baseController.getRealNumbers());
				rawArray2 += baseController.getMySorter().sortingTime(baseController.getMySorter().getSortTime());
				for (double number : baseController.getRealNumbers())
				{
					rawArray3 += number + " ";
				}

				displayArea.setText(rawArray);
				displayArea2.setText(rawArray2);
				displayArea3.setText(rawArray3);
			}
		});
		
		sort4Button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String rawArray = "";
				String rawArray2 = "";
				String rawArray3 = "";
				for (Gui number : baseController.getStuffage())
				{
					rawArray += number + " ";
					rawArray += "\n";
					rawArray += "\n";
				}
				baseController.getMySorter().selectionSort4(baseController.getStuffage());
				rawArray2 += baseController.getMySorter().sortingTime(baseController.getMySorter().getSortTime());
				for (Gui number : baseController.getStuffage())
				{
					rawArray3 += number + " ";
					rawArray3 += "\n";
					rawArray3 += "\n";
				}

				displayArea.setText(rawArray);
				displayArea2.setText(rawArray2);
				displayArea3.setText(rawArray3);
			}
		});
	}
}

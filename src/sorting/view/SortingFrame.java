package sorting.view;

import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import sorting.control.SortingController;

public class SortingFrame extends JFrame
{
	private SortingPanel basePanel;
	
	public SortingFrame(SortingController baseController)
	{
		basePanel = new SortingPanel(baseController);
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000, 600);
		this.setResizable(false);
		setVisible(true);
	}
}

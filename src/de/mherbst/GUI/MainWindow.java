package de.mherbst.GUI;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTree;
import javax.swing.JTabbedPane;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Bildschirmgröße ermitteln
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		frame = new JFrame();

		JSplitPane splitPane = new JSplitPane();
		
		JTree tree = new JTree();
		splitPane.setLeftComponent(tree);
		
        JPanel panelRot = new JPanel();
        JPanel panelBlue = new JPanel();
        JPanel panelGreen = new JPanel();

        panelRot.setBackground(Color.RED);
        panelBlue.setBackground(Color.BLUE);
        panelGreen.setBackground(Color.GREEN);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.addTab("Ich bin rot", panelRot);
		tabbedPane.addTab("Ich bin blau", panelBlue);
		tabbedPane.addTab("Ich bin grün", panelGreen);
		
		splitPane.setRightComponent(tabbedPane);
		
		frame.getContentPane().add(splitPane);
		
		frame.setSize(screenSize);
		frame.setTitle("Learning Java Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

}

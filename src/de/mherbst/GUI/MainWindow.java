package de.mherbst.GUI;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.JTabbedPane;
import javax.swing.BorderFactory;

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
		int screenHeight = screenSize.height;
		int screenWidth =  screenSize.width;

		frame = new JFrame();

		JSplitPane splitPane = new JSplitPane();
		
		
		//create the root node
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		
		//create the child nodes
		DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode("Vegetables");
		vegetableNode.add(new DefaultMutableTreeNode("Tomate"));
		vegetableNode.add(new DefaultMutableTreeNode("Paprika"));
		vegetableNode.add(new DefaultMutableTreeNode("Blumenkohl"));
		vegetableNode.add(new DefaultMutableTreeNode("Karotte"));
		vegetableNode.add(new DefaultMutableTreeNode("Porree"));
		vegetableNode.add(new DefaultMutableTreeNode("Linsen"));
		vegetableNode.add(new DefaultMutableTreeNode("Bohnen"));
		vegetableNode.add(new DefaultMutableTreeNode("Kartoffel"));
		vegetableNode.add(new DefaultMutableTreeNode("Bohnen"));
		vegetableNode.add(new DefaultMutableTreeNode("Chikoree"));
		vegetableNode.add(new DefaultMutableTreeNode("Salat"));
		vegetableNode.add(new DefaultMutableTreeNode("Mais"));
		vegetableNode.add(new DefaultMutableTreeNode("Rüben"));
		vegetableNode.add(new DefaultMutableTreeNode("Weißkohl"));
		vegetableNode.add(new DefaultMutableTreeNode("Minze"));
		vegetableNode.add(new DefaultMutableTreeNode("Topinambur"));
		vegetableNode.add(new DefaultMutableTreeNode("Grünkohl"));
		vegetableNode.add(new DefaultMutableTreeNode("Rote Beete"));
		vegetableNode.add(new DefaultMutableTreeNode("Blattspinat"));
		vegetableNode.add(new DefaultMutableTreeNode("Brokkoli"));
		vegetableNode.add(new DefaultMutableTreeNode("Chicoree"));
		vegetableNode.add(new DefaultMutableTreeNode("Kohlrabi"));
		vegetableNode.add(new DefaultMutableTreeNode("Pak Choi"));
		vegetableNode.add(new DefaultMutableTreeNode("Pastinaken"));
		vegetableNode.add(new DefaultMutableTreeNode("Sellerie"));
		vegetableNode.add(new DefaultMutableTreeNode("Wirsing"));
		vegetableNode.add(new DefaultMutableTreeNode("Kürbis"));
		vegetableNode.add(new DefaultMutableTreeNode("Petersilie"));
		
		
		DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruits");
		fruitNode.add(new DefaultMutableTreeNode("Banane"));
		fruitNode.add(new DefaultMutableTreeNode("Orange"));
		fruitNode.add(new DefaultMutableTreeNode("Erdbere"));
		fruitNode.add(new DefaultMutableTreeNode("Mango"));
		fruitNode.add(new DefaultMutableTreeNode("Apfel"));
		fruitNode.add(new DefaultMutableTreeNode("Birne"));
		fruitNode.add(new DefaultMutableTreeNode("Himbeere"));
		fruitNode.add(new DefaultMutableTreeNode("Blaubeere"));
		fruitNode.add(new DefaultMutableTreeNode("Stachelbeere"));
		fruitNode.add(new DefaultMutableTreeNode("Kirsche"));
		fruitNode.add(new DefaultMutableTreeNode("Papaya"));
		fruitNode.add(new DefaultMutableTreeNode("Pampelmuse"));
		fruitNode.add(new DefaultMutableTreeNode("Tybeere"));
		fruitNode.add(new DefaultMutableTreeNode("Litchie"));
		fruitNode.add(new DefaultMutableTreeNode("Melone"));
		fruitNode.add(new DefaultMutableTreeNode("Clementine"));
		fruitNode.add(new DefaultMutableTreeNode("Grapefruit"));
		fruitNode.add(new DefaultMutableTreeNode("Ananas"));
		fruitNode.add(new DefaultMutableTreeNode("Aprikosen"));
		fruitNode.add(new DefaultMutableTreeNode("Heidelbeere"));
		fruitNode.add(new DefaultMutableTreeNode("Johannisbeere"));
		fruitNode.add(new DefaultMutableTreeNode("Renekloden"));
		fruitNode.add(new DefaultMutableTreeNode("Mirabellen"));
		fruitNode.add(new DefaultMutableTreeNode("Pflaume"));
		
		
		DefaultMutableTreeNode nutsNode = new DefaultMutableTreeNode("Nüsse");
		nutsNode.add(new DefaultMutableTreeNode("Walnüsse"));
		nutsNode.add(new DefaultMutableTreeNode("Haselnüsse"));
		nutsNode.add(new DefaultMutableTreeNode("Erdnüsse"));
		nutsNode.add(new DefaultMutableTreeNode("Pecanüsse"));
		nutsNode.add(new DefaultMutableTreeNode("Paranüsse"));
		nutsNode.add(new DefaultMutableTreeNode("Cashewnüsse"));
		nutsNode.add(new DefaultMutableTreeNode("Walnüsse"));
		
		
		//add the child nodes to the root node
		root.add(vegetableNode);
		root.add(fruitNode);
		root.add(nutsNode);
		
		JTree tree = new JTree(root);

		try {
			URL iconURL = MainWindow.class.getResource("../../../de/mherbst/GUI/resources/Kreis10.jpg");
			ImageIcon imageIcon = new ImageIcon(iconURL);
	        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
	        renderer.setLeafIcon(imageIcon);
	        tree.setCellRenderer(renderer);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
        tree.setShowsRootHandles(true);
        tree.setRootVisible(false);
        
        JPanel leftPanel = new JPanel();
        //leftPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        
        leftPanel.setLayout(new BorderLayout());
        leftPanel.setMinimumSize(new Dimension(150, screenHeight));
        leftPanel.setPreferredSize(new Dimension(150, screenHeight));
        
        InputField inputField = new InputField(20);
        
        
        leftPanel.add(inputField, BorderLayout.NORTH);
        leftPanel.add(new JScrollPane(tree), BorderLayout.CENTER);
        
		splitPane.setLeftComponent(leftPanel);
        
		
		
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

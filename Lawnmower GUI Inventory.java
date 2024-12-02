package _20Fall;

import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MajorProgrammingProject2 implements ActionListener {
	
	private JFrame mainFrame, viewFrame, addFrame, addLawnFrame, addCommercialFrame, addGasFrame, addPushFrame /*LawnInfo, CommInfo, GasInfo, PushInfo*/;
	private JList<String> list;
	private JComboBox addList;
	private JPanel controlPanel, viewPanel, addPanel, addLawnPanel, addCommercialPanel, addGasPanel, addPushPanel;
	private JLabel lawn1,commercial1,gas1,push1;
	private JLabel manufacturer, horsepower, cylinders;
	private JLabel addLawnManu, addLawnPower, addLawnCylinders, addLawnModel, addLawnDeck, addLawnManu1, addLawnYear, addLawnSerial;
	private JLabel addcLabel1, addcLabel2, addcLabel3, addcLabel4, addcLabel5, addcLabel6, addcLabel7, addcLabel8, addcLabel9, addcLabel10;
	private JLabel addgLabel1, addgLabel2, addgLabel3, addgLabel4, addgLabel5, addgLabel6, addgLabel7, addgLabel8, addgLabel9;
	private JLabel addpLabel1, addpLabel2, addpLabel3, addpLabel4, addpLabel5, addpLabel6;
	private JTextField lawnText1, lawnText2, lawnText3, lawnText4, lawnText5,lawnText6, lawnText7, lawnText8  ;
	private JTextField addcfield1, addcfield2, addcfield3, addcfield4, addcfield5, addcfield6, addcfield7, addcfield8, addcfield9, addcfield10;
	private JTextField addgfield1, addgfield2, addgfield3, addgfield4, addgfield5, addgfield6, addgfield7, addgfield8, addgfield9;
	private JTextField addpfield1, addpfield2, addpfield3, addpfield4, addpfield5, addpfield6;
	private JButton viewButton,addButton,saveButton,exitButton,loadButton,lawnButton,commercialButton,gasButton,pushButton;
	private JButton viewLawn, viewCommercial, viewGas, viewPush;
	private JButton back1,back2,back3,back4, back5;
	private String[] listmowers = {"None","LawnTractor","CommercialMower", "GasPoweredMower", "PushReelMower"};
	private JTextField commercialText, gasText, pushText;
	private File file;
	private MowerWareHouse house = new MowerWareHouse();
	private LawnTractor lawn = new LawnTractor();
	private CommercialMower commercial = new CommercialMower();
	private GasPoweredMower gas = new GasPoweredMower();
	private PushReelMower push = new PushReelMower();
	private Engine engine = new Engine();
	private JFileChooser chooser = new JFileChooser(".");
	private String input;
	public MajorProgrammingProject2() throws IOException{
	
		
	

		
		mainFrame = new JFrame("Mower WareHouse");
		viewFrame = new JFrame("View Window");
		addFrame = new JFrame("Add Window");
		addLawnFrame = new JFrame("Add Lawn Info");
		addCommercialFrame = new JFrame("Add Commercial Info");
		addGasFrame = new JFrame("Add GasPowered Info");
		addPushFrame = new JFrame("Add PushReel Info");

		
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new GridBagLayout());
		GridBagConstraints layoutConst = new GridBagConstraints();
		
		addPanel = new JPanel();
		addPanel.setLayout(new GridBagLayout());
		
		addLawnPanel = new JPanel();
		addLawnPanel.setLayout(new GridBagLayout());
		
		addCommercialPanel = new JPanel();
		addCommercialPanel.setLayout(new GridBagLayout());
		
		addGasPanel = new JPanel();
		addGasPanel.setLayout(new GridBagLayout());
		
		addPushPanel = new JPanel();
		addPushPanel.setLayout(new GridBagLayout());
		
		viewPanel = new JPanel();
		viewPanel.setLayout(new GridBagLayout());;
		
		
		
		addList = new JComboBox(listmowers);
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		addList.addActionListener(this);	
		addPanel.add(addList, layoutConst);
		
		back5 = new JButton("Back");
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		back5.addActionListener(this);
		addPanel.add(back5, layoutConst);
		
		viewButton = new JButton("View");
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		viewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(house.toString());
				for(int i = 0; i < house.getNumLawn(); i++) {
				System.out.println(house.getLawn(i));
				}
				for(int i = 0; i < house.getNumCommercial(); i++) {
					System.out.println(house.getCommercial(i));
					}
				for(int i = 0; i < house.getNumGas(); i++) {
					System.out.println(house.getGas(i));
					}
				for(int i = 0; i < house.getNumPush(); i++) {
						System.out.println(house.getPush(i));
					}
			}
		});
		controlPanel.add(viewButton,layoutConst);
		
		lawn1 = new JLabel("LawnTractor");
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		viewPanel.add(lawn1, layoutConst);
		
		
		viewLawn = new JButton("View");
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		viewLawn.addActionListener(this);
		viewPanel.add(viewLawn, layoutConst);
		
		commercial1 = new JLabel("CommercialMower");
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		viewPanel.add(commercial1, layoutConst);
		
		viewCommercial = new JButton("View");
		layoutConst.gridx = 1;
		layoutConst.gridy = 1;
		viewPanel.add(viewCommercial, layoutConst);
		
		
		gas1 = new JLabel("GasPoweredMower");
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		viewPanel.add(gas1, layoutConst);
		
		viewGas = new JButton("View");
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		viewPanel.add(viewGas, layoutConst);
		
		push1 = new JLabel("PushReelMower");
		layoutConst.gridx = 0;
		layoutConst.gridy = 3;
		viewPanel.add(push1, layoutConst);
		
		viewPush = new JButton("View");
		layoutConst.gridx = 1;
		layoutConst.gridy = 3;
		viewPanel.add(viewPush, layoutConst);
		
		
		list = new JList();
		layoutConst.gridx = 0;
		layoutConst.gridy = 4;
		
		viewPanel.add(list, layoutConst);
		
		
		
		addButton = new JButton("Add");
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		addButton.addActionListener(this);
		controlPanel.add(addButton,layoutConst);
		
		
		addLawnManu = new JLabel("Engine Manufacturer");
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		addLawnPanel.add(addLawnManu,layoutConst);
		
		lawnText1 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		addLawnPanel.add(lawnText1,layoutConst);
		
		lawnText2 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 1;
		addLawnPanel.add(lawnText2,layoutConst);
		
		lawnText3 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		addLawnPanel.add(lawnText3,layoutConst);
		
		lawnText4 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 3;
		addLawnPanel.add(lawnText4,layoutConst);
		
		lawnText5 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 4;
		addLawnPanel.add(lawnText5,layoutConst);
		
		lawnText6 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 5;
		addLawnPanel.add(lawnText6,layoutConst);
		
		
		
		lawnText7 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 6;
		addLawnPanel.add(lawnText7,layoutConst);
		
		lawnText8 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 7;
		addLawnPanel.add(lawnText8,layoutConst);
		
		addLawnPower = new JLabel("Engine Horsepower");
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		addLawnPanel.add(addLawnPower,layoutConst);
		
		addLawnCylinders = new JLabel("Engine Cylinders");
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		addLawnPanel.add(addLawnCylinders,layoutConst);
		
		addLawnModel = new JLabel("LawnTractor Model");
		layoutConst.gridx = 0;
		layoutConst.gridy = 3;
		addLawnPanel.add(addLawnModel,layoutConst);
		
		addLawnDeck = new JLabel("LawnTractor Deck Width");
		layoutConst.gridx = 0;
		layoutConst.gridy = 4;
		addLawnPanel.add(addLawnDeck,layoutConst);
		
		addLawnManu1 = new JLabel("LawnTractor Manufacturer");
		layoutConst.gridx = 0;
		layoutConst.gridy = 5;
		addLawnPanel.add(addLawnManu1,layoutConst);
		
		addLawnYear = new JLabel("LawnTractor Year Made");
		layoutConst.gridx = 0;
		layoutConst.gridy = 6;
		addLawnPanel.add(addLawnYear,layoutConst);
		
		addLawnSerial = new JLabel("LawnTractor Serial Number");
		layoutConst.gridx = 0;
		layoutConst.gridy = 7;
		addLawnPanel.add(addLawnSerial,layoutConst);
		
		lawnButton = new JButton("Add Info");
		layoutConst.gridx = 0;
		layoutConst.gridy = 8;
		lawnButton.addActionListener(this);
		addLawnPanel.add(lawnButton,layoutConst);
		
		back1 = new JButton("Back");
		layoutConst.gridx = 0;
		layoutConst.gridy = 9;
		back1.addActionListener(this);
		addLawnPanel.add(back1,layoutConst);
		
		
		addcLabel1 = new JLabel("Engine Manufacturer");
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		addCommercialPanel.add(addcLabel1,layoutConst);
		
		addcLabel2 = new JLabel("Engine Horsepower");
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		addCommercialPanel.add(addcLabel2,layoutConst);
		
		addcLabel3 = new JLabel("Engine Cylinders");
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		addCommercialPanel.add(addcLabel3,layoutConst);
		
		addcLabel4 = new JLabel("Commercial Model");
		layoutConst.gridx = 0;
		layoutConst.gridy = 3;
		addCommercialPanel.add(addcLabel4,layoutConst);
		
		addcLabel5 = new JLabel("Commercial Deck Width");
		layoutConst.gridx = 0;
		layoutConst.gridy = 4;
		addCommercialPanel.add(addcLabel5,layoutConst);
		
		addcLabel6 = new JLabel("Commercial Operating Hours");
		layoutConst.gridx = 0;
		layoutConst.gridy = 5;
		addCommercialPanel.add(addcLabel6,layoutConst);
		
		addcLabel7 = new JLabel("Commercial ZeroTurnRadius (true/false)");
		layoutConst.gridx = 0;
		layoutConst.gridy = 6;
		addCommercialPanel.add(addcLabel7,layoutConst);
		
		addcLabel8 = new JLabel("Commercial Manufacturer");
		layoutConst.gridx = 0;
		layoutConst.gridy = 7;
		addCommercialPanel.add(addcLabel8,layoutConst);
		
		addcLabel9 = new JLabel("Commercial Year Made");
		layoutConst.gridx = 0;
		layoutConst.gridy = 8;
		addCommercialPanel.add(addcLabel9,layoutConst);
		
		addcLabel10 = new JLabel("Commercial Serial Number");
		layoutConst.gridx = 0;
		layoutConst.gridy = 9;
		addCommercialPanel.add(addcLabel10,layoutConst);
		
	
		
		addcfield1 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		addCommercialPanel.add(addcfield1,layoutConst);
		
		addcfield2 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 1;
		addCommercialPanel.add(addcfield2,layoutConst);
		
		addcfield3 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		addCommercialPanel.add(addcfield3,layoutConst);
		
		addcfield4 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 3;
		addCommercialPanel.add(addcfield4,layoutConst);
		
		addcfield5 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 4;
		addCommercialPanel.add(addcfield5,layoutConst);
		
		addcfield6 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 5;
		addCommercialPanel.add(addcfield6,layoutConst);
		
		addcfield7 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 6;
		addCommercialPanel.add(addcfield7,layoutConst);
		
		addcfield8 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 7;
		addCommercialPanel.add(addcfield8,layoutConst);
		
		addcfield9 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 8;
		addCommercialPanel.add(addcfield9,layoutConst);
		
		addcfield10 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 9;
		addCommercialPanel.add(addcfield10,layoutConst);
		
		commercialButton = new JButton("Add Info");
		layoutConst.gridx = 0;
		layoutConst.gridy = 11;
		commercialButton.addActionListener(this);
		addCommercialPanel.add(commercialButton,layoutConst);
		
		back2 = new JButton("Back");
		layoutConst.gridx = 0;
		layoutConst.gridy = 12;
		back2.addActionListener(this);
		addCommercialPanel.add(back2,layoutConst);
		
		
		addgLabel1 = new JLabel("Cut Width");
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		addGasPanel.add(addgLabel1,layoutConst);
		
		addgLabel2 = new JLabel("Wheel Diameter");
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		addGasPanel.add(addgLabel2,layoutConst);
		
		addgLabel3 = new JLabel("Engine Manufacturer");
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		addGasPanel.add(addgLabel3,layoutConst);
		
		addgLabel4 = new JLabel("Engine Horse Power");
		layoutConst.gridx = 0;
		layoutConst.gridy = 3;
		addGasPanel.add(addgLabel4,layoutConst);
		
		addgLabel5 = new JLabel("Engine Cylinders");
		layoutConst.gridx = 0;
		layoutConst.gridy = 4;
		addGasPanel.add(addgLabel5,layoutConst);
		
		addgLabel6 = new JLabel("Self-Propelled (true/false)");
		layoutConst.gridx = 0;
		layoutConst.gridy = 5;
		addGasPanel.add(addgLabel6,layoutConst);
		
		addgLabel7 = new JLabel("Gas Manufacturer");
		layoutConst.gridx = 0;
		layoutConst.gridy = 6;
		addGasPanel.add(addgLabel7,layoutConst);
		
		addgLabel8 = new JLabel("Gas Year Made");
		layoutConst.gridx = 0;
		layoutConst.gridy = 7;
		addGasPanel.add(addgLabel8,layoutConst);
		
		addgLabel9 = new JLabel("Gas Serial Number");
		layoutConst.gridx = 0;
		layoutConst.gridy = 8;
		addGasPanel.add(addgLabel9,layoutConst);
		
		addgfield1 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		addGasPanel.add(addgfield1,layoutConst);
		
		addgfield2 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 1;
		addGasPanel.add(addgfield2,layoutConst);
		
		addgfield3 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		addGasPanel.add(addgfield3,layoutConst);
		
		addgfield4 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 3;
		addGasPanel.add(addgfield4,layoutConst);
		
		addgfield5 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 4;
		addGasPanel.add(addgfield5,layoutConst);
		
		addgfield6 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 5;
		addGasPanel.add(addgfield6,layoutConst);
		
		addgfield7 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 6;
		addGasPanel.add(addgfield7,layoutConst);
		
		addgfield8 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 7;
		addGasPanel.add(addgfield8,layoutConst);
		
		addgfield9 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 8;
		addGasPanel.add(addgfield9,layoutConst);
		
		gasButton = new JButton("Add Info");
		layoutConst.gridx = 0;
		layoutConst.gridy = 9;
		gasButton.addActionListener(this);
		addGasPanel.add(gasButton,layoutConst);
		
		back3 = new JButton("Back");
		layoutConst.gridx = 0;
		layoutConst.gridy = 10;
		back3.addActionListener(this);
		addGasPanel.add(back3,layoutConst);
		
		
		addpLabel1 = new JLabel("Push Cut Width");
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		addPushPanel.add(addpLabel1,layoutConst);
		
		addpLabel2 = new JLabel("Push Wheel Diameter");
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		addPushPanel.add(addpLabel2,layoutConst);
		
		addpLabel3 = new JLabel("Push Number Wheels");
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		addPushPanel.add(addpLabel3,layoutConst);
		
		addpLabel4 = new JLabel("Push Manufacturer");
		layoutConst.gridx = 0;
		layoutConst.gridy = 3;
		addPushPanel.add(addpLabel4,layoutConst);
		
		addpLabel5 = new JLabel("Push Year Made");
		layoutConst.gridx = 0;
		layoutConst.gridy = 4;
		addPushPanel.add(addpLabel5,layoutConst);
		
		addpLabel6 = new JLabel("Push Serial Number");
		layoutConst.gridx = 0;
		layoutConst.gridy = 5;
		addPushPanel.add(addpLabel6,layoutConst);
		
		addpfield1 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		addPushPanel.add(addpfield1,layoutConst);
		
		addpfield2 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 1;
		addPushPanel.add(addpfield2,layoutConst);
		
		addpfield3 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		addPushPanel.add(addpfield3,layoutConst);
		
		addpfield4 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 3;
		addPushPanel.add(addpfield4,layoutConst);
		
		addpfield5 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 4;
		addPushPanel.add(addpfield5,layoutConst);
		
		addpfield6 = new JTextField(10);
		layoutConst.gridx = 1;
		layoutConst.gridy = 5;
		addPushPanel.add(addpfield6,layoutConst);
		
		pushButton = new JButton("Add Info");
		layoutConst.gridx = 0;
		layoutConst.gridy = 6;
		pushButton.addActionListener(this);
		addPushPanel.add(pushButton,layoutConst);
		
		back4 = new JButton("Back");
		layoutConst.gridx = 0;
		layoutConst.gridy = 7;
		back4.addActionListener(this);
		addPushPanel.add(back4,layoutConst);
		
		loadButton = new JButton("Load");
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		loadButton.addActionListener(new ActionListener() {
			   @Override
			   public void actionPerformed(ActionEvent event) {
				   File file;
					int choice;
				 chooser = new JFileChooser(".");
					chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
					choice = chooser.showOpenDialog(chooser);
					
					
					if(choice == JFileChooser.APPROVE_OPTION) {
						file = chooser.getSelectedFile();
						
						try {
							house.readMowerData(file.toString());
						} catch (IOException e) {
							
							e.printStackTrace();
						}
					}
					chooser.setVisible(true);
					
			   }

			});
		controlPanel.add(loadButton, layoutConst);
		
		saveButton = new JButton("Save");
		layoutConst.gridx = 0;
		layoutConst.gridy = 3;
		saveButton.addActionListener( new ActionListener(){
		  public void actionPerformed(ActionEvent event) {
			  
			  
			   File file;
				int choice;
			 chooser = new JFileChooser(".");
				chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				choice = chooser.showOpenDialog(chooser);
				
				
				if(choice == JFileChooser.APPROVE_OPTION) {
					file = chooser.getSelectedFile();

					try {
						house.saveMowerData(file.toString());
						
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
				chooser.setVisible(true);
				
		   }

		});
		controlPanel.add(saveButton, layoutConst);

		exitButton = new JButton("Exit");
		layoutConst.gridx = 0;
		layoutConst.gridy = 4;
		exitButton.addActionListener(this);
		controlPanel.add(exitButton, layoutConst);
		
		mainFrame.add(controlPanel);
		mainFrame.setSize(200,350);
		
		
		addFrame.add(addPanel);
		addFrame.setSize(300,300);
		
		addLawnFrame.add(addLawnPanel);
		addLawnFrame.setSize(300,300);
		
		addCommercialFrame.add(addCommercialPanel);
		addCommercialFrame.setSize(450,400);
		
		addGasFrame.add(addGasPanel);
		addGasFrame.setSize(450,400);
		
		addPushFrame.add(addPushPanel);
		addPushFrame.setSize(350,350);
		
		viewFrame.add(viewPanel);
		viewFrame.setSize(350,350);
		
		mainFrame.setVisible(true);
	}
	
	
	public static void main(String[] args) throws IOException{
		MajorProgrammingProject2 major = new MajorProgrammingProject2();
		MowerWareHouse house = new MowerWareHouse();
	
			
		File file;
		int choice;
		JFileChooser chooser = new JFileChooser(".");
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		choice = chooser.showOpenDialog(chooser);
		
		
		if(choice == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			
			house.readMowerData(file.toString());
			house.saveMowerData("OutputFile.txt");
			
			
			
		}
			
		
		
		
		chooser.setVisible(true);
	
		
	
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addButton) {
			mainFrame.setVisible(false);
			addFrame.setVisible(true);
			
		}
		
		if(addList.getSelectedItem().equals("LawnTractor")) {
			addLawnFrame.setVisible(true);
			addFrame.setVisible(false);
		}
		
		if(e.getSource() == lawnButton) {
			engine.setManufacturer(lawnText1.getText());
			engine.setHorsePower(Integer.parseInt(lawnText2.getText()));
			engine.setCylinders(Integer.parseInt(lawnText3.getText()));
			lawn.setEngine(engine);
			lawn.setModel(lawnText4.getText());
			lawn.setDeckWidth(Integer.parseInt(lawnText5.getText()));
			lawn.setManufacturer(lawnText6.getText());
			lawn.setYear(Integer.parseInt(lawnText7.getText()));
			lawn.setSerialNumber(lawnText8.getText());
			house.addLawn(String.format(lawn.toString() + "%n" + lawn.getManufacturer() + "%n" + 
			lawn.getYear() + "%n" + lawn.getSerialNumber() ));
			
			
		}
		
		if(addList.getSelectedItem().equals("CommercialMower")) {
			addCommercialFrame.setVisible(true);
			addFrame.setVisible(false);
		}
		
		if(e.getSource() == commercialButton) {
			engine.setManufacturer(addcfield1.getText());
			engine.setHorsePower(Integer.parseInt(addcfield2.getText()));
			engine.setCylinders(Integer.parseInt(addcfield3.getText()));
			commercial.setEngine(engine);
			commercial.setModel(addcfield4.getText());
			commercial.setDeckWidth(Integer.parseInt(addcfield5.getText()));
			commercial.setOperatingHours(Integer.parseInt(addcfield6.getText()));
			
			if(addcfield7.getText().equals("true")) {
			commercial.setZeroTurnRadius(true);
			}
			else {
				commercial.setZeroTurnRadius(false);
			}
			commercial.setManufacturer(addcfield8.getText());
			commercial.setYear(Integer.parseInt(addcfield9.getText()));
			commercial.setSerialNumber(addcfield10.getText());
			house.addCommercial(String.format(commercial.getEngine() + "%n" + commercial.getModel() + "%n" + commercial.getDeckWidth() + "%n" + commercial.toString() 
			+ "%n" + commercial.getManufacturer() + "%n" + commercial.getYear() + "%n" + commercial.getSerialNumber()) );
			
		}
		
		if(addList.getSelectedItem().equals("GasPoweredMower")) {
			addGasFrame.setVisible(true);
			addFrame.setVisible(false);
		}
		
		if(e.getSource() == gasButton) {
			gas.setCutWidth(Integer.parseInt(addgfield1.getText()));
			gas.setWheelDiameter(Integer.parseInt(addgfield2.getText()));
			engine.setManufacturer(addgfield3.getText());
			engine.setHorsePower(Integer.parseInt(addgfield4.getText()));
			engine.setCylinders(Integer.parseInt(addgfield5.getText()));
			gas.setEngine(engine);
			
			if(addcfield6.getText().equals("true")) {
				gas.setSelfPropelled(true);
				}
				else {
					gas.setSelfPropelled(false);
				}
			gas.setManufacturer(addgfield7.getText());
			gas.setYear(Integer.parseInt(addgfield8.getText()));
			gas.setSerialNumber(addgfield9.getText());
			house.addGas(String.format(gas.getCutWidth() + "%n" + gas.getWheelDiameter() + "%n" + gas.toString() + "%n" + gas.getManufacturer() + "%n" 
			+ gas.getYear() + "%n" + gas.getSerialNumber()));
			
		}
		
		if(addList.getSelectedItem().equals("PushReelMower")) {
			addPushFrame.setVisible(true);
			addFrame.setVisible(false);
		}
		
		if(e.getSource() == pushButton) {
			push.setCutWidth(Integer.parseInt(addpfield1.getText()));
			push.setWheelDiameter(Integer.parseInt(addpfield2.getText()));
			push.setNumWheels(Integer.parseInt(addpfield3.getText()));
			push.setManufacturer(addpfield4.getText());
			push.setYear(Integer.parseInt(addpfield5.getText()));
			push.setSerialNumber(addpfield6.getText());
			house.addPush(String.format(push.getCutWidth() + "%n" + push.getWheelDiameter() + "%n" + push.toString() + "%n" + push.getManufacturer() + "%n" 
			+ push.getYear() + "%n" + push.getSerialNumber()));
		
		}
		
		if(e.getSource() == exitButton) {
			System.exit(0);
		}
		
		if(e.getSource() == back1) {
			addLawnFrame.setVisible(false);
			addFrame.setVisible(true);
		}
		
		if(e.getSource() == back2) {
			addCommercialFrame.setVisible(false);
			addFrame.setVisible(true);
		}
		if(e.getSource() == back3) {
			addGasFrame.setVisible(false);
			addFrame.setVisible(true);
		}
		if(e.getSource() == back4) {
			addPushFrame.setVisible(false);
			addFrame.setVisible(true);
		}
		
		if(e.getSource() == back5) {
			addFrame.setVisible(false);
			addLawnFrame.setVisible(false);
			addCommercialFrame.setVisible(false);
			addPushFrame.setVisible(false);
			addGasFrame.setVisible(false);
			mainFrame.setVisible(true);
		}
		

	}
	
	/*public void saveAddMowers(String outputFile) throws IOException{
		FileOutputStream file = new FileOutputStream(outputFile);
		PrintWriter print = new PrintWriter(file);
		for(int i = 0; i < house.getNumLawn(); i++) {
		print.println(house.getLawn(i));
		}
	}*/
	
	
	
}


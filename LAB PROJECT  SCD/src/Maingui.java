

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.LineBorder;

import com.sun.jdi.connect.spi.Connection;

import java.awt.Color;
	import javax.swing.JLabel;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JTextField;
	import javax.swing.JComboBox;
	import javax.swing.JCheckBox;
	import javax.swing.JCheckBoxMenuItem;
	import javax.swing.DefaultComboBoxModel;
	import javax.swing.JSeparator;
	import javax.swing.JButton;
	import java.text.SimpleDateFormat;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
	public class Maingui{

		private JFrame frame;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		private JTextField textField_8;
		private JTextField textField_10;
		private JTextField textField_17;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_9;
		private JTextField textField_11;
		private JTextField textField_12;
		private JTextField textField_13;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args)throws Exception{
			 try {
		        	localpaymentoption obj=new localpaymentoption();
		        	obj.mymethod(1);
		        }
		        catch(Exception ex) {
		        	System.out.println(ex);
		        }
			String url="jbdc:mysql://localhost:3305//employee";
			String uname="root";
			String pass="rafay1234567890";
			String query="SELECT * FROM employee.personal;";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=(Connection) DriverManager.getConnection(url,uname,pass);
	java.sql.Statement st=((java.sql.Connection) conn).createStatement();
	ResultSet rs=((java.sql.Statement) st).executeQuery(query);
	rs.next();

	String name=rs.getString("name");
	System.out.println(name);
	st.close();
	conn.close();
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Maingui window = new Maingui();
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
		public Maingui() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(0, 0,1368, 689);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
			panel.setBounds(35, 127, 976, 235);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(0, 107, 341, -1);
			panel.add(separator);
			
			JLabel lblBiryani = new JLabel("BEEF BIRYANI");
			lblBiryani.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblBiryani.setBounds(461, 107, 129, 20);
			panel.add(lblBiryani);
			
			JLabel lblZinger = new JLabel("ZINGER BURGER");
			lblZinger.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblZinger.setBounds(461, 148, 129, 21);
			panel.add(lblZinger);
			
			JLabel lblNihari = new JLabel("NIHARI");
			lblNihari.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNihari.setBounds(461, 193, 101, 20);
			panel.add(lblNihari);
			
			JLabel lblBeefBurger = new JLabel("BEEF BURGER");
			lblBeefBurger.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblBeefBurger.setBounds(10, 107, 129, 20);
			panel.add(lblBeefBurger);
			
			JLabel lblChickenBurger = new JLabel("CHICKEN BURGER");
			lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblChickenBurger.setBounds(10, 146, 156, 25);
			panel.add(lblChickenBurger);
			
			JLabel lblCheeseBurger = new JLabel("CHEESE BURGER");
			lblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblCheeseBurger.setBounds(10, 191, 129, 20);
			panel.add(lblCheeseBurger);
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("QUANTITY");
			chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
			chckbxNewCheckBox.setBounds(165, 107, 107, 23);
			panel.add(chckbxNewCheckBox);
			
			textField = new JTextField();
			textField.setBounds(278, 107, 86, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			JCheckBox checkBox_1 = new JCheckBox("QUANTITY");
			checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
			checkBox_1.setBounds(165, 147, 107, 23);
			panel.add(checkBox_1);
			
			JCheckBox checkBox_2 = new JCheckBox("QUANTITY");
			checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
			checkBox_2.setBounds(165, 192, 107, 23);
			panel.add(checkBox_2);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(278, 151, 86, 20);
			panel.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(278, 196, 86, 20);
			panel.add(textField_2);
			
			JCheckBox checkBox_3 = new JCheckBox("QUANTITY");
			checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
			checkBox_3.setBounds(660, 106, 107, 23);
			panel.add(checkBox_3);
			
			JCheckBox checkBox_4 = new JCheckBox("QUANTITY");
			checkBox_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
			checkBox_4.setBounds(660, 147, 107, 23);
			panel.add(checkBox_4);
			
			JCheckBox checkBox_5 = new JCheckBox("QUANTITY");
			checkBox_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
			checkBox_5.setBounds(660, 192, 107, 23);
			panel.add(checkBox_5);
			
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(805, 110, 86, 20);
			panel.add(textField_9);
			
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(805, 151, 86, 20);
			panel.add(textField_11);
			
			textField_12 = new JTextField();
			textField_12.setColumns(10);
			textField_12.setBounds(805, 196, 86, 20);
			panel.add(textField_12);
			
			JLabel label = new JLabel("ITEM NAMES");
			label.setFont(new Font("Tahoma", Font.BOLD, 29));
			label.setBounds(349, 11, 318, 65);
			panel.add(label);
			
			JLabel lblNewLabel_2 = new JLabel("CUSTOMER NAME");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_2.setBounds(10, 54, 156, 25);
			panel.add(lblNewLabel_2);
			
			textField_13 = new JTextField();
			textField_13.setBounds(176, 56, 134, 20);
			panel.add(textField_13);
			textField_13.setColumns(10);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
			panel_1.setBounds(1021, 127, 331, 378);
			frame.getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			textField_10 = new JTextField();
			textField_10.setBounds(93, 62, 86, 35);
			panel_1.add(textField_10);
			textField_10.setColumns(10);
			
			JButton btnNewButton = new JButton("CONVERT");
			btnNewButton.setBounds(10, 140, 134, 23);
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
			panel_1.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("CLOSE");
			btnNewButton_1.setBounds(170, 140, 101, 23);
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			panel_1.add(btnNewButton_1);
			
			JLabel label_8 = new JLabel("DRINKS");
			label_8.setBounds(30, 215, 70, 20);
			label_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
			panel_1.add(label_8);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBounds(100, 217, 101, 22);
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Tea", "Pepsi", "Coke", "coffee", "IceTea", "Ice-Cream", "Orange"}));
			comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			panel_1.add(comboBox_2);
			
			JLabel label_9 = new JLabel("QUANTITY");
			label_9.setBounds(30, 283, 112, 20);
			label_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
			panel_1.add(label_9);
			
			JCheckBox checkBox = new JCheckBox("HOME DELIVERY");
			checkBox.setBounds(30, 325, 218, 23);
			checkBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panel_1.add(checkBox);
			
			textField_17 = new JTextField();
			textField_17.setBounds(129, 286, 86, 20);
			panel_1.add(textField_17);
			textField_17.setColumns(10);
			
			JButton btnNewButton_6 = new JButton("GIVE ORDER");
			btnNewButton_6.setBounds(211, 218, 140, 23);
			btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
			panel_1.add(btnNewButton_6);
			
			JLabel lblNewLabel_1 = new JLabel("discount voucher code");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_1.setBounds(93, 11, 178, 40);
			panel_1.add(lblNewLabel_1);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
			panel_2.setBounds(35, 374, 351, 178);
			frame.getContentPane().add(panel_2);
			panel_2.setLayout(null);
			
			JLabel label_2 = new JLabel("COST OF DRINKS");
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
			label_2.setBounds(10, 33, 192, 21);
			panel_2.add(label_2);
			
			JLabel label_3 = new JLabel("COST OF DELIVERY");
			label_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
			label_3.setBounds(10, 75, 192, 21);
			panel_2.add(label_3);
			
			JLabel lblSpecialDiscountCode = new JLabel("SPECIAL DISCOUNT CODE");
			lblSpecialDiscountCode.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblSpecialDiscountCode.setBounds(10, 117, 203, 21);
			panel_2.add(lblSpecialDiscountCode);
			
			textField_3 = new JTextField();
			textField_3.setBounds(196, 33, 117, 20);
			panel_2.add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(196, 78, 117, 20);
			panel_2.add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(212, 120, 117, 20);
			panel_2.add(textField_5);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
			panel_3.setBounds(407, 374, 604, 178);
			frame.getContentPane().add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblNewLabel_3 = new JLabel("TAX");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_3.setBounds(10, 28, 101, 20);
			panel_3.add(lblNewLabel_3);
			
			JLabel lblSubTotal = new JLabel("SUB TOTAL");
			lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblSubTotal.setBounds(10, 76, 101, 20);
			panel_3.add(lblSubTotal);
			
			JLabel lblTotal = new JLabel("TOTAL");
			lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblTotal.setBounds(10, 122, 101, 20);
			panel_3.add(lblTotal);
			
			textField_6 = new JTextField();
			textField_6.setBounds(150, 28, 110, 20);
			panel_3.add(textField_6);
			textField_6.setColumns(10);
			
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(150, 79, 110, 20);
			panel_3.add(textField_7);
			
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(150, 125, 110, 20);
			panel_3.add(textField_8);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
			panel_5.setBounds(35, 563, 1293, 87);
			frame.getContentPane().add(panel_5);
			panel_5.setLayout(null);
			
			JButton btnNewButton_3 = new JButton("RECIEPT");
			btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
			btnNewButton_3.setBounds(444, 54, 124, 23);
			panel_5.add(btnNewButton_3);
			
			JButton btnNewButton_4 = new JButton("RESET");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				
				}
			});
			btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_4.setBounds(764, 54, 89, 23);
			panel_5.add(btnNewButton_4);
			
			JButton btnNewButton_5 = new JButton("EXIT");
			 btnNewButton_5 .addActionListener(new ActionListener() {
				 public void actionPerformed(ActionEvent arg0) {
					 System.exit(0);
				 }
			 });
			btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
			btnNewButton_5.setBounds(1117, 54, 89, 23);
			panel_5.add(btnNewButton_5);
			
			JButton btnNewButton_2 = new JButton("TOTAL");
			btnNewButton_2.addMouseListener(new MouseAdapter() {
			
				
				
			});
			btnNewButton_2.setBounds(136, 54, 89, 23);
			panel_5.add(btnNewButton_2);
			
			JLabel lblNewLabel = new JLabel("RESTAURENT MANAGEMENT SYSTEM");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
			lblNewLabel.setBounds(107, 11, 1197, 60);
			frame.getContentPane().add(lblNewLabel);
		}
	}



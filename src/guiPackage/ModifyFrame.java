	package guiPackage;
	
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	
	@SuppressWarnings("serial")
	public class ModifyFrame extends JFrame {
	
		private JPanel contentPane;
		private JTextField txtYear;
		private JTextField txtRegion;
		private JTextField txtCount;
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ModifyFrame frame = new ModifyFrame();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
		/**
		 * Create the frame.
		 */
		public ModifyFrame() {
			setTitle("NZSociety");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 613, 408);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new FirstFrame().setVisible(true);
					setVisible(false);
				}
			});
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnNewButton.setBounds(10, 340, 85, 21);
			contentPane.add(btnNewButton);
			
			JButton btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Thank You :) ");
					System.exit(0);
				}
			});
			btnExit.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnExit.setBounds(514, 340, 85, 21);
			contentPane.add(btnExit);
			
			JComboBox<String> comboBox_1 = new JComboBox<String>();
			comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
			comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
			comboBox_1.addItem("Select");
			comboBox_1.addItem("Birth");
			comboBox_1.addItem("Death");
			comboBox_1.setBounds(188, 77, 105, 21);
			contentPane.add(comboBox_1);
			
			@SuppressWarnings("rawtypes")
			JComboBox<Comparable> comboBox_3 = new JComboBox<Comparable>();
			comboBox_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
			comboBox_3.addItem("Year");
			for(int i= 2003;i<2018;i++) {
				comboBox_3.addItem(i);
			}
			comboBox_3.setBounds(46, 200, 105, 21);
			contentPane.add(comboBox_3);
			
			JComboBox<String> comboBox_4 = new JComboBox<String>();
			comboBox_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
			comboBox_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
			comboBox_4.addItem("Select");
			comboBox_4.addItem("Birth");
			comboBox_4.addItem("Death");
			comboBox_4.setBounds(188, 200, 105, 21);
			contentPane.add(comboBox_4);
			
			JComboBox<String> comboBox_5 = new JComboBox<String>();
			comboBox_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
			comboBox_5.addItem("Region");
			comboBox_5.addItem("Northland region");
			comboBox_5.addItem("Auckland region");
			comboBox_5.addItem("Waikato region");
			comboBox_5.addItem("Bay of Plenty region");
			comboBox_5.addItem("Gisborne region");
			comboBox_5.addItem("Hawke's Bay region");
			comboBox_5.addItem("Taranaki region");
			comboBox_5.addItem("Manawatu-Wanganui region");
			comboBox_5.addItem("Wellington region");
			comboBox_5.addItem("Tasman region");
			comboBox_5.addItem("Nelson region");
			comboBox_5.addItem("Marlborough region");
			comboBox_5.addItem("West Coast region");
			comboBox_5.addItem("Canterbury region");
			comboBox_5.addItem("Otago region");
			comboBox_5.addItem("Southland region");
			comboBox_5.addItem("Region not stated or");
			comboBox_5.addItem("New Zealand");
			
			comboBox_5.setBounds(335, 200, 248, 21);
			contentPane.add(comboBox_5);
			
			JButton btnResult = new JButton("Delete");
			btnResult.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnResult.setBounds(359, 257, 224, 34);
			contentPane.add(btnResult);
			
			txtYear = new JTextField();
			txtYear.setText("Year");
			txtYear.setToolTipText("");
			txtYear.setFont(new Font("Times New Roman", Font.BOLD, 12));
			txtYear.setBounds(46, 77, 105, 19);
			contentPane.add(txtYear);
			txtYear.setColumns(10);
			
			txtRegion = new JTextField();
			txtRegion.setFont(new Font("Times New Roman", Font.BOLD, 12));
			txtRegion.setText("Region");
			txtRegion.setBounds(335, 77, 112, 19);
			contentPane.add(txtRegion);
			txtRegion.setColumns(10);
			
			JButton btnAdd = new JButton("Add");
			btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnAdd.setBounds(359, 128, 224, 34);
			contentPane.add(btnAdd);
			
			txtCount = new JTextField();
			txtCount.setToolTipText("");
			txtCount.setText("Count");
			txtCount.setFont(new Font("Times New Roman", Font.BOLD, 12));
			txtCount.setColumns(10);
			txtCount.setBounds(478, 78, 105, 19);
			contentPane.add(txtCount);
			
			
		}
	}

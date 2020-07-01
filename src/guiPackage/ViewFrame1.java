	package guiPackage;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.table.DefaultTableModel;

import codePackage.Read;
import implementationPackage.Tokening;

import javax.swing.JLabel;
	import java.awt.Font;
	
	
	@SuppressWarnings("serial")
	public class ViewFrame1 extends JFrame {
		
		
		private static JTable table;
		private String[] columnNames = {"Period",
	            "Death_Birth",
	            "Region","Count",};
		private Object[][] data = new Object[][]{};
		
		
		public ViewFrame1() throws FileNotFoundException, IOException
		{
			setTitle("NZSociety");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
			Read rd = new Read();
			rd.readData();
			
			getContentPane().setLayout(null);
			
			ViewFrame1.table = new JTable();
			table.setModel( new DefaultTableModel(data,  columnNames));
			
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(0, 37, 549, 287);
			table.setFillsViewportHeight(true);
			table.setEnabled(false);
			table.setDragEnabled(false);
		
			getContentPane().add(scrollPane);
			
			JLabel lblData = new JLabel("Data");
			lblData.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblData.setBounds(10, 10, 91, 17);
			getContentPane().add(lblData);
			
			JButton btnNewButton = new JButton("Exit");
			btnNewButton.setBounds(439, 334, 85, 21);
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
			getContentPane().add(btnNewButton);
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Thank You :) ");
					System.exit(0);
				}
			});
			
			JButton btnBack = new JButton("Back");
			btnBack.setBounds(10, 334, 85, 21);
			getContentPane().add(btnBack);
			btnBack.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new FirstFrame().setVisible(true);
					setVisible(false);
				}
			});
			
			//set width and height
			this.setBounds( 75,75,563, 408);
			
			//set visible
			this.setVisible(true);
			
			//cannot be resize
			this.setResizable(true);
			
			new Tokening(rd.getSdata());
		}
	
		public static JTable getTable() {
			return table;
		}
	
	
		public void setTable(JTable table) {
			ViewFrame1.table = table;
		}
		
	}

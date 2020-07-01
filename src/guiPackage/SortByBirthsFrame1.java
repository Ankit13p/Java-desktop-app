	package guiPackage;
	
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.border.EmptyBorder;
	import javax.swing.table.DefaultTableModel;

import codePackage.Read;
import implementationPackage.NzSocietyData;
import implementationPackage.SortMain;

import javax.swing.JButton;
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.StringTokenizer;
	import java.awt.event.ActionEvent;
	import javax.swing.JLabel;
	
	@SuppressWarnings("serial")
	public class SortByBirthsFrame1 extends JFrame {
	
		private JPanel contentPane;
		JScrollPane scrollPane;
		private JTable table;
		private String[] columnNames = {"Period",
	            "Death_Birth",
	            "Region","Count"};
		private Object[][] data = new Object[][]{};
		
		public JTable getTable() {
			return table;
		}
	
	
		public void setTable() throws FileNotFoundException, IOException {
			new SortMain();
			
			ArrayList<NzSocietyData> nzdArrayList=SortMain.birthSort();
			
			for(int i1=0; i1<nzdArrayList.size();i1++) {
			
					StringTokenizer tokenizer = new StringTokenizer(""+nzdArrayList.get(i1), ","); 
					String year = tokenizer.nextToken();
					String birthdeath = tokenizer.nextToken();
					String region = tokenizer.nextToken();
					String count = tokenizer.nextToken();
					
					Object[] row = { year, birthdeath, region, count};
					
						DefaultTableModel model = (DefaultTableModel) this.table.getModel();
						
						model.addRow(row);
			           
	}
		}
	
		/**
		 * Launch the application.
		 */
	
		
	
		/**
		 * Create the frame.
		 * @throws IOException 
		 * @throws FileNotFoundException 
		 */
		public SortByBirthsFrame1() throws FileNotFoundException, IOException {
			setTitle("NZSociety");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 613, 408);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			Read rd = new Read();
			rd.readData();
			
			getContentPane().setLayout(null);
			JButton btnNewButton = new JButton("Back");
			btnNewButton.setBounds(10, 340, 85, 21);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new SortFrame().setVisible(true);
					setVisible(false);
				}
			});
			contentPane.setLayout(null);
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
			contentPane.add(btnNewButton);
			
			JButton btnExit = new JButton("Exit");
			btnExit.setBounds(452, 340, 85, 21);
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Thank You :) ");
					System.exit(0);
				}
			});
			btnExit.setFont(new Font("Times New Roman", Font.BOLD, 12));
			contentPane.add(btnExit);
			
			JLabel lblSortByRegion = new JLabel("Sort By Birth");
			lblSortByRegion.setBounds(10, 24, 153, 27);
			lblSortByRegion.setFont(new Font("Times New Roman", Font.BOLD, 20));
			contentPane.add(lblSortByRegion);
			
			JButton btnSearch = new JButton("Sort");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						setTable();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
			btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnSearch.setBounds(355, 30, 71, 21);
			contentPane.add(btnSearch);
			
			this.table = new JTable();
			table.setModel( new DefaultTableModel(data,  columnNames));
			
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(0, 69, 549, 255);
			table.setFillsViewportHeight(true);
			table.setEnabled(false);
			table.setDragEnabled(false);
		
			this.setBounds( 75,75,563, 408);
			
			this.setVisible(true);
			
			this.setResizable(true);
			
			getContentPane().add(scrollPane);
			
		}
	}

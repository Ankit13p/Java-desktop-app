	package guiPackage;
	
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.JTextField;
	import javax.swing.border.EmptyBorder;
	import javax.swing.table.DefaultTableModel;

import codePackage.Read;

import javax.swing.JButton;
	import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.StringTokenizer;
	import java.awt.event.ActionEvent;
	import javax.swing.JLabel;
	
	@SuppressWarnings("serial")
	public class SearchByYearFrame1 extends JFrame {
	
		private JPanel contentPane;
		JScrollPane scrollPane;
		private JTextField textField_1;
		private JTable table;
		private String[] columnNames = {"Period",
	            "Death_Birth",
	            "Region","Count"};
		private Object[][] data = new Object[][]{};
		private JTextField textField;
		
		
		
		
		
	
		public JTable getTable() {
			return table;
		}
	
	
		public void setTable() {
			yearSearch();
		}


		public void yearSearch() throws HeadlessException {
			try
			{
			Read rd = new Read();
			rd.readData();
			ArrayList<String> al = rd.getSdata();
		//if(Integer.parseInt(textField_1.getText())>2002 && Integer.parseInt(textField_1.getText())<2018) {
			int c=0;
			for(int i1=0; i1<al.size();i1++) {
				// if (al.get(i1).contains(textField_1.getText())) {
					 StringTokenizer tokenizer = new StringTokenizer(al.get(i1), ","); 
						
						
					 String year = tokenizer.nextToken();
						String birthdeath = tokenizer.nextToken();
						String region = tokenizer.nextToken();
						String count = tokenizer.nextToken();
						
						Object[] row = { year, birthdeath, region, count};
						
						
						if (((String) row[0]).contains(textField_1.getText())) {
							DefaultTableModel model = (DefaultTableModel) this.table.getModel();
							model.addRow(row);
			               c++;
						}
							
							
						/*DefaultTableModel model = (DefaultTableModel) this.table.getModel();
						
						model.addRow(row);
		               count++;*/
		            }
				 
				//}
			textField.setText(""+c);;
			if(c==0)
			{
				 JOptionPane.showMessageDialog(null, "Data Not Found!");
				//textArea.setText("Data Not Found");
				//textArea.setFont(new Font("Times New Roman", Font.BOLD, 12));
			}
			//}
			}
			catch(FileNotFoundException fnf) {
			System.err.println(fnf);
			}
			catch(IOException io) {
				System.err.println(io);
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
		public SearchByYearFrame1() throws FileNotFoundException, IOException {
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
					new SearchFrame().setVisible(true);
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
			
			JLabel lblSortByRegion = new JLabel("Search By Year");
			lblSortByRegion.setBounds(10, 24, 153, 27);
			lblSortByRegion.setFont(new Font("Times New Roman", Font.BOLD, 20));
			contentPane.add(lblSortByRegion);
			
			textField_1 = new JTextField();
			textField_1.setToolTipText("Enter Year Only");
			textField_1.setBounds(172, 31, 173, 19);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
			
			JButton btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					/*DefaultTableModel dm = (DefaultTableModel)table.getModel();
					dm.getDataVector().removeAllElements();
					dm.fireTableDataChanged();*/
					setTable();
				}
			});
			btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnSearch.setBounds(355, 30, 71, 21);
			contentPane.add(btnSearch);
			
			textField = new JTextField();
			textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			textField.setEditable(false);
			textField.setBounds(516, 45, 23, 19);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JLabel lblDataFound = new JLabel("Data Found");
			lblDataFound.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			lblDataFound.setBounds(455, 46, 61, 16);
			contentPane.add(lblDataFound);
			
			this.table = new JTable();
			table.setModel( new DefaultTableModel(data,  columnNames));
			
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(0, 69, 549, 255);
			table.setFillsViewportHeight(true);
			table.setEnabled(false);
			table.setDragEnabled(false);
		
	this.setBounds( 75,75,563, 408);
			
			//set visible
			this.setVisible(true);
			
			//cannot be resize
			this.setResizable(true);
			//dt.populateTable(rd.getSdata());
			
			//new DataToken(rd.getSdata());
			//DataToken dt = new DataToken(rd.getSdata());
			//populateTable(rd.getSdata());
				
			getContentPane().add(scrollPane);
			
			
			
			//setTextArea();
		}
	}

		package guiPackage;
		
		import javax.swing.JFrame;
		import javax.swing.JOptionPane;
		import javax.swing.JPanel;
		import javax.swing.JScrollPane;
		import javax.swing.JTable;
		import javax.swing.border.EmptyBorder;
		import javax.swing.table.DefaultTableModel;

import codePackage.Read;

import javax.swing.JButton;
		import java.awt.Font;
		import java.awt.event.ActionListener;
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
		import java.awt.event.ActionEvent;
		import javax.swing.JLabel;
		
		@SuppressWarnings("serial")
		public class LookItFrame extends JFrame {
		
			private JPanel contentPane;
			JScrollPane scrollPane;
			private JTable table;
			private String[] columnNames = {"Period",
		            "Death_Birth",
		            "Region","Count"};
			private Object[][] data = new Object[][]{};
			String ip;
			
			
			
			
			
		
			public JTable getTable() {
				return table;
			}
		
		
			
			private void ipMax() throws NumberFormatException, IOException {
				String[] row = null;
				File file= new File("data//record.csv");
					//ArrayList<NzSocietyData>sdata = new ArrayList<NzSocietyData>();
					FileReader fr = new FileReader(file);
					BufferedReader br =  new BufferedReader(fr);
					String line;
					int max=0;
					 while ((line = br.readLine()) != null) {
				           row = line.split(",");
				           if(row[1].contains(ip)) {
				        	   	if(Integer.parseInt(row[3])>max) {
				        	   			max=Integer.parseInt(row[3]);
				        	   	}
						 }
				          
					} if(row[3].contains(""+max)) {
						DefaultTableModel model = (DefaultTableModel) this.table.getModel();
					
					model.addRow(row);
					}
					 	br.close();
						fr.close();
	
				}
			
			
		
			/**
			 * Launch the application.
			 */
		
			
		
			/**
			 * Create the frame.
			 * @throws IOException 
			 * @throws FileNotFoundException 
			 */
			public LookItFrame() throws FileNotFoundException, IOException {
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
				
				this.table = new JTable();
				table.setModel( new DefaultTableModel(data,  columnNames));
				
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(0, 143, 549, 181);
				table.setFillsViewportHeight(true);
				table.setEnabled(false);
				table.setDragEnabled(false);
			
				this.setBounds( 75,75,563, 408);
				
				//set visible
				this.setVisible(true);
				
				//cannot be resize
				this.setResizable(true);
				
					
				getContentPane().add(scrollPane);
				
				JButton btnDeathsMax = new JButton("Deaths Max");
				btnDeathsMax.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						DefaultTableModel dm = (DefaultTableModel)table.getModel();
						dm.getDataVector().removeAllElements();
						dm.fireTableDataChanged();
						try {
							try {
								ip="Deaths";
								ipMax();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
	
					
	
					
				});
				btnDeathsMax.setToolTipText("Get Maximum deaths Count");
				btnDeathsMax.setFont(new Font("Times New Roman", Font.BOLD, 12));
				btnDeathsMax.setBounds(199, 71, 104, 34);
				contentPane.add(btnDeathsMax);
				
				JLabel lblViewMaxAnd = new JLabel("View Max Deaths count");
				lblViewMaxAnd.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblViewMaxAnd.setBounds(10, 34, 511, 27);
				contentPane.add(lblViewMaxAnd);
			}
		}

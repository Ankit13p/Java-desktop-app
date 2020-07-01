		package guiPackage;
		
		import java.awt.EventQueue;
		
		import javax.swing.JFrame;
		import javax.swing.JOptionPane;
		import javax.swing.JPanel;
		import javax.swing.border.EmptyBorder;
		import javax.swing.JButton;
		import java.awt.Font;
		import java.awt.event.ActionListener;
		import java.io.IOException;
		import java.awt.event.ActionEvent;
		import javax.swing.JLabel;
		
		@SuppressWarnings("serial")
		public class FindFrame extends JFrame {
		
			private JPanel contentPane;
		
			/**
			 * Launch the application.
			 */
			public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							FindFrame frame = new FindFrame();
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
			public FindFrame() {
				setTitle("NZSociety");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 613, 408);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JButton btnNewButton = new JButton("Exit");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						JOptionPane.showMessageDialog(null, "Thank You :) ");
						System.exit(0);
					}
				});
				btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
				btnNewButton.setBounds(504, 340, 85, 21);
				contentPane.add(btnNewButton);
				
				JButton btnBack = new JButton("Back");
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						new FirstFrame().setVisible(true);
						setVisible(false);
					}
				});
				btnBack.setFont(new Font("Times New Roman", Font.BOLD, 12));
				btnBack.setBounds(10, 340, 85, 21);
				contentPane.add(btnBack);
				
				JButton btnSearch = new JButton("Search");
				btnSearch.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						new SearchFrame().setVisible(true);
						setVisible(false);
					}
				});
				btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 12));
				btnSearch.setBounds(336, 60, 224, 34);
				contentPane.add(btnSearch);
				
				JButton btnSort = new JButton("Sort");
				btnSort.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						new SortFrame().setVisible(true);
						setVisible(false);
					}
				});
				btnSort.setFont(new Font("Times New Roman", Font.BOLD, 12));
				btnSort.setBounds(336, 120, 224, 34);
				contentPane.add(btnSort);
				
				JButton btnCompare = new JButton("look It");
				btnCompare.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							new LookItFrame().setVisible(true);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						setVisible(false);
					}
				});
				btnCompare.setFont(new Font("Times New Roman", Font.BOLD, 12));
				btnCompare.setBounds(336, 182, 224, 34);
				contentPane.add(btnCompare);
				
				JLabel lblSearchingData_1 = new JLabel("Searching Data");
				lblSearchingData_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				lblSearchingData_1.setBounds(50, 58, 191, 34);
				contentPane.add(lblSearchingData_1);
				
				JLabel lblSortingData_1 = new JLabel("Sorting Data");
				lblSortingData_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				lblSortingData_1.setBounds(50, 118, 191, 34);
				contentPane.add(lblSortingData_1);
				
				JLabel lblCompareData = new JLabel("Looking For Max count");
				lblCompareData.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				lblCompareData.setBounds(50, 180, 191, 34);
				contentPane.add(lblCompareData);
			}
		
		}

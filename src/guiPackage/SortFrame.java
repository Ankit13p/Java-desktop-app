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
	public class SortFrame extends JFrame {
	
		private JPanel contentPane;
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						SortFrame frame = new SortFrame();
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
		public SortFrame() {
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
					new FindFrame().setVisible(true);
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
			btnExit.setBounds(504, 340, 85, 21);
			contentPane.add(btnExit);
			
			JButton btnSpecificYear = new JButton("Sort By Year");
			btnSpecificYear.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnSpecificYear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						new SortByYearFrame1().setVisible(true);
					} catch (IOException e) {
						e.printStackTrace();
					}
					setVisible(false);
				}
			});
			btnSpecificYear.setBounds(325, 33, 224, 34);
			contentPane.add(btnSpecificYear);
			
			JButton button = new JButton("Sort By Region");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						new SortByRegionFrame1().setVisible(true);
					} catch (IOException e) {
						e.printStackTrace();
					}
					setVisible(false);
				}
			});
			button.setFont(new Font("Times New Roman", Font.BOLD, 12));
			button.setBounds(325, 213, 224, 34);
			contentPane.add(button);
			
			JButton btnBirthDetail = new JButton("Sort By Birth");
			btnBirthDetail.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						new SortByBirthsFrame1().setVisible(true);
					} catch (IOException e) {
						e.printStackTrace();
					}
					setVisible(false);
				}
			});
			btnBirthDetail.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnBirthDetail.setBounds(325, 126, 224, 34);
			contentPane.add(btnBirthDetail);
			
			
			JLabel lblSortDataIn_1 = new JLabel("Sort data in order to Births");
			lblSortDataIn_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			lblSortDataIn_1.setBounds(41, 124, 264, 34);
			contentPane.add(lblSortDataIn_1);
			
			JLabel lblSortDataIn_3 = new JLabel("Sort data in order to Region");
			lblSortDataIn_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			lblSortDataIn_3.setBounds(41, 211, 264, 34);
			contentPane.add(lblSortDataIn_3);
			
			JLabel lblSortDataIn = new JLabel("Sort data in order to Year");
			lblSortDataIn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			lblSortDataIn.setBounds(41, 31, 264, 34);
			contentPane.add(lblSortDataIn);
		}
	}

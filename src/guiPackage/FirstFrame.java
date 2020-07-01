	package guiPackage;
	
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	
	import java.awt.Font;
	
	@SuppressWarnings("serial")
	public class FirstFrame extends JFrame {
	
		private JPanel contentPane;
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
				
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						FirstFrame frame = new FirstFrame();
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
		public FirstFrame() {
			setTitle("NZSociety");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 613, 408);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBounds(10, 10, 578, 347);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JButton btnView = new JButton("View");
			btnView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//textArrayListDisplay();
					try {
						new ViewFrame1().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
					setVisible(false);
				}
	
			});
			btnView.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnView.setBounds(322, 58, 224, 34);
			panel.add(btnView);
			
			JButton btnFind = new JButton("Find");
			btnFind.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new FindFrame().setVisible(true);
					setVisible(false);
				}
			});
			btnFind.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnFind.setBounds(322, 136, 224, 34);
			panel.add(btnFind);
			
			JButton btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new Welcome().setVisible(true);
					setVisible(false);
				}
			});
			btnBack.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnBack.setBounds(10, 326, 85, 21);
			panel.add(btnBack);
			
			JButton btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Thank You :) ");
					System.exit(0);
				}
			});
			btnExit.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnExit.setBounds(483, 326, 85, 21);
			panel.add(btnExit);
			
			JLabel lblToViewBirth_1 = new JLabel("To view Birth and Death record");
			lblToViewBirth_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			lblToViewBirth_1.setBounds(53, 56, 224, 34);
			panel.add(lblToViewBirth_1);
			
			JLabel lblToFindParticular_1 = new JLabel("To Find Particular Information");
			lblToFindParticular_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			lblToFindParticular_1.setBounds(53, 134, 224, 34);
			panel.add(lblToFindParticular_1);
		}
	}

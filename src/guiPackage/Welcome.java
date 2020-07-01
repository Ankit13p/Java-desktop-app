	package guiPackage;
	
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import javax.swing.SwingConstants;
	import javax.swing.border.EmptyBorder;
	
	@SuppressWarnings("serial")
	public class Welcome extends JFrame {
	
		private JPanel contentPane;
		private JTextField txtWelcomeToNzsociety;
		private JLabel lblNewLabel;
	
	
		/**
		 * Create the frame.
		 */
		public Welcome() {
			setTitle("NZSociety");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 613, 408);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			txtWelcomeToNzsociety = new JTextField();
			txtWelcomeToNzsociety.setForeground(Color.BLACK);
			txtWelcomeToNzsociety.setEditable(false);
			txtWelcomeToNzsociety.setHorizontalAlignment(SwingConstants.CENTER);
			txtWelcomeToNzsociety.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
			txtWelcomeToNzsociety.setText("WelCome To NZSociety");
			txtWelcomeToNzsociety.setBounds(50, 151, 516, 37);
			contentPane.add(txtWelcomeToNzsociety);
			txtWelcomeToNzsociety.setColumns(10);
			
			lblNewLabel = new JLabel("");
		
			lblNewLabel.setBounds(50, 89, 516, 202);
			contentPane.add(lblNewLabel);
			
			JButton btnContinue = new JButton("Continue");
			btnContinue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new FirstFrame().setVisible(true);
					setVisible(false);
				}
			});
			btnContinue.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnContinue.setBounds(417, 319, 111, 21);
			contentPane.add(btnContinue);
			this.setVisible(true);
			
		}
	}

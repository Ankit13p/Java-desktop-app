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
public class SearchFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchFrame frame = new SearchFrame();
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
	public SearchFrame() {
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
		
		JButton btnSearchByYear = new JButton("Search By Year");
		btnSearchByYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new SearchByYearFrame1().setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				setVisible(false);
			}
		});
		btnSearchByYear.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnSearchByYear.setBounds(335, 51, 224, 34);
		contentPane.add(btnSearchByYear);
		
		JButton btnSearchByRegion = new JButton("Search By Region");
		btnSearchByRegion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new SearchByRegionFrame1().setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				setVisible(false);
			}
		});
		btnSearchByRegion.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSearchByRegion.setBounds(335, 149, 224, 34);
		contentPane.add(btnSearchByRegion);
		
		JButton btnSearchByYear_1 = new JButton("Search By Year and Region");
		btnSearchByYear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new SearchByYearAndRegionFrame1().setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				setVisible(false);
			}
			
		});
		btnSearchByYear_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSearchByYear_1.setBounds(335, 241, 224, 34);
		contentPane.add(btnSearchByYear_1);
		
		JLabel lblFindDataBy = new JLabel("Find data by entering year");
		lblFindDataBy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFindDataBy.setBounds(39, 51, 264, 34);
		contentPane.add(lblFindDataBy);
		
		JLabel lblFindDataBy_1 = new JLabel("Find data by entering region");
		lblFindDataBy_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFindDataBy_1.setBounds(39, 149, 264, 34);
		contentPane.add(lblFindDataBy_1);
		
		JLabel lblFindDataBy_2 = new JLabel("Find data by entering year and region");
		lblFindDataBy_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFindDataBy_2.setBounds(39, 241, 264, 34);
		contentPane.add(lblFindDataBy_2);
	}

}

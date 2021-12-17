package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stories extends JFrame {

	private JPanel contentPane;
	private SaveS1 save=new SaveS1();
	private SaveS2 loadS2=new SaveS2();
	private static Stories frame = new Stories();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public Stories() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Story One");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				playFrame story =new playFrame();
				story.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(12, 183, 121, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Story Two");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Story2 story =new Story2();
				story.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(12, 276, 121, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Load Game S1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				playFrame frame=new playFrame();
				if(save.getRaft()!=null) {
				frame.lblNewLabel.setBounds(save.getRaft());
				frame.lblNewLabel_1.setBounds(save.getFarmerRight());
				frame.lblNewLabel_2.setBounds(save.getWolfRigh());
				frame.lblNewLabel_4.setBounds(save.getGoatRight());
				frame.lblNewLabel_6.setBounds(save.getPlantRight());
				frame.lblNewLabel_5.setBounds(save.getFarmerLeft());
				frame.lblNewLabel_8.setBounds(save.getWolfLeft());
				frame.lblNewLabel_9.setBounds(save.getGoatLeft());
				frame.lblNewLabel_10.setBounds(save.gePlantLeft());
				frame.lblNewLabel_1.setVisible(save.getFarmerRightBool());
				frame.lblNewLabel_5.setVisible(save.getFarmerLeftBool());
				frame.lblNewLabel_2.setVisible(save.getWolfRightBool());
				frame.lblNewLabel_8.setVisible(save.getWolfLeftBool());
				frame.lblNewLabel_4.setVisible(save.getGoatRightBool());
				frame.lblNewLabel_9.setVisible(save.getGoatLeftBool());
				frame.lblNewLabel_6.setVisible(save.getPlantRightBool());
				frame.lblNewLabel_10.setVisible(save.getPlantLeftBool());
				}
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBounds(243, 200, 153, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Load Game S2");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Story2 S2=new Story2();
				if(loadS2.getRaft()!=null) {
				S2.lblNewLabel_1.setBounds(loadS2.getFarmer_90Right());
				S2.lblNewLabel_6.setBounds(loadS2.getFarmer_90Left());
				S2.lblNewLabel_1.setVisible(loadS2.getFarmer_90RightBool());
				S2.lblNewLabel_6.setVisible(loadS2.getFarmer_90LeftBool());
				S2.lblNewLabel_2.setBounds(loadS2.getFarmer_40_40Right());
				S2.lblNewLabel_7.setBounds(loadS2.getFarmer_40_40Left());
				S2.lblNewLabel_2.setVisible(loadS2.getFarmer_40RightBool());
				S2.lblNewLabel_7.setVisible(loadS2.getFarmer_40LeftBool());
				S2.lblNewLabel_11.setBounds(loadS2.getRaft());
				S2.lblNewLabel_3.setBounds(loadS2.getFarmer_60Right());
				S2.lblNewLabel_8.setBounds(loadS2.getFarmer_60Left());
				S2.lblNewLabel_3.setVisible(loadS2.getFarmer_60RightBool());
				S2.lblNewLabel_8.setVisible(loadS2.getFarmer_60LeftBool());
				S2.lblNewLabel_4.setBounds(loadS2.getFarmer_80Right());
				S2.lblNewLabel_9.setBounds(loadS2.getFarmer_80Left());
				S2.lblNewLabel_4.setVisible(loadS2.getFarmer_80RightBool());
				S2.lblNewLabel_9.setVisible(loadS2.getFarmer_80LeftBool());
				S2.lblNewLabel_5.setBounds(loadS2.getWolfRigh());
				S2.lblNewLabel_10.setBounds(loadS2.getWolfLeft());
				S2.lblNewLabel_5.setVisible(loadS2.getWolfRightBool());
				S2.lblNewLabel_10.setVisible(loadS2.getWolfLeftBool());
				}
				S2.setVisible(true);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBounds(243, 260, 153, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Story Three");
		btnNewButton_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setBounds(12, 373, 132, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Load Game S3");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.setBounds(243, 335, 153, 29);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Stories.class.getResource("/ICrosser.jpg")));
		lblNewLabel.setBounds(0, 0, 483, 446);
		contentPane.add(lblNewLabel);
		
		

		
	}
}

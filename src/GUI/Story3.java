package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Strtegy.StoryOne;
import Strtegy.StoryThree;
import command.Invoker;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Story3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Story3 frame = new Story3();
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
	public Story3() {
		
		Invoker inv = Invoker.newInv();
		inv.newGame(new StoryThree());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Story3.class.getResource("/monsterR1.png")));
		lblNewLabel_1.setBounds(855, 363, 64, 76);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Story3.class.getResource("/monsterL1.png")));
		lblNewLabel_2.setBounds(0, 338, 88, 76);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Story3.class.getResource("/monsterR2.png")));
		lblNewLabel_3.setBounds(793, 354, 78, 76);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Story3.class.getResource("/monsterL2.png")));
		lblNewLabel_4.setBounds(67, 323, 78, 76);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Story3.class.getResource("/monsterR3.png")));
		lblNewLabel_5.setBounds(736, 338, 78, 76);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Story3.class.getResource("/monsterL3.png")));
		lblNewLabel_6.setBounds(144, 308, 78, 76);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);
		
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Story3.class.getResource("/farmer5.png")));
		lblNewLabel_7.setBounds(207, 287, 56, 88);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setVisible(false);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Story3.class.getResource("/farmerBigRight.png")));
		lblNewLabel_8.setBounds(276, 275, 56, 88);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Story3.class.getResource("/farmerRight.png")));
		lblNewLabel_9.setBounds(299, 256, 78, 97);
		lblNewLabel_9.setVisible(false);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Story3.class.getResource("/farmer5.png")));
		lblNewLabel_10.setBounds(691, 323, 56, 76);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Story3.class.getResource("/farmerBigLeft.png")));
		lblNewLabel_11.setBounds(659, 287, 56, 91);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Story3.class.getResource("/farmerLeft.png")));
		lblNewLabel_12.setBounds(615, 287, 64, 88);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Story3.class.getResource("/Raft.png")));
		lblNewLabel_13.setBounds(553, 388, 162, 65);
		contentPane.add(lblNewLabel_13);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Story3.class.getResource("/River2.png")));
		lblNewLabel.setBounds(0, 0, 919, 439);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Monster-1");
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				
				if (inv.isBoatOnTheLeftBank()) {

				
				if ( lblNewLabel_1.getBounds().contains(855, 363) ) {
					lblNewLabel_1.setBounds(760, 405, 56, 62);

					inv.onBoat(inv.getCrossersOnLeftBank(),StoryThree.getMonster1());	
				}
				
				else if (lblNewLabel_1.getBounds().contains(760, 405)) {
					
					lblNewLabel_1.setBounds(855, 363, 64, 76);
					
					inv.offBoat(StoryThree.getMonster1(), inv.getCrossersOnLeftBank());

					
				}
				
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {

				
				 if( lblNewLabel_2.getBounds().contains(0, 338) ) {
					lblNewLabel_2.setBounds(175, 412, 97, 90);

					inv.onBoat(inv.getCrossersOnRightBank(), StoryThree.getMonster1());
					
				}
				
				
				
				else if( lblNewLabel_2.getBounds().contains(175, 412) ) {
					lblNewLabel_2.setBounds(0, 338, 88, 76);
					inv.offBoat(StoryThree.getMonster1(), inv.getCrossersOnRightBank());
					
				}
					
				
				}
				
				
				
			}
		});
		btnNewButton.setBounds(798, 443, 109, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Monster-2");
		btnNewButton_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (inv.isBoatOnTheLeftBank()) {

				
				if ( lblNewLabel_3.getBounds().contains(793, 354) ) {
					lblNewLabel_3.setBounds(760, 405, 56, 62);


					inv.onBoat(inv.getCrossersOnLeftBank(),StoryThree.getMonster2());	
				}
				
				else if (lblNewLabel_3.getBounds().contains(760, 405)) {
					
					lblNewLabel_3.setBounds(793, 354, 78, 76);
					
					inv.offBoat(StoryThree.getMonster2(), inv.getCrossersOnLeftBank());

					
				}
				
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {

				
				 if( lblNewLabel_4.getBounds().contains(67, 323) ) {
					lblNewLabel_4.setBounds(175, 412, 97, 90);
					
					inv.onBoat(inv.getCrossersOnRightBank(), StoryThree.getMonster2());
					
				}
				
				
				
				else if( lblNewLabel_4.getBounds().contains(175, 412) ) {
					lblNewLabel_4.setBounds(67, 323, 78, 76);
					inv.offBoat(StoryThree.getMonster2(), inv.getCrossersOnRightBank());
					
				}
					
				
				}
								
			}
		});
		btnNewButton_1.setBounds(729, 503, 109, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Monster-3");
		btnNewButton_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (inv.isBoatOnTheLeftBank()) {

				
				if ( lblNewLabel_5.getBounds().contains(736, 338) ) {
					lblNewLabel_5.setBounds(760, 405, 56, 62);

					inv.onBoat(inv.getCrossersOnLeftBank(),StoryThree.getMonster3());	
				}
				
				else if (lblNewLabel_5.getBounds().contains(760, 405)) {
					
					lblNewLabel_5.setBounds(736, 338, 78, 76);
					
					inv.offBoat(StoryThree.getMonster3(), inv.getCrossersOnLeftBank());

					
				}
				
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {

				
				 if( lblNewLabel_6.getBounds().contains(144, 308) ) {
					lblNewLabel_6.setBounds(175, 412, 97, 90);

					inv.onBoat(inv.getCrossersOnRightBank(), StoryThree.getMonster3());
					
				}
				
				
				
				else if( lblNewLabel_6.getBounds().contains(175, 412) ) {
					lblNewLabel_6.setBounds(144, 308, 78, 76);
					inv.offBoat(StoryThree.getMonster3(), inv.getCrossersOnRightBank());
					
				}
					
				
				}
								
							
			}
		});
		btnNewButton_2.setBounds(659, 443, 109, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Man-1");
		btnNewButton_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
				if (inv.isBoatOnTheLeftBank()) {

				
				if ( lblNewLabel_10.getBounds().contains(691, 323) ) {
					lblNewLabel_10.setBounds(760, 405, 56, 62);


					inv.onBoat(inv.getCrossersOnLeftBank(),StoryThree.getFarmer1());	
				}
				
				else if (lblNewLabel_10.getBounds().contains(760, 405)) {
					
					lblNewLabel_10.setBounds(691, 323, 56, 76);
					
					inv.offBoat(StoryThree.getFarmer1(), inv.getCrossersOnLeftBank());

					
				}
				
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {

				
				 if( lblNewLabel_7.getBounds().contains(207, 287) ) {
					lblNewLabel_7.setBounds(175, 412, 97, 90);

					inv.onBoat(inv.getCrossersOnRightBank(), StoryThree.getFarmer1());
					
				}
				
				
				
				else if( lblNewLabel_7.getBounds().contains(175, 412) ) {
					lblNewLabel_7.setBounds(207, 287, 56, 88);
					inv.offBoat(StoryThree.getFarmer1(), inv.getCrossersOnRightBank());
					
				}
					
				
				}
					
				
			}
		});
		btnNewButton_3.setBounds(534, 444, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Man-2");
		btnNewButton_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (inv.isBoatOnTheLeftBank()) {

					
				if ( lblNewLabel_11.getBounds().contains(659, 287) ) {
					lblNewLabel_11.setBounds(760, 405, 56, 62);

					inv.onBoat(inv.getCrossersOnLeftBank(),StoryThree.getFarmer2());	
				}
				
				else if (lblNewLabel_11.getBounds().contains(760, 405)) {
					
					lblNewLabel_11.setBounds(659, 287, 56, 91);
					
					inv.offBoat(StoryThree.getFarmer2(), inv.getCrossersOnLeftBank());

					
				}
				
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {

				
				 if( lblNewLabel_8.getBounds().contains(276, 275) ) {
					lblNewLabel_8.setBounds(175, 412, 97, 90);

					inv.onBoat(inv.getCrossersOnRightBank(), StoryThree.getFarmer2());
					
				}
				
				
				
				else if( lblNewLabel_11.getBounds().contains(175, 412) ) {
					lblNewLabel_8.setBounds(276, 275, 56, 88);
					inv.offBoat(StoryThree.getFarmer2(), inv.getCrossersOnRightBank());
					
				}
					
				
				 
				}
					
								
			}
		});
		btnNewButton_4.setBounds(454, 504, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Man-3");
		btnNewButton_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if (inv.isBoatOnTheLeftBank()) {

					
				if ( lblNewLabel_12.getBounds().contains(615, 287) ) {
					lblNewLabel_12.setBounds(760, 405, 56, 62);

					inv.onBoat(inv.getCrossersOnLeftBank(),StoryThree.getFarmer3());	
				}
				
				else if (lblNewLabel_12.getBounds().contains(760, 405)) {
					
					lblNewLabel_12.setBounds(615, 287, 64, 88);
					
					inv.offBoat(StoryThree.getFarmer3(), inv.getCrossersOnLeftBank());

					
				}
				
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {

				
				 if( lblNewLabel_9.getBounds().contains(299, 256) ) {
					lblNewLabel_9.setBounds(175, 412, 97, 90);

					inv.onBoat(inv.getCrossersOnRightBank(), StoryThree.getFarmer3());
					
				}
				
				
				
				else if( lblNewLabel_9.getBounds().contains(175, 412) ) {
					lblNewLabel_9.setBounds(299, 256, 78, 97);
					inv.offBoat(StoryThree.getFarmer3(), inv.getCrossersOnRightBank());
					
				}
					
				
				}
					
				
			}
		});
		btnNewButton_5.setBounds(382, 444, 97, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Save");
		btnNewButton_6.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_6.setForeground(Color.BLUE);
		btnNewButton_6.setBounds(0, 456, 97, 25);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Reset");
		btnNewButton_7.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_7.setForeground(Color.BLUE);
		btnNewButton_7.setBounds(113, 503, 97, 25);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("UNDO");
		btnNewButton_8.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_8.setForeground(Color.BLUE);
		btnNewButton_8.setBounds(113, 457, 97, 25);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Exit");
		btnNewButton_9.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_9.setForeground(Color.BLUE);
		btnNewButton_9.setBounds(0, 503, 97, 25);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("REDO");
		btnNewButton_10.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_10.setForeground(Color.BLUE);
		btnNewButton_10.setBounds(222, 482, 97, 25);
		contentPane.add(btnNewButton_10);
		


		

	}
}

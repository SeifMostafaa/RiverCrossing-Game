package GUI;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Saving.data;
import Strtegy.StoryOne;
import Strtegy.StoryTwo;
import command.Invoker;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Story2 extends JFrame {

	private JPanel contentPane;
	private static Story2 frame = new Story2();
	SaveS2 save=new SaveS2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				   frame = new Story2();
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
	protected static JLabel lblNewLabel_1;
	protected static JLabel lblNewLabel_2;
	protected static JLabel lblNewLabel_3;
	protected static JLabel lblNewLabel_4;
	protected static JLabel lblNewLabel_5;
	protected static JLabel lblNewLabel_6;
	protected static JLabel lblNewLabel_7;
	protected static JLabel lblNewLabel_8;
	protected static JLabel lblNewLabel_9;
	protected static JLabel lblNewLabel_10;
	protected static JLabel lblNewLabel_11;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	public Story2() {
		
		Invoker inv = new Invoker();
		inv.newGame(new StoryTwo());
		SaveRedoS2 saveR=new SaveRedoS2();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1114, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 lblNewLabel_1 = new JLabel("");
		 lblNewLabel_1.setIcon(new ImageIcon(Story2.class.getResource("/farmerBigRight.png")));
		lblNewLabel_1.setBounds(1017, 439, 67, 88);
		contentPane.add(lblNewLabel_1);
		
		 lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Story2.class.getResource("/farmerRight1.png")));
		lblNewLabel_2.setBounds(956, 432, 65, 78);
		contentPane.add(lblNewLabel_2);
		
		 lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Story2.class.getResource("/farmerR3.png")));
		lblNewLabel_3.setBounds(918, 419, 56, 71);
		contentPane.add(lblNewLabel_3);
		
		 lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Story2.class.getResource("/farmer5.png")));
		lblNewLabel_4.setBounds(852, 399, 67, 88);
		contentPane.add(lblNewLabel_4);
		  
	    lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Story2.class.getResource("/Black_Right.png")));
		lblNewLabel_5.setBounds(791, 399, 56, 65);
		contentPane.add(lblNewLabel_5);
		
	    lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Story2.class.getResource("/farmerBigLeft.png")));
		lblNewLabel_6.setBounds(10, 422, 67, 88);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.hide();
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Story2.class.getResource("/farmerLeft1.png")));
		lblNewLabel_7.setBounds(89, 419, 65, 78);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.hide();
		
	    lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Story2.class.getResource("/farmerL3.png")));
		lblNewLabel_8.setBounds(140, 399, 76, 88);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.hide();
		
	    lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Story2.class.getResource("/farmer5.png")));
		lblNewLabel_9.setBounds(194, 383, 76, 88);
		contentPane.add(lblNewLabel_9);
		lblNewLabel_9.hide();
		 
	    lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Story2.class.getResource("/Black_Left.png")));
		lblNewLabel_10.setBounds(263, 399, 56, 65);
		contentPane.add(lblNewLabel_10);
		lblNewLabel_10.hide();
		
	    lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Story2.class.getResource("/Raft.png")));
		lblNewLabel_11.setBounds(700, 480, 170, 68);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(707, 210, 211, 40);
		contentPane.add(lblNewLabel_12);
		
		
		
		
		
		JButton btnNewButton_5 = new JButton("Reset");
		btnNewButton_5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				frame =new Story2();
				frame.setVisible(true);
				inv.resetGame();				
			}
		});
		btnNewButton_5.setBounds(119, 601, 97, 31);
		contentPane.add(btnNewButton_5);
		
		
		JButton btnNewButton_8 = new JButton("Save");
		btnNewButton_8.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_8.setForeground(Color.BLUE);
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				save.setFarmer_40Data(lblNewLabel_2.getBounds(), lblNewLabel_7.getBounds(), lblNewLabel_2.isVisible(), lblNewLabel_7.isVisible());
				save.setFarmer_60Data(lblNewLabel_3.getBounds(), lblNewLabel_8.getBounds(), lblNewLabel_3.isVisible(), lblNewLabel_8.isVisible());
				save.setFarmer_80Data(lblNewLabel_4.getBounds(), lblNewLabel_9.getBounds(), lblNewLabel_4.isVisible(), lblNewLabel_9.isVisible());
				save.setFarmer_90Data(lblNewLabel_1.getBounds(), lblNewLabel_6.getBounds(), lblNewLabel_1.isVisible(), lblNewLabel_6.isVisible());
				save.setWolfData(lblNewLabel_5.getBounds(), lblNewLabel_10.getBounds(), lblNewLabel_5.isVisible(), lblNewLabel_10.isVisible());
				save.setRaftData(lblNewLabel_11.getBounds());
				data save = new data();
				save.save2(StoryTwo.getFarmer90(), StoryTwo.getFarmer80(), StoryTwo.getFarmer60(), StoryTwo.getFarmer40(),StoryTwo.getWolf(), inv.getCrossersOnLeftBank(), inv.getCrossersOnRightBank(), inv.getCrossersOnBoat(), inv);
					
				
			}
		});
		btnNewButton_8.setBounds(10, 555, 97, 31);
		contentPane.add(btnNewButton_8);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Story2.class.getResource("/RiverBig.png")));
		lblNewLabel.setBounds(0, 0, 1096, 540);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		JButton btnNewButton_7 = new JButton("Move");
		btnNewButton_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_7.setForeground(Color.BLUE);
		btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
		
				if(inv.isBoatOnTheLeftBank()) {

					if (inv.canMove(inv.getCrossersOnBoat(), inv.isBoatOnTheLeftBank())) {
						
						save.setFarmer_40Data(lblNewLabel_2.getBounds(), lblNewLabel_7.getBounds(), lblNewLabel_2.isVisible(), lblNewLabel_7.isVisible());
						save.setFarmer_60Data(lblNewLabel_3.getBounds(), lblNewLabel_8.getBounds(), lblNewLabel_3.isVisible(), lblNewLabel_8.isVisible());
						save.setFarmer_80Data(lblNewLabel_4.getBounds(), lblNewLabel_9.getBounds(), lblNewLabel_4.isVisible(), lblNewLabel_9.isVisible());
						save.setFarmer_90Data(lblNewLabel_1.getBounds(), lblNewLabel_6.getBounds(), lblNewLabel_1.isVisible(), lblNewLabel_6.isVisible());
						save.setWolfData(lblNewLabel_5.getBounds(), lblNewLabel_10.getBounds(), lblNewLabel_5.isVisible(), lblNewLabel_10.isVisible());
						save.setRaftData(lblNewLabel_11.getBounds());

				Timer time=new Timer();
				TimerTask timer=new TimerTask() {
					
					@Override
					public void run() {
				    	lblNewLabel_11.setBounds(550, 480, 170, 68);  							//moving the boat 		
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40())) 
							lblNewLabel_2.setBounds(550, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
							lblNewLabel_3.setBounds(680, 439, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
							lblNewLabel_4.setBounds(680, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
							lblNewLabel_1.setBounds(680, 439, 67, 88);

						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_5.setBounds(680, 439, 170, 68);

						
					}
				};
				time.schedule(timer,100);
				 timer=new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_11.setBounds(500, 480, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40()))
							lblNewLabel_2.setBounds(500, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
							lblNewLabel_3.setBounds(586, 439, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
							lblNewLabel_4.setBounds(586, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
							lblNewLabel_1.setBounds(586, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_5.setBounds(586, 439, 170, 68);



					}

				};
				time.schedule(timer,200);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_11.setBounds(440, 480, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40()))
						lblNewLabel_2.setBounds(440, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
						lblNewLabel_3.setBounds(500, 439, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
						lblNewLabel_4.setBounds(500, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
						lblNewLabel_1.setBounds(500, 439,  67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_5.setBounds(500, 439, 170, 68);
						
					}
				};
				time.schedule(timer, 300);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_11.setBounds(400, 480, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40()))
							lblNewLabel_2.setBounds(400, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
							lblNewLabel_3.setBounds(486, 439, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
							lblNewLabel_4.setBounds(486, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
							lblNewLabel_1.setBounds(486, 439,  67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_5.setBounds(486, 439, 170, 68);
						
					}
				};
				time.schedule(timer, 400);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_11.setBounds(300, 480, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40()))
						lblNewLabel_2.setBounds(300, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
						lblNewLabel_3.setBounds(386, 439, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
						lblNewLabel_4.setBounds(386, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
						lblNewLabel_1.setBounds(386, 439,  67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_5.setBounds(386, 439, 170, 68);
					}
				};
				time.schedule(timer, 500);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_11.setBounds(200, 480, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40()))
						lblNewLabel_2.setBounds(200, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
						lblNewLabel_3.setBounds(286, 439, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
						lblNewLabel_4.setBounds(286, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
						lblNewLabel_1.setBounds(286, 439,  67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_5.setBounds(286, 439, 56, 37);
					}
				};
				time.schedule(timer, 600);
				timer =new TimerTask() {					
					@Override
					public void run() {


						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40())) {
							lblNewLabel_2.hide();
							lblNewLabel_7.setBounds(89, 419, 65, 78);
							lblNewLabel_7.show();
					
						}
							
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60())) {
							lblNewLabel_3.hide();
							lblNewLabel_8.setBounds(140, 399, 76, 88);
							lblNewLabel_8.show();
						}
							
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80())) {
							lblNewLabel_4.hide();
							lblNewLabel_9.setBounds(194, 383, 76, 88);
							lblNewLabel_9.show();
							
						}
							
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90())) {
							lblNewLabel_1.hide();
							lblNewLabel_6.setBounds(10, 422, 67, 88);
							lblNewLabel_6.show();
							
						}
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf())) {
							lblNewLabel_5.hide();
							lblNewLabel_10.setBounds(263, 399, 56, 65);
							lblNewLabel_10.show();
							
						}
						
						inv.doMove(inv.getCrossersOnBoat(), inv.isBoatOnTheLeftBank());
						if (inv.getCrossersOnBoat().size() == 0 && inv.getCrossersOnLeftBank().size() == 0 && inv.getCrossersOnRightBank().size() == 5)
							new GameOver().setVisible(true);
					}
				};
				time.schedule(timer, 700);
				}
				}
				else if (!inv.isBoatOnTheLeftBank()) {
					if (inv.canMove(inv.getCrossersOnBoat(), inv.isBoatOnTheLeftBank())) {
					
						save.setFarmer_40Data(lblNewLabel_2.getBounds(), lblNewLabel_7.getBounds(), lblNewLabel_2.isVisible(), lblNewLabel_7.isVisible());
						save.setFarmer_60Data(lblNewLabel_3.getBounds(), lblNewLabel_8.getBounds(), lblNewLabel_3.isVisible(), lblNewLabel_8.isVisible());
						save.setFarmer_80Data(lblNewLabel_4.getBounds(), lblNewLabel_9.getBounds(), lblNewLabel_4.isVisible(), lblNewLabel_9.isVisible());
						save.setFarmer_90Data(lblNewLabel_1.getBounds(), lblNewLabel_6.getBounds(), lblNewLabel_1.isVisible(), lblNewLabel_6.isVisible());
						save.setWolfData(lblNewLabel_5.getBounds(), lblNewLabel_10.getBounds(), lblNewLabel_5.isVisible(), lblNewLabel_10.isVisible());
						save.setRaftData(lblNewLabel_11.getBounds());
					
				Timer time=new Timer();
				TimerTask timer=new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_11.setBounds(200, 480, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40()))
						lblNewLabel_7.setBounds(200, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
						lblNewLabel_8.setBounds(286, 439, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
						lblNewLabel_9.setBounds(286, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
						lblNewLabel_6.setBounds(286, 439,  67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_10.setBounds(286, 439, 56, 37);
					}
				};
				time.schedule(timer,100);
				 timer=new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_11.setBounds(300, 480, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40()))
						lblNewLabel_7.setBounds(300, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
						lblNewLabel_8.setBounds(386, 439, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
						lblNewLabel_9.setBounds(386, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
						lblNewLabel_6.setBounds(386, 439,  67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_10.setBounds(386, 439, 170, 68);
					}

				};
				time.schedule(timer,200);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_11.setBounds(400, 480, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40()))
							lblNewLabel_7.setBounds(400, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
							lblNewLabel_8.setBounds(486, 439, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
							lblNewLabel_9.setBounds(486, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
							lblNewLabel_6.setBounds(486, 439,  67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_10.setBounds(486, 439, 170, 68);
					}
				};
				time.schedule(timer, 300);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_11.setBounds(440, 480, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40()))
						lblNewLabel_7.setBounds(440, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
						lblNewLabel_8.setBounds(500, 439, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
						lblNewLabel_9.setBounds(500, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
						lblNewLabel_6.setBounds(500, 439,  67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_10.setBounds(500, 439, 170, 68);

					}
				};
				time.schedule(timer, 400);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_11.setBounds(500, 480, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40()))
							lblNewLabel_7.setBounds(500, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
							lblNewLabel_8.setBounds(586, 439, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
							lblNewLabel_9.setBounds(586, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
							lblNewLabel_6.setBounds(586, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_10.setBounds(586, 439, 170, 68);

					}
				};
				time.schedule(timer, 500);
				timer =new TimerTask() {
					
					@Override
					public void run() {
				    	lblNewLabel_11.setBounds(700, 480, 170, 68);  							//moving the boat 		
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40())) 
							lblNewLabel_7.setBounds(550, 439,  65, 78);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60()))
							lblNewLabel_8.setBounds(680, 439, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80()))
							lblNewLabel_9.setBounds(680, 439, 67, 88);
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90()))
							lblNewLabel_6.setBounds(680, 439, 67, 88);

						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf()))
							lblNewLabel_10.setBounds(680, 439, 170, 68);
					}
				};
				time.schedule(timer, 600);
				timer =new TimerTask() {
					
					@Override
					public void run() {
									
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer40())) {
							lblNewLabel_7.hide();
							lblNewLabel_2.setBounds(956, 432, 65, 78);
							lblNewLabel_2.show();
							
						}
							
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer60())) {
							lblNewLabel_8.hide();
							lblNewLabel_3.setBounds(918, 419, 56, 71);
							lblNewLabel_3.show();
						}
							
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer80())) {
							lblNewLabel_9.hide();
							lblNewLabel_4.setBounds(852, 399, 67, 88);
							lblNewLabel_4.show();
							
						}
							
						if (inv.getCrossersOnBoat().contains(StoryTwo.getFarmer90())) {
							lblNewLabel_6.hide();
							lblNewLabel_1.setBounds(1017, 439, 67, 88);
							lblNewLabel_1.show();
							
						}
						
						if (inv.getCrossersOnBoat().contains(StoryTwo.getWolf())) {
							lblNewLabel_10.hide();
							lblNewLabel_5.setBounds(791, 399, 56, 65);
							lblNewLabel_5.show();
							
						}
						
						
						inv.doMove(inv.getCrossersOnBoat(), inv.isBoatOnTheLeftBank());
						if (inv.getCrossersOnBoat().size() == 0 && inv.getCrossersOnLeftBank().size() == 0 && inv.getCrossersOnRightBank().size() == 5) {
							new GameOver().setVisible(true);
						}
					}
				};
				time.schedule(timer, 700);
				}
						
					
			}

		}
			
		});
		btnNewButton_7.setBounds(497, 575, 97, 34);
		contentPane.add(btnNewButton_7);
		
		

		
		JButton btnNewButton_6 = new JButton("Wolf");
		btnNewButton_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_6.setForeground(Color.BLUE);
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if (inv.isBoatOnTheLeftBank()) {
				if (lblNewLabel_5.getBounds().contains(791, 399)) {
				lblNewLabel_5.setBounds(764, 462, 56, 65);
				inv.onBoat(inv.getCrossersOnLeftBank(), StoryTwo.getWolf());

				
				}
			
			
			else if (lblNewLabel_5.getBounds().contains(764, 462)) {
				
				lblNewLabel_5.setBounds(791, 399, 56, 65);
				
				inv.offBoat(StoryTwo.getWolf(), inv.getCrossersOnLeftBank());

				
			}
				
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {
			 if( lblNewLabel_10.getBounds().contains(263, 399) ) {
				lblNewLabel_10.setBounds(204, 462, 56, 65);
				inv.onBoat(inv.getCrossersOnRightBank(), StoryTwo.getWolf());

				
			}
			
			
			
			else if( lblNewLabel_10.getBounds().contains(204, 462) ) {
				lblNewLabel_10.setBounds(263, 399, 56, 65);
				inv.offBoat(StoryTwo.getWolf(), inv.getCrossersOnRightBank());

				
			}
				
				}
				
			}
		});
		
		
		btnNewButton_6.setBounds(743, 575, 97, 34);
		contentPane.add(btnNewButton_6);

		
		JButton btnNewButton = new JButton("Framer-90");
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (inv.isBoatOnTheLeftBank()) {
					if (lblNewLabel_1.getBounds().contains(1017, 439)) {
					lblNewLabel_1.setBounds(724, 437, 67, 88);
					inv.onBoat(inv.getCrossersOnLeftBank(), StoryTwo.getFarmer90());

					
					}
				
				
				else if (lblNewLabel_1.getBounds().contains(724, 437)) {

					lblNewLabel_1.setBounds(1017, 439, 67, 88);
					
					inv.offBoat(StoryTwo.getFarmer90(), inv.getCrossersOnLeftBank());					
				}
				}
				else if (!inv.isBoatOnTheLeftBank()) {

				 if( lblNewLabel_6.getBounds().contains(10, 422) ) {
						System.out.println("in");

					lblNewLabel_6.setBounds(171, 432, 67, 88);
					inv.onBoat(inv.getCrossersOnRightBank(), StoryTwo.getFarmer90());

					
				}
				
				
				
				else if( lblNewLabel_6.getBounds().contains(171, 432) ) {
					lblNewLabel_6.setBounds(10, 422, 67, 88);
					inv.offBoat(StoryTwo.getFarmer90(), inv.getCrossersOnRightBank());

					
				}
				}
			}
		});
		
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(974, 553, 110, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Farmer-40");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (inv.isBoatOnTheLeftBank()) {

				if (lblNewLabel_2.getBounds().contains(956, 432)) {
				lblNewLabel_2.setBounds(714, 439, 65, 78);
				inv.onBoat(inv.getCrossersOnLeftBank(), StoryTwo.getFarmer40());

				
				}
			
			
			else if (lblNewLabel_2.getBounds().contains(714, 439)) {
				
				lblNewLabel_2.setBounds(956, 432, 65, 78);
				
				inv.offBoat(StoryTwo.getFarmer40(), inv.getCrossersOnLeftBank());

				
			}
				}
				else if (!inv.isBoatOnTheLeftBank()) {

			  if( lblNewLabel_7.getBounds().contains(89, 419) ) {
				lblNewLabel_7.setBounds(254, 439, 65, 78);
				inv.onBoat(inv.getCrossersOnRightBank(), StoryTwo.getFarmer40());

				
			}
			
			
			
			else if( lblNewLabel_7.getBounds().contains(254, 439) ) {
				lblNewLabel_7.setBounds(89, 419, 65, 78);
				inv.offBoat(StoryTwo.getFarmer40(), inv.getCrossersOnRightBank());

				
			}
				
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(974, 599, 110, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Farmer-80");
		btnNewButton_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (inv.isBoatOnTheLeftBank()) {
				if (lblNewLabel_4.getBounds().contains(852, 399)) {
				lblNewLabel_4.setBounds(801, 439, 67, 88);
				inv.onBoat(inv.getCrossersOnLeftBank(), StoryTwo.getFarmer80());

				
				}
			
			
			else if (lblNewLabel_4.getBounds().contains(801, 439)) {
				
				lblNewLabel_4.setBounds(852, 399, 67, 88);
				inv.offBoat(StoryTwo.getFarmer80(), inv.getCrossersOnLeftBank());

				
			}
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {
			  if( lblNewLabel_9.getBounds().contains(194, 383) ) {
				lblNewLabel_9.setBounds(178, 439, 76, 88);
				inv.onBoat(inv.getCrossersOnRightBank(), StoryTwo.getFarmer80());

				
			}
			
			
			
			else if( lblNewLabel_9.getBounds().contains(178, 439) ) {
				lblNewLabel_9.setBounds(194, 383, 76, 88);
				inv.offBoat(StoryTwo.getFarmer80(), inv.getCrossersOnRightBank());

				
			}
				}
				
			}
		});
		btnNewButton_2.setBounds(852, 553, 110, 34);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Farmer-60");
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				if (inv.isBoatOnTheLeftBank()) {

				if (lblNewLabel_3.getBounds().contains(918, 419)) {
				lblNewLabel_3.setBounds(801, 449, 56, 71);
				inv.onBoat(inv.getCrossersOnLeftBank(), StoryTwo.getFarmer60());

				
				}
			
			
			else if (lblNewLabel_3.getBounds().contains(801, 449)) {
				
				lblNewLabel_3.setBounds(918, 419, 56, 71);
				inv.offBoat(StoryTwo.getFarmer60(), inv.getCrossersOnLeftBank());

				
			}
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {


			 if( lblNewLabel_8.getBounds().contains(140, 399) ) {
				lblNewLabel_8.setBounds(204, 439, 76, 88);
				inv.onBoat(inv.getCrossersOnRightBank(), StoryTwo.getFarmer60());

				
			}
			
			
			
			else if( lblNewLabel_8.getBounds().contains(204, 439) ) {
				lblNewLabel_8.setBounds(140, 399, 76, 88);
				inv.offBoat(StoryTwo.getFarmer60(), inv.getCrossersOnRightBank());

				
			}
				
				}
				
			}
		});
		btnNewButton_3.setBounds(852, 599, 110, 34);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Stories S=new Stories();
				S.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setBounds(10, 601, 97, 31);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_9 = new JButton("UNDO");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(save.getRaft()!=null) {
					
					inv.addRedo();
					inv.undo();
					
					saveR.setFarmer_40Data(lblNewLabel_2.getBounds(), lblNewLabel_7.getBounds(), lblNewLabel_2.isVisible(), lblNewLabel_7.isVisible());
					saveR.setFarmer_60Data(lblNewLabel_3.getBounds(), lblNewLabel_8.getBounds(), lblNewLabel_3.isVisible(), lblNewLabel_8.isVisible());
					saveR.setFarmer_80Data(lblNewLabel_4.getBounds(), lblNewLabel_9.getBounds(), lblNewLabel_4.isVisible(), lblNewLabel_9.isVisible());
					saveR.setFarmer_90Data(lblNewLabel_1.getBounds(), lblNewLabel_6.getBounds(), lblNewLabel_1.isVisible(), lblNewLabel_6.isVisible());
					saveR.setWolfData(lblNewLabel_5.getBounds(), lblNewLabel_10.getBounds(), lblNewLabel_5.isVisible(), lblNewLabel_10.isVisible());
					saveR.setRaftData(lblNewLabel_11.getBounds());
					
				lblNewLabel_2.setBounds(save.getFarmer_40_40Right());
				lblNewLabel_7.setBounds(save.getFarmer_40_40Left());
				lblNewLabel_2.setVisible(save.getFarmer_40RightBool());
				lblNewLabel_7.setVisible(save.getFarmer_40LeftBool());
				
				lblNewLabel_3.setBounds(save.getFarmer_60Right());
				lblNewLabel_8.setBounds(save.getFarmer_60Left());
				lblNewLabel_3.setVisible(save.getFarmer_60RightBool());
				lblNewLabel_8.setVisible(save.getFarmer_60LeftBool());
				
				lblNewLabel_4.setBounds(save.getFarmer_80Right());
				lblNewLabel_9.setBounds(save.getFarmer_80Left());
				lblNewLabel_4.setVisible(save.getFarmer_80RightBool());
				lblNewLabel_9.setVisible(save.getFarmer_80LeftBool());
				
				lblNewLabel_1.setBounds(save.getFarmer_90Right());
				lblNewLabel_6.setBounds(save.getFarmer_90Left());
				lblNewLabel_1.setVisible(save.getFarmer_90RightBool());
				lblNewLabel_6.setVisible(save.getFarmer_90LeftBool());
				
				lblNewLabel_5.setBounds(save.getWolfRigh());
				lblNewLabel_10.setBounds(save.getWolfLeft());
				lblNewLabel_5.setVisible(save.getWolfRightBool());
				lblNewLabel_10.setVisible(save.getWolfLeftBool());
				
				lblNewLabel_11.setBounds(save.getRaft());
				}
				
				
			}
		});
		btnNewButton_9.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_9.setForeground(Color.MAGENTA);
		btnNewButton_9.setBounds(182, 559, 97, 25);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("REDO");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inv.redo();
				
				if(saveR.getRaft()!=null) {
					
				lblNewLabel_2.setBounds(saveR.getFarmer_40_40Right());
				lblNewLabel_7.setBounds(saveR.getFarmer_40_40Left());
				lblNewLabel_2.setVisible(saveR.getFarmer_40RightBool());
				lblNewLabel_7.setVisible(saveR.getFarmer_40LeftBool());
				
				lblNewLabel_3.setBounds(saveR.getFarmer_60Right());
				lblNewLabel_8.setBounds(saveR.getFarmer_60Left());
				lblNewLabel_3.setVisible(saveR.getFarmer_60RightBool());
				lblNewLabel_8.setVisible(saveR.getFarmer_60LeftBool());
				
				lblNewLabel_4.setBounds(saveR.getFarmer_80Right());
				lblNewLabel_9.setBounds(saveR.getFarmer_80Left());
				lblNewLabel_4.setVisible(saveR.getFarmer_80RightBool());
				lblNewLabel_9.setVisible(saveR.getFarmer_80LeftBool());
				
				lblNewLabel_1.setBounds(saveR.getFarmer_90Right());
				lblNewLabel_6.setBounds(saveR.getFarmer_90Left());
				lblNewLabel_1.setVisible(saveR.getFarmer_90RightBool());
				lblNewLabel_6.setVisible(saveR.getFarmer_90LeftBool());
				
				lblNewLabel_5.setBounds(saveR.getWolfRigh());
				lblNewLabel_10.setBounds(saveR.getWolfLeft());
				lblNewLabel_5.setVisible(saveR.getWolfRightBool());
				lblNewLabel_10.setVisible(saveR.getWolfLeftBool());
				
				lblNewLabel_11.setBounds(saveR.getRaft());
				}
				
			}
		});
		btnNewButton_10.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_10.setForeground(Color.MAGENTA);
		btnNewButton_10.setBounds(288, 581, 97, 25);
		contentPane.add(btnNewButton_10);
	
    }
}

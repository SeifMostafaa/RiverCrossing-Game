package GUI;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.ImageView;
import org.ietf.jgss.GSSContext;

import Characters.Farmer;
import Controller.Controller;
import Saving.data;
import Strtegy.StoryOne;
import command.Animal;
import command.Farmers;
import command.Invoker;
import command.Plant;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
public class playFrame extends JFrame {

	private JPanel contentPane;
	private static playFrame frame = new playFrame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new playFrame();
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
	protected static JLabel lblNewLabel_6;
	protected static JLabel lblNewLabel_1;
	protected static JLabel lblNewLabel_2; 
	protected static JLabel lblNewLabel_4;
	protected static JLabel lblNewLabel_5;
	protected static JLabel lblNewLabel_8;
	protected static JLabel lblNewLabel_9;
	protected static JLabel lblNewLabel_10;
	protected static JLabel lblNewLabel;
	public playFrame() {
		
		int x =(int )(Math.random()*2);
		Invoker inv =  Invoker.newInv();
		inv.newGame(new StoryOne());
		SaveS1 save=new SaveS1();
		saveRedoS1 saveR= new saveRedoS1();
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 753, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
			.addGap(0, 480, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1062, 646);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(playFrame.class.getResource("/farmerRight.png")));
		lblNewLabel_1.setBounds(916, 384, 97, 90);
		contentPane.add(lblNewLabel_1);
		
		 lblNewLabel_2 = new JLabel("");
		if(x==0) {
		lblNewLabel_2.setIcon(new ImageIcon(playFrame.class.getResource("/WolfRight.png")));
		}
		else {
			lblNewLabel_2.setIcon(new ImageIcon(playFrame.class.getResource("/Black_Right.png")));
		}
		lblNewLabel_2.setBounds(869, 384, 56, 62);
		contentPane.add(lblNewLabel_2);
		
		 lblNewLabel_4 = new JLabel("");
		if(x==0) {
		lblNewLabel_4.setIcon(new ImageIcon(playFrame.class.getResource("/goatRight.png")));
		}
		else
		{
			lblNewLabel_4.setIcon(new ImageIcon(playFrame.class.getResource("/goat1R.png")));
		}
		lblNewLabel_4.setBounds(798, 360, 75, 74);
		contentPane.add(lblNewLabel_4);
		
	     lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(playFrame.class.getResource("/carrots.png")));
		lblNewLabel_6.setBounds(720, 372, 56, 37);
		contentPane.add(lblNewLabel_6);
		 lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(playFrame.class.getResource("/farmerLeft.png")));
		lblNewLabel_5.setBounds(66, 356, 97, 90);
		contentPane.add(lblNewLabel_5);
		 lblNewLabel_8 = new JLabel("");
		if(x==0) {
		lblNewLabel_8.setIcon(new ImageIcon(playFrame.class.getResource("/wolfLeft.png")));
		}
		else {
			lblNewLabel_8.setIcon(new ImageIcon(playFrame.class.getResource("/Black_Left.png")));
		}
		lblNewLabel_8.setBounds(140, 372, 56, 62);
		contentPane.add(lblNewLabel_8);
		 lblNewLabel_9 = new JLabel("");
		if(x==0) {
		lblNewLabel_9.setIcon(new ImageIcon(playFrame.class.getResource("/goatLeft.png")));
		}
		else {
			lblNewLabel_9.setIcon(new ImageIcon(playFrame.class.getResource("/goat1L.png")));
		}
		lblNewLabel_9.setBounds(208, 360, 75, 74);
		contentPane.add(lblNewLabel_9);
		
		 lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(playFrame.class.getResource("/carrots.png")));
		lblNewLabel_10.setBounds(268, 372, 56, 37);
		contentPane.add(lblNewLabel_10);
		 lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(playFrame.class.getResource("/Raft.png")));
		lblNewLabel.setBounds(660, 426, 170, 68);
		contentPane.add(lblNewLabel);
		JButton btnNewButton = new JButton("Exit");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_9.setVisible(false);
		lblNewLabel_10.setVisible(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);;
				Stories S=new Stories();
				S.setVisible(true);
		  }
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(12, 545, 97, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				frame =new playFrame();
				frame.setVisible(true);
				inv.resetGame();
			}
		});
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(121, 545, 97, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("Move");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				
				
				
				if ( (inv.getCrossersOnLeftBank().contains(StoryOne.getWolf()) && inv.getCrossersOnLeftBank().contains(StoryOne.getGoat()) && inv.getCrossersOnLeftBank().size() == 2 ) ||  (inv.getCrossersOnRightBank().contains(StoryOne.getWolf()) && inv.getCrossersOnRightBank().contains(StoryOne.getGoat()) && inv.getCrossersOnRightBank().size() == 2)  ) {	
					new EA2().setVisible(true);
				}
				
				
				else if ( (inv.getCrossersOnLeftBank().contains(StoryOne.getPlant()) && inv.getCrossersOnLeftBank().contains(StoryOne.getGoat()) && inv.getCrossersOnLeftBank().size() == 2 ) ||  (inv.getCrossersOnRightBank().contains(StoryOne.getPlant()) && inv.getCrossersOnRightBank().contains(StoryOne.getGoat()) && inv.getCrossersOnRightBank().size() == 2)  ) {
						new EA().setVisible(true);
				}
						
						
				
				
			else {
				if(inv.isBoatOnTheLeftBank()) {

					if (inv.canMove(inv.getCrossersOnBoat(), inv.isBoatOnTheLeftBank())) {
						
						save.setFarmerData(lblNewLabel_1.getBounds(), lblNewLabel_5.getBounds(), lblNewLabel_1.isVisible(), lblNewLabel_5.isVisible());
						save.setGoatData(lblNewLabel_4.getBounds(), lblNewLabel_9.getBounds(), lblNewLabel_4.isVisible(), lblNewLabel_9.isVisible());
						save.setWolfData(lblNewLabel_2.getBounds() ,lblNewLabel_8.getBounds(), lblNewLabel_2.isVisible(), lblNewLabel_8.isVisible());
						save.setRaftData(lblNewLabel.getBounds());
						save.setPlantData(lblNewLabel_6.getBounds(),lblNewLabel_10.getBounds(), lblNewLabel_6.isVisible(), lblNewLabel_10.isVisible());
						
						
				Timer time=new Timer();
				TimerTask timer=new TimerTask() {
					
					@Override
					public void run() {
				    	lblNewLabel.setBounds(550, 426, 170, 68); 		
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer())) 
							lblNewLabel_1.setBounds(550, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
							lblNewLabel_2.setBounds(680, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
							lblNewLabel_4.setBounds(680, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
							lblNewLabel_6.setBounds(680, 427, 56, 37);

					}
				};
				time.schedule(timer,100);
				 timer=new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(500, 426, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
							lblNewLabel_1.setBounds(500, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
							lblNewLabel_2.setBounds(586, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
							lblNewLabel_4.setBounds(586, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
							lblNewLabel_6.setBounds(586, 427, 56, 37);

					}

				};
				time.schedule(timer,200);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(440, 426, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
						lblNewLabel_1.setBounds(440, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
						lblNewLabel_2.setBounds(500, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
						lblNewLabel_4.setBounds(500, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
						lblNewLabel_6.setBounds(500, 427, 56, 37);

					}
				};
				time.schedule(timer, 300);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(400, 426, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
							lblNewLabel_1.setBounds(400, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
							lblNewLabel_2.setBounds(486, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
							lblNewLabel_4.setBounds(486, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
							lblNewLabel_6.setBounds(486, 427, 56, 37);
					}
				};
				time.schedule(timer, 400);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(300, 426, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
						lblNewLabel_1.setBounds(300, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
						lblNewLabel_2.setBounds(386, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
						lblNewLabel_4.setBounds(386, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
						lblNewLabel_6.setBounds(386, 427, 56, 37);
					}
				};
				time.schedule(timer, 500);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(200, 426, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
						lblNewLabel_1.setBounds(200, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
						lblNewLabel_2.setBounds(286, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
						lblNewLabel_4.setBounds(286, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
						lblNewLabel_6.setBounds(286, 427, 56, 37);
					}
				};
				time.schedule(timer, 600);
				timer =new TimerTask() {					
					@Override
					public void run() {


						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer())) {
							lblNewLabel_1.setVisible(false);
							lblNewLabel_5.setBounds(66, 356, 97, 90);
							lblNewLabel_5.setVisible(true);
					
						}
							
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf())) {
							lblNewLabel_2.setVisible(false);;
							lblNewLabel_8.setBounds(140, 372, 56, 62);
							lblNewLabel_8.setVisible(true);;
						}
							
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat())) {
							lblNewLabel_4.setVisible(false);;
							lblNewLabel_9.setBounds(208, 360, 75, 74);
							lblNewLabel_9.setVisible(true);
							
						}
							
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant())) {
							lblNewLabel_6.setVisible(false);
							lblNewLabel_10.setBounds(268, 372, 56, 37);
							lblNewLabel_10.setVisible(true);
							
						}
						inv.addUndo();
						inv.doMove(inv.getCrossersOnBoat(), inv.isBoatOnTheLeftBank());
						if (inv.getCrossersOnBoat().size() == 0 && inv.getCrossersOnLeftBank().size() == 0 && inv.getCrossersOnRightBank().size() == 4)
							new GameOverS1().setVisible(true);
					}
				};
				time.schedule(timer, 700);
				}
				}
				else if (!inv.isBoatOnTheLeftBank()) {
					if (inv.canMove(inv.getCrossersOnBoat(), inv.isBoatOnTheLeftBank())) {
						save.setFarmerData(lblNewLabel_1.getBounds(), lblNewLabel_5.getBounds(), lblNewLabel_1.isVisible(), lblNewLabel_5.isVisible());
						save.setGoatData(lblNewLabel_4.getBounds(), lblNewLabel_9.getBounds(), lblNewLabel_4.isVisible(), lblNewLabel_9.isVisible());
						save.setWolfData(lblNewLabel_2.getBounds() ,lblNewLabel_8.getBounds(), lblNewLabel_2.isVisible(), lblNewLabel_8.isVisible());
						save.setRaftData(lblNewLabel.getBounds());
						save.setPlantData(lblNewLabel_6.getBounds(),lblNewLabel_10.getBounds(), lblNewLabel_6.isVisible(), lblNewLabel_10.isVisible());
					
					
				Timer time=new Timer();
				TimerTask timer=new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(200, 426, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
						lblNewLabel_5.setBounds(200, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
						lblNewLabel_8.setBounds(286, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
						lblNewLabel_9.setBounds(286, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
						lblNewLabel_10.setBounds(286, 427, 56, 37);
					}
				};
				time.schedule(timer,100);
				 timer=new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(300, 426, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
						lblNewLabel_5.setBounds(300, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
						lblNewLabel_8.setBounds(386, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
						lblNewLabel_9.setBounds(386, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
						lblNewLabel_10.setBounds(386, 427, 56, 37);
					}

				};
				time.schedule(timer,200);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(400, 426, 170, 68);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
							lblNewLabel_5.setBounds(400, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
							lblNewLabel_8.setBounds(486, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
							lblNewLabel_9.setBounds(486, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
							lblNewLabel_10.setBounds(486, 427, 56, 37);
					}
				};
				time.schedule(timer, 300);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(440, 426, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
						lblNewLabel_5.setBounds(440, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
						lblNewLabel_8.setBounds(500, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
						lblNewLabel_9.setBounds(500, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
						lblNewLabel_10.setBounds(500, 427, 56, 37);

					}
				};
				time.schedule(timer, 400);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(500, 426, 170, 68);
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
							lblNewLabel_5.setBounds(500, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
							lblNewLabel_8.setBounds(586, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
							lblNewLabel_9.setBounds(586, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
							lblNewLabel_10.setBounds(586, 427, 56, 37);

					}
				};
				time.schedule(timer, 500);
				timer =new TimerTask() {
					
					@Override
					public void run() {
				    	lblNewLabel.setBounds(660, 426, 170, 68);  							 		
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer()))
							lblNewLabel_5.setBounds(550, 380, 97, 90);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf()))
							lblNewLabel_8.setBounds(680, 405, 56, 62);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat()))
							lblNewLabel_9.setBounds(680, 400, 75, 74);
						
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant()))
							lblNewLabel_10.setBounds(680, 427, 56, 37);
					}
				};
				time.schedule(timer, 600);
				timer =new TimerTask() {
					
					@Override
					public void run() {
									
						if (inv.getCrossersOnBoat().contains(StoryOne.getFarmer())) {
							lblNewLabel_5.setVisible(false);
							lblNewLabel_1.setBounds(916, 384, 97, 90);
							lblNewLabel_1.setVisible(true);
							
						}
							
						if (inv.getCrossersOnBoat().contains(StoryOne.getWolf())) {
							lblNewLabel_8.setVisible(false);
							lblNewLabel_2.setBounds(869, 384, 56, 62);
							lblNewLabel_2.setVisible(true);
						}
							
						if (inv.getCrossersOnBoat().contains(StoryOne.getGoat())) {
							lblNewLabel_9.setVisible(false);
							lblNewLabel_4.setBounds(798, 360, 75, 74);
							lblNewLabel_4.setVisible(true);
							
						}
							
						if (inv.getCrossersOnBoat().contains(StoryOne.getPlant())) {
							lblNewLabel_10.setVisible(false);
							lblNewLabel_6.setBounds(720, 372, 56, 37);
							lblNewLabel_6.setVisible(true);
							
						}
						
						inv.addUndo();
						inv.doMove(inv.getCrossersOnBoat(), inv.isBoatOnTheLeftBank());
						if (inv.getCrossersOnBoat().size() == 0 && inv.getCrossersOnLeftBank().size() == 0 && inv.getCrossersOnRightBank().size() == 4) {
							new GameOverS1().setVisible(true);
						}
					}
				};
				time.schedule(timer, 700);
				}
						
					
			}

				
				
			}
			}
		});
		btnNewButton_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_6.setForeground(Color.BLUE);
		btnNewButton_6.setBounds(295, 545, 97, 37);
		contentPane.add(btnNewButton_6);
		
		
		int farmerFlag;
		JButton btnNewButton_2 = new JButton("Farmer");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				int i;				
				if (inv.isBoatOnTheLeftBank()) {
					if (lblNewLabel_1.getBounds().contains(916, 384)) {
					lblNewLabel_1.setBounds(670, 380, 97, 90);
					inv.onBoat(inv.getCrossersOnLeftBank(), StoryOne.getFarmer());

					
					}
				
				
				else if (lblNewLabel_1.getBounds().contains(670, 380)) {
					
					lblNewLabel_1.setBounds(916, 384, 97, 90);
					
					inv.offBoat(StoryOne.getFarmer(), inv.getCrossersOnLeftBank());

					
				}
					
				}
				
				else if ( !inv.isBoatOnTheLeftBank()) {
					
				 if( lblNewLabel_5.getBounds().contains(66, 356) ) {
					lblNewLabel_5.setBounds(200, 380, 97, 90);
					inv.onBoat(inv.getCrossersOnRightBank(), StoryOne.getFarmer());

					
				}
				
				
				
				else if( lblNewLabel_5.getBounds().contains(200, 380) ) {
					lblNewLabel_5.setBounds(66, 356, 97, 90);
					inv.offBoat(StoryOne.getFarmer(), inv.getCrossersOnRightBank());

					
				}
					
				
				}
			}
		
				
			
		});
		btnNewButton_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBounds(916, 545, 116, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Wolf");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if (inv.isBoatOnTheLeftBank()) {

				
				if ( lblNewLabel_2.getBounds().contains(869, 384) ) {
					lblNewLabel_2.setBounds(760, 405, 56, 62);
					inv.onBoat(inv.getCrossersOnLeftBank(),StoryOne.getWolf());	
				}
				
				else if (lblNewLabel_2.getBounds().contains(760, 405)) {
					
					lblNewLabel_2.setBounds(869, 384, 56, 62);
					
					inv.offBoat(StoryOne.getWolf(), inv.getCrossersOnLeftBank());

					
				}
				
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {

				
				 if( lblNewLabel_8.getBounds().contains(140, 372) ) {
					lblNewLabel_8.setBounds(175, 412, 97, 90);
					inv.onBoat(inv.getCrossersOnRightBank(), StoryOne.getWolf());
					
				}
				
				
				
				else if( lblNewLabel_8.getBounds().contains(175, 412) ) {
					lblNewLabel_8.setBounds(140, 372, 97, 90);
					inv.offBoat(StoryOne.getWolf(), inv.getCrossersOnRightBank());
					
				}
					
				
				}
				
			}
		});
		btnNewButton_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBounds(747, 545, 116, 37);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Goat");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				if (inv.isBoatOnTheLeftBank()) {

				if ( lblNewLabel_4.getBounds().contains(798, 360) ) {
					lblNewLabel_4.setBounds(752, 400, 75, 74);
					inv.onBoat(inv.getCrossersOnLeftBank(), StoryOne.getGoat());
				}
				
				else if (lblNewLabel_4.getBounds().contains(755, 400)) {
					
					lblNewLabel_4.setBounds(798, 360, 75, 74);
					inv.offBoat(StoryOne.getGoat(), inv.getCrossersOnLeftBank());
					
				}
				}
					
				else if (!inv.isBoatOnTheLeftBank()) {

				if( lblNewLabel_9.getBounds().contains(208, 360) ) {
					lblNewLabel_9.setBounds(208, 401, 97, 90);
					inv.onBoat(inv.getCrossersOnRightBank(), StoryOne.getGoat());

				}
				
				
				
				else if( lblNewLabel_9.getBounds().contains(208, 401) ) {
					lblNewLabel_9.setBounds(208, 360, 97, 90);
					inv.offBoat(StoryOne.getGoat(), inv.getCrossersOnRightBank());
					
				}
					
				}
				
			}
		});
		btnNewButton_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.setBounds(593, 545, 116, 37);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_8 = new JButton("Save");
		btnNewButton_8.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_8.setForeground(Color.BLUE);
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			save.setFarmerData(lblNewLabel_1.getBounds(), lblNewLabel_5.getBounds(), lblNewLabel_1.isVisible(), lblNewLabel_5.isVisible());
			save.setGoatData(lblNewLabel_4.getBounds(), lblNewLabel_9.getBounds(), lblNewLabel_4.isVisible(), lblNewLabel_9.isVisible());
			save.setWolfData(lblNewLabel_2.getBounds() ,lblNewLabel_8.getBounds(), lblNewLabel_2.isVisible(), lblNewLabel_8.isVisible());
			save.setRaftData(lblNewLabel.getBounds());
			save.setPlantData(lblNewLabel_6.getBounds(),lblNewLabel_10.getBounds(), lblNewLabel_6.isVisible(), lblNewLabel_10.isVisible());
			data save = new data();
			save.save(StoryOne.getFarmer(), StoryOne.getWolf(), StoryOne.getGoat(), StoryOne.getPlant(), inv.getCrossersOnLeftBank(), inv.getCrossersOnRightBank(), inv.getCrossersOnBoat(), inv);
				
			}
		});
		btnNewButton_8.setBounds(10, 498, 97, 37);
		contentPane.add(btnNewButton_8);
		

		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(playFrame.class.getResource("/River_1.png")));
		lblNewLabel_3.setBounds(0, 0, 1044, 484);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_4 = new JButton("Plant");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (inv.isBoatOnTheLeftBank()) {

				if ( lblNewLabel_6.getBounds().contains(720, 372) ) {
					lblNewLabel_6.setBounds(747,426, 56, 37);
					inv.onBoat(inv.getCrossersOnLeftBank(), StoryOne.getPlant());
				}
				
				else if (lblNewLabel_6.getBounds().contains(747,426)) {
					
					lblNewLabel_6.setBounds(720, 372, 56, 37);
					inv.offBoat(StoryOne.getPlant(), inv.getCrossersOnLeftBank());
					
				}
				
				}
				
				else if (!inv.isBoatOnTheLeftBank()) {

				
				
				if( lblNewLabel_10.getBounds().contains(268, 372) ) {
					lblNewLabel_10.setBounds(199, 402, 97, 90);
					inv.onBoat(inv.getCrossersOnRightBank(), StoryOne.getPlant());

					
				}
				
				
				
				else if( lblNewLabel_10.getBounds().contains(199, 402) ) {
					lblNewLabel_10.setBounds(268, 372, 56, 37);
					inv.offBoat(StoryOne.getPlant(), inv.getCrossersOnRightBank());
	
					
				}
				}
					
				
				
				
			}
		});
		btnNewButton_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setBounds(443, 545, 97, 37);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_7 = new JButton("UNDO");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				inv.addRedo();
				inv.undo();
				
				System.out.println(inv.getCrossersOnLeftBank());
				System.out.println(inv.getCrossersOnRightBank());
				System.out.println(inv.getCrossersOnBoat());
				
				if(save.getRaft()!=null) {
					
					saveR.setFarmerData(lblNewLabel_1.getBounds(), lblNewLabel_5.getBounds(), lblNewLabel_1.isVisible(), lblNewLabel_5.isVisible());
					saveR.setGoatData(lblNewLabel_4.getBounds(), lblNewLabel_9.getBounds(), lblNewLabel_4.isVisible(), lblNewLabel_9.isVisible());
					saveR.setWolfData(lblNewLabel_2.getBounds() ,lblNewLabel_8.getBounds(), lblNewLabel_2.isVisible(), lblNewLabel_8.isVisible());
					saveR.setRaftData(lblNewLabel.getBounds());
					saveR.setPlantData(lblNewLabel_6.getBounds(),lblNewLabel_10.getBounds(), lblNewLabel_6.isVisible(), lblNewLabel_10.isVisible());
					
				lblNewLabel_1.setBounds(save.getFarmerRight());
				lblNewLabel_1.setVisible(save.getFarmerRightBool());
				lblNewLabel_5.setBounds(save.getFarmerLeft());
				lblNewLabel_5.setVisible(save.getFarmerLeftBool());
				
				lblNewLabel_4.setBounds(save.getGoatRight());
				lblNewLabel_9.setBounds(save.getGoatLeft());
				lblNewLabel_4.setVisible(save.getGoatRightBool());
				lblNewLabel_9.setVisible(save.getGoatLeftBool());
				
				lblNewLabel.setBounds(save.getRaft());
				
				lblNewLabel_2.setBounds(save.getWolfRigh());
				lblNewLabel_2.setVisible(save.getWolfRightBool());
				lblNewLabel_8.setBounds(save.getWolfLeft());
				lblNewLabel_8.setVisible(save.getWolfLeftBool());
				
				lblNewLabel_6.setBounds(save.getPlantRight());
				lblNewLabel_6.setVisible(save.getPlantRightBool());
				lblNewLabel_10.setBounds(save.gePlantLeft());
				lblNewLabel_10.setVisible(save.getPlantLeftBool());
				
				}
			}
		});
		btnNewButton_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_7.setForeground(Color.BLUE);
		btnNewButton_7.setBounds(139, 498, 97, 34);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("REDO");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				inv.redo();
				if(saveR.getRaft()!=null) {
					
				lblNewLabel_1.setBounds(saveR.getFarmerRight());
				lblNewLabel_1.setVisible(saveR.getFarmerRightBool());
				lblNewLabel_5.setBounds(saveR.getFarmerLeft());
				lblNewLabel_5.setVisible(saveR.getFarmerLeftBool());
				
				lblNewLabel_4.setBounds(saveR.getGoatRight());
				lblNewLabel_9.setBounds(saveR.getGoatLeft());
				lblNewLabel_4.setVisible(saveR.getGoatRightBool());
				lblNewLabel_9.setVisible(saveR.getGoatLeftBool());
				
				lblNewLabel.setBounds(saveR.getRaft());
				
				lblNewLabel_2.setBounds(saveR.getWolfRigh());
				lblNewLabel_2.setVisible(saveR.getWolfRightBool());
				lblNewLabel_8.setBounds(saveR.getWolfLeft());
				lblNewLabel_8.setVisible(saveR.getWolfLeftBool());
				
				lblNewLabel_6.setBounds(saveR.getPlantRight());
				lblNewLabel_6.setVisible(saveR.getPlantRightBool());
				lblNewLabel_10.setBounds(saveR.gePlantLeft());
				lblNewLabel_10.setVisible(saveR.getPlantLeftBool());
				
				}

			}
		});
		btnNewButton_9.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_9.setForeground(Color.BLUE);
		btnNewButton_9.setBounds(248, 498, 97, 34);
		contentPane.add(btnNewButton_9);
	}
}

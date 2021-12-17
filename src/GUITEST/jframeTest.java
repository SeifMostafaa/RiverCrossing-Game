package GUITEST;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.ImageView;

import org.ietf.jgss.GSSContext;

import Controller.Controller;
import Strtegy.StoryOne;
import command.Animal;
import command.Farmers;
import command.Invoker;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
public class jframeTest extends JFrame {
	

	private JPanel contentPane;
	boolean dos=true;
	private Controller controller=new Controller();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframeTest frame = new jframeTest();
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
	public jframeTest() {
		Invoker inv = new Invoker();
		inv.newGame(new StoryOne());

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
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(jframeTest.class.getResource("/farmerRight.png")));
		lblNewLabel_1.setBounds(916, 384, 97, 90);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(jframeTest.class.getResource("/WolfRight.png")));
		lblNewLabel_2.setBounds(848, 384, 56, 62);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(jframeTest.class.getResource("/goatRight.png")));
		lblNewLabel_4.setBounds(788, 372, 75, 74);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(jframeTest.class.getResource("/Raft.png")));
		lblNewLabel.setBounds(660, 426, 170, 68);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(jframeTest.class.getResource("/carrots.png")));
		lblNewLabel_6.setBounds(720, 372, 56, 37);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(717, 340, 75, 74);
		contentPane.add(lblNewLabel_7);
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(jframeTest.class.getResource("/farmerLeft.png")));
		lblNewLabel_5.setBounds(53, 360, 97, 90);
		contentPane.add(lblNewLabel_5);
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(jframeTest.class.getResource("/wolfLeft.png")));
		lblNewLabel_8.setBounds(140, 372, 56, 62);
		contentPane.add(lblNewLabel_8);
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(jframeTest.class.getResource("/goatLeft.png")));
		lblNewLabel_9.setBounds(208, 360, 75, 74);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(jframeTest.class.getResource("/carrots.png")));
		lblNewLabel_10.setBounds(268, 372, 56, 37);
		contentPane.add(lblNewLabel_10);
		JButton btnNewButton = new JButton("Exit");
		lblNewLabel_5.hide();
		lblNewLabel_8.hide();
		lblNewLabel_9.hide();
		lblNewLabel_10.hide();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(12, 545, 97, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.resetGame();
			}
		});
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(121, 545, 97, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("Move");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
				if(inv.canMove(inv.getCrossersOnBoat(), true)) {
				
					inv.doMove(inv.getCrossersOnBoat(), inv.isBoatOnTheLeftBank() );
					Timer time=new Timer();
					TimerTask timer=new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(550, 426, 170, 68);
						lblNewLabel_1.setBounds(550, 380, 97, 90);
						lblNewLabel_2.setBounds(570, 380, 97, 90);

					}
				};
				time.schedule(timer,100);
				 timer=new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(500, 426, 170, 68);
						lblNewLabel_1.setBounds(500, 380, 97, 90);
						lblNewLabel_2.setBounds(520, 380, 97, 90);
					}

				};
				time.schedule(timer,200);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(440, 426, 170, 68);
						lblNewLabel_1.setBounds(440, 380, 97, 90);
						lblNewLabel_2.setBounds(460, 380, 97, 90);
					}
				};
				time.schedule(timer, 300);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(400, 426, 170, 68);
						lblNewLabel_1.setBounds(400, 380, 97, 90);
						lblNewLabel_2.setBounds(420, 380, 97, 90);
					}
				};
				time.schedule(timer, 400);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(300, 426, 170, 68);
						lblNewLabel_1.setBounds(300, 380, 97, 90);
						lblNewLabel_2.setBounds(320, 380, 97, 90);
					}
				};
				time.schedule(timer, 500);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(200, 426, 170, 68);
						lblNewLabel_1.setBounds(200, 380, 97, 90);
						lblNewLabel_2.setBounds(220, 380, 97, 90);
					}
				};
				time.schedule(timer, 600);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_5.setBounds(53, 360, 97, 90);
						lblNewLabel_5.show();
						lblNewLabel_8.setBounds(140, 372, 56, 62);
						lblNewLabel_8.show();
						
						lblNewLabel_1.hide();
						lblNewLabel_2.hide();

						dos=false;
						
					}
				};
				time.schedule(timer, 700);
			}
			else if (inv.canMove(inv.getCrossersOnBoat(), false)) {
				
				inv.doMove(inv.getCrossersOnBoat(), inv.isBoatOnTheLeftBank());
				Timer time=new Timer();
				TimerTask timer=new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(200, 426, 170, 68);
						lblNewLabel_5.setBounds(200, 380, 97, 90);

					}
				};
				time.schedule(timer,100);
				 timer=new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(300, 426, 170, 68);
						lblNewLabel_5.setBounds(300, 380, 97, 90);
					}

				};
				time.schedule(timer,200);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(400, 426, 170, 68);
						lblNewLabel_5.setBounds(400, 380, 97, 90);
					}
				};
				time.schedule(timer, 300);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(440, 426, 170, 68);
						lblNewLabel_5.setBounds(440, 380, 97, 90);
					}
				};
				time.schedule(timer, 400);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(500, 426, 170, 68);
						lblNewLabel_5.setBounds(500, 380, 97, 90);
					}
				};
				time.schedule(timer, 500);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel.setBounds(660, 426, 170, 68);
						lblNewLabel_5.setBounds(660, 380, 97, 90);
					}
				};
				time.schedule(timer, 600);
				timer =new TimerTask() {
					
					@Override
					public void run() {
						lblNewLabel_5.hide();
						lblNewLabel_1.setBounds(916, 384, 97, 90);
						lblNewLabel_1.show();

						
						dos=true;
					}
				};
				time.schedule(timer, 700);
			}
			}
		});
		btnNewButton_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_6.setForeground(Color.BLUE);
		btnNewButton_6.setBounds(295, 545, 97, 37);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_2 = new JButton("Farmer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//boolean flag = false;
				Farmers farmer = new Farmers();
				
				//if (!flag) {
					inv.onBoat(inv.getCrossersOnLeftBank(), farmer);
					lblNewLabel_1.setBounds(670, 380, 97, 90);
					//flag = true;

				//}
				/*else {
					inv.getCrossersOnBoat().remove(farmer);
					lblNewLabel_1.setBounds(916, 384, 97, 90);
					flag = false;
				}*/
				
				//lblNewLabel_5.setBounds(53, 360, 97, 90);
				/*if (dos)
					lblNewLabel_1.setBounds(670, 380, 97, 90);
				else
					lblNewLabel_5.setBounds(250, 320, 97, 90);*/
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBounds(897, 545, 116, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Wolf");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Animal wolf = new Animal("wolf");

				inv.onBoat(inv.getCrossersOnLeftBank(), wolf);
				lblNewLabel_2.setBounds(670, 380, 97, 90);
			}
		});
		btnNewButton_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBounds(720, 545, 116, 37);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Goat");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Animal goat = new Animal("wolf");

				inv.onBoat(inv.getCrossersOnLeftBank(), goat);
				
				
				
			}
		});
		btnNewButton_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.setBounds(540, 545, 116, 37);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_8 = new JButton("Save");
		btnNewButton_8.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		btnNewButton_8.setForeground(Color.BLUE);
		btnNewButton_8.setBounds(10, 498, 97, 37);
		contentPane.add(btnNewButton_8);
		

		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(jframeTest.class.getResource("/River_1.png")));
		lblNewLabel_3.setBounds(0, 0, 1044, 484);
		contentPane.add(lblNewLabel_3);
		
	}
}

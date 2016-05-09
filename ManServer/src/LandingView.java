import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;


public class LandingView extends JFrame {

	private JPanel contentPane;
	private JRadioButton SaladMan;
	private ButtonGroup RadioButtons;
	private LandingController landingController;
	public ManServer manServer;

	
	public LandingView() {
		
	}
	
	public void setLandingController(LandingController landingController){
		this.landingController = landingController;
	}
	
	/**
	 * Create the frame.
	 */
	public void openView(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SaladMan = new JRadioButton("Salad Man");
		SaladMan.setBounds(34, 44, 109, 23);
		SaladMan.setSelected(true);
		contentPane.add(SaladMan);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(341, 227, 83, 23);
		btnStart.setActionCommand("Start");
		contentPane.add(btnStart);
		
		
		JLabel lblSelectServer = new JLabel("Select Server:");
		lblSelectServer.setBounds(21, 11, 119, 36);
		contentPane.add(lblSelectServer);
		
		
		
		btnStart.addActionListener(new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        landingController.startButtonPress();
		    }
		});
	}
}
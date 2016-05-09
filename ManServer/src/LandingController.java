import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.nio.*;

import javax.swing.JButton;

public class LandingController {
	private LandingView landingView;
	private LandingModel landingModel;
	
	public LandingController(LandingView landingView){
		this.landingView = landingView;
		landingView.setVisible(true);
		landingView.openView();
	}
	
	public void setLandingModel(LandingModel landingModel){
		this.landingModel = landingModel;
	}
	
	public void startButtonPress(){
		System.out.println("start");
		landingModel.loadServer(0);
		
	}
	
	public void migrateViewToConsole(){
		System.out.println("Migrating to console view");
	}
}

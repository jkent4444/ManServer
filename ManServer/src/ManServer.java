import java.awt.EventQueue;
import java.nio.*;
class ManServer {
	public static void main(String[] args){
		//start up the visual and select which server type you want
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Model handles data storage stores the controller
					
					//Controller handles all the events stores model and view
					
					//View holds the controller
					LandingView frame = new LandingView();
					LandingController controller = new LandingController(frame);
					LandingModel model = new LandingModel(controller);
					controller.setLandingModel(model);
					frame.setLandingController(controller);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}

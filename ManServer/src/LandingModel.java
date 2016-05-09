
public class LandingModel {
	private LandingController landingController;
	
	public LandingModel(LandingController landingController){
		this.landingController = landingController;
	}
	
	public void loadServer(int serverNum){
		System.out.println(serverNum);
		landingController.migrateViewToConsole();
	}
	
	
}

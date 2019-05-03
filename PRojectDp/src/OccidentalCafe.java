
public class OccidentalCafe implements Cafe {

	
	public boolean grantCafeAccess(int  userType) {
		if(userType==1) {
			System.out.println("now you can send message to the city");
			return true;
		}
		else {
			System.out.println("As you are not a Software Engineer,You have no permission to access the cafe");
			return false;
		}
	}

	@Override
	public void sendMessage(AbstractIslandFactory abstractIslandFactory, String message) {
		// TODO Auto-generated method stub
		
		Messenger.showMessage(abstractIslandFactory,message);
	}

}

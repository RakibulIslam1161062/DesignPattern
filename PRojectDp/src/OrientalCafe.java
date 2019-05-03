
public class OrientalCafe implements Cafe {

	
	
	public boolean grantCafeAccess(int  userType) {
		if(userType==1) return true;
		else return false;
	}

	@Override
	public void sendMessage(AbstractIslandFactory abstractIslandFactory, String message) {
		// TODO Auto-generated method stub
		 Messenger.showMessage(abstractIslandFactory,message);
	}

}


public class CityCafe implements Cafe {

	@Override
	public void sendMessage(AbstractIslandFactory abstractIslandFactory, String message) {
		// TODO Auto-generated method stub
		Messenger.showMessage(abstractIslandFactory,message);
	}

	@Override
	public boolean grantCafeAccess(int userType) {
		// TODO Auto-generated method stub
		return true;
	}

}

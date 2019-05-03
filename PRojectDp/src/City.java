
public class City extends AbstractIslandFactory {

	@Override
	Tree getTree(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void getHut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String getIslandName() {
		// TODO Auto-generated method stub
		return "City:  ";
	}

	@Override
	Cafe enterCafe() {
		// TODO Auto-generated method stub
		return new CityCafe();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Reservoir getReservoirInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}

package leader;

public class LeaderMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leader hong = new Leader("ȫ�浿","30130",true);
		Leader kim = new Leader("��κ�","20100",false);
		
		hong.isLeader();
		kim.isLeader();

	}

}

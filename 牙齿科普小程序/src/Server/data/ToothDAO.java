package Server.data;

public class ToothDAO {
	private FileOperation fp;
	
	public ToothDAO(){
		fp = new FileOperation("1.txt");
	}
	
	public String getIntro(String code) {
		return fp.getIntro(code);
	}

}

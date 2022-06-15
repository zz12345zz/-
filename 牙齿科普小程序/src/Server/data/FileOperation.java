package Server.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import Server.data.DataAble;

public class FileOperation implements DataAble{
	private String name;
	
	public FileOperation(String name) {
		this.name=name;
	}
	
	public String getIntro(String code) {
		String Intro = "None";
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(name));
			String tempLine = "";
			while((tempLine = br.readLine())!=null) {
				if(tempLine.trim().length()>0) {
					String [] term = tempLine.split(",");
					if(term.length==2) {
						if(code.equals(term[0].trim())) {
							Intro=term[1].trim();
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Intro;
					
	}

}

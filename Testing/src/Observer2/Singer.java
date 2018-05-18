package Observer2;

import java.util.ArrayList;
import java.util.Random;

/* Singer Class */
public class Singer implements Talent {
	private ArrayList<Fan> fanList;
	public Singer() {
		fanList = new ArrayList<Fan>();
	}
	@Override
	public void addFan(Fan o) {
		fanList.add(o);
	}
	@Override
	public void deleteFan(Fan o) {
		if( fanList.indexOf(o) <= 0){
			fanList.remove(o);
		}
	}
	@Override
	public void speak() {
		String [] voices = { "»ç¶ûÇØ¿ä, ¿©·¯ºÐ!", "³ÊÈñ°°Àº ÆÒ ÇÊ¿ä ¾ø¾î!" };
		Random r = new Random();
		int index = r.nextInt(voices.length);
		for(int i = 0 ; i < fanList.size(); i++){
			Fan o = (Fan)fanList.get(i);
			o.hear(voices[index]);
		}
	}
}
package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	public static void main(String args[]) {
		 Playable playable = new Veena();
		 playable.play();
		 Playable obj = new Saxophone();
		 obj.play();
		 obj.play();
	}
	}
   

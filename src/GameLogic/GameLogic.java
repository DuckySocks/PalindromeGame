package GameLogic;

public class GameLogic {
	public static void main(String[] args) {
		String word = "racEcAr";
		GameLogic logic = new GameLogic();
		System.out.println(logic.isMatch(word));
	}
	
	
	public boolean isMatch(String word) {
		word = word.toLowerCase();
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				
				//System.out.println("This	is	false");
				// return false (use this if using Boolean method)
				
				return false;
			}
			//System.out.println("This	is	true");
			// return true (use this if using Boolean method)
		}
		return true;
	}
}

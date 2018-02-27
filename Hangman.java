public class Hangman {
	private String dWord; //disguised word
	private String iWord; //input word
	private int iCount;
	private int gCount;
	
	//assigns values to the 2 String variables
	public void setDWord(String w) {
		//assigns the user input to iWord
		iWord =w;
	
		//based on iWord the dWord is created
		dWord = "";
		for(int i=0;i<iWord.length();i++)
			dWord += "?";
	}

	public void makeGuess(String letter)
	{
		//replace the ?? with the letter
		reveal(letter);

		//replace the letter with ??
		iWord.replace(letter,"?");
	}


	private void reveal(String letter)
	{
		//l contains the location where we
		//want to start searching

		int l = 0, location = 0;

		do{
			//location of the guess in the input word
			location = iWord.indexOf(letter,l);

			//if letter exists in the input word then separate
			//the disguised word into 2 section
			if(location != -1)
			{
				String s1, s2;
				s1 = dWord.substring(0,location);
				s2 = dWord.substring(location + 1);

				dWord = s1 + letter + s2;	
			}
			
			/*else if (location == -1) {
				iCount++;
				System.out.println("Your misses: " + iCount);
			}*/

			//change l with the new location
			l = location + 1;

		}while(location != -1);
				
		//keeps track of the number of misses


		//keeps track of the number of guesses
		//including the incorrect ones
		gCount++;
	}

	public void print()
	{
		System.out.println(dWord);
	}

	
	public int getICount(){return iCount;}
	
	public int getGCount(){return gCount;}


	public String getIWord(){return iWord;}
	
}

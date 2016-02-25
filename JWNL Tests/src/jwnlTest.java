import edu.mit.jwi.*;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.POS;

import java.io.File;

public class jwnlTest 
{
	public static void main (String [] args)throws Exception
	{
		File file = new File("Z:/Wordnet/wn3.1.dict/dict");
		IDictionary dict = new Dictionary(file);
		dict.open();
		
		 IIndexWord idxWord = dict.getIndexWord("dog", POS.NOUN);
		 IWordID wordID = idxWord.getWordIDs().get(0);
		 IWord word = dict.getWord(wordID);
		 System.out.println("Id = " + wordID);
		 System.out.println("Lemma = " + word.getLemma());
		 System.out.println("Gloss = " + word.getSynset().getGloss());
		 System.out.println(word.getSenseKey());
		 System.out.println("==========");
		 
		 idxWord = dict.getIndexWord("lemma", POS.NOUN);
		 wordID = idxWord.getWordIDs().get(0);
		 word = dict.getWord(wordID);
		 System.out.println("Id = " + wordID);
		 System.out.println("Lemma = " + word.getLemma());
		 System.out.println("Gloss = " + word.getSynset().getGloss());
		 System.out.println(word.getSenseKey().toString());
		 /*
		  * CHECK OUT SENSEKEY OBJECT
		  */
	}
}

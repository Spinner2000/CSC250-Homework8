import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		BibleBookCollection theNewTestament = new BibleBookCollection("data.dat");
		try
		{
			BibleBook answer = theNewTestament.getFirstBookGivenSearchTerm("Church");
			answer.display();
		}
		catch(Exception e)
		{
			System.out.println("No Book Found");
		}
		BibleBook chapter=theNewTestament.sortOnChapterCount();
		BibleBook name=theNewTestament.sortOnName();
		while(theNewTestament.nextLine()) {
			name.display();
			chapter.display();
		}
		
		
	}
}
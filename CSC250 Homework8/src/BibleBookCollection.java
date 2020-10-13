import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BibleBookCollection 
{
	private ArrayList<BibleBook> theBooks;
	
	public BibleBookCollection()
	{
		this.theBooks = new ArrayList<BibleBook>();
	}
	
	public BibleBookCollection(String filename)
	{
		this();
		try
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/" + filename));
			while(input.hasNext())
			{
				this.theBooks.add(new BibleBook(input.nextLine()));
			}
			input.close();
		}
		catch(Exception e) { e.printStackTrace();}
	}
	
	public void addBibleBook(BibleBook b)
	{
		this.theBooks.add(b);
	}
	
	public void addBibleBook(String colonDelimitedData)
	{
		this.theBooks.add(new BibleBook(colonDelimitedData));
	}
	
	public BibleBook getFirstBookGivenSearchTerm(String term) throws Exception
	{
		for(BibleBook aBook : this.theBooks)
		{
			if(aBook.searchSummary(term))
			{
				return aBook;
			}
		}
		throw new Exception("Term not found exception");
	}
	
	public BibleBook sortOnName(){
		int n=this.theBooks.size();
		private arrayList[] letters= {1,2,3,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
		  for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (BibleBook(this.theBooks[j]).getName.charAt(0).compareTo(BibleBook(this.theBooks[j+1]).getName.charAt(0)) != 0)
	                { 
	                    String temp = this.theBooks[j]; 
	                    this.theBooks[j] = this.theBooks[j+1]; 
	                    this.theBooks[j+1] = temp; 
	                } 
	        return this.theBooks;
	
	}
	
	public BibleBook sortOnChapterCount() {
		 int n = this.theBooks.size();
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (BibleBook(this.theBooks[j]).getNumber_of_chapters() > BibleBook(this.theBooks[j+1]).getNumber_of_chapters()) 
	                {  
	                    String temp = this.theBooks[j]; 
	                    this.theBooks[j] = this.theBooks[j+1]; 
	                    this.theBooks[j+1] = temp; 
	                } 
	        return this.theBooks;
	      
		
		//return theBooks
		
	}
}
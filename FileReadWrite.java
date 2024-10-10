import java.io.*;
import java.util.*;
public class FileReadWrite {
	public static void main(String[]args) {
		try {
			Scanner sc=new Scanner(System.in);
		File obj=new File("Register1.txt");
		if(obj.createNewFile()) {
			System.out.println("Register1.txt created \n");}
		else {
			System.out.println("file already exists");}
		
		FileWriter fout=new FileWriter("Register1.txt");
				System.out.println("Enter KEAM Rank:");
		int n=sc.nextInt();
		fout.write(n+"\n");
		fout.close();
		System.out.println("Data Added");
		FileReader fin=new FileReader("Register1.txt");
		BufferedReader br=new BufferedReader(fin);
		String line;
		System.out.println("\n content of Register1.txt is:");
		while((line=br.readLine())!=null) {
			System.out.println(line);}
			br.close();
			}
		catch(IOException e) {
			System.out.println("Error Occured:"+e.getMessage());}
		
		
			}
				
		}
		
		
	
	



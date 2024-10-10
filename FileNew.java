import java .io.*;
class FileNew{
public static void main(String[]args){
try{
FileInputStream fin=new FileInputStream("wee.txt");
FileOutputStream fout=new FileOutputStream("wee1.txt");
int i;
while((i=fin.read())!=-1){
fout.write(i);}
System.out.println(" Successfully wrote.");
fin.close();
fout.close();
}
catch(FileNotFoundException e){
System.out.println(e.getMessage());
}
catch(IOException e){
System.out.println(e.getMessage());
}
}
}
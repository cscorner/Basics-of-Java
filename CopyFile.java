import java.io.*;
public class CopyFile
{
public static void main(String args[]) throws IOException
{
FileInputStream fis = new FileInputStream("e:/testout.txt");
FileOutputStream fos= new FileOutputStream("e:/output.txt");
int c;
while ((c = fis.read()) != -1)
{
fos.write(c);
}
fis.close();
fos.close();
}
}
import java.io.File;
public class CreateDir {
public static void main(String args[]) {
String dirname = "e:/sycs1718/myfolder";
File d = new File(dirname);
// Create directory now.
d.mkdirs();
}
}
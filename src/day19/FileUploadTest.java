package day19;

public class FileUploadTest {

    public static void main(String[] args) {
        FileLoader f1 = new FileLoader("file1");
        FileLoader f2 = new FileLoader("file2");
        FileLoader f3 = new FileLoader("file3");
        FileLoader f4 = new FileLoader("file4");
        FileLoader f5 = new FileLoader("file5");

        f1.start();
        f2.start();
        f3.start();
        f4.start();
        f5.start();

    }
}

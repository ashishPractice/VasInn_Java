package day19;

public class FileLoader extends Thread{

    String name;

    public FileLoader(String name){
        this.name = name;
    }

    public void run(){
        FileUpload f = new FileUpload();
        f.upload(name);
    }
}

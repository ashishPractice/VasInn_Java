package day21;

import javax.print.Doc;
import java.util.Arrays;
import java.util.List;

public class Document {

    private List<Page> pages;

    public String getPageContent(int pageNum){
        pages = Arrays.asList(new Page("context1"), new Page("context2"), new Page("context3"));
        return this.pages.get(pageNum).getContent();

    }

    public static void printPages(Document doc, int[] pageNum){
        Arrays.stream(pageNum).mapToObj(doc::getPageContent).forEach(Printer::print);
    }

    public static void main(String[] args) {
        Document doc =  new Document();
        int[] pageNumber = {0,1,2};
        printPages(doc,pageNumber);

    }

}

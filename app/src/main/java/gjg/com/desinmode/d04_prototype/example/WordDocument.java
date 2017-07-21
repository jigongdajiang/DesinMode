package gjg.com.desinmode.d04_prototype.example;

import java.util.ArrayList;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 */


public class WordDocument implements Cloneable {
    private String text;
    private ArrayList<String> images;

    public WordDocument(String text, ArrayList<String> images) {
        this.text = text;
        this.images = images;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "WordDocument{" +
                "text='" + text + '\'' +
                ", images=" + images +
                '}';
    }

    @Override
    protected WordDocument clone() throws CloneNotSupportedException {
        WordDocument doc = (WordDocument) super.clone();
        doc.text = this.text;
//        doc.images = this.images;//单纯的引用指向，属于浅拷贝
        doc.images = (ArrayList<String>) this.images.clone();//深拷贝
        return doc;
    }
}

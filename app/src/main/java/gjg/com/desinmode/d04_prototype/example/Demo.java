package gjg.com.desinmode.d04_prototype.example;

import java.util.ArrayList;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 */


public class Demo {
    public void main() throws CloneNotSupportedException {
        ArrayList<String> images = new ArrayList<>();
        images.add("图片1");
        images.add("图片2");
        images.add("图片3");
        WordDocument doc = new WordDocument("文本",images);
        doc.toString();

        WordDocument docClone = doc.clone();
        docClone.setText("克隆后又修改了标题");
        docClone.clone();

        doc.toString();//深拷贝时原来的没有改变
    }
}

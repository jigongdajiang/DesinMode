package gjg.com.desinmode.d12_iterator.navgationbottom;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 */


public class TabBean {
    private String text;//文字
    private int mImgIconDrawableSelectorId;//选中未选中时图片的资源drawable对象
    private int mTextColorSelectorId;//选中未选中时的文字颜色资源

    public TabBean(String text, int mImgIconDrawableSelectorId, int mTextColorSelectorId) {
        this.text = text;
        this.mImgIconDrawableSelectorId = mImgIconDrawableSelectorId;
        this.mTextColorSelectorId = mTextColorSelectorId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getmImgIconDrawableSelectorId() {
        return mImgIconDrawableSelectorId;
    }

    public void setmImgIconDrawableSelectorId(int mImgIconDrawableSelectorId) {
        this.mImgIconDrawableSelectorId = mImgIconDrawableSelectorId;
    }

    public int getmTextColorSelectorId() {
        return mTextColorSelectorId;
    }

    public void setmTextColorSelectorId(int mTextColorSelectorId) {
        this.mTextColorSelectorId = mTextColorSelectorId;
    }
}

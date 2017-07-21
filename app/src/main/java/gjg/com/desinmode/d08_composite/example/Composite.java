package gjg.com.desinmode.d08_composite.example;

import java.util.List;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description: 树枝构件
 */


public class Composite extends Component{
    private List<Component> childs;

    public Composite(List<Component> childs) {
        this.childs = childs;
    }

    public void addChild(Component component){
        childs.add(component);
    }
    public void removeChild(Component component){
        childs.remove(component);
    }

    public List<Component> getChildren(){
        return this.childs;
    }
    @Override
    public void doSomeThing() {

    }
}

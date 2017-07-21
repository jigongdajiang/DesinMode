package gjg.com.desinmode.d03_builder.example.common;

/**
 * @author : gongdaocai
 * @date : 2017/7/17
 * FileName:
 * @description:
 */


public class NormalProduct {
    private Builder.Params mParams;

    public void apply(){
        if(null != mParams){
            //这里根据参数自动添加约束
        }
    }

    public NormalProduct(Builder.Params mParams) {
        this.mParams = mParams;
    }

    public static class Builder{
        Params params;

        public Builder() {
            this.params = new Params();
        }
        public Builder setName(String name){
            params.name = name;
            return this;
        }
        public Builder setAge(String age){
            params.age = age;
            return this;
        }
        public NormalProduct builder(){
            NormalProduct product = new NormalProduct(params);
            product.apply();
            return product;
        }
        public static class Params{
            public String name;
            public String age;
        }
    }
}

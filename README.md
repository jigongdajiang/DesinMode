# DesinMode
23种设计模式总结及简单示例源码
程序架构说明

在gjg.com.desinmode 下有23中设计模式的实例源码

每种模式 以dXX_modeName形式命名 例如 d01_factorymethod   第一种设计模式_工厂方法模式

每个dXX_modeName 包含一个包 example  存放的是示例源码  Description:是原理总结

Description分别从 定义 场景 角色 案例  android中的应用  利弊 六个方面对模式进行了简要总结性介绍，例如:
/**
     * 定义:
     *      将产品的实例化进行隐藏
     * 场景:
     *      任何需要生成对象的情况都可使用工厂方法替代生成。
     * 角色:
     *      工厂接口IFactory
     *      工厂实现Factory
     *      产品接口IProduct
     *      产品实现product
     * 案例:
     *      水果工厂
     * android:
     *      BitmapFactory
*/

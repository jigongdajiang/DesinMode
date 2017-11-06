package gjg.com.desinmode.d20_observer.dateupdate;

/**
 * @author : gongdaocai
 * @date : 2017/11/5
 * FileName:
 * @description:
 */


public class Member {
    private String name;
    private String age;

    public Member() {
    }

    public Member(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

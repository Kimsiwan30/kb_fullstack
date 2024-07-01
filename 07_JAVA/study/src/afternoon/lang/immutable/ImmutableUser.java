package afternoon.lang.immutable;

public class ImmutableUser {
    private final String name;

    public ImmutableUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ImmutableUser setName(String name) {
        return new ImmutableUser(name);
    }
    //불변객체에는 전달이 불가하니 새로 만들어서 전달하는 과정

//    public String setName(String name) {
//        this.name = name;
//    }  불변 객체라서 에러가 뜸

    @Override
    public String toString() {
        return "ImmutableUser{" +
                "name='" + name + '\'' +
                '}';
    }

}

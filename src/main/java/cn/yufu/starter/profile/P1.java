package cn.yufu.starter.profile;

public class P1 {
    private String name="P1";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "P1{" +
                "name='" + name + '\'' +
                '}';
    }
}

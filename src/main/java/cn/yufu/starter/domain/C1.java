package cn.yufu.starter.domain;

public class C1 {

    private C2 c2;

    public C2 getC2() {
        return c2;
    }

    public void setC2(C2 c2) {
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return "C1{" +
                "c2=" + c2 +
                '}';
    }
}

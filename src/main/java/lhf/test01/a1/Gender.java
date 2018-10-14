package lhf.test01.a1;

public enum Gender {
    MALE("男"),
    FEMAIL("女");
    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

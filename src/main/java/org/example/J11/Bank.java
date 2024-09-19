package org.example.J11;

public class Bank {
    private String name; // 銀行名 3文字以上

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("名前が不正です");
        }
        this.name = name;
    }
}

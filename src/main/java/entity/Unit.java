package entity;

import java.util.Arrays;

/**
 * 按键类
 * <p>
 * Created  by  renxingWei  on  2020/9/21
 **/
public class Unit {

    // 元素的数字代表
    private int number;

    // 元素代表的字母(大写)
    private Character[] leters;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Character[] getLeters() {
        return leters;
    }

    public void setLeters(Character[] leters) {
        this.leters = leters;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "number=" + number +
                ", leters=" + Arrays.toString(leters) +
                '}';
    }
}

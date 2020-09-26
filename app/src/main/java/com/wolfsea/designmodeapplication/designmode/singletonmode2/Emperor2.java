package com.wolfsea.designmodeapplication.designmode.singletonmode2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Emperor2 {

    private static final int COUNT = 2;
    private static final List<String> NAME_LIST = new ArrayList<>();
    private static final List<Emperor2> EMPEROR_2_LIST = new ArrayList<>();
    private static int currentEmperorIndex;

    static {
        for (int i = 0; i < COUNT; i++) {
            Emperor2 emperor2 = new Emperor2("皇帝" + (i + 1));
            EMPEROR_2_LIST.add(emperor2);
        }
    }

    private Emperor2() {}

    private Emperor2(String name) {
        NAME_LIST.add(name);
    }

    public static Emperor2 getInstance() {

        Random random = new Random();
        currentEmperorIndex = random.nextInt(COUNT);
        return EMPEROR_2_LIST.get(currentEmperorIndex);
    }

    public void say() {
        System.out.println(NAME_LIST.get(currentEmperorIndex));
    }

}

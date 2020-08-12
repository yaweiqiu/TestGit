package com.example.ndkdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiuyawei
 * @createTime 2020/8/12 9:39 AM
 * @describe
 */
class Father {
    private List<Children> myChildren = new ArrayList<>();

    public void registerObserver(Children children) {
        if (!myChildren.contains(children)) {
            myChildren.add(children);
        }
    }

    public void unRegisterObserver(Children children) {
        if (myChildren.contains(children)) {
            myChildren.remove(children);
        }
    }

    public void notifyChild() {
        for (int i = 0; i < myChildren.size(); i++) {
            System.out.println("Hi," + myChildren.get(i).getName() + " is time to go home, your mather call you eat !");
        }
    }

    public void notifySpecialChild(Children children) {
        System.out.println("Hi," + children.getName() + " is time to go home, your mather call you eat !");
    }
}

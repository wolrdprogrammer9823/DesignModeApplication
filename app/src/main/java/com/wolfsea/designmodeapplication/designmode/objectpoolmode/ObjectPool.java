package com.wolfsea.designmodeapplication.designmode.objectpoolmode;
import java.util.Hashtable;

/**
 * @author liuliheng
 * @desc  抽象对象池
 * @time 2020/11/5  0:07
 **/
public abstract class ObjectPool<T> {

    private final Hashtable<T, ObjectStatus> objectPool = new Hashtable<>();

    public ObjectPool() {

        objectPool.put(create(), new ObjectStatus());
    }

    //取出对象
    public synchronized T checkOut() {

        for (T t : objectPool.keySet()) {
            if (objectPool.get(t).validate()) {

                objectPool.get(t).using();
                return t;
            }
        }

        return null;
    }

    //归还对象
    public synchronized void checkIn(T t) {

        objectPool.get(t).setFree();
    }

    static class ObjectStatus {

        //占用
        public void using() {


        }

        //释放
        public void setFree() {


        }

        //是否可用
        public boolean validate() {


            return false;
        }

    }

    public abstract T create();
}


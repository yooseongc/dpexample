package com.yooseongc.dpexample.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Manager<T extends Product> {

    private HashMap<String, T> showcase = new HashMap<>();

    public void register(String name, T proto) {
        showcase.put(name, proto);
    }

    public T create(String protoname) {
        if(!showcase.containsKey(protoname))
            throw new IllegalArgumentException();

        T target = showcase.get(protoname);

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(target);
            oos.close();
            baos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            ois.close();
            bais.close();

            return (T) ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}

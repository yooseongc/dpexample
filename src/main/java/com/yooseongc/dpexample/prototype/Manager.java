package com.yooseongc.dpexample.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Manager {

    private HashMap<String, Product> showcase = new HashMap<>();

    // 절대 사용하면 안되는 Code. showcase의 element는 immutable라는 전제가 있어야 한다.
    /*public HashMap<String, Product> getShowcase() {
    	return showcase;
    }*/

    public void showShowcase() {
        showcase.forEach((k, v) -> System.out.println(k + ": " + v));

        // 위와 같은 표현
        /*for(String k : showcase.keySet()) {
            System.out.println(k + ": " + showcase.get(k));
        }*/
    }

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        if(!showcase.containsKey(protoname))
            throw new IllegalArgumentException();

        Product target = showcase.get(protoname);

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

            return (Product) ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}

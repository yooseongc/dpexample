package com.yooseongc.dpexample.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Manager {

    private HashMap<String, Product> showcase = new HashMap<>();

    public HashMap<String, Product> getShowcase() {
    	return showcase;
    }
    
    public void showShowcase() {
    	Object[] keys = showcase.keySet().toArray();
    	for (int i = 0; i < keys.length; i++) {
    		System.out.println(keys[i] + ": " + ((Object) showcase.get(keys[i])).toString());
    	}
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

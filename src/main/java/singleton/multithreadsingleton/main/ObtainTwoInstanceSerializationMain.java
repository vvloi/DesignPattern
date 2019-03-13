package singleton.multithreadsingleton.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import singleton.multithreadsingleton.singleton.VolatileVariableSingleton;

public class ObtainTwoInstanceSerializationMain {
	public static void main(String[] args) {
		try {
			VolatileVariableSingleton instance1 = VolatileVariableSingleton.getInstance();
            ObjectOutput out = null;

            out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(instance1);
            out.close();

            //deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            VolatileVariableSingleton instance2 = (VolatileVariableSingleton) in.readObject();
            in.close();

            System.out.println(instance1);
            System.out.println(instance2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
}

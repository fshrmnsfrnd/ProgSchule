import java.io.*;

public class Main {
    public static void main(String[] args){

        class Address implements Serializable, Cloneable{
            String city;

            public Address(){}

            Address(Address other) {
                this.city = other.city;
            }

            Address deepCopy() {
                Address copy = new Address();
                copy.city = this.city;
                return copy;
            }

            public Address deepSerealCopy(Address object) {
                try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
                     ObjectOutputStream out = new ObjectOutputStream(bos)) {

                    out.writeObject(object);
                    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                    ObjectInputStream in = new ObjectInputStream(bis);
                    return (Address) in.readObject();
                } catch (IOException | ClassNotFoundException e) {
                    throw new RuntimeException("Deep copy failed", e);
                }
            }

            @Override
            public Address clone() {
                Address clone = null;
                try {
                    clone = (Address) super.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                return clone;
            }
        }

        class Person implements Serializable, Cloneable{
            String name;
            Address address;

            public Person(){}

            Person(Person other) {
                this.name = other.name;
                this.address = new Address(other.address);
            }

            Person deepCopy() {
                Person copy = new Person();
                copy.name = this.name;
                copy.address = this.address.deepCopy();
                return copy;
            }

            //Ab Java 16
            public static <T extends Serializable> T deepSerialCopy(T object) {
                try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
                     ObjectOutputStream out = new ObjectOutputStream(bos)) {

                    out.writeObject(object);
                    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                    ObjectInputStream in = new ObjectInputStream(bis);
                    return (T) in.readObject();
                } catch (IOException | ClassNotFoundException e) {
                    throw new RuntimeException("Deep copy failed", e);
                }
            }

            @Override
            public Person clone() {
                Person clone = null;
                try {
                    clone = (Person) super.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                return clone;
            }
        }

        Address a1 = new Address();
        a1.city = "cityA1";
        Person p1 = new Person();
        p1.address = a1;
        p1.name = "NameP1";

        Person p1ManuelCopy = p1.deepCopy();
        p1ManuelCopy.name = "ManualCopyName";
        Person p1ConstructorCopy = new Person(p1);
        p1ConstructorCopy.name = "ConstructorCopyName";
        Person p1SerialCopy = Person.deepSerialCopy(p1);
        p1SerialCopy.name = "SearialCopyName";
        Person p1CloneCopy = p1.clone();
        p1CloneCopy.name = "CloneCopyName";

        a1.city = "a1NewCityName";

        System.out.println("p1Name:  "+p1.name);
        System.out.println("ManuelCopyName:  "+p1ManuelCopy.name);
        System.out.println("ConstructorCopyName:  "+p1ConstructorCopy.name);
        System.out.println("SearialCopyName:  "+p1SerialCopy.name);
        System.out.println("p1CloneCopyName:  "+p1CloneCopy.name);

        System.out.println("p1AdressCity:  "+p1.address.city);
        System.out.println("ManuelCopyAdressCity:  "+p1ManuelCopy.address.city);
        System.out.println("ConstructorCopyAdressCity:  "+p1ConstructorCopy.address.city);
        System.out.println("SearialCopyAdressCity:  "+p1SerialCopy.address.city);
        System.out.println("p1CloneCopyAdressCity:  "+p1CloneCopy.address.city);
    }


}


package Java_Practice;
public class MyClass {
    int value;
    
    MyClass(int value) {
        this.value = value;
    }
    public void modifyReference(MyClass obj) {
    obj.value = obj.value + 20;
}

}


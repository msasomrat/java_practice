package Java_Practice;

public class call_value {
    int n;
    void change(int i)
    {
        i= 20;
        n=i;
    }
    void change_ref(call_value p){
        p.n = 20;
    }
}

public class encapsule{

    private int v = 90;

    int get() {
        return v;
    }

    public static void main(String[] args) {
        encapsule hi = new encapsule();
        int b=hi.get();
        
        System.out.print(hi.get());
    }
}

interface Inface {

    float sum(float x, float y);
}

class B implements Inface {
    public float sum(float x, float y) {
        return x + y;
    }
}

class InterfaceTest1 {
    public static void main(String arg[]) {
        Inface s = new B();
        System.out.println("Addition of two numbers is = " + s.sum(30.0f, 12.0f));
    }
}
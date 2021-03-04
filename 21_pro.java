final class Demo {
    final float pi = 3.14f;
    
    final void display() {
        System.out.println("Value of Pi is: " + pi);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}

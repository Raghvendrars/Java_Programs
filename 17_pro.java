class circle {
    int count = 0;
    int radius;

    circle() {
        this(3);
        count++;
    }

    circle(int r) {
        this(3.14f, r);
        count++;
    }

    circle(float pi, int r) {
        count++;
        System.out.println("Area of a Circle: " + pi * Math.pow(r, 2) + "\nNumber of instances/object: " + count);

    }

    public static void main(String[] args) {
        new circle();
    }
}

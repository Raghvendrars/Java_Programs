class comandline{
    public static void main(String[] args) {
        System.out.println("Number of arguments: "+args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println((i+1)+" Student Name: "+args[i]);
        }
    }
}

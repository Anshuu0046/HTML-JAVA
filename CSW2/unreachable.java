
 class unreachable {
    String obj;

     public static void main(String[] args) {
         test();
         System.gc();

     }
     public unreachable (String s) {
         obj = s;

     }
     static void test() {
         unreachable u = new unreachable("1st object");

     }
     @Override
     protected void finalize() throws Throwable {
         System.out.println("Kachra Seth ko mil gya!");
     }

}

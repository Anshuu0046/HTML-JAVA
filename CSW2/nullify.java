class Nulll{
    private String name;
    public Nulll (String name)
    {
        this.name= name;

    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Tera Dimag Kharab Hai kya????");
    }
}
public class nullify {
    public static void main(String[] args) {
        Nulll n = new Nulll("Dhirti");
        n = null;
        System.gc();
    }
}

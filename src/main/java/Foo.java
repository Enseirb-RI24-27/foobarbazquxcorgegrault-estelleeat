import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public Bar getBar() {
        return this.bar;
    }

    public List<Grault> getGraults() {
        return this.graults;
    }

    public List<Baz> getBazs() {
        return this.bazs;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public Qux getQux() {
        return this.qux;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault() {
        //this.graults.add();

    }

}

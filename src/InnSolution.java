public class InnSolution {
    public void Solution(Client[] a1) {
        Purch b=new Purch ();
        try {
            b.purchase(a1);
        } catch (InnException e) {
            System.err.println(e.getMessage());
        }
    }
}

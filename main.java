public class main {
  public static void main(String[] args) {
    Konoha[] k = new Konoha[3];

    k[0] = new Konoha();
    k[0].setNo("012606");
    k[0].setNama("Uchiha Sasuke");
    k[0].setTingkat("Genin");

    k[1] = new Konoha();
    k[1].setNo("012607");
    k[1].setNama("Uzumaki Naruto");
    k[1].setTingkat("Genin");

    k[2] = new Konoha();
    k[2].setNo("012601");
    k[2].setNama("Haruno Sakura");
    k[2].setTingkat("Chunin");

    System.out.println("\t\tDATA KONOHAGAKUREN ");
      System.out.print("No.Registrasi\t");
      System.out.print("Nama\t\t");
      System.out.print("Peringkat");
      System.out.println();
    for (Konoha x:k){
    ;
      System.out.print(""+x.getNo());
      System.out.print("\t\t"+x.getNama());
      System.out.print("\t"+x.getTingkat());
      System.out.println();
    }
  }
}

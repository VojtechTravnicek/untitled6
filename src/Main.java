public class Main {
    public static void main(String[] args) {
        seznamZkazniku zaznam = new seznamZkazniku();
        Zakaznik zakaznik1 = new Zakaznik("Franta Novotný", 4);
        Zakaznik zakaznik2 = new Zakaznik("Franta Novák", 8);
        seznamZkazniku.nactiZeSouboru("vstup.txt");
        for(Zakaznik zakaznik : zaznam.getList()){
            System.out.println(zakaznik.getJmeno()+":"+zakaznik.getPocetProdeju()+"\n");
        }
        zaznam.pridat(zakaznik1);
        zaznam.pridat(zakaznik2);
        zaznam.zapisDoSouboru("vystup.txt");
    }
}
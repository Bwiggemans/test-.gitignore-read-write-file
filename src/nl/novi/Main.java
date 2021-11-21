package nl.novi;

public class Main {

    public static void main(String[] args) {
	readerWriter rw = new readerWriter();
	String tekst = "This is also ok, or not?" + "\n" + "zie je wel dat het werkt." + "\n" + "Dit doet het ook.";
	rw.setTekst(tekst);
	rw.write("voorbeeld.txt");
	rw.read("voorbeeld.txt");
    }
}

package zadatak5;

public class Main {

	public static void main(String[] args) {

		GeometrijskaSlika krug = new Krug(5);
		System.out.println(krug);

		GeometrijskaSlika kvadrat = new Kvadrat(5);
		System.out.println(kvadrat);

		GeometrijskaSlika trougao = new Trougao(5);
		System.out.println(trougao);

		GeometrijskaSlika pravougaonik = new Pravougaonik(5, 4);
		System.out.println(pravougaonik);

		GeometrijskaSlika nejednakostranicniTrougao = new NejednakostranicniTrougao(4, 7, 5);
		System.out.println(nejednakostranicniTrougao);

		GeometrijskaSlika elipsa = new Elipsa(4, 9);
		System.out.println(elipsa);
	}

}

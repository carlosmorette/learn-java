public class Tuple<L, R> {
    private L i1;
    private R i2;

    Tuple (L i1, R i2) {
	this.i1 = i1;
	this.i2 = i2;
    }

    L getL() {return i1;}
    R getR() {return i2;}
}

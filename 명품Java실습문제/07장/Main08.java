public class Main08<E> {
	private E s;
	public Main08(E s) {
		this.s = s;
	}
	void setS(E s) {
		this.s = s;
	}
	E getS() {
		return s;
	}
	public static void main(String[] args) {
		int n = 10;
		Main08<Integer> myclass = new Main08<>(n);
		System.out.println(myclass.getS());
	}

}
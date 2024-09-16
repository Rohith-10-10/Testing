package concept_oops;

public class This_Keyword {
    int x, y;       // class variables

   This_Keyword(int x, int y){
	this.x = x;
	this.y = y;
}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       This_Keyword th = new This_Keyword(100,200);
       th.display();
	}

}

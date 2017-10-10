package JavaPractice;

public class main {

	public static void main(String[] args) {
		System.out.println("すがわら");
		System.out.println("31歳です");
		System.out.println("お酒が好きです");
		System.out.println("31+31の計算をします");
		System.out.println(31+ 31);
		int x=6;
		System.out.println(x * x *3.14);

		int kensAge = 22;
		System.out.println("ケンの年齢は" +kensAge);

		kensAge = 23;
		System.out.println("えっと、本当の年齢は" +kensAge +"です");

		boolean tenki = true;
		if (tenki == true){
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");

		}else{
			System.out.println("DVDを見ます");
		}


		boolean doorClose = true;
		while (doorClose == false){
			System.out.println("ノックする");
		}
		for (int i = 0; i<3 ; i++){
			System.out.println("現在" + (i+1)+ "週目→");
		}

		/// TODO 自動生成されたメソッド・スタブ

	}

}

package Java;

public class Java_25_public_private_protected {

	public static void main(String[] args) {
		
		Java_25_public pub = new Java_25_public();	
		System.out.println(	pub.noModifiers);
		
		Java_25_private pri = new Java_25_private();
		
		System.out.println(pub.taluk);
		System.out.println(pub.village);
		System.out.println(pub.radius);
		System.out.println(pub.post);
		
		pri.setmobName("MI A3");
		System.out.println(pri.getmobName());
		
		Java_25_protected pro = new Java_25_protected();
		System.out.println(pro.name);
		//It won't work. because, its private.../
		//System.out.println(pri.);
	}

}


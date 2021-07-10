package HashMaps;

public class MapUse {

	public static void main(String[] args) {
		Mapp<String, Integer> hashmap = new Mapp<>();
		for(int i=0; i < 20;i++) {
			hashmap.insert("abc"+i, i+1);
			System.out.println(hashmap.loadFactor());
		}

		hashmap.removeKey("abc3");
		hashmap.removeKey("abc14");
		for(int i=0;i < 20;i++) {
			System.out.println("abc"+i+":"+ hashmap.getValue("abc"+i));
		}
		System.out.println("Size of hashmap is = " + hashmap.size());
	}
}
 
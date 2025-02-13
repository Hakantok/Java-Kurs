package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s� : " + mesaj.length()); // String olarak tan�mlad�g�m�z mesaj '�n i�inde ka� eleman oldu�unu buluruz.
		System.out.println("5. eleman : " + mesaj.charAt(4)); // mesaj '�n i�erisindeki 5. eleman� buluruz. 0 dan ba�lad��� i�in 4 yazd�k.
		System.out.println(mesaj.concat(" Ya�as�n!")); // ilk mesaj ile burda yazd���m�z mesaj� birle�tirir.
		System.out.println(mesaj.startsWith("B")); // mesaj B ile ba�l�yorusa true yazar. Ba�lam�yorsa false yazar. Harfin b�y�k veya k���k olmas� �nemlidir. k���k yazarsak false d�nd�r�r.
		System.out.println(mesaj.endsWith(".")); // mesaj�n . ile bitip bitmedi�ine bakar. E�er bitiyorsa true yazar, bitmiyorsa false yazar.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // mesaj�m�z�n i�erisinden elemanlar� almak i�in kullan�r�z. �lk k�sma 0 yazd�k ��nk� 0. elemandan ba�layarak almak istedik. �kinci k�s�ma 5 yazd�k ��nk� 5. elemana kadar almak istedik. 3. k�sma karakterler yazd�k ��nk� �stte char olarak bir karakterler dizisi olu�turduk. Ald���m�z elemanlar� bu dizinin i�erisindeki elemanlar�n yerine yaz�yoruz. En son k�sma yazd���m�z 0 ile olu�turdu�umuz karakterler dizisine aktaraca��m�z elemanlar� dizinin ka��nc� eleman�ndan ba�layarak aktaraca��m�z� se�iyoruz. 
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av")); // mesaj�n i�erisindeki av'�n ka��nc� eleman oldu�unu yazar.
		System.out.println(mesaj.lastIndexOf("e")); // e harfini mesaj�n i�inde arar ama aramaya sondan ba�lar ve harfin s�ras�n� ba�tan ka��nc� ise onu yazar. �rne�in indexOf da a y� arat�rsak 7 ��kt�s�n� verir. Ama last�ndexOf da a 'y� arat�rsak sondan geldi�i i�in 9 ��kt�s�n� verir.
		
		
		String yeniMesaj = mesaj.replace(' ', '-'); // // ilk yazd���m�z tek t�rnaklar�n aras�ndaki harf yerine ikinci k�s�mdaki tek t�rnag�n i�indeki harfi yazar.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2)); // mesaj� 2. elemandan itibaren ba�layarak yazar.
		System.out.println(mesaj.substring(2, 5)); // mesaj�n 2. eleman�ndan ba�lar 5. eleman�na kadar yazar.(4 dahil de�ildir.)
		
		for(String kelime : mesaj.split(" ")) { // mesaj� bo�luk olan k�s�mlardan par�alar ve alt alta yazar.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); // mesajdaaki t�m harfleri k���lt�r ve �yle yazar.
		System.out.println(mesaj.toUpperCase()); // mesajdaki t�m harfleri b�y�lterek yazar.
		System.out.println(mesaj.trim()); // mesaj�n ba��nda veya sonunda bo�luk varsa onlar� siler ve �yle yazar.
	}
	

}

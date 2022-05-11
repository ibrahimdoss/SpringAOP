
public enum ExampleNotes {
	
	//12.satır target deme sebebimiz buna AOP uygulayacağımız için.
	
	//Bu örnek Runtime AOP, Compile time değil
	
	//Compile olduğu zaman compile time da proxy'i üretir onu Runtime da 
	//kullanırız.
	
	//Bu örnek de bi tane pointcut var onun da bi tane joinpointi var o da
	//Greet metodu. 
	
	//Burada proxy target görünümlü başka bir obje, neden target görünümlü 
	//olmak zorunda dersek, özünde business kodumuz değişmemeli yani greeti
	//çağıracağımız için 
	
	//burada proxy çağırıp onu execution yapmış oluyoruz.
}

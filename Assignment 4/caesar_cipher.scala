import scala.io.StdIn._

object Ceasar_Cipher extends App{
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val shift = (readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
	val msg = readLine("Secret Message: ")

	val E = (c:Char, key:Int, a:String) => {
		if (a.indexOf(c.toUpper) == -1) c
		else a((a.indexOf(c.toUpper) + key) % a.size)
	}

	val D = (c:Char, key:Int, a:String) => {
		if (a.indexOf(c) == -1)	c
		else{
			if ((a.indexOf(c) - key)<0) a((a.indexOf(c) - key + a.size) % a.size)
			else a((a.indexOf(c) - key) % a.size)
		}
    }
    
	val cipher = (algo: (Char, Int, String) => Char, s:String, key:Int, a:String) =>
		s.map(algo(_, key, a))

	val enm = cipher(E, msg, shift, alphabet)
    println("Encypted => " + enm);

	val dem = cipher(D, enm, shift, alphabet) 
	println("Decypted => " + dem);
}
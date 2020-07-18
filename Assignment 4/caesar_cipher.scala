import scala.io.StdIn._

object Ceasar_Cipher extends App{
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val shift = (readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
	val msg = readLine("Secret Message: ")

    val En = (c:Char, key:Int, a:String) => {
		if (a.indexOf(c.toUpper) == -1) c
		else a((a.indexOf(c.toUpper) + key) % a.size)
    }

	val De = (c:Char, key:Int, a:String) => {
        if (a.indexOf(c.toUpper) == -1) c
        else{
            if ((a.indexOf(c) - key)<0)	a(a.size - (a.indexOf(c) - key).abs % a.size)
			else a((a.indexOf(c) - key) % a.size)
        }
    }
    
    val cipher = (algo: (Char, Int, String) => Char, s:String, key:Int, a:String) =>
        s.map(algo(_, key, a))

	val enm = cipher(En, msg, shift, alphabet)
    println("Encrypted => " + enm);

    val dem = cipher(De, enm, shift, alphabet) 
    println("Decrypted => " + dem);
}
package exercises

import org.junit.Assert
import org.junit.Test

class VowerConsonantTest {

    @Test
    fun countVowels() {
        Assert.assertEquals(11, countVowels("Quantas vogais tem nessa frase?"))
    }

    @Test
    fun countConsonats(){
        Assert.assertEquals(21, countConsonats("Geralmente uma frase possui mais consoantes"))
    }

    @Test
    fun countVowelsAndConsonats(){
        val phrase = "Estou gostando muito de aprender Koltin"
        Assert.assertEquals(15, countVowels(phrase))
        Assert.assertEquals(19, countConsonats(phrase))
    }
}
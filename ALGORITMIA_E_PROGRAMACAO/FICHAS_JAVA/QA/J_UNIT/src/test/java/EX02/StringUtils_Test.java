package EX02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtils_Test {

    // Não é necessário testar ambas as funçoes pois mo codigo da 1a está a ser utilizada a 2a:
    // Além disso, a funçao aninhada é private
    @Test
    public void testIsPalindrome(){
        assertEquals(true,StringUtils.isPalindrome("ana")); //metodo ispalindrome é estatico logo nao requis uma instancia da classe
        assertEquals(true,StringUtils.isPalindrome("Ana"));
        assertEquals(false,StringUtils.isPalindrome("patos"));
        assertTrue(StringUtils.isPalindrome("reviver"));
        assertTrue(StringUtils.isPalindrome("radar ovo radar"));

        assertFalse(StringUtils.isPalindrome("radar ov radar"));
        assertFalse(StringUtils.isPalindrome("solsticio"));

        assertFalse(StringUtils.isPalindrome(null));
//        assertFalse(StringUtils.isPalindrome("")); //posso fazer exceptiom
//        assertFalse(StringUtils.isPalindrome("8"));
//        assertEquals(false,StringUtils.isPalindrome("a"));
//        assertEquals(false,StringUtils.isPalindrome("88"));
    }

//    @Test
//    public void testReverseString(){
//        assertEquals("ana",StringUtils.reverseString("ana")); //mudei o metodo pars proteced na classe stringunits
//        assertEquals("ytilauq",StringUtils.reverseString("quality")); //mudei o metodo pars proteced na classe stringunits
//        assertEquals("ooo",StringUtils.reverseString("ooo")); //mudei o metodo pars proteced na classe stringunits
//        assertEquals("o",StringUtils.reverseString("o")); //mudei o metodo pars proteced na classe stringunits
//        assertEquals("",StringUtils.reverseString("")); //mudei o metodo pars proteced na classe stringunits


    }



package com.mycompany.holamundocarolina;

//Sort Inner Content
//
//You have to sort the inner content of every word of a string in descending order.
//The inner content is the content of a word without first and the last char.
//
//Some examples:
//"sort the inner content in descending order" -> "srot the inner ctonnet in dsnnieedcg oredr"
//"wait for me" -> "wiat for me"
//"this kata is easy" -> "tihs ktaa is esay"
//"I am" -> "I am"
public class HolaMundoCarolina {

    public static void main(String[] args) {

        System.out.println(sortWord("h"));

    }

    public static String sortWord(String word) {
        if (word.length() < 3) {
            return word;
        } else {
            String wordSort = "" + word.charAt(0);
            char last = word.charAt(word.length() - 1);
            String inner = "";
            for (int i = 1; i < word.length() - 1; i++) {
                inner = inner + word.charAt(i);
            }
            String auxiliar = sortWordInner(inner);
            for (int j = 0; j < auxiliar.length(); j++) {
                wordSort = wordSort + auxiliar.charAt(j);
            }
            wordSort = wordSort + last;
            return wordSort;
        }

    }

    public static String sortWordInner(String wordInner) {
        char wordAuxiliar[] = wordInner.toCharArray();
        for (int i = 0; i < wordInner.length(); i++) {
            for (int j = i + 1; j < wordInner.length(); j++) {
                if (wordAuxiliar[i] < wordAuxiliar[j]) {
                    char aux = wordAuxiliar[i];
                    wordAuxiliar[i] = wordAuxiliar[j];
                    wordAuxiliar[j] = aux;
                }
            }
        }
        return new String(wordAuxiliar);
    }
}

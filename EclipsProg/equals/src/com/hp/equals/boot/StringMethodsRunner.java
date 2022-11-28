package com.hp.equals.boot;



public class StringMethodsRunner {

	public static void main(String[] args) {
		String love="Love is considered to be both positive and negative, with its virtue representing human kindness, compassion, and affection, as the unselfish loyal and benevolent concern for the good of another and its vice representing human moral flaw, akin to vanity, selfishness, amour-propre, and egotism, as potentially leading people into a type of mania, obsessiveness or codependency. It may also describe compassionate and affectionate actions towards other humans, one's self, or animals. In its various forms, love acts as a major facilitator of interpersonal relationships and, owing to its central psychological importance, is one of the most common themes in the creative arts. Love has been postulated to be a function that keeps human beings together against menaces and to facilitate the continuation of the species.";
		System.out.println(love.toUpperCase());
		System.out.println(love.toLowerCase());
		String[] splits = love.split(" ");
		for (int dil = 0; dil < splits.length; dil++) {
        System.out.println(splits[dil]);			
		}
		System.out.println("................................................");
		String[] splited=love.split(",");
		for (int hrudaya = 0; hrudaya < splited.length; hrudaya++) {
			System.out.println("Splited Love by , "+splited[hrudaya]);
		}
		char[] charecters=love.toCharArray();
		for (int chars = 0; chars < charecters.length; chars++) {
			System.out.println(charecters[chars]);			
		}
		String reverse = new StringBuffer(love).reverse().toString();
		System.out.println("Revrsed : "+reverse);
        System.out.println(".................................................");
        
        StringBuffer buffer=new StringBuffer(love);
        buffer.reverse();
        String palindrom =buffer.toString();
        if(love.equals(palindrom)) {
        	System.out.println("Love name is Palindrom");
        }
        else {
        	System.out.println("Love is not Palindrom");
        }
        System.out.println("..................................................");
        char[] chars=love.toCharArray();
        StringBuilder digits =new StringBuilder();
        for (char a : chars) {
        	if (Character.isDigit(a)) {
        		digits.append(a);
        	
        }
        System.out.println("Number of digits are = "+digits);
        System.out.println(".................................................");
        
        char[] dup = love.toCharArray();
        int count;
        for (int j = 0; j < dup.length; j++) {
			count=1;
			for (int s = 0; s < dup.length; s++) {
				if (dup[j]==dup[s]&&dup[j] !=' ') {
					count++;
					dup[s]='0';
				}
				if(count >1&&dup[j]!='0')
					System.out.println("Duplicate numbers are = "+dup[a]);
			}
		}
        System.out.println("To find G in love name");
        String word="G";
        String[] repeates=love.split(" ");
        int counts=0;
        for (int m = 0; m < repeates.length; m++) {
			if(word.equals(repeates[m])) {
				counts++;
			}
        System.out.println("The word "+word +" Occurs " +counts + "Times in the above String");
        System.out.println("Love is blind and unconditional");
	}

}
	}
	}

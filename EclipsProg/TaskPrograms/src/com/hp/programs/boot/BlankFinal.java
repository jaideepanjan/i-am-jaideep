package com.hp.programs.boot;

public class BlankFinal {

		
		final int i;

		public BlankFinal(int i) {
			this.i=10;
			
		}
		
		class Blank{
			public  void main (String[] args) {
				BlankFinal refName=new BlankFinal(i);				
			}
		}
		
		

	}



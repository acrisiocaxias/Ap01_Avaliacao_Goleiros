package avaliacao_de_goleiros;

public class Gol {
	private String matriz[][];
//Mapeamento GOL
	public void Gol(){
		//cria o gol 8x16
		matriz = new String[8][16];
		for (int x = 0; x <= 8; x++){
			for (int y = 0; y <= 16; y++){
				//Trave do GOL
				
				
				if((x==1&&y<=15&&y!=0)||(x<=8&&x!=0&&y==1)||(x<=8&&x!=0&&y==15)) {
				//Areá fora do GOL
					
				}else if ((x==0&&y<=16)||(x<=8&&y==0)||(x<=8&&y==16)) {
				//Gaveta 
					
				} else if((x==2&&y==2)||(x==2&&y==14)) {
				//Area na qual é possivel fazer gol
					
					
				} else {
				}
				}
				
			}
		}
	
	//Divisão dos 4 quadrantes
	public void Quadrantes() {
		matriz = new String[8][16];
		for (int x = 0; x <= 8; x++){
			for (int y = 0; y <= 16; y++){
				if(x<=4&&y<=8) {
	
				}else if(x>4&&y<=8) {
					
				}else if(x<=4&&y>8) {
					
				} else {
					
				}
				
		} 
		}
		
			}
}

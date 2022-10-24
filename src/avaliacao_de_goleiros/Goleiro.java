package avaliacao_de_goleiros;

import java.util.Random;

public class Goleiro {

	//Atributos de identificação dos goleiros
		 private int id;
		 private String nome;
		 
		 //Atributos que irão variar de 1 a 10
		 private int velocidade;
		 private int flexibilidade;
		 private int agilidade;
		 private int coodernacao;
		 private int forca;
		 private int equilibrio;
		 private int AAG;
		 private int x;
		 private int y;

	    
		public Goleiro(int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca, int equilibrio) {
			this.nome=nome;
			this.velocidade=velocidade;
			this.flexibilidade=flexibilidade;
			this.agilidade=agilidade;
			this.coodernacao = coordenacao;
			this.forca=forca;
			this.equilibrio=equilibrio;
		}
		
		
		//Gets e Sets	 
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getVelocidade() {
			return velocidade;
		}


		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}


		public int getFlexibilidade() {
			return flexibilidade;
		}


		public void setFlexibilidade(int flexibilidade) {
			this.flexibilidade = flexibilidade;
		}


		public int getAgilidade() {
			return agilidade;
		}


		public void setAgilidade(int agilidade) {
			this.agilidade = agilidade;
		}


		public int getCoodernacao() {
			return coodernacao;
		}


		public void setCoodernacao(int coodernacao) {
			this.coodernacao = coodernacao;
		}


		public int getForca() {
			return forca;
		}


		public void setForca(int forca) {
			this.forca = forca;
		}


		public int getEquilibrio() {
			return equilibrio;
		}


		public void setEquilibrio(int equilibrio) {
			this.equilibrio = equilibrio;
		}


		public int getAAG() {
			return AAG;
		}


		public void setAAG(int aAG) {
			AAG = aAG;
		}
		
		//Calculo da AGG(Informado no pdf)
		public int Area_Atuacao_Goleiro(int velocidade, int flexibilidade,int agilidade, int coodernacao, int força, int equilibrio){
			
			AAG=((velocidade*3)+(flexibilidade*2)+(agilidade*3)+(coodernacao*2)+(força)+(equilibrio*2))/8;
			return AAG;
		}
		
		//È sorteado o quadrante a ser preechido
		public void SorteioInicioAAG(int quadrante) {
			Random sorteio = new Random();
			if(quadrante==1) {
				x=sorteio.nextInt(5);
				y=sorteio.nextInt(9);
			}else if(quadrante==2) {
				x=sorteio.nextInt(5);
				y= sorteio.nextInt(8,17);
			}else if(quadrante==3) {
				x= sorteio.nextInt(4,9);
				y=sorteio.nextInt(9);
			} else {
				x= sorteio.nextInt(4,9);
				y= sorteio.nextInt(8,17);
			}
			System.out.println("x="+x);
			System.out.print("y="+y);
			System.out.print("\n");
		}
		
		//Area que o goleiro vai atuar
		public void AreaGoleiro(int AAG) {
			int verde;
			int aux1,aux2,aux3;
			SorteioInicioAAG(4);
			verde=x;
			aux1=x;
			aux2=x;
			aux3=x;
			int j=0;
			
					if(AAG>=1&&AAG<=4) {
						for(int i=1; i<=AAG;i++) {	
							verde=x--;
							System.out.println("x="+verde);
						}
					}else
					if(AAG<=8) {
						for(int i=1; i<=4;i++) {	
							j=j+1;
							verde=x--;
							System.out.println("x="+verde);
						
						}
						verde=y+1;
						System.out.println("y="+verde);
						
						for(int i=1; i<=(AAG-j);i++) {
						System.out.println("X="+aux1);
						aux1--;
						}
					}else
					if(AAG<=12) {
						for(int i=1; i<=4;i++) {	
							verde=x--;
							System.out.println("x="+verde);
						
						}
						verde=y+1;
						System.out.println("y="+verde);
						j=4;
						for(int i=1; i<=4;i++) {
							j=j+1;
							System.out.println("X="+aux1);
							aux1--;
							
						}
						
						verde=y+2;
						System.out.println("y="+verde);
							
						for(int i=1; i<=(AAG-j);i++) {
							System.out.println("xx="+aux2);
							aux2--;
							}
						}
						else {
				
							for(int i=1; i<=4;i++) {	
								verde=x--;
								System.out.println("x="+verde);
							
							}
							verde=y+1;
							System.out.println("y="+verde);
							for(int i=1; i<=4;i++) {
								System.out.println("X="+aux1);
								aux1--;
								
							}
							
							verde=y+2;
							System.out.println("y="+verde);
							
							j=8;
							for(int i=1; i<=4;i++) {
								j=j+1;
								System.out.println("xx="+aux2);
								aux2--;
								}
							verde=y+3;
							System.out.println("y="+verde);
							
							for(int i=1; i<=(AAG-j);i++) {
								System.out.println("XX="+aux3);
								aux3--;
								}
							
							
						}
					}
	 
}
package avaliacao_de_goleiros;
//Ap01(Antonio Acrisio Caxias Sousa)
public class Main {

	public static void main(String[] args) {
		//Instância chutes
		Chute_Ao_Gol chute01 = new Chute_Ao_Gol (1, 2, 1, 4 ,7);
		Chute_Ao_Gol chute02 = new Chute_Ao_Gol (2, 6, 1, 3, 6);
		Chute_Ao_Gol chute03 = new Chute_Ao_Gol (3, 9, 2, 4, 15);
		Chute_Ao_Gol chute04 = new Chute_Ao_Gol (4, 5, 4, 6, 11);
		Chute_Ao_Gol chute05 = new Chute_Ao_Gol (5, 3, 4, 8, 13);
		Chute_Ao_Gol chute06 = new Chute_Ao_Gol (6, 3, 3, 6, 4);
		Chute_Ao_Gol chute07 = new Chute_Ao_Gol (7, 4, 4, 5, 8);
		Chute_Ao_Gol chute08 = new Chute_Ao_Gol (8, 7, 4, 7, 14);
		Chute_Ao_Gol chute09 = new Chute_Ao_Gol (9, 8, 4, 7, 14);
		Chute_Ao_Gol chute10 = new Chute_Ao_Gol (10, 4, 4, 6, 12);
		Chute_Ao_Gol chute11 = new Chute_Ao_Gol (11, 2, 4, 5, 15);
		Chute_Ao_Gol chute12 = new Chute_Ao_Gol (12, 7, 3, 6, 4);
		Chute_Ao_Gol chute13 = new Chute_Ao_Gol (13, 3, 3, 8, 2);
		Chute_Ao_Gol chute14 = new Chute_Ao_Gol (14, 9, 4, 7, 10);
		Chute_Ao_Gol chute15 = new Chute_Ao_Gol (15, 10, 4, 7, 12);
		Chute_Ao_Gol chute16 = new Chute_Ao_Gol (16, 5, 1, 4, 2);
		Chute_Ao_Gol chute17 = new Chute_Ao_Gol (17, 3, 4, 5, 13);
		Chute_Ao_Gol chute18 = new Chute_Ao_Gol (18, 10, 2, 4, 16);
		Chute_Ao_Gol chute19 = new Chute_Ao_Gol (19, 10, 4, 5, 16);
		Chute_Ao_Gol chute20 = new Chute_Ao_Gol (20, 10, 2, 3, 14);
		Chute_Ao_Gol chute21 = new Chute_Ao_Gol (21, 9, 2, 1, 8);
		Chute_Ao_Gol chute22 = new Chute_Ao_Gol (22, 4, 4, 8, 16);
		Chute_Ao_Gol chute23 = new Chute_Ao_Gol (23, 8, 4, 6, 14);
		Chute_Ao_Gol chute24 = new Chute_Ao_Gol (24, 7, 4, 7, 11);
		Chute_Ao_Gol chute25 = new Chute_Ao_Gol (25, 6, 1, 0, 3);
		Chute_Ao_Gol chute26 = new Chute_Ao_Gol (26, 5, 3, 6, 7);
		Chute_Ao_Gol chute27 = new Chute_Ao_Gol (27, 3, 3, 8, 4);
		Chute_Ao_Gol chute28 = new Chute_Ao_Gol (28, 4, 3, 6, 7);
		Chute_Ao_Gol chute29 = new Chute_Ao_Gol (29, 10, 2, 2, 13);
		Chute_Ao_Gol chute30 = new Chute_Ao_Gol (30, 7, 3, 5, 3);
		
		//Instância Goleiros
		Goleiro goleiro01 = new Goleiro(1, "Pratik Skaggs" ,5, 7, 8, 9, 6, 6);
		Goleiro goleiro02 = new Goleiro(2, "Uehudah Hack", 9, 6, 8, 8, 7, 10);
		Goleiro goleiro03 = new Goleiro(3, "Edison Drye", 5, 8, 5, 8, 10, 7);
		Goleiro goleiro04 = new Goleiro(4, "Ajani Harding", 6, 6, 5, 8, 7, 6);
		Goleiro goleiro05 = new Goleiro(5, "Orazio Hart", 5, 8, 7, 9, 9, 10);
		Goleiro goleiro06 = new Goleiro(6, "Tristan Karns", 9, 7, 10, 7, 7, 6);
		Goleiro goleiro07 = new Goleiro(7, "Niven Glaser", 10, 9, 7, 6, 5, 8);
		Goleiro goleiro08 = new Goleiro(8, "Derwyn Devers", 10, 7, 9, 5, 9, 5);
		Goleiro goleiro09 = new Goleiro(9, "Tod Phan", 10, 7, 7, 5, 5, 6);
		Goleiro goleiro10 = new Goleiro(10, "Eddie Hulse", 7, 6, 5, 9, 7, 5);
		Goleiro goleiro11 = new Goleiro(11, "Welford Yepez", 5, 8, 8, 7, 7, 8);
		Goleiro goleiro12 = new Goleiro(12, "Rishley Snyder", 6, 5, 6, 5 ,7 ,6);
		Goleiro goleiro13 = new Goleiro(13, "Milo Mccurdy", 10, 9, 8, 6, 10, 9);
		Goleiro goleiro14 = new Goleiro(14, "Carden Justus", 8, 5, 8, 5, 10, 7);
		Goleiro goleiro15 = new Goleiro(15, "Carlyon Gorby", 8 ,5 ,8 ,8, 8, 6);
		Goleiro goleiro16 = new Goleiro(16, "Mungo Spangler", 8 ,10 ,9 ,8, 9 ,5);
		Goleiro goleiro17 = new Goleiro(17, "Whitmore Squires", 9, 10, 7, 9, 9 ,10);
		Goleiro goleiro18 = new Goleiro(18, "Pedrog Mccurdy", 8, 5 ,10 ,5 ,7 ,7);
		Goleiro goleiro19 = new Goleiro(19, "Ridgley Leo", 8, 8 ,8 ,9 ,9 ,9);
		Goleiro goleiro20 = new Goleiro(20, "Bolton Tarin", 9, 8, 7, 6, 9, 10);
		Goleiro goleiro21 = new Goleiro(21, "Edison Loy", 7, 7, 5, 10, 10, 7);
		Goleiro goleiro22 = new Goleiro(22, "Delling Herndon", 7 ,5 ,5 ,8 ,9 ,9);
		Goleiro goleiro23 = new Goleiro(23, "Senichi Iorio", 7, 7, 5, 8, 10, 5);
		Goleiro goleiro24 = new Goleiro(24, "Albin Kerner", 6, 7, 8, 8, 9, 9);
		Goleiro goleiro25 = new Goleiro(25, "Jivin Justus", 9, 10, 8, 7, 7, 5);
		Goleiro goleiro26 = new Goleiro(26, "Clement Fleisher", 10, 9, 10, 5, 7, 8);

		
		
	}

}

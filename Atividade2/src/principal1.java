import java.util.Scanner;


public class principal1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		urna urna= new urna();
		
		int candidatos[]=new int[4];
		int votosbrancos=0;
		int votosnulos=0;
		int opcao =0;
	    
		do {
			System.out.println("Urna Eletrocnica");
			System.out.println("Opções de votos:");
			System.out.println("1 - Para votar:");
			System.out.println("2 - Votar em branco");
			System.out.println("3 - Anular o voto");
			System.out.println("4 - Apurar a eleição");
			System.out.println("0 - Sair");
			
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				
				int voto=0;
				System.out.println("Digite o numero do candidato em que deseja votar:");
				voto=sc.nextInt();
				urna.Votacao(voto);
				break;
				
             case 2:
				
				urna.votarEmBranco();
				
				break;
			case 3:
				
				urna.anularOVoto();
				break;
			
            case 4:
				
				candidatos=urna.getCandidatos();
				votosbrancos=urna.getVotosbrancos();
				votosnulos=urna.getVotosnulos();
				
				System.out.println("Apuração de votos");
				System.out.println("Candidato 1: " +candidatos[0]);
				System.out.println("Candidato 2: "+candidatos[1]);
				System.out.println("Canditato 3:" +candidatos[2]);
				System.out.println("Canditato 4:" +candidatos[3]);		
				System.out.println("Votos Brancos:" +votosbrancos);
				System.out.println("Votos Nulos:" +votosnulos);
				
				System.out.println("Votação encerrada!!!");
				
				break;
				
            default:
				
				System.out.println("Votaçao Encerrada.");
			
	

  }
}
	
		while (opcao !=0);
		sc.close();	
  }
	
}
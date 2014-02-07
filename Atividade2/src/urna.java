
public class urna {
	
	private int votosbrancos;
	private int votosnulos;
	private int candidatos[] = new int[4];

	
   public void Urna (){
		
	}
	
	public void Votacao(int voto){
		if (voto == 1){
			candidatos[0]++;
		}
		else{
			if (voto == 2){
				candidatos[1]++;
			}
			else
			{
				if (voto == 3){
					candidatos[2]++;
				}
				else
				{
					if (voto == 4){
						candidatos[3]++;
					}
				}
			}
		}
	}
	

	public void votarEmBranco(){
		votosbrancos++;
	}
	
	public void anularOVoto(){
		votosnulos++;
	}
	
	
	public int getVotosbrancos() {
		return votosbrancos;
	}

	public int getVotosnulos() {
		return votosnulos;
	}

	public int[] getCandidatos() {
		return candidatos;
	}

}

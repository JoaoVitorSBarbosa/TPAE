class Horario {
	int hora;
	int minuto;
	int segundo;

	Horario (int hora,int minuto,int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	Horario (int segundos) {
		hora = segundos / 3600;
		segundos = segundos - (hora * 3600);
		minuto = segundos / 60;
                this.segundo = segundos - (minuto * 60);
	}
	
	int getHora () {
		return hora;
	}
	int getMinuto () {
        	return minuto;
        }
	int getSegundo () {
        	return segundo;
        }

	void getHorario() {
		System.out.printf("%02dh:%02dm:%02ds \n", getHora(), getMinuto(), getSegundo());
	}
}

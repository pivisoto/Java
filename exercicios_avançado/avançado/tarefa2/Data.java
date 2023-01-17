public class Data {
	int mes;
	int dia;
	int ano;

	public Data(int dia, int mes, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}
	public void setData(int dia,int mes, int ano) {
		if(ano >= 1970) {
			if((mes >= 1) && (mes <=12)) {
				if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
					if (dia >= 1 && dia <= 31) {
						this.dia = dia;
						this.mes = mes;
						this.ano = ano;
					}
					else {
						this.dia = 1;
						this.mes = 1;
						this.ano = 1970;
					}
				}
				else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					if (dia >= 1 && dia <= 30) {
						this.dia = dia;
						this.mes = mes;
						this.ano = ano;
					}
					else {
						this.dia = 1;
						this.mes = 1;
						this.ano = 1970;
					}
				}
			}
			else {
				this.dia = 1;
				this.mes = 1;
				this.ano = 1970;
			}
		}
		else {
			this.dia = 1;
			this.mes = 1;
			this.ano = 1970;
		}
	}

public int getDia(int dia){
    return dia;
}
public int getMes(int mes){
    return mes;
}
public int getAno(int ano){
    return ano;
}
public boolean isBissexto(int ano){
    if (ano % 4 == 0){
        return true;
        }
        else{
            return false;
        }
    }
@Override
public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}



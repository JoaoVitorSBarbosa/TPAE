public abstract class Salario {
    private final double SALARIO_MINIMO = 1000;

    public abstract double calculaDescVT(double salarioBruto);
    public abstract double calculaDescPS(double salarioBruto);
    
    public final double calcularSalarioLiquido(double salarioBruto){
        
        //Desconto do INSS
        double descINSS = 0;
        if(salarioBruto == SALARIO_MINIMO){
            descINSS = salarioBruto * 0.07;
        }else if(salarioBruto < 2 * SALARIO_MINIMO ){
            descINSS = salarioBruto * 0.1;
        }else if(salarioBruto < 3 * SALARIO_MINIMO){
            descINSS = salarioBruto * 0.12;
        }else if(salarioBruto < 4 * SALARIO_MINIMO){
            descINSS = salarioBruto * 0.14;
        }else{
            descINSS = salarioBruto * 0.2;
        }
        //Desconto do Imposto de Renda Retido na Fonte
        double descIRRF = 0;
        if(salarioBruto == SALARIO_MINIMO){
            descIRRF = 0;
        }else if(salarioBruto < 2 * SALARIO_MINIMO ){
            descIRRF = salarioBruto * 0.075;
        }else if(salarioBruto < 3 * SALARIO_MINIMO){
            descIRRF = salarioBruto * 0.15;
        }else if(salarioBruto < 4 * SALARIO_MINIMO){
            descIRRF = salarioBruto * 0.225;
        }else{
            descIRRF = salarioBruto * 0.275;
        }
        //Desconto com Vale Transporte
        double descVT = calculaDescVT(salarioBruto);
        //Desconto com Plano de Saude
        double descPS = calculaDescPS(salarioBruto);
        //Calculo do Salario Liquido
        return (salarioBruto - descINSS - descIRRF - descVT - descPS);
    }
}
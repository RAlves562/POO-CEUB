public class imc{
    private Double imcPessoa;
    public Double imcResultado;
    public Double imcBaixoPeso;
    public Double imcPesoAdequado;
    public Double imcSobrePeso;
    public Double imcObesidadeGrau1;
    public Double imcObesidadeGrau2;
    public Double imcObesidadeGrau3;

private static double calcularImcPessoa(double peso, double altura) {
     double imc = 0.0;
     imc = peso / ( Math.pow(altura, 2) );
     return imc;
}
public static double mostrarImc;{
    System.out.println("Nome:" + this.nomePessoa);
    System.out.println("peso" + this.pesoPessoa);
    system.out.println("Altura" + this.alturaPessoa);
    system.out.println("Imc" + this.imcPessoa);
}   
public static double classificarImc;{
if (imcResultado < 18.5){
    System.out.println("Baixo Peso: " + this.imcBaixoPeso);
}
else if (imcResultado > 18.5 && imcResultado < 24.9) {
    System.out.println("Peso Adequado: " + this.imcPesoAdequado);
}
else if (imcResultado >= 25 && imcResultado <= 29.9) {
    System.out.println("sobre Peso: " + this.imcSobrePeso);
}
else if (imcResultado > 30 && imcResultado < 34.9){
    system.out.println("Obesidade Grau1: " + this.imcObesidadeGrau1);
}
else if (imcResultado > 35 && imcResultado < 39.9){
    system.out.println("Obesidade Grau2: " + this.imcObesidadeGrau2);
}
else {
    system.out.println("Obesidade Grau3: " + this.imcObesidadeGrau3);
} 
}
}
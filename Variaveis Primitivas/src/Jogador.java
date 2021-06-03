public class Jogador {
    private byte idade;
    private int totalDePartidas;
    private long totalDePontos;
    private char sexoM = 'M';
    private char sexoF = 'F';
    private float peso;
    private double salario;
    private boolean online = true;

    public void definirIdade() {
        this.idade = 32;
        System.out.println("O jogador tem " + getIdade());
    }

    public void totalDePartidas() {
        this.totalDePartidas = 2147483647;
        System.out.println("O jogador jogou " + getTotalDePartidas() + " partidas");

    }
    
    public void totalDePontos() {
        this.totalDePontos = 922337203;
        System.out.println("O jogador possui " + getTotalDePontos() + " pontos");
    }

    public void peso() {
        this.peso = 64.4f;  
        System.out.println("O jogador pesa " + getPeso());
    }
    
    public void definirSexoM() {
        this.sexoM = 'M';
        System.out.println("O jogador é do sexo " + getSexoM());        
    }    
    
    public void definirSexoF() {
        this.sexoM = 'F';   
        System.out.println("O jogador é do sexo " + getSexoF());     
    }
    
    public void salario() {
        this.salario = 3.156785;
        System.out.println("Seu sálario é de " + getSalario());
    }

    public void online() {
        this.online = true;
        System.out.println("O jogador esta jogando agora");
    }

    
    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    public int getTotalDePartidas() {
        return totalDePartidas;
    }
    public void setTotalDePartidas(int totalDePartidas) {
        this.totalDePartidas = totalDePartidas;
    }
    public long getTotalDePontos() {
        return totalDePontos;
    }
    public void setTotalDePontos(long totalDePontos) {
        this.totalDePontos = totalDePontos;
    }
    public char getSexoM() {
        return sexoM;
    }
    public void setSexoM(char sexoM) {
        this.sexoM = sexoM;
    }
    public char getSexoF() {
        return sexoF;
    }
    public void setSexoF(char sexoF) {
        this.sexoF = sexoF;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public boolean isOnline() {
        return online;
    }
    public void setOnline(boolean online) {
        this.online = online;
    }

    

    
}

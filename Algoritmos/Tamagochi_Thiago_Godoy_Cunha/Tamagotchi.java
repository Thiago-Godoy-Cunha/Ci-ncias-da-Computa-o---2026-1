/**
 * Classe que representa o ancestral dos pokemons, o Tamagotchi.
 * Autor: Thiago Godoy Cunha
 */
public class Tamagotchi {
    private String nome;
    private int idade;
    private int peso;
    private int vezesAcordado;

    // Construtor
    public Tamagotchi(String nome) {
        this.nome = nome;
        this.idade = 0;  
        this.peso = 1;    
        this.vezesAcordado = 0;
    }

    // Getters
    public String getNome() { return this.nome; }
    public int getIdade() { return this.idade; }
    public int getPeso() { return this.peso; }
    public int getVezesAcordado() { return this.vezesAcordado; }

    // Aumenta idade e zera contador de sono
    public void dormir() {
        this.idade = this.idade + 1;
        this.vezesAcordado = 0;
        if (!this.isVivo()) {
            System.out.println("Infelizmente, " + this.nome + " faleceu durante o sono.");
        } else {
            System.out.println(this.nome + " dormiu e agora tem " + this.idade + " dias de idade.");
        }
    }

    // Conta vezes pulou sono
    public void permanecerAcordado() {
        this.vezesAcordado = this.vezesAcordado + 1;
        System.out.println(this.nome + " continuou acordado.");
    }

    // Aumenta 5kg no peso e obriga a dormir
    public void comerMuito() {
        this.peso = this.peso + 5;
        System.out.println(this.nome + " comeu muito e engordou 5 kg, depois disso, bateu o soninho das 14 horas e foi dormir.");
        this.dormir(); 
    }

    // Come pouco e aumenta 1kg no peso
    public void comerPouco() {
        this.peso = this.peso + 1;
        System.out.println(this.nome + " comeu pouco e engordou 1 kg.");
    }

    // Não come e diminui 2kg no peso
    public void naoComer() {
        this.peso = this.peso - 2;
        System.out.println(this.nome + " não comeu e emagreceu 2 kg.");
    }

    // Corre, diminui 4kg no peso e manda comer muito
    public void correr() {
        this.peso = this.peso - 4;
        System.out.println(this.nome + " correu por 10 minutos e emagreceu 4 kg.");
    }

    // Caminha e diminui 1 kg no peso
    public void caminhar() {
        this.peso = this.peso - 1;
        System.out.println(this.nome + " caminhou por 10 minutos e emagreceu 1 kg.");
    }

    // Verifica se morre
    public boolean isVivo() {
        if (this.idade >= 15) {
            return false; // Morreu de velhice
        } else if (this.peso <= 0) {
            return false; // Morreu desnutrido
        } else if (this.peso > 20) {
            return false; // Explodiu
        } else {
            return true;  // Continua vivo
        }
    }
}
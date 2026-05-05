/**
 * Classe principal que controla as interações com oo Tamagotchi.
 * Autor: Thiago Godoy Cunha
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao simulador de Tamagotchi!");
        System.out.println("'É tipo pokemon, só que sem rinha'\n");
        System.out.println("Digite o nome do seu pokeavô: ");
        
        String nome = Teclado.leString();
        Tamagotchi tama = new Tamagotchi(nome);

        while (tama.isVivo()) {
            System.out.println("\n\n\n-------------------------\n-------------------------");
            System.out.println("Status de " + tama.getNome());
            System.out.println("Idade: " + tama.getIdade() + " dias de idade | Peso: " + tama.getPeso() + " kg");
            System.out.println("-------------------------\n-------------------------");

            int evento = (int)(Math.random() * 3) + 1;

            if (evento == 1) {
                lidarSono(tama);
            } else if (evento == 2) {
                lidarFome(tama);
            } else if (evento == 3) {
                lidarTedio(tama);
            }
        }

        System.out.println("\nProcure um centro Pokemon, seu Tamagotchi foi de arrasta pra cima");
        if (tama.getIdade() >= 15) {
            System.out.println(tama.getNome() + " faleceu de velhice aos 15 dias.");
            System.exit(0);
        } 
        if (tama.getPeso() <= 0) {
            System.out.println(tama.getNome() + " morreu desnutrido e o Ibama vai te pegar.");
            System.exit(0);
        } 
        if (tama.getPeso() > 20) {
            System.out.println(tama.getNome() + " comeu tanto que virou um balão, começou a levitar ultrapassando a atmosfera e, ao orbitar a terra, explodiu em colisão com outro Tamagotchi rechonchudo!");
            System.exit(0);
        }
    }

    // Método para organizar a lógica quando ele ta com sono
    public static void lidarSono(Tamagotchi tama) {
        System.out.println("\n\n\n" + tama.getNome() + " está com SONO.");

        // Força dormir
        if (tama.getVezesAcordado() >= 5) {
            System.out.println("Como ficou acordado 5 vezes seguidas, ele desmaiou de sono!");
            tama.dormir();
        } else {
            boolean respcorr = false;
            
            while (!respcorr) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Dormir");
                System.out.println("2 - Permanecer acordado");
                int opcao = Teclado.leInt();
    
                if (opcao == 1) {
                    tama.dormir();
                    respcorr = true;
                } 
                if (opcao == 2) {
                    tama.permanecerAcordado();
                    respcorr = true;
                }
                if (opcao < 1 || opcao > 2) {
                    System.out.println("Resposta não está entre as opções");
                }
            }
        }
    }

    // Método para organizar a lógica quando ele ta com fome
    public static void lidarFome(Tamagotchi tama) {
        System.out.println("\n\n\n" + tama.getNome() + " está com FOME.");
            
        boolean respcorr = false;
        
        while (!respcorr) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Comer muito");
            System.out.println("2 - Comer pouco");
            System.out.println("3 - Não comer");
            int opcao = Teclado.leInt();
    
            if (opcao == 1) {
                tama.comerMuito();
                respcorr = true;
            } 
            if (opcao == 2) {
                tama.comerPouco();
                respcorr = true;
            } 
            if (opcao == 3) {
                tama.naoComer();
                respcorr = true;
            }
            if (opcao < 1 || opcao > 3) {
                System.out.println("Resposta não está entre as opções");
            }
        }
    }

    // Método para organizar a lógica quando ele ta entediado
    public static void lidarTedio(Tamagotchi tama) {
        System.out.println("\n\n\n" + tama.getNome() + " está ENTEDIADO.");
            
        boolean respcorr = false;
        
        while (!respcorr) {
            System.out.println("Escolha uma opção de exercício:");
            System.out.println("1 - Correr 10 minutos");
            System.out.println("2 - Caminhar 10 minutos");
            
            int opcao = Teclado.leInt();
    
            if (opcao == 1) {
                tama.correr();
                if (tama.isVivo()) {
                    System.out.println("O exercício deu muita fome...");
                    tama.comerMuito();
                }
                respcorr = true;
            } 
            if (opcao == 2) {
                tama.caminhar();
                if (tama.isVivo()) {
                    System.out.println("O exercício deu fome...");
                    lidarFome(tama); 
                }
                respcorr = true;
            }
            if (opcao < 1 || opcao > 2) {
                System.out.println("Resposta não está entre as opções");
            }
        }
    }
}

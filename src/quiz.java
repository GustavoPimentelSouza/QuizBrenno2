
import Cabecalho.Cabecalho;

import java.util.Scanner;

public class quiz {
    public String aluno;
    public String Professor;
    public String materia;
    public String Curso;
    public void escrevacabecalho() {


    }

    public static void main(String[] args) throws Exception {

        Cabecalho head = new Cabecalho();
        head.aluno = "Gustavo Pimentel Souza";
        head.Professor = "Brenno Pimenta";
        head.materia= "Algoritmo e programação II";
        head.curso = "Engenharia de Software";
        head.cabecalho();


        int numeroAcertos = 0;
        System.out.println("========================================================================================================");
        System.out.println("Iniciaremos agora o quiz de 15 questões sobre conhecimento gerais!");
        System.out.println("Primeira Pergunta!!");

        numeroAcertos += perguntaum();
        numeroAcertos += perguntadois();
        numeroAcertos += perguntatres();
        numeroAcertos += perguntaquatro();
        numeroAcertos += perguntacinco();
        numeroAcertos += perguntaseis();
        numeroAcertos += perguntasete();
        numeroAcertos += perguntaoito();
        numeroAcertos += perguntanove();
        numeroAcertos += perguntadez();
        numeroAcertos += perguntaonze();
        numeroAcertos += perguntadoze();
        numeroAcertos += perguntatreze();
        numeroAcertos += perguntaquatorze();
        numeroAcertos += perguntaquinze();



        System.out.println("Fim do Quiz! Parabéns... De 15 perguntas você acertou: " + numeroAcertos);
    }

    public static int perguntaum() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("1)Qual o carro mais rapido do mundo?");
        questao1.setOpcaoA("A - Ford Mustang GT500" );
        questao1.setOpcaoB("B - Ford Maverick");
        questao1.setOpcaoC("C - Ford Del Rey");
        questao1.setOpcaoD("D - Ford Escort");
        questao1.setOpcaoE("E - Uno com escada");
        questao1.setCorreta("E");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }

    public static int perguntadois()  {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao2 = new Questao();
        questao2.setPergunta("2 - Qual a maior marca de carros esportivos do mundo? ");
        questao2.setOpcaoA("A -  Porsche");
        questao2.setOpcaoB("B - Ferrari");
        questao2.setOpcaoC("C - Mercedes");
        questao2.setOpcaoD("D - Ford");
        questao2.setOpcaoE("E - Red Bull");
        questao2.setCorreta("A");
        questao2.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao2.isCorreta(respostaUsuario) )  {
            cont++;
        }
        System.out.println("========================================================================");



        return cont;
    }

    public static int perguntatres()  {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao3 = new Questao();
        questao3.setPergunta("3 - Carro de corrida mais rápido do mundo ");
        questao3.setOpcaoA("A - Uno");
        questao3.setOpcaoB("B - Koenigsegg Agera RS");
        questao3.setOpcaoC("C - Ferrari");
        questao3.setOpcaoD("D - Porsche");
        questao3.setOpcaoE("E - Retrovisores");
        questao3.setCorreta("B");
        questao3.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao3.isCorreta(respostaUsuario) )  {
            cont++;
        }
        System.out.println("========================================================================");



        return cont;
    }


    public static int perguntaquatro()  {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao4 = new Questao();
        questao4.setPergunta("4 - Melhor piloto de formula 1?");
        questao4.setOpcaoA("A - Verstappen");
        questao4.setOpcaoB("B - Felipe ");
        questao4.setOpcaoC("C - Alain Prost e Fernando Alonso ");
        questao4.setOpcaoD("D - Sergio Pérez");
        questao4.setOpcaoE("E - Lewis Hamilton");
        questao4.setCorreta("A");
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao4.isCorreta(respostaUsuario) )  {
            cont++;
        }
        System.out.println("========================================================================");



        return cont;
    }
    public static int perguntacinco() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao5 = new Questao();
        questao5.setPergunta("5 - Quem são os 10 melhores pilotos de MotoGP?");
        questao5.setOpcaoA("A - Brazilian Racing Motors" );
        questao5.setOpcaoB("B - Pecco Bagnaia");
        questao5.setOpcaoC("C - Marc Marquez.");
        questao5.setOpcaoD("D - Arrows");
        questao5.setOpcaoE("E - Jorge Martin" );
        questao5.setCorreta("B");
        questao5.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao5.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }public static int perguntaseis() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao6 = new Questao();
        questao6.setPergunta("6 - Melhor piloto de drift do brasil?");
        questao6.setOpcaoA("A - Lando Norris");
        questao6.setOpcaoB("B - Charles Leclerc");
        questao6.setOpcaoC("C - Yuki Tsunoda");
        questao6.setOpcaoD("D - Diego Rafael Higa ");
        questao6.setOpcaoE("E - Logan Sargeant");
        questao6.setCorreta("D");
        questao6.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao6.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }public static int perguntasete() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao7 = new Questao();
        questao7.setPergunta("7 - Melhor piloto de motocross do mundo ? ");
        questao7.setOpcaoA("A - T. Gajser" );
        questao7.setOpcaoB("B - J. Seewer");
        questao7.setOpcaoC("C - J. Prado");
        questao7.setOpcaoD("D - M. Renaux");
        questao7.setOpcaoE("E - C. VLAANDEREN");
        questao7.setCorreta("A");
        questao7.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao7.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }public static int perguntaoito() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao8 = new Questao();
        questao8.setPergunta("8 - Em 2017 o último piloto brasileiro a correr pela Fórmula 1, Felipe Massa, participou de sua última corrida por qual escuderia? ");
        questao8.setOpcaoA("A - Ferrari " );
        questao8.setOpcaoB("B - Mercedes");
        questao8.setOpcaoC("C - Mclaren");
        questao8.setOpcaoD("D - Haas");
        questao8.setOpcaoE("E - Williams");
        questao8.setCorreta("E");
        questao8.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao8.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntanove() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao9 = new Questao();
        questao9.setPergunta("9 - Em qual destes circuitos foi disputada o primerio Grande Prêmio de Formula 1?");
        questao9.setOpcaoA("A - Circuit de Monaco / Mônaco" );
        questao9.setOpcaoB("B - Circuit of the Americas / EUA");
        questao9.setOpcaoC("C - Silverstone / Inglaterra");
        questao9.setOpcaoD("D - Interlagos / Brasil");
        questao9.setOpcaoE("E - Circuit de Monza / Itália");
        questao9.setCorreta("C");
        questao9.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao9.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntadez() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao10 = new Questao();
        questao10.setPergunta("10 - Melhor piloto de moto do brasil?");
        questao10.setOpcaoA("A - Lotus");
        questao10.setOpcaoB("B - Valentino Rossi");
        questao10.setOpcaoC("C - Marc Márquez");
        questao10.setOpcaoD("D -  Moronguinho");
        questao10.setOpcaoE("E - Willians");
        questao10.setCorreta("D");
        questao10.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao10.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }public static int perguntaonze() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao11 = new Questao();
        questao11.setPergunta("11 - Maior campeão da MotoGP?");
        questao11.setOpcaoA("A - Giacomo Agostini" );
        questao11.setOpcaoB("B - Valentino Rossi");
        questao11.setOpcaoC("C - Toro Rosso");
        questao11.setOpcaoD("D - Michael Doohan");
        questao11.setOpcaoE("E - Alpha Tauri");
        questao11.setCorreta("A");
        questao11.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao11.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntadoze() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao12 = new Questao();
        questao12.setPergunta("12 - Melhor piloto de formula 2?");
        questao12.setOpcaoA("A - F. Drugovich" );
        questao12.setOpcaoB("B - Resfriamento de discos");
        questao12.setOpcaoC("C - vácuo");
        questao12.setOpcaoD("D - L. Lawson");
        questao12.setOpcaoE("E - L. Sargeant");
        questao12.setCorreta("D");
        questao12.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao12.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntatreze() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao13 = new Questao();
        questao13.setPergunta("13 - Melhor piloto de kart do mundo?");
        questao13.setOpcaoA("A - Juan Fangio  " );
        questao13.setOpcaoB("B - Lewis Hamilton ");
        questao13.setOpcaoC("C - Matheus Morgatto");
        questao13.setOpcaoD("D - Max Verstappen ");
        questao13.setOpcaoE("E - Nikita Mazepin ");
        questao13.setCorreta("C");
        questao13.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao13.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntaquatorze() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao14 = new Questao();
        questao14.setPergunta("14 - Melhor piloto de avião do mundo?");
        questao14.setOpcaoA("A - Svetlana Kapanina" );
        questao14.setOpcaoB("B - Ayrton Senna");
        questao14.setOpcaoC("C - Michael Schumacher");
        questao14.setOpcaoD("D - Erich Hartmann");
        questao14.setOpcaoE("E - Alain Prost");
        questao14.setCorreta("D");
        questao14.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao14.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntaquinze() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao15 = new Questao();
        questao15.setPergunta("1 - No capeonato de 2020, foi registrado no GP da Itália a volta mais rápida da história da Fórmula 1. Com uma volta no tempo de 1m 18s 887, e uma média de 234,36 Km/h, quem foi o Autor desta volta?");
        questao15.setOpcaoA("A - Sebastian Vettel " );
        questao15.setOpcaoB("B - Carlos Sainz");
        questao15.setOpcaoC("C - Abdon de Rezende Vasconcelos");
        questao15.setOpcaoD("D - Lance Stroll");
        questao15.setOpcaoE("E - Alexander Albos");
        questao15.setCorreta("C");
        questao15.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao15.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }


    public static String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    public static boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida ... ");
        return false;
    }

    public static class Questao {
        private String pergunta = "";
        private String opcaoA = "";
        private String opcaoB = "";
        private String opcaoC = "";
        private String opcaoD = "";
        private String opcaoE = "";
        private String correta = "";

        public boolean isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                return false;
            }
        }

        public void escrevaQuestao() {
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
            System.out.println();
        }

        public void setPergunta(String pergunta) {
            this.pergunta = pergunta;
        }

        public void setOpcaoA(String opcaoA) {
            this.opcaoA = opcaoA;
        }

        public void setOpcaoB(String opcaoB) {
            this.opcaoB = opcaoB;
        }

        public void setOpcaoC(String opcaoC) {
            this.opcaoC = opcaoC;
        }

        public void setOpcaoD(String opcaoD) {
            this.opcaoD = opcaoD;
        }

        public void setOpcaoE(String opcaoE) {
            this.opcaoE = opcaoE;
        }

        public void setCorreta(String correta) {
            this.correta = correta;
        }
    }



}
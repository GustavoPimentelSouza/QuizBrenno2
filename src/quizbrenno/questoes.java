
package quizbrenno;

public class questoes{
    String questao1 = "";

    String A = "";

    String B = "";

    String C = "";

    String D = "";

    String E = "";

    String correta = "";
    private boolean questao;

    public void escrevaquestao(){
        System.out.println(this.questao);
        System.out.println(this.A);
        System.out.println(this.B);
        System.out.println(this.C);
        System.out.println(this.D);
        System.out.println(this.E);
        System.out.println(this.correta);
    }

    public boolean iscorreta(String resposta){
        if(resposta.equals(this.correta)){
            System.out.println("RESPOSTA CORRETA, PARABENS!!!!");

            return true;
        }
        else
            System.out.println("RESPOSTA ERRADA!");
        System.out.println("A RESPOSTA CORRETA E" + this.correta);
        return false;
    }
}
package exemplo4;

public class Disciplina {

    private String nomed;
    private Disciplina d;
    private Professor p;
    private Aluno a;

    public Disciplina(String nomed) {
        this.nomed = nomed;
    }

    public Disciplina() {
    }

    public String getNomed() {
        return nomed;
    }

    public void setNomed(String nomed) {
        this.nomed = nomed;
    }

    public Disciplina getD() {
        return d;
    }

    public void setD(Disciplina d) {
        this.d = d;
    }

    public Professor getP() {
        return p;
    }

    public void setP(Professor p) {
        this.p = p;
    }

    public Aluno getA() {
        return a;
    }

    public void setA(Aluno a) {
        this.a = a;
    }

    public void associar(Professor p){
        this.p=p;
    }
    public void mostrarDisciplina(){
        System.out.println("Professor(a) " + p.getNome()+ " da aula de " + nomed);
    }
}
package model;

import java.util.ArrayList;

public class CadProfessor {
    private ArrayList<Professor> professores = new ArrayList<>();

    //@PostMapping - CADASTRAR
    public void cadastrar(Professor p) {
        professores.add(p);
        System.out.println("model.Professor cadastrado: " + p.getNome());
    }

    //@GetMapping - READ
    public void listar() {
        for (Professor p : professores) {
            System.out.println("Nome: " + p.getNome());
        //System.out.println(a); chama automaticamente a toString()
        }
    }
    //@PutMapping – UPDATE
    public void atualizar(String nome, int novaIdade) {
        for (Professor p : professores) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.setIdade(novaIdade);
                System.out.println( " idade atualizada" + novaIdade);
                return;
            }
        }
        System.out.println("model.Professor não encontrado.");
            }
        }


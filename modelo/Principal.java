/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instanciar 10 objetos da classe aluno usando o 
        //construtor cheio
        Aluno aluno01 =  new Aluno(111, "joao", "1111-1111");
        Aluno aluno02 =  new Aluno(222, "haha", "2222-2222");
        Aluno aluno03 =  new Aluno(333, "huhu", "3333-3333");
        Aluno aluno04 =  new Aluno(444, "hihi", "4444-4444");
        Aluno aluno05 =  new Aluno(555, "kkkk", "5555-5555");
        Aluno aluno06 =  new Aluno(666, "shuahsua", "6666-6666");
        Aluno aluno07 =  new Aluno(777, "hohoho", "7777-7777");
        Aluno aluno08 =  new Aluno(888, "hehe", "8888-8888");
        Aluno aluno09 =  new Aluno(999, "kakaka", "9999-9999");
        Aluno aluno10 =  new Aluno(1010, "god", "1010-1010");
        
        //Objeto'listasAlunos' pertence 'a Classe ArrayList'
        //INstanciando uma lista vazia que só receberá obejtos da
        //clase Aluno
        //Classe Tipada ArrayList<T>
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        
        //Adicionando 10 obejos da classe aluno
        //na lista instanciada usando metodo add()
        listaAluno.add(aluno01);
        listaAluno.add(aluno02);
        listaAluno.add(aluno03);
        listaAluno.add(aluno04);
        listaAluno.add(aluno05);
        listaAluno.add(aluno06);
        listaAluno.add(aluno07);
        listaAluno.add(aluno08);
        listaAluno.add(aluno09);
        listaAluno.add(aluno10);
        //listaAluno.add("Aluno11");//Erro - Lista Tipada
        //Não Aceita String
        
        //instanciar 5 obejtos da Classe Aluno
        //e adicionar na listaAlunos
        //usando um laço FOR
        
        /*
        for (int j = 11; j<=15; j++){
            Aluno objAluno = new Aluno(j, "aluno"+j, "1234-"+j+j);
            listaAluno.add(objAluno);
        }
        */
        
        
        //novos objetos definido Fora do For
        //Não posso declarar fora do laço for - senão da erro, le somente 
        //O ultimo indice da lista
        for (int j = 11; j<=15; j++){
            Aluno objAluno1 = new Aluno();
            objAluno1.setIdAluno(j);
            objAluno1.setNome("Novo-Aluno"+j);
            objAluno1.setCelular("9999-"+j+j);
            //objAluno1 = new Aluno(j, "aluno"+j, "1234-"+j+j);
            listaAluno.add(objAluno1);
        }
        
        
        //Leitura dos objetos Adicionados dentro da Lista
        //usando o Laço For
        //Metodo size retorna o tamanho da lista
        //metodo get(index) retorna o elemento da posição Index
        /*for (int i=0; i< listaAluno.size(); i++){
            System.out.println("Aluno "+listaAluno.get(i).getIdAluno()+ " - "+
                                        listaAluno.get(i).getNome()+ " - " +
                                        listaAluno.get(i).getCelular());
        }*/
        
        //Nova leitura de objetos
        //******Não "devo" Declarar dentro do laço for******
        Aluno objAluno = new Aluno();
        
        for(int i = 0; i < listaAluno.size(); i++){
            objAluno = listaAluno.get(i);
            //aluno com ID 999
            if (objAluno.getIdAluno() == 999){
                System.out.println("ENCONTREI O " + objAluno.getNome());
            }
            System.out.println("Aluno "+
                objAluno.getIdAluno()+ " - " + 
                objAluno.getNome());
        
        }
   
    }
    
}

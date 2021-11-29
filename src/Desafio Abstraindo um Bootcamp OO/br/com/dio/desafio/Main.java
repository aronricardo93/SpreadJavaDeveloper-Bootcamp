
package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        
        Curso curso = new Curso();
        Curso curso2 = new Curso();
        
        curso.setTitulo("Java completo");
        curso.setDescricao("Aprenda de forma absoluta sobre Java e OO");
        curso.setCargaHoraria(100);

        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Tudo sobre javascript");
        curso2.setCargaHoraria(75);
                
        Mentoria mentoria = new Mentoria();
        
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Hands On with Java");
        mentoria.setData(LocalDate.now());
        

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Spread Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp...");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devAronRicardo = new Dev();
        Dev devCintia = new Dev();
        
        devAronRicardo.setNome("Aron Ricardo");
        devAronRicardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos : " + 
                devAronRicardo.getConteudosInscritos());
        devAronRicardo.progredir();
        System.out.println("--------");
        System.out.println("Conteúdos inscritos : " + 
                devAronRicardo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos : " + 
                devAronRicardo.getConteudosConcluidos());
        System.out.println("XP: " + devAronRicardo.calcularTotalXp());
        
        System.out.println("---------------------------------------------------");
        
        devCintia.setNome("Cintia Nery");
        devCintia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos : " + 
                devCintia.getConteudosInscritos());
        devCintia.progredir();
        System.out.println("----------");
        System.out.println("Conteúdos inscritos : " + 
                devCintia.getConteudosInscritos());
        System.out.println("Conteúdos concluídos : " + 
                devCintia.getConteudosConcluidos());
        System.out.println("XP: " + devCintia.calcularTotalXp());
    }
    
}

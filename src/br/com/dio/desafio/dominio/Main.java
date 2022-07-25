package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
Curso curso1 = new Curso();
curso1.setTitulo("curso java");
curso1.setDescricao("descricao curso java");
curso1.setCargaHoraria(8);

Curso curso2 = new Curso();
curso2.setTitulo("curso js");
curso2.setDescricao("descriçao curso js");
curso2.setCargaHoraria(6);

Mentoria mentoria = new Mentoria();
mentoria.setTitulo("mentoria de java");
mentoria.setDescricao("descriçao mentoria java");
mentoria.setData(LocalDate.now());

/*System.out.println(curso1);
System.out.println(curso2);
System.out.println(mentoria);*/


Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.setDescricao("Descrição Bootcamp Java Developer");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria);

Dev devDaiane = new Dev();
devDaiane.setNome("Daiane");
devDaiane.inscreverBootcamp(bootcamp);
System.out.println("Conteúdos Inscritos Daiane:" + devDaiane.getConteudoInscritos());
devDaiane.progredir();
devDaiane.progredir();
System.out.println("*_*");
System.out.println("Conteúdos Inscritos Daiane:" + devDaiane.getConteudoInscritos());
System.out.println("Conteúdos Cocluídos Daiane:" + devDaiane.getConteudoConcluidos());
System.out.println("XP:" + devDaiane.calacularTotalxp());

System.out.println("********");

Dev devJoao = new Dev();
devJoao.setNome("Joao");
devJoao.inscreverBootcamp(bootcamp);
System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
devJoao.progredir();
devJoao.progredir();
devJoao.progredir();
System.out.println("*_*");
System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
System.out.println("Conteúdos Inscritos João:" + devDaiane.getConteudoConcluidos());
System.out.println("XP:" + devJoao.calacularTotalxp());


    }
}

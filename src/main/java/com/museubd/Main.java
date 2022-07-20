package com.museubd;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.museubd.model.bean.Artista;
import com.museubd.model.bean.ObjetosArte;
import com.museubd.model.dao.ArtistaDAO;
import com.museubd.model.dao.ObjetosArteDAO;

public class Main{
    public static void main(String[] args){

        /*/////////////////////////TESTES ARTISTA/////////////////////////
        Artista artista = new Artista();
        ArtistaDAO artistaDAO = new ArtistaDAO();

        artista.setNome("teste");
        artista.setDescricao("descricao");
        artista.setEstiloPrincipal("estiloPrincipal");
        artista.setPeriodoArt("periodoArt");
        artista.setPaisOrig("paisOrigem");
        artista.setDataNasc(Date.valueOf("2015-03-31"));
        artista.setDataMorte(Date.valueOf("2015-03-31"));

        //INSERT
        artistaDAO.insert(artista);

        //UPDATE
        artista.setDescricao("nova descricao");
        artistaDAO.update(artista);

        //DELETE
        artistaDAO.delete(artista);

        //READ
        List<Artista> artistasList = new ArrayList<>();
        artistasList = artistaDAO.read();
        for(int i = 0; i<artistasList.size(); i++){
            System.out.println(artistasList.get(i).getNome());
        }


        /////////////////////////TESTES OBJETOS_ARTE/////////////////////////
        ObjetosArte objeto = new ObjetosArte();
        ObjetosArteDAO objetoDAO = new ObjetosArteDAO();

        objeto.setNumID(11111);
        objeto.setTitulo("titulo");
        objeto.setNomeArtista("Tarsila do Amaral");
        objeto.setDescricao("descricao");
        objeto.setAnoCriacao(Date.valueOf("2015-03-31"));
        objeto.setPeriodoArt("periodo_art");
        objeto.setPaisCultura("pais_cultura");
        objeto.setEstilo("estilo");
        objeto.setTipo("pintura");
        objeto.setStatus("permanente");
        objeto.setCusto(200.0);

        //INSERT
        objetoDAO.insert(objeto);

        //UPDATE
        objeto.setDescricao("nova descricao");
        objetoDAO.update(objeto);

        //DELETE
        objetoDAO.delete(objeto);

        //READ
        List<ObjetosArte> objetosArteList = new ArrayList<>();
        objetosArteList = objetoDAO.read();
        for(int i = 0; i<objetosArteList.size(); i++){
            System.out.println(objetosArteList.get(i).getTitulo());
        }*/



        Scanner op = new Scanner(System.in);
        int option;
        do {

            System.out.println("---- Consultas básicas ----");
            System.out.println("Artistas: 1 para cadastrar, 2 para listar, 3 para alterar e 4 para excluir");
            System.out.println("Objetos de arte: 5 para cadastrar, 6 para listar, 7 para alterar e 8 para excluir");
            System.out.println("Coleção: 9 para cadastrar, 10 para listar");
            System.out.println("Exposição: 11 para cadastrar, 12 para listar");
            System.out.println("---- Consultas especiais ----");
            System.out.println("13 para listar objetos comprados por tipo e por classe (emprestado ou próprio)");
            System.out.println("14 para listar as coleções com maiores números de empréstimo por mês");
            System.out.println("15 para listar as coleções com maiores números de empréstimo por ano");
            System.out.println("16 para listar as compras de objetos de arte por mês");
            System.out.println("17 para listar as compras de objetos de arte por ano");
            System.out.println("18 para curva de gastos");
            System.out.println("19 para listar a quantidade de objetos emprestados por coleção");
            System.out.println("20 para listar a quantidade de objetos emprestados por mês");
            System.out.println("21 para curva com os totais por coleção e por museu");
            System.out.println("22 para sair");

            
            option = op.nextInt();
            
            switch(option){
                case 1:
                    cadastrarArtista();
                    break;
                case 2:
                    listarArtistas();
                    break;
                case 3:
                    alterarArtista();
                    break;
                case 4:
                    excluirArtista();
                    break;
                case 5:
                    cadastrarObjeto();
                    break;
                case 6:
                    listarObjetos();
                    break;
                case 7:
                    alterarObjeto();
                    break;
                case 8:
                    excluirObjeto();
                    break;
                case 9:
                    cadastrarColecao();
                    break;
                case 10:
                    listarColecoes();
                    break;
                case 11:
                    cadastrarExposicao();
                    break;
                case 12:
                    listarExposicoes();
                    break;
                case 13:
                    //
                    break;
                case 14:
                    //
                    break;
                case 15:
                    //
                    break;
                case 16:
                    //
                    break;
                case 17:
                    //
                    break;
                case 18:
                    //
                    break;
                case 19:
                    //
                    break;
                case 20:
                    //
                    break;
                case 21:
                    //
                    break;
                case 22:
                    System.out.println("Fim das consultas!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while(option != 22);
    }

    static void cadastrarArtista(){
        System.out.println("Cadastro de artista");
        System.out.println("Insira os seguintes dados");
        System.out.println("Nome ");
        Scanner artista = new Scanner(System.in);
        String nome = artista.next();
        System.out.println("Descrição ");
        String descricao = artista.next();
        System.out.println("Estilo principal ");
        String estiloPrincipal = artista.next();
        System.out.println("Período da arte ");
        String periodoArte = artista.next();
        System.out.println("País de origem ");
        String paisOrigem = artista.next();
        System.out.println("Ano do nascimento ");
        int anoNascimento = artista.nextInt();
        System.out.println("Mês do nascimento ");
        int mesNascimento = artista.nextInt();
        System.out.println("Dia do nascimento ");
        int diaNascimento = artista.nextInt();
        System.out.println("Ano da nascimento ");
        int anoMorte = artista.nextInt();
        System.out.println("Mês da morte ");
        int mesMorte = artista.nextInt();
        System.out.println("Dia da morte ");
        int diaMorte = artista.nextInt();

        String traco = "-";
        String dataNasc = anoNascimento + traco + mesNascimento + traco + diaNascimento;
        String dataMort = anoMorte + traco + mesMorte + traco + diaMorte;
        Date dataNascimento = Date.valueOf(dataNasc);
        Date dataMorte = Date.valueOf(dataMort);

        ArtistaDAO.insert(nome, descricao, estiloPrincipal, periodoArte, paisOrigem, dataNascimento, dataMorte);
    }

    static void listarArtistas(){
        ArtistaDAO.read();
    }

    static void alterarArtista(){
        System.out.println("Alteração de artista");
        System.out.println("Insira os seguintes dados");
        System.out.println("Artista a ser alterado (nome) ");
        Scanner artista = new Scanner(System.in);
        String nome = artista.next();
        System.out.println("Descrição ");
        String descricao = artista.next();
        System.out.println("Estilo principal ");
        String estiloPrincipal = artista.next();
        System.out.println("Período da arte ");
        String periodoArte = artista.next();
        System.out.println("País de origem ");
        String paisOrigem = artista.next();
        System.out.println("Ano do nascimento ");
        int anoNascimento = artista.nextInt();
        System.out.println("Mês do nascimento ");
        int mesNascimento = artista.nextInt();
        System.out.println("Dia do nascimento ");
        int diaNascimento = artista.nextInt();
        System.out.println("Ano da nascimento ");
        int anoMorte = artista.nextInt();
        System.out.println("Mês da morte ");
        int mesMorte = artista.nextInt();
        System.out.println("Dia da morte ");
        int diaMorte = artista.nextInt();

        String traco = "-";
        String dataNasc = anoNascimento + traco + mesNascimento + traco + diaNascimento;
        String dataMort = anoMorte + traco + mesMorte + traco + diaMorte;
        Date dataNascimento = Date.valueOf(dataNasc);
        Date dataMorte = Date.valueOf(dataMort);

        ArtistaDAO.update(nome, descricao, estiloPrincipal, periodoArte, paisOrigem, dataNascimento, dataMorte);
    }

    static void excluirArtista(){
        System.out.println("Exclusão de artista");
        System.out.println("Insira os seguintes dados");
        System.out.println("Artista a ser alterado (nome) ");
        Scanner artista = new Scanner(System.in);
        String nome = artista.next();

        ArtistaDAO.delete(nome);
    }

    static void cadastrarObjeto(){
        System.out.println("Cadastro de objetos de arte");
        System.out.println("Insira os seguintes dados");
        System.out.println("Título ");
        Scanner objeto = new Scanner(System.in);
        String titulo = objeto.next();
        System.out.println("Nome artista ");
        String nomeArtista = objeto.next();
        System.out.println("Descrição ");
        String descricao = objeto.next();
        System.out.println("Ano de criação ");
        int anoCriacao = objeto.nextInt();
        System.out.println("Período da arte ");
        String periodoArte = objeto.next();
        System.out.println("País da cultura ");
        String paisCultura = objeto.next();
        System.out.println("Estilo ");
        String estilo = objeto.next();
        System.out.println("Custo ");
        double custo = objeto.nextDouble();
        System.out.println("Tipo: 1 para pintura, 2 para escultura, 3 para outros ");
        int tipo = objeto.nextInt();

        String tp, st;
        switch(tipo){
            case 1:
                tp = "pintura"; 
                cadastrarPintura();
                break;
            case 2:
                tp = "escultura";
                cadastrarEscultura();
                break;
            case 3:
                tp = "outros";
                cadastrarOutro();
                break;
        }

        System.out.println("Status: 1 para emprestado, 2 para permanente ");
        int status = objeto.nextInt();

        switch(status){
            case 1:
                st = "permanente";
                cadastrarEmprestado();
                break;
            case 2:
                st = "emprestado";
                cadastrarPermanente();
                break;
        }

        ObjetosArteDAO.insert(titulo, nomeArtista, descricao, anoCriacao, periodoArte, paisCultura, estilo, tp, st, custo);
    }

    static void listarObjetos(){
        ObjetosArteDAO.read();
    }

    static void alterarObjeto(){
        System.out.println("Alteração de objetos de arte");
        System.out.println("Insira os seguintes dados");
        System.out.println("Id a ser alterado ");
        Scanner objeto = new Scanner(System.in);
        int id = objeto.nextInt();
        System.out.println("Título ");
        String titulo = objeto.next();
        System.out.println("Nome artista ");
        String nomeArtista = objeto.next();
        System.out.println("Descrição ");
        String descricao = objeto.next();
        System.out.println("Ano de criação ");
        int anoCriacao = objeto.nextInt();
        System.out.println("Período da arte ");
        String periodoArte = objeto.next();
        System.out.println("País da cultura ");
        String paisCultura = objeto.next();
        System.out.println("Estilo ");
        System.out.println("Custo ");
        double custo = objeto.nextDouble();
        String estilo = objeto.next();
        System.out.println("Tipo: 1 para pintura, 2 para escultura, 3 para outros ");
        int tipo = objeto.nextInt();

        String tp, st;
        switch(tipo){
            case 1:
                tp = "pintura"; 
                cadastrarPintura();
                break;
            case 2:
                tp = "escultura";
                cadastrarEscultura();
                break;
            case 3:
                tp = "outros";
                cadastrarOutro();
                break;
        }

        System.out.println("Status: 1 para emprestado, 2 para permanente ");
        int status = objeto.nextInt();

        switch(status){
            case 1:
                st = "permanente";
                cadastrarEmprestado();
                break;
            case 2:
                st = "emprestado";
                cadastrarPermanente();
                break;
        }

        ObjetosArteDAO.update(id, titulo, nomeArtista, descricao, anoCriacao, periodoArte, paisCultura, estilo, tp, st, custo);
    }

    static void excluirObjeto(){
        System.out.println("Cadastro de objetos de arte");
        System.out.println("Insira os seguintes dados");
        System.out.println("Id do objeto ");
        Scanner objeto = new Scanner(System.in);
        int id = objeto.nextInt();

        ObjetosArteDAO.delete(id);
    }
    
    static void cadastrarPintura(){
        System.out.println("Cadastro de pintura");
        System.out.println("Insira os seguintes dados");
        System.out.println("Objeto a que se referencia "); //fk
        Scanner pintura = new Scanner(System.in);
        int objeto = pintura.nextInt();
        System.out.println("Tipo de tinta ");
        String tipo = pintura.next();
        System.out.println("Suporte ");
        String suporte = pintura.next();

        cadastroPintura(objeto, tipo, suporte);
    }

    static void listarPinturas(){
        listaPinturas();
    }

    static void cadastrarEscultura(){
        System.out.println("Cadastro de escultura");
        System.out.println("Insira os seguintes dados");
        System.out.println("Objeto a que se referencia "); //fk
        Scanner escultura = new Scanner(System.in);
        int objeto = escultura.nextInt();
        System.out.println("Material ");
        String material = escultura.next();
        System.out.println("Altura ");
        int altura = escultura.nextInt();
        System.out.println("Peso ");
        int peso = escultura.nextInt();

        cadastroEscultura(objeto, material, altura, peso);
    }

    static void listarEsculturas(){
        listaEsculturas();
    }

    static void cadastrarOutro(){
        System.out.println("Cadastro de outro tipo de objeto");
        System.out.println("Insira os seguintes dados");
        System.out.println("Objeto a que se referencia "); //fk
        Scanner outro = new Scanner(System.in);
        int objeto = outro.nextInt();
        System.out.println("Tipo ");
        String tipo = outro.next();

        cadastroOutro(objeto, tipo);
    }

    static void listarOutros(){
        listaOutros();
    }

    static void cadastrarEmprestado(){
        System.out.println("Cadastro de empréstimo");
        System.out.println("Insira os seguintes dados");
        System.out.println("Objeto a que se referencia "); //fk
        Scanner emprestimo = new Scanner(System.in);
        int objeto = emprestimo.nextInt();
        System.out.println("Nome coleção ");
        String nomeColecao = emprestimo.next();
        System.out.println("Ano do empréstimo ");
        int anoEmp = emprestimo.nextInt();
        System.out.println("Mês do empréstimo ");
        int mesEmp = emprestimo.nextInt();
        System.out.println("Dia do empréstimo ");
        int diaEmp = emprestimo.nextInt();
        System.out.println("Ano da devolução ");
        int anoDev = emprestimo.nextInt();
        System.out.println("Mês da devolução ");
        int mesDev = emprestimo.nextInt();
        System.out.println("Dia da devolução ");
        int diaDev = emprestimo.nextInt();

        String traco = "-";
        String data1 = anoEmp + traco + mesEmp + traco + diaEmp;
        String data2 = anoDev + traco + mesDev + traco + diaDev;
        Date dataEmprestimo = Date.valueOf(data1);
        Date dataDevolucao = Date.valueOf(data2);

        cadastroEmprestado(objeto, nomeColecao, dataEmprestimo, dataDevolucao);
    }

    static void listarEmprestados(){
        listaEmprestimos();
    }

    static void cadastrarPermanente(){
        System.out.println("Cadastro de permanente");
        System.out.println("Insira os seguintes dados");
        System.out.println("Objeto a que se referencia "); //fk
        Scanner permanente = new Scanner(System.in);
        int objeto = permanente.nextInt();
        System.out.println("Em exposição? 0 para não e 1 para sim");
        int emExposicao = permanente.nextInt();
        System.out.println("Ano da aquisição ");
        int anoAq = permanente.nextInt();
        System.out.println("Mês da aquisição ");
        int mesAq = permanente.nextInt();
        System.out.println("Dia da aquisição ");
        int diaAq = permanente.nextInt();

        String traco = "-";
        String data1 = anoAq + traco + mesAq + traco + diaAq;
        Date dataAquisicao = Date.valueOf(data1);

        cadastroEmprestado(objeto, emExposicao, dataAquisicao);
    }

    static void listarPermanentes(){
        listaPermanentes();
    }

    static void cadastrarExposicao(){
        System.out.println("Cadastro de exposição");
        System.out.println("Insira os seguintes dados");
        System.out.println("Nome ");
        Scanner exposicao = new Scanner(System.in);
        String nomeExposicao = exposicao.next();
        System.out.println("Ano de início ");
        int anoIni = exposicao.nextInt();
        System.out.println("Mês de início ");
        int mesIni = exposicao.nextInt();
        System.out.println("Dia de início ");
        int diaIni = exposicao.nextInt();
        System.out.println("Ano final ");
        int anoFin = exposicao.nextInt();
        System.out.println("Mês final ");
        int mesFin = exposicao.nextInt();
        System.out.println("Dia final ");
        int diaFin = exposicao.nextInt();

        String traco = "-";
        String data1 = anoIni + traco + mesIni + traco + traco + diaIni;
        String data2 = anoFin + traco + mesFin + traco + diaFin;
        Date dataInicio = Date.valueOf(data1);
        Date dataFinal = Date.valueOf(data2);

        cadastroExposicao(nomeExposicao, dataInicio, dataFinal);
    }

    static void listarExposicoes(){
        listaExposicoes();
    }

    static void cadastrarColecao(){
        System.out.println("Cadastro de coleção");
        System.out.println("Insira os seguintes dados");
        System.out.println("Nome ");
        Scanner colecao = new Scanner(System.in);
        String nomeColecao = colecao.next();
        System.out.println("Descrição ");
        String descricao = colecao.next();
        System.out.println("Endereço ");
        String endereco = colecao.next();
        System.out.println("Telefone ");
        String telefone = colecao.next();
        System.out.println("Pessoa de contato ");
        String pessoaContato = colecao.next();
        System.out.println("Tipo da coleção ");
        String tipo = colecao.next();

        cadastroColecao(nomeColecao, descricao, endereco, telefone, pessoaContato, tipo);
    }

    static void listarColecoes(){
        listaColecoes();

    }
}

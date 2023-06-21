import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { ProjetoModel, ProjetoItemModel } from './../models';
import { CustomStorageService } from './';

@Injectable({
  providedIn: 'root'
})
export class ProjetoService {

  listaPsp: any = [
    {
      Id: "YW6EKq5NkP",
      Etapa: "Inicio",
      Titulo: "Bem Vindo(a)",
      Ds: "<p class='text-center'>O PSP é composto de etapas para serem seguidas, e cumprindo cada etapa, é possível ter um projeto realizado com eficiência. <br> Vamos lá para essa jornada!</p>"
    }, 
    {
      Id: "YW6EKq5NkB",
      Etapa: "Pré Projeto",
      Titulo: "Fase 1",
      Ds: "<p class='text-center'> Nessa fase é de extrema importância a escolha de como você irá fazer relatórios do projeto. É um momento para refletir quais ferramentas serão úteis para você desde o começo do projeto até o final!</p>"
    },
    {
      Id: "HIMYjo1c3L",
      Etapa: "Pré Projeto",
      Titulo: "Fase 2",
      Ds: "<p class='text-center'> Hora de escolher as práticas de medidas. <br> Mas o que isso quer dizer? <br> É hora de você definir como vai medir seu tempo e como vai medir o avanço do código, pode usar ferramentas como cronometros ou sites mais focados como Trello ou Jira.</p>"
    },
    {
      Id: "TmRC9ne7SR",
      Etapa: "Desenvolvimento",
      Titulo: "Fase 1",
      Ds: "<p class='text-center'>É hora de scolher padrões de programação (design patterns). É bom estudar sobre isso nesse momento! Hora de procurar muito material sobre! Boa sorte!<br> (Você pode usar o campo de anotação para registrar sua escolha)</p> "
    },
    {
      Id: "TAuGqcan3U",
      Etapa: "Desenvolvimento",
      Titulo: "Fase 2",
      Ds: "<p class='text-center'>Aqui vamos definir como realizar o versionamento de código. Recomendamos o estudo sobre Git e GitHub!</p>"
    },
    {
      Id: "e5pNykHfNJ",
      Etapa: "Desenvolvimento",
      Titulo: "Fase 3",
      Ds: "<p class='text-center'>Nessa etapa tente elaborar as funções necessárias para seu projeto, é importante realizar a medida de tempo e do trabalho em geral.</p>"
    },
    {
      Id: "5RgX342Cpc",
      Etapa: "Desenvolvimento",
      Titulo: "Fase 4",
      Ds: "<p class='text-center'> Aqui é o inicio do processo de medir o tamanho do programa. (É basicamente ter noção da dificuldade e tamanho de esforço do programa em relação ao tempo) </p>"
    },
    {
      Id: "MikyR7TT0N",
      Etapa: "Desenvolvimento",
      Titulo: "Fase 5",
      Ds: "<span class='text-justify'>Caso seja um desenvolvedor/engenheiro já experiente, essa fase pode ser mais fácil. <br> Aqui é o momento de realizar o PIP - Proposta de melhoria de Processo - que basicamente consiste em se conhecer melhor, e analisar o que pode te ajudar a melhorar sua produtividade, seja uma ferramenta para foco no computador ou uma música mais relaxante, o importante é identificar suas dificuldades e analisar como melhorar. Vale também registrar os problemas nos projetos anteriores e analisar como evitar eles em próximos projetos!  </span>"
    },
    {
      Id: "7GkTi24jtS",
      Etapa: "Relatórios",
      Titulo: "Fase 1",
      Ds: "<p class='text-center'>Hora de planejar os relatórios de testes necessários, pois as ferramentas já foram decididas anteriormente.</p>"
    },
    {
      Id: "zMdCcCGorw",
      Etapa: "Relatórios",
      Titulo: "Fase 2",
      Ds: "<p class='text-center'>Hora da prática de estimativa de tamanho e recurso, que consiste em analisar as funções do projeto e os meios de realiza-las, bem como o esforço que será necessário para cria-las</p>"
    },
    {
      Id: "ygzjnHXknn",
      Etapa: "Produção própria",
      Titulo: "Fase 1",
      Ds: "<p class='text-center'>Aqui é o momento de realizar o planejamento de tarefas. Boa sorte!</p>"
    },
    {
      Id: "UWIE2xeXos",
      Etapa: "Produção própria",
      Titulo: "Fase 2",
      Ds: "<p class='text-center'>Hora de criar os cronogramas para ajudar com a organização de tempo e compromissos </p>"
    },
    {
      Id: "QqdTd1DFJJ",
      Etapa: "Produção própria",
      Titulo: "Fase 3",
      Ds: "<p class='text-center'>Momento de conhecer bem a própria produtividade. Você procrastina demais? Dorme bem? Saiba que esses itens são importantes para o foco de maneira ideal no projeto. Analise sua produtividade!</p>"
    },
    {
      Id: "0PRFTIHY8n",
      Etapa: "Revisão",
      Titulo: "Fase 1",
      Ds: "<p class='text-center'>Vamos fazer a revisão do projeto para produção? Esse é o momento!</p>"
    },
    {
      Id: "IqzmkioP62",
      Etapa: "Revisão",
      Titulo: "Fase 2",
      Ds: "<p class='text-center'>Momento de listar os defeitos de seu projeto inclusive com base em seus projetos anteriores. Resolva os defeitos, repita esse processo quantas vezes achar necessário! </p>"
    },
    {
      Id: "CFRfAMKxjt",
      Etapa: "Detalhes",
      Titulo: "Fase 1",
      Ds: "<p class='text-center'> Aqui vamos realizar a verificação de consistência do projeto, verificar se tem bugs, se as funções funcionam como esperado, analisar tempo, realizar testes, corrigir erros. Repita quantas vezes achar necessário!</p>"
    },
    {
      Id: "iIaC3Fbp0H",
      Etapa: "Detalhes",
      Titulo: "Fase 2",
      Ds: "<p class='text-center'>Caso chegue aqui, seu projeto deve estar perfeito. Verifique se tudo foi completado!</p>"
    },
    {
      Id: "Lg4ugcyhlN",
      Etapa: "Ciclico",
      Titulo: "Fase 1",
      Ds: "<p class='text-center'> Essa etapa é um pouco complicada, pois consiste na ideia de modularizar seu projeto, crie módulos. Experimento separar seu projeto por funções similares, é um bom começo!</p>"
    },
    {
      Id: "6DTotXTnb4",
      Etapa: "Ciclico",
      Titulo: "Fase 2",
      Ds: "<p class='text-center'> Hora de tratar todas as etapas anteriores em cada módulo! Boa sorte! </p>"
    },
    {
      Id: "6DTotXTnbA",
      Etapa: "Finalização",
      Titulo: "Final",
      Ds: "<p class='text-center'>Chegando nessa etapa, seu projeto já deve estar pronto! Parabéns! </p>"
    },

  ]

  constructor(private customStorageService: CustomStorageService) {
    this.projetos = new BehaviorSubject<Array<ProjetoModel>>(new Array<ProjetoModel>());
  }

  private localStoToken: string = "SKHIFY";
  private ProjetosCarregados: boolean = false;
  private projetos: BehaviorSubject<Array<ProjetoModel>>;

  // verifica se existe algum registro armazenado
  public carregarLocalStorage(): boolean {

    var possivelResultado = this.customStorageService.get(this.localStoToken);
    if (possivelResultado) {
      this.setProjetos(possivelResultado);
      return true;
    }
    else {
      let a = new Array<ProjetoModel>();
      this.setProjetos(a);
      return false;
    }

  }

  // método para ter controle se os projetos foram carregados
  public isProjetosCarregado(): boolean {
    return this.ProjetosCarregados;
  }

  // metodo para resetar a variavel de projetos
  public resetProjeto(): void {
    this.customStorageService.clear();
    this.projetos = new BehaviorSubject<Array<ProjetoModel>>(new Array<ProjetoModel>());
    this.ProjetosCarregados = false;
  }

  // metodo para alteral a variavel de projetos (e no esquema de armazenamento)
  public setProjetos(data: Array<ProjetoModel>): void {
    this.customStorageService.set(this.localStoToken, data);
    this.projetos.next(data);
    this.ProjetosCarregados = true;
  }

  // metodo para pegar um observador da variavel de projetos
  public getProjetos(): Observable<Array<ProjetoModel>> {
    return this.projetos.asObservable();
  }

  // metodo de auxilio para gerar um novo projeto -> e já gera os filhos e retorna (no local onde chamar deve adicionar na variavel de projetos)
  public montarNovoProjeto(nome: string, descricao: string): ProjetoModel {
    let projeto: ProjetoModel = new ProjetoModel();
    projeto.id = "P" + Math.random().toString(36).substr(2, 9);
    projeto.Descricao = descricao;
    projeto.Nome = nome;
    projeto.Favorito = false;

    this.montarFilhosPadrao(projeto);
    return projeto;
  }

  // variavel interna para montar o esqueleto das fases default do psp
  private montarFilhosPadrao(projeto: ProjetoModel) {

    projeto.Fases = [];

    for (let i = 0; i < this.listaPsp.length; i++) {
      const element = this.listaPsp[i];

      projeto.Fases.push(this.criarItem(element.Etapa, element.Id, element.Titulo));
    }

  }

  // mais um método pra facilitar a vida
  private criarItem(status: string, id: string, nome: string): ProjetoItemModel {

    let item = new ProjetoItemModel();
    item.id = id;
    item.Nome = nome;
    item.Resumo = '--';
    item.Status = status;
    item.flgConcluido = false;
    return item;

  }

  public carregarDetalheFases(projeto: ProjetoModel): ProjetoModel {

    for (let i = 0; i < this.listaPsp.length; i++) {
      const element = this.listaPsp[i];

      this.localizarFaseAtribuirDetalhe(projeto, element.Id, element.Ds);
    }

    return projeto;

  }

  private localizarFaseAtribuirDetalhe(projeto: ProjetoModel, id: string, detalhe: string) {

    try {

      for (let i = 0; i < projeto.Fases.length; i++) {

        const element = projeto.Fases[i];

        if (id == element.id) {
          projeto.Fases[i].Resumo = detalhe;
        }

      }

    } catch (error) {
    }

  }


}

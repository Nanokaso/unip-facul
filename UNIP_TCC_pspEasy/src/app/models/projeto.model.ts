import { ProjetoItemModel } from './';

export class ProjetoModel {
    id: string;
    Nome: string;
    Descricao: string;
    Favorito: boolean;
    Status: string;
    Fases: Array<ProjetoItemModel>
}
export type Carta = {
    id: number,
    nome: string,
    descricao: string,
    ataque: number,
    defesa: number,
    tipo: string,
    classe: string
}

export const CLASSE = ['MAGO', 'PALADINO', 'CACADOR', 'DRUIDA', 'QUALQUER'];
export const TIPO = ['MAGIA', 'CRIATURA'];
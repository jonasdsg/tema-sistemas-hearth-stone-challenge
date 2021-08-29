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
export const IMAGENS = [
    {
        classe:'MAGO',
        link:'https://static.wikia.nocookie.net/hearthstone_gamepedia/images/3/3c/Jaina_Proudmoore%28320%29.png'
    },
    {
        classe:'PALADINO',
        link:'https://static.wikia.nocookie.net/hearthstone_gamepedia/images/4/4d/Uther_Lightbringer%28257%29.png'
    },
    {
        classe:'CACADOR',
        link:'https://static.wikia.nocookie.net/hearthstone_gamepedia/images/a/a0/Rexxar%28484%29.png'
    },
    {
        classe:'DRUIDA',
        link:'https://static.wikia.nocookie.net/hearthstone_gamepedia/images/f/fa/Malfurion_Stormrage%28621%29.png'
    },
    {
        classe:'QUALQUER',
        link:'https://static.wikia.nocookie.net/hearthstone_gamepedia/images/c/c5/Garrosh_Hellscream%28635%29.png'
    }
];
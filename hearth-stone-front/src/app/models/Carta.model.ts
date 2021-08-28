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
        link:'https://pm1.narvii.com/6458/c1c77a74d37cb73855ef9b1107162b75404b9f8a_hq.jpg'
    },
    {
        classe:'PALADINO',
        link:'https://pm1.narvii.com/6547/0cf7c1dd2714ef107ab2953f308b28be6e90d5d5_hq.jpg'
    },
    {
        classe:'CACADOR',
        link:'https://i.pinimg.com/originals/94/3b/f1/943bf1b79dcab3d2b529e904c15a76c9.jpg'
    },
    {
        classe:'DRUIDA',
        link:'http://4.bp.blogspot.com/_wnuwcUW6qdE/TUlHvwKNr9I/AAAAAAAAAqI/RSWd3mJmd64/s1600/Druid_by_Okha.jpg'
    },
    {
        classe:'QUALQUER',
        link:'https://i.pinimg.com/originals/1e/ea/6e/1eea6ee48a55cd76efbc19bf6bb1644f.jpg'
    }
];
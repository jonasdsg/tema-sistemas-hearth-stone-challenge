import { Carta, IMAGENS } from './../../../models/Carta.model';
import { CartaService } from './../carta.service';
import { Component } from "@angular/core";

@Component({
    templateUrl: './carta-pesquisa-component.html'
})
export class CartaPesquisaComponent {
    public info: any = null;
    public cartas: Carta[]
    public atributos = ['ataque', 'defesa', 'tipo', 'classe'];
    public imagens = IMAGENS;
    public pesquisado = false;
    constructor(private cartaService: CartaService) { }

    pesquisar(carta: Carta) {
        this.cartaService.procurar(this.getParams(carta)).subscribe(resp => {
            this.cartas = resp.length ? resp : null;
            this.pesquisado = true;
        })
    }
    
    getLink(classe: string) {
        return this.imagens.filter(c=>c.classe===classe)[0].link;
    }

    getValordoAtributo(atributo: string, carta: Carta) {
        return `${atributo.toUpperCase()}: ${carta[atributo]}`;
    }

    private getParams(carta: Carta) {
        const params: any = {};
        const atributosDaClasse = ['id', 'nome', 'descricao', 'ataque', 'defesa', 'tipo', 'classe'];
        atributosDaClasse.forEach(atributo => {
            if (carta[atributo]) {
                params[atributo] = carta[atributo];
            }
        })

        return params;
    }
}
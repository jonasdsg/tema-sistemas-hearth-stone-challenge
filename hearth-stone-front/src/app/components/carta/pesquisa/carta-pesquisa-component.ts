import { Router } from '@angular/router';
import { Carta, IMAGENS } from './../../../models/Carta.model';
import { CartaService } from './../carta.service';
import { Component } from "@angular/core";

@Component({
    templateUrl: './carta-pesquisa-component.html'
})
export class CartaPesquisaComponent {
    public info: any = null;
    public cartas: Carta[]
    private carta:Carta;
    //public atributos = ['ataque', 'defesa', 'tipo', 'classe'];
    public imagens = IMAGENS;
    public pesquisado = false;
    constructor(private cartaService: CartaService,private router:Router) { }

    pesquisar(carta: Carta) {
        this.carta = carta;
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
    
    detalhe(id:number){
        this.router.navigate(['detalhe',id]);
    }

    deletar(id:number){
        this.cartaService.deletar(id).subscribe(()=>{
            this.info = {};
            this.info.message = "Carta removida com sucesso!";
            this.info.alerta = 'alert-success';
        })
        setTimeout(()=>{
            this.info = null;
            this.pesquisar(this.getParams(this.carta));
        },3000)
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
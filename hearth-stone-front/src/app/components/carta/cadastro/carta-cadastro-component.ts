import { CartaService } from './../carta.service';
import { Carta } from './../../../models/Carta.model';
import { Component } from "@angular/core";

@Component({
    templateUrl: './carta-cadastro-component.html'
})
export class CartaCadastroComponent {
    constructor(private cartaService:CartaService){}

    getCarta(carta:Carta){
        if(carta){
            this.salvar(carta);
        }
    }

    private salvar(carta:Carta){
        this.cartaService.salvar(carta).subscribe(console.log);
    }
}
import { CartaService } from './../carta.service';
import { Carta } from './../../../models/Carta.model';
import { Component } from "@angular/core";
import { timeStamp } from 'console';

@Component({
    templateUrl: './carta-cadastro-component.html'
})
export class CartaCadastroComponent {
    public info:any = null;
    constructor(private cartaService:CartaService){}

    getCarta(carta:Carta){
        if(carta){
            this.salvar(carta);
        }
    }

    private salvar(carta:Carta){
        this.info = {};
        this.cartaService.salvar(carta).subscribe(()=>{
            this.info.alerta = "alert-success";
            this.info.message = "Cadastrado com sucesso";
        },()=>{
            this.info.alerta = "alert-danger";
            this.info.message = "Erro ao cadastar"
        });
        setTimeout(()=>{
            this.info = null;
        },3000)
    }
}
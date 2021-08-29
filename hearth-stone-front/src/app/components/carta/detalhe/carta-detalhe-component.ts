import { Carta } from 'src/app/models/Carta.model';
import { Component, OnInit } from "@angular/core";
import { ActivatedRoute, Router } from '@angular/router';
import { CartaService } from './../carta.service';
import { switchMap } from 'rxjs/operators'
@Component({
    templateUrl:'carta-detalhe-component.html'
})
export class CartaDetalheComponent implements OnInit{
    public carta:Carta;

    constructor(
        private cartaService:CartaService,
        private activatedRoute:ActivatedRoute,
        private route:Router){

    }
    
    ngOnInit(): void {
        this.activatedRoute.params.pipe(
            switchMap(param=>{
                console.log(param['id'])
                if(param['id'] && !isNaN(param['id'])){
                    return this.cartaService.procurarPorId(param['id']);
                }
                this.route.navigate(['/cadastrar']);
            })

        ).subscribe(resp =>{
            this.carta = resp;
        })
    }

    atualizar(carta:Carta){
        this.cartaService.atualizar(carta).subscribe(console.log);
    }
}
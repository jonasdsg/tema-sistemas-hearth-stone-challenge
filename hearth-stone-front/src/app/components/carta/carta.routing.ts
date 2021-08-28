import { CartaCadastroComponent } from './cadastro/carta-cadastro-component';
import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";

@NgModule({
    imports:[
        RouterModule.forRoot([
            {
                path: 'cadastrar',
                component: CartaCadastroComponent
            }
        ])
    ]
})
export class CartaRouting {}
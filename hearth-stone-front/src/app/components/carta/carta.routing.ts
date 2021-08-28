import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { CartaPesquisaComponent } from './pesquisa/carta-pesquisa-component';
import { CartaCadastroComponent } from './cadastro/carta-cadastro-component';

@NgModule({
    imports: [
        RouterModule.forRoot([
            {
                path: 'cadastrar',
                component: CartaCadastroComponent
            },
            {
                path: 'pesquisar',
                component: CartaPesquisaComponent
            }
        ])
    ]
})
export class CartaRouting { }
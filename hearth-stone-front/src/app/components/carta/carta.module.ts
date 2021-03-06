import { CartaDetalheComponent } from './detalhe/carta-detalhe-component';
import { CartaPesquisaComponent } from './pesquisa/carta-pesquisa-component';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

import { CartaComponent } from './carta.components';
import { CartaRouting } from './carta.routing';
import { CartaCadastroComponent } from './cadastro/carta-cadastro-component';

@NgModule({
    declarations: [
        CartaComponent,    
        CartaCadastroComponent,
        CartaPesquisaComponent,
        CartaDetalheComponent,
    ],
    imports: [ReactiveFormsModule, HttpClientModule, CommonModule],
    exports: [CartaRouting]
})
export class CartaModule { }
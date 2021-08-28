import { CartaCadastroComponent } from './cadastro/carta-cadastro-component';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

import { CartaComponent } from './carta.components';
import { CartaRouting } from './carta.routing';

@NgModule({
    declarations: [
        CartaComponent,
        CartaCadastroComponent,
    ],
    imports: [ReactiveFormsModule, HttpClientModule, CommonModule],
    exports: [CartaRouting]
})
export class CartaModule { }
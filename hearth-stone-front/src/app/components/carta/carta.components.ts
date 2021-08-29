import { Router } from '@angular/router';
import { Component, EventEmitter, Input, OnChanges, Output, SimpleChanges } from "@angular/core";
import { FormBuilder, FormGroup } from "@angular/forms";
import { Carta, TIPO, CLASSE } from "src/app/models/Carta.model";

@Component({
    selector: 'carta-component',
    templateUrl: 'carta.components.html'
})
export class CartaComponent implements OnChanges {
    @Input() nomeDaTela: string = null;
    @Input() nomeDoBotao: string = null;
    @Input() edicaoHabilitada: boolean= false;
    @Input() carta: Carta = null;
    @Input() ehPesquisa:boolean = false;
    @Output() aoEmitirCarta = new EventEmitter<Carta>();
    public nulo = null;
    public tipos = TIPO;
    public classes = CLASSE;
    public cartaForm: FormGroup = null;
    public valores = [1,2,3,4,5,6,7,8,9,10];

    constructor(private fb: FormBuilder,private router:Router) { }

    ngOnChanges(changes: SimpleChanges): void {
        this.cartaForm = this.criarFormulario(this.carta);
        if(this.carta){
            this.cartaForm.disable();
        }
        if(!this.edicaoHabilitada && this.nomeDaTela.toLowerCase().includes("detalhe")){
            this.cartaForm.disable();
            this.nomeDoBotao = "Voltar";
        }
    }

    emitir(carta: Carta) {
        if(this.nomeDoBotao === "Voltar" ){
            this.router.navigate(['pesquisar']);
        }
        this.aoEmitirCarta.emit(this.cartaForm.getRawValue() as Carta);
    }

    limparFormulario(){
        this.cartaForm.reset();
    }

    habilitarEdicao(){
        this.cartaForm.enable();
        this.cartaForm.get('id').disable();
    }

    private criarFormulario(carta?: Carta): FormGroup {
        return this.fb.group({
            id: carta?.id || null,
            nome: carta?.nome || null,
            descricao: carta?.descricao || null,
            ataque: carta?.ataque || null,
            defesa: carta?.defesa || null,
            tipo: carta?.tipo || null,
            classe: carta?.classe || null
        })
    }
}
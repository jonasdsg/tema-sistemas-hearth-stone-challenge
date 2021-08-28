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
    @Input() carta: Carta = null;
    @Output() aoEmitirCarta = new EventEmitter<Carta>();
    public tipos = TIPO;
    public classes = CLASSE;
    public cartaForm: FormGroup = null;

    constructor(private fb: FormBuilder) { }

    ngOnChanges(changes: SimpleChanges): void {
        this.cartaForm = this.criarFormulario(this.carta);
    }

    emitir(carta: Carta) {
        this.aoEmitirCarta.emit(this.cartaForm.getRawValue() as Carta);
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
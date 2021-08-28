import { BASE_URL, OPTIONS } from './../../../assets/connection';
import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from 'rxjs';
import { Carta } from 'src/app/models/Carta.model';

@Injectable({
    providedIn: 'root'
})
export class CartaService {
    private baseUrl = BASE_URL+"carta";
 
    constructor(private http:HttpClient){}
    
    procurar(params:any){
        const procura = OPTIONS;
        procura.params = params;
        return this.http.get(this.baseUrl, procura) as unknown as Observable<Carta[]>;
    }

    salvar(carta:Carta){
        return this.http.post(this.baseUrl, carta, OPTIONS) as unknown as Observable<Carta>;
    }

    atualizar(carta:Carta){
        return this.http.put(this.baseUrl, carta, OPTIONS) as unknown as Observable<Carta>;
    }

    deletar(id:number){
        return this.http.delete(`${this.baseUrl}/${id}`,OPTIONS) as unknown as Observable<Carta>;
    }
}
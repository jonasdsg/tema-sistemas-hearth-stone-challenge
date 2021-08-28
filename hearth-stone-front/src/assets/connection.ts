import { HttpHeaders } from "@angular/common/http";

export const BASE_URL:string = "http://localhost:8080/"
export const OPTIONS:any = { headers: new HttpHeaders({ 'Content-Type': 'application/json', }), };
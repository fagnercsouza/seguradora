import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Apolice } from './apolice.model';

@Injectable({
  providedIn: 'root'
})
export class ApoliceService {

  private baseUrl = 'http://localhost:8080/api/apolice'

  constructor(private http: HttpClient) { }

  listar(): Observable<Apolice[]>{
    return this.http.get<Apolice[]>(this.baseUrl)
  }
  buscarApolice(numeroApolice: number): Observable<Apolice>{
    return this.http.get<Apolice>(this.baseUrl+"/"+numeroApolice)
  }
}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from './cliente.model';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  private baseUrl = 'http://localhost:8080/api/cliente'

  constructor(private http: HttpClient) { }

  listar(): Observable<Cliente[]>{
    return this.http.get<Cliente[]>(this.baseUrl)
  }
}

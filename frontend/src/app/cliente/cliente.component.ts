import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente.model';
import { ClienteService } from './cliente.service';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent implements OnInit {
  displayedColumns: string[] = ['nome', 'cpf', 'cidade', 'uf'];
  clientes: Cliente[]=[]
  constructor(private clienteService: ClienteService) { }

  ngOnInit(): void {
   this.listarClientes()
  }
  listarClientes(){
    this.clienteService.listar()
    .subscribe(apolice => this.clientes = apolice)
 }
}

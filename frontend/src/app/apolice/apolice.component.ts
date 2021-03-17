import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Apolice } from './apolice.model';
import { ApoliceService } from './apolice.service';

@Component({
  selector: 'app-apolice',
  templateUrl: './apolice.component.html',
  styleUrls: ['./apolice.component.css']
})
export class ApoliceComponent implements OnInit {

  displayedColumns: string[] = ['id', 'inicioContrato', 'fimContrato', 'placa', 'valorApolice'];
  apolices: Apolice[]=[]
  vencimento: number
  numeroApolice: number
  constructor(private apoliceService: ApoliceService, public dialog: MatDialog) { }

  ngOnInit(): void {
   this.listarApolice();
  }
  listarApolice(){
     this.apoliceService.listar()
     .subscribe(apolice => this.apolices = apolice)
  }
}

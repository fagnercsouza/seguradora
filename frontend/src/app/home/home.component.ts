import { Component, Input, OnInit } from '@angular/core';
import { Apolice } from '../apolice/apolice.model';
import { ApoliceService } from '../apolice/apolice.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  @Input()
  value: number = 0
  apolice: Apolice
  qntDias: number
  statu: boolean = false
  constructor(private apoliceService: ApoliceService) { }

  ngOnInit(): void {

  }
  buscarApolice(){
    if(!this.value){
      return
    }
    this.apoliceService.buscarApolice(this.value)
        .subscribe(res => this.apolice = res)
    this.dateDiferencaEmDias()
  }
      
  dateDiferencaEmDias() {
    let final = new Date(this.apolice.fimContrato).getTime()
    let atual = new Date().getTime()

    let seila = atual - final
    let tempoEmDias = 1000 * 60 * 60 * 24
    let dias = seila / tempoEmDias
    this.qntDias = dias
    console.log(dias);
    console.log(seila);

    
 }
}

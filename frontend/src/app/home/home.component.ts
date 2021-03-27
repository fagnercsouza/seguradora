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
  vencindo: boolean
  constructor(private apoliceService: ApoliceService) { }

  ngOnInit(): void {

  }
  buscarApolice(){
    if(!this.value){
      return this.apolice = null
    }
    this.apoliceService.buscarApolice(this.value)
        .subscribe(res => {
          this.apolice = res
          this.dateDiferencaEmDias(new Date(res.fimContrato))
        })
  }
      
  dateDiferencaEmDias(dataFinal: Date) {
    
    let atual = new Date().getTime()

    let seila = atual - dataFinal.getTime()
    let tempoEmDias = 1000 * 60 * 60 * 24
    let dias = seila / tempoEmDias
    let diasPositivo = Math.abs(dias)
    this.qntDias = diasPositivo
    if(dias >0){
      this.vencindo = true
    }else{
      this.vencindo = false
    } 
    this.value = 0
 }
}

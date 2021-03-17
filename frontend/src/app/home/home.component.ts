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
    let final = new Date('2021-01-20')
    let atual = new Date()
    
    final = new Date(final)
    atual = new Date(atual)
    // let seila = atual - final
    // let time = Math.abs(atual - final)
    // let tempoEmDias = 1000 * 60 * 60 * 24
    // let dias = time / tempoEmDias
    
    // console.log(dias);

    
 }
}

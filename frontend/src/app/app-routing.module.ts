import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApoliceComponent } from './apolice/apolice.component';
import { ClienteComponent } from './cliente/cliente.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'apolice', component: ApoliceComponent},
  {path: 'cliente', component: ClienteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

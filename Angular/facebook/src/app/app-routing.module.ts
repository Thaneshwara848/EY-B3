import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { GalaryComponent } from './galary/galary.component';
import { DepartmentComponent } from './department/department.component';
import { HomeComponent } from './home/home.component';
import { ItComponent } from './it/it.component';
import { DatabindingComponent } from './databinding/databinding.component';

const routes: Routes = 
[
  {
    path:'databind',
    component:DatabindingComponent
  },
  {
    path:'signup',
    component:SignupComponent
  },
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'galary',
    component:GalaryComponent
  },
  {
    path:'department',
    component:DepartmentComponent
  },
  {
    path:'home',
    component:HomeComponent
  },
  {
    path:'it',
    component:ItComponent
  },
  {
    path:'**',component:LoginComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


// 4: 20 to 4: 40 will be the break 
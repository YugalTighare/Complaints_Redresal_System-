import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './components/header/header.component';
import { MainComponent } from './components/main/main.component';
import{AdminComponent} from './components/admin/admin.component';
import { FooterComponent } from './components/footer/footer.component';


const routes: Routes = [
{path:'',redirectTo:'/main',pathMatch:'full'},
  {path:"header", component:HeaderComponent},
  {path:"main", component:MainComponent},
  {path:"admin", component:AdminComponent},
  {path:"footer", component:FooterComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

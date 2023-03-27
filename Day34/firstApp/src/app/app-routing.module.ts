import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { MasterComponent } from './master/master.component';
import { SupplierComponent } from './supplier/supplier.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  {
    path: 'customer',
    loadChildren: () =>
      import('./customer/customer.module').then(
        (module) => module.CustomerModule
      ),
  },
  { path: 'master', component: MasterComponent },
  { path: 'supplier', component: SupplierComponent },
  {
    path: 'person',
    loadChildren: () =>
      import('./person/person.module').then((module) => module.PersonModule),
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

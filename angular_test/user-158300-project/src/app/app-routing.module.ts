import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Loginuser158300ComponentComponent } from './loginuser158300-component/loginuser158300-component.component';
import { User158300ComponentComponent } from './user158300-component/user158300-component.component';

const routes: Routes = [
  {
    path: 'viewAllUsers',
    component: User158300ComponentComponent,
  },
  { path: 'viewUsersByLogin', component: Loginuser158300ComponentComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

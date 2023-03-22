import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { SupplierComponent } from './supplier/supplier.component';
import { MasterComponent } from './master/master.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [AppComponent, CustomerComponent, SupplierComponent, MasterComponent, HomeComponent],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}

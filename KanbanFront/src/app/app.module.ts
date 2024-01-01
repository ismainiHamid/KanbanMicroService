import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignInComponent } from './login/sign-in/sign-in.component';
import { SignUpComponent } from './login/sign-up/sign-up.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ClientComponent } from './dashboard/client/client.component';
import { ProjectComponent } from './dashboard/project/project.component';
import { MemberComponent } from './dashboard/member/member.component';
import {TasksComponent} from "./dashboard/tasks/tasks.component";
import { TicketComponent } from './dashboard/ticket/ticket.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {UserComponent} from "./dashboard/user/user.component";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignInComponent,
    SignUpComponent,
    DashboardComponent,
    ClientComponent,
    ProjectComponent,
    MemberComponent,
    TasksComponent,
    TicketComponent,
    UserComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

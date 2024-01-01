import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {SignUpComponent} from "./login/sign-up/sign-up.component";
import {SignInComponent} from "./login/sign-in/sign-in.component";
import {ClientComponent} from "./dashboard/client/client.component";
import {ProjectComponent} from "./dashboard/project/project.component";
import {TicketComponent} from "./dashboard/ticket/ticket.component";
import {TasksComponent} from "./dashboard/tasks/tasks.component";
import {UserComponent} from "./dashboard/user/user.component";

const routes: Routes = [
  {path: '', redirectTo: '/sign-in', pathMatch: 'full'},
  {path: 'sign-in', component: SignInComponent},
  {path: 'sign-up', component: SignUpComponent},
  {path: 'clients', component: ClientComponent},
  {path: 'projects', component: ProjectComponent},
  {path: 'members', component: ProjectComponent},
  {path: 'tasks', component: TasksComponent},
  {path: 'tickets', component: TicketComponent},
  {path: 'users', component: UserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

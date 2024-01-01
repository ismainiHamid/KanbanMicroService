import {Component, OnInit} from '@angular/core';
import {UserService} from "./user.service";
import {User} from "./user";
import {Router} from "@angular/router";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  public addUser: boolean = true;
  public users: User[] = [];
  public user: User;


  constructor(private userService: UserService, private router:Router) {
    this.user = new User();
  }

  ngOnInit(): void {
    this.findAll();
  }

  public findAll() {
    this.userService.findAll().subscribe(data => {
      this.users = data;
    }, error => {
      console.log('Fetching error : ' + error);
    });
  }

  public gotoProjectList() {
    this.router.navigate(['/projects']);
  }

  public showForm() {
    this.addUser = !this.addUser;
  }
}

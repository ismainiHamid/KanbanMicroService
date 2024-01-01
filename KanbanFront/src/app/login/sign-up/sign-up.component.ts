import {Component, OnInit} from '@angular/core';
import {UserService} from "../../dashboard/user/user.service";
import {User} from "../../dashboard/user/user";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit{
  public show: boolean = false;
  public showConfirm: boolean = false
  public user:User;

  constructor(private userService:UserService) {
    this.user = new User();
  }

  ngOnInit() {

  }

  public save(form:NgForm){
    this.userService.save(this.user).subscribe(result => {
      form.resetForm();
    });
  }


  public inputPassword() {
    this.show = !this.show;
  }

  public inputConfirmPassword() {
    this.showConfirm = !this.showConfirm;
  }
}

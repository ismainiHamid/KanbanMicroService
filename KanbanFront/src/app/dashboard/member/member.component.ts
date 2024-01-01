import { Component } from '@angular/core';

@Component({
  selector: 'app-member',
  templateUrl: './member.component.html',
  styleUrls: ['./member.component.css']
})
export class MemberComponent {
  addMember:boolean = true;

  showForm(){
    this.addMember = !this.addMember;
  }
}

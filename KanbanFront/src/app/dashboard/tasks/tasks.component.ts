import {Component, OnInit} from '@angular/core';
import {TaskService} from "./task.service";
import {Project} from "../project/project";

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {
  public addTask: boolean = true;
  public projects: Project[] = [];

  constructor(private taskService: TaskService) {
  }

  ngOnInit() {
    this.findAllProject();
  }

  public findAllProject() {
    this.taskService.findAllProject().subscribe(data => {
      this.projects = data;
    });
  }

  showForm() {
    this.addTask = !this.addTask;
  }
}

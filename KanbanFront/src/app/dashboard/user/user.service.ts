import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "./user";

@Injectable({
  providedIn: 'root'
})
export class UserService {
  public uri: string = "/api/profiling-manage/users";

  constructor(private httpClient: HttpClient) {
  }

  public save(user: User) {
    return this.httpClient.post(this.uri, user);
  }

  public findAll(): Observable<User[]> {
    return this.httpClient.get<User[]>(this.uri);
  }
}

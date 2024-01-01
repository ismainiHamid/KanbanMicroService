import {Injectable, Injector} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Client} from "./client";

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  private uri: string = "/api/project-manage/clients";

  constructor(private httpClient: HttpClient) {}

  public save(client: Client) {
    return this.httpClient.post(this.uri, client);
  }

  public update(client: Client) {
    return this.httpClient.put(this.uri, client);
  }

  public delete(client:Client) {
    return this.httpClient.delete(`${this.uri}/${client.id}`);
  }

  public findAll(): Observable<Client[]> {
    return this.httpClient.get<Client[]>(this.uri);
  }

  public findById(client:Client){
    return this.httpClient.get(`${this.uri}/${client.id}`);
  }
}

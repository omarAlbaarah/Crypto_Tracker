import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CryptoToken } from '../_models/cryptoToken';

@Injectable({
  providedIn: 'root'
})
export class CryptoTokenService {
  baseUrl = "http://crypto-currencies-omar.herokuapp.com/api";
constructor(private http: HttpClient) { }

getTokens(): Observable<CryptoToken[]>{
  return this.http.get<CryptoToken[]>(this.baseUrl + '/tokens');
}
}


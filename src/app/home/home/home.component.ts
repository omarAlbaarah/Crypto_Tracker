import { Component, OnInit } from '@angular/core';
import { CryptoToken } from 'src/app/_models/cryptoToken';
import { AlertifyService } from 'src/app/_services/alertify.service';
import { CryptoTokenService } from 'src/app/_services/cryptoToken.service';
import { interval } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  title = 'LiveFeedPrice-SPA';
  tokens: CryptoToken[];
  loading: boolean = false;
  mySubscription;
  searchText: string;

  constructor(private cryptoTokenservices: CryptoTokenService, private alertify: AlertifyService){
  }

  ngOnInit() {
    this.loading = true;
    this.loadTokens();
    this.mySubscription= interval(10000).subscribe((x =>{
      this.loadTokens();
    }));
  }



   loadTokens(){
    this.cryptoTokenservices.getTokens().subscribe((tokens: CryptoToken[]) => {
      this.tokens = tokens;
      this.loading = false;
    }, error => {
      this.alertify.error(error);
      this.loading = false;
    });
  }
}
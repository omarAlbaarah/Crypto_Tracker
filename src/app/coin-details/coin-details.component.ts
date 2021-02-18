import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CryptoToken } from '../_models/cryptoToken';

@Component({
  selector: 'app-coin-details',
  templateUrl: './coin-details.component.html',
  styleUrls: ['./coin-details.component.scss']
})
export class CoinDetailsComponent implements OnInit {
id: string;
name: string;
price: number;
marketCap: number;
rank: number;
constructor(private route: ActivatedRoute) {
  
  }
  ngOnInit() {
    
    this.route.paramMap.subscribe(params => {
      console.log(params.get('id'));
      this.id = params.get('id');
      this.name = params.get('name');
      this.price = + params.get('price');
      this.marketCap = +params.get('marketCap');
      this.rank = + params.get('rank');
    });
        
      
     
  }

}

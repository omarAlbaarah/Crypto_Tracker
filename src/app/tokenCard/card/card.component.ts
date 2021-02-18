import { Input } from '@angular/core';
import { Component, OnInit } from '@angular/core';
import { CryptoToken } from 'src/app/_models/cryptoToken';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnInit {
  @Input()
  cryptoToken!: CryptoToken;
  constructor() { }

  ngOnInit() {
  }
 

}

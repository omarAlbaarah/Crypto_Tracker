import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home/home.component';
import { AlertifyService } from './_services/alertify.service';
import { CryptoTokenService } from './_services/cryptoToken.service';
import { CardComponent } from './tokenCard/card/card.component';
import { HttpClientModule } from '@angular/common/http';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatProgressBarModule } from '@angular/material/progress-bar';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { RouterModule } from '@angular/router';
import { appRoute } from './routes';
import { CoinDetailsComponent } from './coin-details/coin-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CardComponent,
    CoinDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    MatProgressSpinnerModule,
    MatProgressBarModule,
    BrowserAnimationsModule,
    Ng2SearchPipeModule,
    RouterModule.forRoot(appRoute)
  ],
  providers: [
    AlertifyService,
    CryptoTokenService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

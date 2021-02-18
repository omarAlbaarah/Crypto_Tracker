import { Routes } from '@angular/router';
import { CoinDetailsComponent } from './coin-details/coin-details.component';
import { HomeComponent } from './home/home/home.component';


export const appRoute: Routes = [
    {path: '', component: HomeComponent},
    {path: 'coinDetails/:id/:name/:price/:marketCap/:rank', component: CoinDetailsComponent},
    {path: '**', redirectTo: '', pathMatch: 'full'},
];

import { Routes } from '@angular/router';

import { HomeComponent } from '../../home/home.component';
import { PropietarioComponent } from '../../propietario/propietario.component';
import { ViviendaComponent } from '../../vivienda/vivienda.component';
import { TypographyComponent } from '../../typography/typography.component';
import { IconsComponent } from '../../icons/icons.component';
import { MapsComponent } from '../../maps/maps.component';
import { NotificationsComponent } from '../../notifications/notifications.component';
//import { UpgradeComponent } from '../../upgrade/upgrade.component';

export const AdminLayoutRoutes: Routes = [
    { path: 'dashboard',      component: HomeComponent },
    { path: 'propietario',    component: PropietarioComponent },
    { path: 'vivienda',       component: ViviendaComponent },
    { path: 'typography',     component: TypographyComponent },
    { path: 'icons',          component: IconsComponent },
    { path: 'maps',           component: MapsComponent },
    { path: 'notifications',  component: NotificationsComponent },
   // { path: 'upgrade',        component: UpgradeComponent },
];

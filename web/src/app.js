import React from 'react';
import {render} from 'react-dom';
import injectTapEventPlugin from 'react-tap-event-plugin';
import Main from './component'; // Our custom react component
import Loading from './loading';
import AnaSorgu from './sorgu/sorguIslem/anaSorgu'
import AltSorgu from './sorgu/sorguIslem/altSorgu'
import Tetikleyici from  './sorgu/tetikleyici/tetikleyici';
import Bildirim from './sorgu/bildirim/bildirim'


injectTapEventPlugin();

render(<Bildirim />, document.getElementById('app'));

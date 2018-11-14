import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Note from './Note';
import registerServiceWorker from './registerServiceWorker';
import Board from './Board'

ReactDOM.render(<Board />, document.getElementById('root'));
registerServiceWorker();

import React, { Component } from 'react';
import {incrementCount} from '../actions'
import   CountWidget from '../containers/CountWidget'
class App extends Component {
  
  render() {
    return (
      <div>
         <h3>Count Widget</h3>
         <CountWidget />
      </div>
    );
  }
}

export default App;

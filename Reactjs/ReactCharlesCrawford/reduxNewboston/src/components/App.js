import React, { Component } from "react";

import CountWidget from "../containers/CountWidget";
import UserWidget from "./userWidget";
class App extends Component {
  render() {
    return (
      <div>
        <h3>Count Component</h3>
        <CountWidget />
        <h3> User Component</h3>
        <UserWidget />
      </div>
    );
  }
}

export default App;

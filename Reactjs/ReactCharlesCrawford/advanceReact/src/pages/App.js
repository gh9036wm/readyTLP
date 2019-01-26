import React, { Component } from "react";
import { Link } from "react-router-dom";

class App extends Component {
  render() {
    return (
      <div>
        <header>
          <h1>Our App</h1>
          <nav>
            <Link to="/home">Home</Link>
            <Link to="/about">About</Link>
          </nav>
        </header>
        {this.props.children}
        <footer>Our footer</footer>
      </div>
    );
  }
}
export default App;

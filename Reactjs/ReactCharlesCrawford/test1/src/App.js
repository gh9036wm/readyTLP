import React, { Component } from "react";
import "./App.css";
import 
// create Nav component
class Nav extends Component {
  constructor(props) {
    super(props);
  }
  render() {
    return (
      <div>
        <button onClick={this.props.goToHome}>Home</button>
        <button onClick={this.props.goToAbout}>About</button>
      </div>
    );
  }
}

// Home page
class Home extends Component {
  constructor(props) {
    super(props);
  }
  render() {
    return (
      <div>
        <p>Welcome to HomePage </p>
      </div>
    );
  }
}

// About Page
class About extends Component {
  constructor(props) {
    super(props);
  }
  render() {
    return (
      <div>
        <p>About us</p>
      </div>
    );
  }
}

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      view: <Home />
    };
    this.goToAbout = this.goToAbout.bind(this);
    this.goToHome = this.goToHome.bind(this);
  }

  goToAbout() {
    this.setState({ view: <About /> });
  }
  goToHome() {
    this.setState({ view: <Home /> });
  }
  render() {
    return (
      <div>
      {/** Passing Nav component into this*/}
        <Nav  goToHome = {this.goToHome} goToAbout={this.goToAbout}/>
        {this.state.view}
       
      </div>
    );
  }
}
export default App;

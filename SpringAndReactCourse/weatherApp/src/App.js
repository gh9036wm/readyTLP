import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {temp: 0, desc: '', icon: '', loading: true}
  }
  
  componentDidMount() {
    fetch('http://api.openweathermap.org/data/2.5/weather?q=London&units=Metric&APIkey=3ada04da93931a728f49bf42257d1f01')
    .then(response => response.json()) 
    .then(responseData => {
      this.setState({ 
         temp: responseData.main.temp,
         desc: responseData.weather[0].description,
         icon: responseData.weather[0].icon, 
         loading: false 
       })
     })
     .catch(err => console.error(err)); 
  }



  render() {
    const imgSrc = `http://openweathermap.org/img/w/${this.state.icon}.png`
    if (this.state.loading) {
      return <p>Loading</p>;
    }
    else {
    return (
      <div className="App">
      <h2>Weather App</h2>
      <p>Temperature: {this.state.temp}</p>
      <p>Description:{this.state.desc}</p>
      <img src= {imgSrc}/>
      </div>
    );
  }
  }
}

export default App;
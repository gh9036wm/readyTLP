import React, { Component } from 'react';
import logo from '../logo.svg';
import '../App.css';
import Profile from './Profile'
import AddProfile from './AddProfile'


class App extends Component {
  constructor(props) {
    super(props)
    this.state = {
      profiles: [
        {
          name: 'Sue', 
          age: 30,
          bio: 'enjoys swimming and biking',
          hobbies: ['swimming', 'biking']
        },
        {
          name: 'Bill',
          age: 40,
          bio: 'enjoys long walks on the beach',
          hobbies: ['gardening', 'games']
        }
      ]
    }
    this.addUser = this.addUser.bind(this);
  }
 addUser(newProfile){ //** 2 starsnewProfile/
      
  
    this.setState({
      profiles: this.state.profiles.concat(newProfile)
    })
  }

render() {
    
    let profiles = this.state.profiles.map(profile => {
      return <Profile
                name = {profile.name}
                age = {profile.age}
                bio = {profile.bio}
                hobbies= {profile.hobbies}
            />
    }) 
    
    return (
      <div>
     {profiles}
      <AddProfile addUser = {this.addUser}/> 
     
      </div>
    );
  }
}

export default App;

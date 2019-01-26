import React, { Component } from 'react';
import Profile from './Profile'
import AddProfile from './AddProfile'

// for stateless function whenever no need declare state or method only render
var MyComponent = props => (
  <div>
    <p>I am just a stateless functional component </p>
    <p> {props.type}</p>
  </div>
)

class App extends Component {
  constructor(props) {
    super(props)
    this.state = {
      profiles: [
        {
          name: 'James', 
          age: 30,
          bio: 'enjoys swimming and biking',
          hobbies: ['swimming', 'biking']
        },
        {
          name: 'Thao',
          age: 40,
          bio: 'enjoys long walks on the beach',
          hobbies: ['gardening', 'games']
        }
      ]
    }
    this.addUser = this.addUser.bind(this)
  }

  //Event Functions area BEGIN
  addUser (newProfile){
    
    this.setState({profiles : this.state.profiles.concat(newProfile)})
    
  }
//Event Functions area END

  render() {
    //get item by calling with state in this component
   // let profile1 = this.state.profiles[0]
   // let profile2 = this.state.profiles[1]
   /**
    * 
    *  <Profile
         name={profile1.name}
         age = {profile1.age}
         bio = {profile1.bio}
         hobbies={profile1.hobbies}
     />
     <Profile
         name={profile2.name}
         age = {profile1.age}
         bio = {profile1.bio}
         hobbies={profile1.hobbies}
     />
    */


    let profiles = this.state.profiles.map(profile=> {
      return<div> 
        <Profile
      name={profile.name}
      age = {profile.age}
      bio = {profile.bio}
      hobbies={profile.hobbies} // pass to props under <Profile hobbies = {profile.hobbies}/>
      />
      </div>
    })
    return (
      
     <div>
       
      {profiles}
     <AddProfile addUser = {this.addUser}/>
     <MyComponent type = {"Stateless Props"}/>
     
      </div>

    );
  }
}

export default App;

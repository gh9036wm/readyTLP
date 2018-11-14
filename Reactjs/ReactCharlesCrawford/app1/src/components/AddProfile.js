import React, { Component } from 'react';
export default class AddProfile extends Component{
    constructor(props){
        super(props)
        this.state = {
            name: 'name',
            age: 'age',
            bio: 'bio',
            hobby: 'hobby'

        }
        this.handleName = this.handleName.bind(this)
        this.handleAge = this.handleAge.bind(this)
        this.handleBio = this.handleBio.bind(this)
        this.handleHobby = this.handleHobby.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)
    }
    handleName(e){
        this.setState({
            name: e.target.value
        })
    }
    handleAge(e){
        this.setState({
            age: e.target.value
        })
    }
    handleBio(e){
        this.setState({
            bio: e.target.value
        })
    }
    handleHobby(e){
        this.setState({
            hobby: e.target.value
        })
    }
    handleSubmit(){
        let newProfile ={
            name:this.state.name,
            age: this.state.age,
            bio: this.state.bio,
            hobbies:[this.state.hobby]
        }
        this.props.addUser(newProfile) // pay attention on how props called in here and 2 stars
    }
    render(){
            return <div>
            <p>Add new Profile</p>
            <div>
            <p>value of input: {this.state.name}</p>
            <p>value of input: {this.state.age}</p>
          <p>value of input: {this.state.bio}</p>
            <p>value of input: {this.state.hobby}</p>
            </div>
            <input onChange={this.handleName} value={this.state.name}/>
            <input onChange={this.handleAge} value={this.state.age}/>
            <input onChange={this.handleBio} value={this.state.bio}/>
            <input onChange={this.handleHobby} value={this.state.hobby}/>


            <button onClick={this.handleSubmit}>Add new profile</button> 
                  </div>
    }



}
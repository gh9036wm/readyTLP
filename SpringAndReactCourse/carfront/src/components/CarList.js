import React, { Component } from 'react'
import {SERVER_URL} from '../constants'
import ReactTable from "react-table";
import 'react-table/react-table.css';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import { confirmAlert } from 'react-confirm-alert';
import 'react-confirm-alert/src/react-confirm-alert.css' 
import AddCar from './AddCar'
import Button from '@material-ui/core/Button';

class Carlist extends Component {
    constructor(props) {
        super(props);
        this.state = { cars: []};
      } 
      componentDidMount() {
        this.fetchCars();
      }
      
      fetchCars = () => {
        // Read the token from the session storage
 // and include it to Authorization header
  const token = sessionStorage.getItem("jwt");
        fetch(SERVER_URL + 'api/cars', {
          headers: {'Authorization': token}
        })
        .then((response) => response.json()) 
        .then((responseData) => { 
          this.setState({ 
            cars: responseData._embedded.cars,
          }); 
        })
        .catch(err => console.error(err)); 
      }
      //confirmation of deletion
      confirmDelete = (link) => {
        confirmAlert({
          message: 'Are you sure to delete?',
          buttons: [
            {
              label: 'Yes',
              onClick: () => this.onDelClick(link)
            },
            {
              label: 'No',
            }
          ]
        })
      }

  // Delete car
onDelClick = (link) => {
  const token = sessionStorage.getItem("jwt");
    fetch(link, {method: 'DELETE', headers: {'Authorization': token}})
    .then(res => {
      toast.success("Car deleted", {
        position: toast.POSITION.BOTTOM_LEFT
      });
      this.fetchCars();
    })
    .catch(err => {
      toast.error("Error when deleting", {
        position: toast.POSITION.BOTTOM_LEFT
      });
      console.error(err)
    }) 
   }

   // Add new car
addCar(car) {
  const token = sessionStorage.getItem("jwt");
  fetch(SERVER_URL + 'api/cars', 
    { method: 'POST', 
      headers: {
        'Content-Type': 'application/json',
        'Authorization': token
      },
      body: JSON.stringify(car)
    })
  .then(res => this.fetchCars())
  .catch(err => console.error(err))
} 
//editable fucntion
renderEditable = (cellInfo) => {
  return (
    <div
      style={{ backgroundColor: "#fafafa" }}
      contentEditable
      suppressContentEditableWarning
      onBlur={e => {
        const data = [...this.state.cars];
        data[cellInfo.index][cellInfo.column.id] = 
         e.target.innerHTML;
        this.setState({ cars: data });
      }}
      dangerouslySetInnerHTML={{
        __html: this.state.cars[cellInfo.index][cellInfo.column.id]
      }} 
    />
  );
} 
// Update car
updateCar(car, link) {
  const token = sessionStorage.getItem("jwt");
  fetch(link, 
  { method: 'PUT', 
    headers: {
      'Content-Type': 'application/json',
      'Authorization': token
    },
    body: JSON.stringify(car)
  })
  .then( res =>
    toast.success("Changes saved", {
      position: toast.POSITION.BOTTOM_LEFT
    }) 
  )
  .catch( err => 
    toast.error("Error when saving", {
      position: toast.POSITION.BOTTOM_LEFT
    }) 
  )
}

      render() {
        const columns = [{
          Header: 'Brand',
          accessor: 'brand',
          Cell: this.renderEditable
        }, {
          Header: 'Model',
          accessor: 'model',
          Cell: this.renderEditable
        }, {
          Header: 'Color',
          accessor: 'color',
          Cell: this.renderEditable
        }, {
          Header: 'Year',
          accessor: 'year',
          Cell: this.renderEditable
        }, {
          Header: 'Price €',
          accessor: 'price',
          Cell: this.renderEditable
        },  {
          id: 'savebutton',
          sortable: false,
          filterable: false,
          width: 100,
          accessor: '_links.self.href',
          Cell: ({value, row}) => 
          (<Button size="small" variant="flat" color="primary" 
          onClick={()=>{this.updateCar(row, value)}}>Save</Button>)
        }, {
          id: 'delbutton',
          sortable: false,
          filterable: false,
          width: 100,
          accessor: '_links.self.href',
          Cell: ({value}) => (<Button size="small" variant="flat" color="secondary" 
          onClick={()=>{this.confirmDelete(value)}}>Delete</Button>)
        }]
      
        return (
          <div className="App">
            <AddCar addCar={this.addCar} fetchCars={this.fetchCars}/>
            
            <ReactTable data={this.state.cars} columns={columns} 
          filterable={true}/>
          <ToastContainer autoClose={1500}  /> 
            </div>
        );
      }
}

export default Carlist;
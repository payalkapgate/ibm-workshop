import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

interface GreetingProp{
  name: string;
  city: string;
}
function Greeting({name, city}:GreetingProp) {
  return (
    <>
      <div>
        <h1>Hello {name} from {city}</h1>
      </div>
       
    </>
  )
}
interface Abuttonprops{
  title:string;
  disabled:boolean;
  
}
function Abutton({title,disabled}:Abuttonprops){
  return(
    <>
      <button disabled={disabled}>{title}</button>
    </>
  )
}
function App(){
  return(
    <div>
      <Greeting name="IBMer" city="Banagalore"/>
       
      <Abutton title='Abutton' disabled = {false}/>

    </div>
  )
  
}

export default App

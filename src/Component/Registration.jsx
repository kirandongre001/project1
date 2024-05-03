// import { useNavigate } from "react-router-dom";
// export default function Registration(){
//   let navigate = useNavigate(); 
//     return(
//         <div>
//             <div class="bg-slate-50 text-center drop-shadow-2xl container mx-auto bg-gradient-to-r from-cyan-200 to-purple-500">
//                 <form class=" text-black-500 font-bold border-2 border-black ring-offset-slate-300" >
//                   <fieldset>
//                     <h4 class="underline">Registration</h4>
//                     <div>
//                     <img class="rounded-t-lg" src=""/>
//                     </div>
//                    <div  class="text-inherit p-5">
//                     First Name:<input class="p-5" type="text" id="fname" name="fname"></input><br></br>
//                     Last name: <input class="p-5" type="text" id="lname" name="lname"></input><br></br>
//                     Email ID: <input class="p-5" type="text" id="email_id" name="email_id"></input><br></br>
//                     Date of Birth: <input class="p-5" type="date" id="dob" name="dob"></input><br></br>
//                     Address:<textarea id="address" class="resize-y rounded-md p-5"></textarea><br></br>
//                     Password:<input  type="text" id="password" name="password"></input><br></br>
//                     <button class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">Register</button>
//                     <button class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded" onClick={()=>{navigate("/login")}}>Login</button>
//                     </div> 
//                   </fieldset>
//                 </form>
//             </div>
//         </div>
//     )
// }


import React, { useState } from 'react';

export default function Registration(){
   
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [email_id, setEmail] = useState('');
  const [dob, setDob] = useState('');
  const [address, setAddress] = useState('');
  const [password, setPassword] = useState('');
 
  const handleSubmit = async (e) => {
    e.preventDefault();

    // Create a FormData object to send form data
    const formData = new FormData();
    formData.append('firstName', firstName);
    formData.append('lastName', lastName);
    formData.append('email_id', email_id);
    formData.append('dob', dob);
    formData.append('address', address);
    formData.append('password', password);

    try {
      // Send form data to server using fetch API
      const response = await fetch('/regUser', {
        method: 'POST',
        body: formData,
      });

      if (response.ok) {
        console.log('Registration successful!');
        // Reset form fields after successful registration
        setFirstName('');
        setLastName('');
        setEmail('');
        setDob('');
        setAddress('');
        setPassword('');
      } else {
        console.error('Registration failed');
      }
    } catch (error) {
      console.error('Error registering user:', error);
    }
  };



    return(
        <div>
            <div class="bg-slate-50 text-center drop-shadow-2xl container mx-auto">
                <form onSubmit={handleSubmit} class=" text-black-500 font-bold border-2 border-black ring-offset-slate-300" >
                  <fieldset>
                    <h4 class="underline">Registration</h4>
                    <div>
                    <img class="rounded-t-lg" src="/img1.jpeg"/>
                    </div>
                   <div  class="text-inherit p-5">

                    First Name:<input class="p-5" type="text" id="fname" name="fname" value={firstName} onChange={(e)=>setFirstName(e.target.value)}></input><br></br>
                    
                    Last name: <input class="p-5" type="text" id="lname" name="lname" value={lastName} onChange={(e)=>setLastName(e.target.value)}></input><br></br>
                    
                    Email ID: <input class="p-5" type="text" id="email_id" name="email_id"value={email_id} onChange={(e)=>setEmail(e.target.value)}></input><br></br>
                    
                    Date of Birth: <input class="p-5" type="date" id="dob" name="dob" value={dob} onChange={(e)=>setDob(e.target.value)}></input><br></br>
                    
                    Address:<textarea id="address" class="resize-y rounded-md p-5" value={address} onChange={(e)=>setAddress(e.target.value)}></textarea><br></br>
                    
                    Password:<input  type="text" id="password" name="password" value={password} onChange={(e)=>setPassword(e.target.value)}></input><br></br>
                    <button type="submit">Submit</button>
                    </div> 
                  </fieldset>
                </form>
            </div>
        </div>
    )
}
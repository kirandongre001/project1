import background from '../assets/Background1.png';

export default function Login(){
    return(
        <div>
            <div class="">
                <form class="" >
                  <fieldset>
                    <h4 class="underline">Login</h4>
                    <div>
                    <img class="rounded-t-lg" src=""/>
                    </div>
                   <div  class="text-inherit p-5 ">
                    Login Id<input class="p-5" type="text" id="fname" name="fname"></input><br></br>
                    Password <input class="p-5" type="text" id="lname" name="lname"></input><br></br>
                    
                    <button class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded drop-shadow-2xl">Login</button>
                    
                    </div> 
                  </fieldset>
                </form>
            </div>
        </div>
    )
}
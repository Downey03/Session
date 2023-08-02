import org.w3c.dom.ls.LSOutput;

import javax.naming.Context;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("")
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        PrintWriter out= resp.getWriter();
        resp.setContentType("text/html");
        System.out.println("controller hit");

        String str = "";

        if(session!=null) System.out.println(session.getAttribute("userId")+" "+session.getId());

        if(session.getAttribute("userId")==null){


        str = """
                                
                <html>
                    <head>
                        <script>
                           (function(){
                           	window.onpageshow = function(event) {
                           		if (event.persisted) {
                           			window.location.reload();
                           		}
                           	}
                           })();
                           
                           const url = "http://localhost:8080/"
                        </script>
                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
                        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
                        <style>
                        .index-container{
                            background-color: rgb(74, 74,74);
                            min-height: 100vh;
                            height: fit-content;
                            display: flex;
                        }
                        
                        .hamburger{
                            font-size: 24;
                            background-color: rgb(249, 249, 249);
                            padding: 10px;
                            border-radius: 6px;
                            border: 1px solid black;
                        }
                        
                        #hamburger-home{
                            width: fit-content;
                            margin: auto;
                            margin-top: 25px;
                           \s
                        }
                        
                        .hamburger:hover{
                            transition: 0.2s;
                            color: azure;
                            background-color: rgb(127,127,127);
                            border: solid black 1px;
                        }
                        
                        .left-container{
                            text-align: center;
                            min-width: 4%;
                            background-color: red;
                            border-right: 1px solid black;
                        }
                        
                        #index-offcanvas{
                            text-align: center;
                            background-color: red;
                            max-width: 20%;
                        }
                        
                        .btn-close{
                            border: 1px solid black;
                        }
                        
                        #login-modal-trigger-btn{
                            border-radius: 6px;
                            margin-bottom: 70px;
                            font-weight: 500;
                            width: 100%;
                        }
                        
                        #login-modal-trigger-btn:hover{
                            cursor: pointer;
                            transition: 0.2s;
                            color: azure;
                            background-color: rgb(127,127,127);
                            border: solid black 2px;
                        }
                        
                        table td{
                            margin: 5px;
                        }
                        
                        .login-modal,.signup-modal{
                            border-radius: 8px;
                            background-color: rgb(127,127,127);
                        }
                        
                        .login-form input{
                            border-radius: 4px;
                            margin-left: 5px;
                            border: solid 0.2px ;
                        }
                        
                        .login-form{
                            position: relative;
                            top: 15px;
                            left: -12%;
                            width: 50%;
                            margin: auto;
                            padding: 10px;
                        }
                        
                        
                        
                        .login-table input[type="submit"]{
                            border: 2px black solid;
                        }
                        
                        .login-table input[type="submit"]:hover{
                            transition: 0.2s;
                            cursor: pointer;
                            color: azure;
                            background-color: rgb(127,127,127);
                            border: solid black 2px;
                        }
                        
                        #signup-modal-trigger-btn{
                            position: relative;
                            /* border: 1px solid black; */
                            font-size: 12px;
                            border: none !important;
                            left: 15px;
                            bottom: 10px;
                            color: rgb(112, 181, 255);
                            background-color: white;
                            /* border-radius: 4px; */
                            margin: auto;
                        }
                        
                        #signup-modal-trigger-btn:hover{
                            cursor: pointer;
                            color: rgb(55, 55, 255);
                        }
                        
                        /* #signup-modal-trigger-btn:hover{
                            transition: 0.2s;
                            color: azure;
                            background-color: rgb(127,127,127);
                        } */
                        
                        .signup-form{
                            position: relative;
                            top: 20px;
                            width: 50%;
                            margin: auto;
                        }
                        
                        .signup-form input:not(input[type='submit']){
                            width: 100%;
                            margin-top: 5px;
                            margin-bottom: 5px;
                            height: 25px;
                            border-radius: 8px;
                            border: 1.5px solid;
                        }
                        
                        .signup-form .submit{
                            width: 50%;
                            margin:10px 28%;
                            height: 30px;
                            font-weight: 500;
                            padding: 5px;
                            font-size: 14px;
                            transition: all 0.2s;
                            border-radius: 8rem;
                            margin-bottom: 40px;
                            border: 1px black solid;
                        }
                        
                        .signup-form .submit:hover{
                            transition: 0.2s;
                            color: azure;
                            background-color: rgb(127,127,127);
                            border: solid black 1px;
                            cursor: pointer;
                        }
                        
                        
                        @keyframes hide {
                            from{
                             opacity: 1;
                            }
                            to{
                             opacity: 0;
                            }
                         }
                        
                        \s
                         .email-warn{
                            width: 10%;
                            position: absolute;
                            z-index: 1;
                            right: 37%;
                            top: 100px;
                            background-color: black;
                            color: white;
                            padding: 0px 1px;
                            border-radius: 5px;
                            text-align: center;
                            animation: hide 1s 2s forwards;
                        }
                        
                        .email-warn::after{
                            position: absolute;
                            content: "";
                            right: 37%;
                            top: 14px ;
                            border: solid 5px;
                            border-color:  black transparent transparent  transparent ;
                        }
                        
                        .pass-warn{
                            width: 14%;
                            position: absolute;
                            z-index: 1;
                            right: 33%;
                            bottom: 125px;
                            background-color: black;
                            color: white;
                            padding: 0px 1px;
                            border-radius: 5px;
                            text-align: center;
                           animation: hide 1s 2s forwards;
                        }
                        
                        .pass-warn::before{
                            position: absolute;
                            content: "";
                            bottom: 15px;
                            border: solid 5px;
                            border-color:   transparent transparent black transparent ;
                        }
                        
                        .pass-check{
                            position: absolute;
                            right: 90px;
                            top: 160px;
                            z-index: 1;
                            height: 14px;
                            color: white;
                            padding-left: 5px;
                            padding-right: 5px;
                            border-radius: 4px;
                        }
                        
                        .pass-check h6,.conf-pass h6{
                            font-size: 8px;
                            -webkit-text-stroke-color: black;
                           \s
                            -webkit-text-fill-color: rgb(255, 255, 255);
                            -webkit-text-stroke-width: 0.2px;
                         }
                        
                         .conf-pass{
                          \s
                            position: absolute;
                            right: 10px;
                            top: 220px;
                            z-index: 1;
                            color: white;
                            height: 14px;
                            border-radius: 2px;
                            padding-left: 5px;
                            padding-right: 5px;
                            border-radius: 4px;
                        }
                        
                        #password-toggle{
                            position: absolute;
                            width: 50px;
                            height: 20px;
                            right: 0px;
                            bottom: 130px;
                            border: transparent ;
                            background-color: transparent;
                        }
                        
                        #password-toggle:hover{
                            cursor: pointer;
                        }
                        
                        .index-nav{
                            padding: 20px 10px;
                            display: flex;
                            background-color: black;
                            justify-content: space-around;
                            width: 96vw;
                        }
                        
                        #index-video-search-input{
                            border-radius: 6px;
                            margin-right: 5px;
                        }
                        
                        #index-search-btn{
                            border-radius: 6px;
                            font-weight: 500;
                        }
                        
                        #index-search-btn:hover{
                            cursor: pointer;
                            transition: 0.2s;
                            color: azure;
                            background-color: rgb(127,127,127);
                            border: solid black 2px;
                        }
                        
                        
                        .index-main{
                            padding: 20px;
                        }
                        
                        .index-results{
                            border-radius: 6px;
                            padding: 20px;
                            background-color: rgb(235, 235, 235);
                            height: fit-content;
                            width: 100%;
                            margin :auto;  \s
                        }
                        
                        #index-results{
                            display: flex;
                            flex-flow: row wrap;
                            justify-content: center;
                            padding: 10px;
                            width: fit-content
                        }
                        
                        #index-results a{
                            text-decoration: none;
                            color: white;
                            width: 210px;
                            border-radius: 6px;
                            margin: 5px;
                            background-color: black;
                            box-shadow: 0 0 1px 2px rgb(77,77,77);
                            padding: 5px;
                            min-width: 210px;
                            max-width: 210px;
                        }
                        
                        #index-results a:hover{
                            color: rgb(64, 64, 221);
                        }
                        
                        #index-results img{
                            display: block;
                            width: 200px;
                        }
                        
                        #login-exception{
                            opacity: 0;
                            position: absolute;
                           \s
                            left: 39%;
                            top: -20px;
                            width: fit-content;
                            z-index: 1;
                            border-radius: 6px;
                            padding: 5px;
                            background-color: rgba(0, 0, 0, 0.901);
                            color: white;
                            text-align: center;
                        }
                        
                        .animate{
                            animation: display ;
                            animation-duration: 2s;
                        }
                        
                        @keyframes display {
                            0%{
                                opacity: 1;
                            }
                            50%{
                                opacity: 1;
                            }
                            100%{
                                opacity: 0;
                            }
                        }
                        
                        #signup-exception{
                            opacity: 0;
                            position: absolute;
                            left: 27%;
                            top: 57;
                            width: fit-content;
                            border-radius: 6px;
                            padding: 5px;
                            background-color: black;
                            color: white;
                            text-align: center;
                        }
                        
                        
                        </style>
                    </head>
                    <body>
                        <div class="index-container">
                            <!-- left container content -->
                            <div class="left-container">
                                <i class="fa-solid fa-bars hamburger"  id="hamburger-home" type="button" data-bs-toggle="offcanvas" data-bs-target="#index-offcanvas" aria-controls="offcanvasTop"></i>
                                <div class="offcanvas offcanvas-start" tabindex="-1" id="index-offcanvas" aria-labelledby="offcanvasTopLabel">
                                    <div class="offcanvas-header">
                                        <i class="fa-solid fa-bars hamburger" id="hamburger-offcanvas" type="button" data-bs-toggle="offcanvas" data-bs-target="#index-offcanvas" aria-controls="offcanvasTop"></i>
                                        <!-- <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button> -->
                                    </div>
                                    <div class="offcanvas-body">
                                        <button id="login-modal-trigger-btn" data-bs-toggle="modal" data-bs-target="#login-modal">Login</button>
                                    </div>
                                </div>
                            </div><!--Left container contents ends here-->
                            <!-- Login modal -->
                            <div class="modal fade" id="login-modal" tabindex="-1" aria-hidden="true" aria-labelledby="login-modal">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="login-form">
                                            <table class="login-table">
                                                <tr>
                                                    <td>
                                                        <label for="login-email">E-mail</label>
                                                    </td>
                                                    <td>
                                                        <input type="email"  required id="login-email" name="userEmail" >
                                                    </td>
                                                    <td rowspan="2">
                                                        <input type="submit"  disabled id="login-submit"  />
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="password">password</label>
                                                    </td>
                                                    <td>
                                                        <input type="password"  required  id="login-pass" name="password">
                                                    </td>
                                                </tr>
                                            </table>
                                            <h6 id="login-exception"></h6>
                                        </div>
                                        <br>
                                        <button id="signup-modal-trigger-btn">new user? signup now</button>
                                        <!-- <button id="signup-modal-trigger-btn" data-bs-toggle="modal" data-bs-target="#signup-modal">new user? signup</button> -->
                                    </div>
                                </div>
                            </div>
                            <!-- signup modal -->
                            <div class="modal fade" id="signup-modal">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-body signup-modal" > <!--change to signup form-->
                                            <div class="pass-check"><h6 id="pass-check"> </h6></div>\s
                                            <div class="conf-pass"><h6 id="conf-pass"></h6></div>
                                            <div class="signup-form">
                                                    <label for="name">Name</label> <br>
                                                    <input type="text"  name="name" required id="name"/> <br>
                                                    <label for="email">E-mail</label> <br>
                                                    <input type="email" name="email" required id="email"/> <br>
                                                    <label for="password">Password</label> <br>
                                                    <input type="password" name="password"  required id="password">
                                                    <p id="password-toggle" onclick="togglePassword()">show</p>
                                                    <label for="confirm-password">Confirm Password</label> <br>
                                                    <input type="password" name="confirm-password"  required id="confirm-password">
                                                    <button type="button" class="submit" id="signup-submit" disabled >create</button>
                                                    <h6 id="signup-exception" >asgas</h6>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                                
                            <div class="right-container">
                                <div class="index-nav">
                                    <div class="index-search-div">
                                        <input type="text" id="index-video-search-input">
                                        <button id="index-search-btn" onclick="requests.getIndexVideo()">Search</button>
                                    </div>
                                </div>
                                <div class="index-main">
                                    <div class="index-results">
                                        <div id="index-results">
                                
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/js/all.min.js" integrity="sha512-fD9DI5bZwQxOi7MhYWnnNPlvXdp/2Pj3XSTRrFs5FQa4mizyGLnJcN6tuvUS6LbmgN1ut+XGSABKvjN0H6Aoow==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
                        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
                        <script>
                        let indexVideoSearchInput = document.getElementById("index-video-search-input")
                        let indexVideoSearchBtn = document.getElementById("index-search-btn")
                        let loginEmail = document.getElementById("login-email")
                        let loginPass = document.getElementById("login-pass")
                        let loginSubmit = document.getElementById("login-submit")
                        let signupName = document.getElementById("name")
                        let signupEmail = document.getElementById("email")
                        let password = document.getElementById("password")
                        let confPassword = document.getElementById("confirm-password")
                        let passWarn = document.getElementById("pass-check")
                        let confPass = document.getElementById("conf-pass")
                        let signupSubmit = document.getElementById("signup-submit")
                        let passwordToggle = document.getElementById("password-toggle")
                        passwordToggle.addEventListener('onclick',passwordToggle)
                        password.addEventListener('keyup',passwordValidation)
                        confPassword.addEventListener('keyup',passwordValidation)
                        password.addEventListener('keyup',validateSignup)
                        confPassword.addEventListener('keyup',validateSignup)
                        signupEmail.addEventListener('keyup',validateSignup)
                        signupName.addEventListener('keyup',validateSignup)
                        loginEmail.addEventListener('keyup',loginValidate)
                        loginPass.addEventListener('keyup',loginValidate)
                        indexVideoSearchInput.addEventListener('keypress',function(e){
                            if(e.key == "Enter"){
                                requests.getIndexVideo()
                            }
                        })
                        
                        let writeFunctions = {
                        
                            writeIndexVideo : function(data,element){
                        
                                console.log(data,element)
                                let writeData = "";
                                for(x in data){
                                    writeData = writeData+`
                                        <a href="${data[x].videoLink}">
                                            <img src="${data[x].videoThumbnail}">
                                            ${data[x].videoTitle}
                                        </a>`;
                                }
                        
                                if(writeData != "")
                                element.innerHTML = writeData
                            },
                            writeIndexVideoNotFound : function(element){
                        
                                let writeData  = "<h3>No Video Found</h3>";
                                element.innerHTML = writeData
                            },
                            writeLoginException : function(data){
                                let element = document.getElementById("login-exception")
                                element.innerText = "Invalid Login Credentials"
                               \s
                                element.setAttribute("class","animate")
                                setTimeout(removeAnimateLogin,4000,element)
                            },
                            writeSignUpException : function(data){
                                let element = document.getElementById("signup-exception")
                                element.innerText = data
                                console.log(data)
                                console.log(element)
                                element.setAttribute("class","animate")
                                element.classList.add("animate")
                                setTimeout(removeAnimateSignup,4000,element)
                            }
                        
                        }
                        
                        let requests = {
                        
                            getIndexVideo : async function(){

                                let element = document.getElementById("index-results")
                                element.innerText = "";
                                let searchKeyword = indexVideoSearchInput.value
                                let response = await fetch(`${url}video/search?searchKeyword=${searchKeyword}`,{
                                    headers : {
                                        "Content-Type" : "application/json"
                                    },
                                    method : "GET",
                                    Accept : "/*",
                                })
                                if(response.status == 404){
                                    writeFunctions.writeIndexVideoNotFound(element)
                                }else{
                                    let data = await response.json()
                                    let start = performance.now()
                                    writeFunctions.writeIndexVideo(data.modelMap.YTLinkList,element)
                                    let timetook = performance.now()-start
                                    console.log(timetook,"ms");
                                }
                            },
                            login : async function(){
                        
                                let userEmail = document.getElementById("login-email").value
                                let password = document.getElementById("login-pass").value;
                               \s
                                let response =await fetch(`${url}user/login`, {
                                    method: 'PUT',
                                    headers: {
                                        "Content-Type":"application/json",
                                        "Accept" :"application/json"
                                    },
                                    body:JSON.stringify({
                                        userEmail : `${userEmail}`,
                                        password : `${password}`
                                    }),
                                    redirect:"follow"
                                })
                                window.location.reload()
                          
                            },
                            signup : async function(){
                                let userName = document.getElementById("name").value;
                                let userEmail = document.getElementById("email").value;
                                let password = document.getElementById("password").value;
                        
                                let response =await fetch(`${url}user/create`, {
                                    method: 'POST',
                                    headers: {
                                        "Content-Type":"application/json",
                                        "Accept":"/*"
                                    },
                                    body:JSON.stringify({
                                        userName : `${userName}`,
                                        userEmail : `${userEmail}`,
                                        password : `${password}`
                                    }),
                                    redirect:"follow"
                                })
                        
                                if(response.status == 406){
                                    let data = await response.json()
                                    writeFunctions.writeSignUpException(data)
                                }else{
                                    let data = await response.json();
                                    let x = window.location.pathname;
                                    let arr = x.split("/")
                                    localStorage.setItem("jwtToken",data);
                                    window.location.href = url+"home.html"
                        //            window.location.href = window.location.origin+"/"+arr[1]+`/home.html`
                                    // window.location.href=url+"home.html"
                                }
                            }
                        
                        }
                        
                        function loginValidate(){
                        \s
                            if(loginEmail.value.length>10 && loginPass.value.length>=8){
                                loginSubmit.disabled = false
                            }else{
                                loginSubmit.disabled = true
                            }
                        }
                        
                        function removeAnimateSignup(){
                            document.getElementById("signup-exception").classList.remove("animate")
                        }
                        
                        function removeAnimateLogin(){
                           \s
                            document.getElementById("login-exception").classList.remove("animate")
                        }
                        
                        
                        function validateSignup(){
                            let passWarn = document.getElementById("pass-check")
                            let confPass = document.getElementById("conf-pass")
                        
                            if(password.value != "" && passWarn.outerText == "" && confPass.outerText == "" && nameValidation()){
                                signupSubmit.disabled = false
                            }else{
                                signupSubmit.disabled = true
                            }
                        }
                        
                        function passwordValidation(){
                            if(password.value.length < 8) passWarn.innerText =  "Password size must be more than 8"
                            else if(!password.value.match(/[a-zA-z]/g)) passWarn.innerText = "Password must have a letter"
                            else if(!password.value.match(/[0-9]/g)) passWarn.innerText = "Password must have a number"
                            else passWarn.innerText = ""
                            if(password.value.toString().length == 0) passWarn.innerText = "";
                            if(confPassword.value.toString().length == 0) confPass.innerText = "";
                            if(password.value != confPassword.value){
                                confPass.innerText = "Password and Confirm Password must be same";
                            }else {
                                confPass.innerHTML = ""
                            }
                        }
                        
                        function nameValidation(){
                            if(signupName.value.length >= 3 && signupEmail.value.length > 10 && signupEmail.value.toString().includes('@') && signupEmail.value.toString().includes(".")){
                                return true
                            }else{
                                return false
                            }
                        }
                        
                        function togglePassword(){
                            let showPass = document.getElementById("password-toggle")
                            let password = document.getElementById("password")
                            if(password.type=="password"){
                                password.type="text"
                                showPass.innerText = "hide"
                            }
                            else{
                                password.type="password"
                                showPass.innerText = "show"
                            }
                        }
                        
                        signupSubmit.addEventListener('click',requests.signup)
                        loginSubmit.addEventListener('click',requests.login)
                        indexVideoSearchBtn.addEventListener('click',requests.getIndexVideo)
                        
//                        requests.getIndexVideo()
                        
                        let loginModal = document.getElementById("login-modal")
                        let signupModal = document.getElementById("signup-modal")
                        
                        loginModal.addEventListener('hide.bs.modal',clearInputs)
                        signupModal.addEventListener('hide.bs.modal',clearInputs)
                        
                        function clearInputs(){
                            loginPass.value = ""
                            loginEmail.value = ""
                            signupEmail.value = ""
                            signupName.value = ""
                            password.value = ""
                            confPassword.value = ""
                            passWarn.inn = ""
                            confPass.innerText = ""
                        
                        }
                        
                        let signUpPage = document.getElementById("signup-modal-trigger-btn")
                        
                        signUpPage.addEventListener('click',function(){
                            window.location.href = `${url}sign_up`
                        })
                        </script>
                       \s
                    </body>
                </html>
                """;

        }else{
            str = """
                    <html>
                        <head>
                            <!-- add script to check jwt -->
                            <script >
                            (function() {
                            	window.onpageshow = function(event) {
                            		if (event.persisted) {
                            			window.location.reload();
                            		}
                                console.log("reloaded")
                            	};
                            })();
                            let url = "http://localhost:8080/"
                            </script>
                            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
                            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
                            <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
                            <style>
                                .home-container{
                                    background-color: rgb(74, 74,74);
                                    min-height: 100vh;
                                    height: fit-content;
                                    display: flex;
                                }
                                #hamburger-icon-home{
                                   margin-top: 20px;
                                }
                                .hamburger{
                                    font-size: 24;
                                    background-color: rgb(219, 219, 219);
                                    padding: 10px;
                                    border-radius: 6px;
                                    border: 1px solid black;
                                }
                                .hamburger:hover{
                                    transition: 0.2s;
                                    color: azure;
                                    background-color: rgb(127,127,127);
                                    border: solid black 1px;
                                }
                                .left-container{
                                    text-align: center;
                                    min-width: 4%;
                                    background-color: red;
                                    border-right: 1px solid black;
                                }
                                #home-offcanvas{
                                    text-align: center;
                                    background-color: red;
                                    max-width: 20%;
                                }
                                .btn-close{
                                    border: 1px solid black;
                                }
                                .create-playlist-div{
                                    padding: 20px;
                                    border: solid 2px black;
                                    border-radius: 6px;
                                    height: 150px;
                                    font-weight: 600;
                                    margin-bottom: 20px;
                                }
                                .create-playlist-div~button{
                                    border-radius: 6px;
                                    width: 100%;
                                    margin-top: 10px;
                                    font-weight: 500;
                                }
                                .create-playlist-div~button:hover{
                                    cursor: pointer;
                                    transition: 0.2s;
                                    color: azure;
                                    background-color: rgb(127,127,127);
                                    border: solid black 2px;
                                }
                                #create-playlist-input-field{
                                    margin: 5px;
                                    width: 100%;
                                    margin-bottom: 10px;
                                    border-radius: 6px;
                                }
                                #create-playlist-btn{
                                    border-radius: 6px;
                                    width: 100%;
                                    margin: 5px;
                                    margin-bottom: 70px;
                                    font-weight: 500;
                                }
                                #create-playlist-btn:hover{
                                    cursor: pointer;
                                    transition: 0.2s;
                                    color: azure;
                                    background-color: rgb(127,127,127);
                                    border: solid black 2px;
                                }
                                #playlists{
                                    background-color: white;
                                    border-radius: 6px;
                                    display: flex;
                                    flex-direction: column;
                                    justify-content: center;
                                }
                                #playlists button{
                                    border-radius: 6px;
                                    display: block;
                                    font-weight: 500;
                                    margin: 10px;
                                }
                                #playlists button:hover{
                                    cursor: pointer;
                                    transition: 0.2s;
                                    color: azure;
                                    background-color: rgb(127,127,127);
                                    border: solid black 2px;
                                }
                                #playlist-modal{
                                    position: absolute;
                                }
                                #modal-content>div{
                                   margin: 50px;
                                }
                                #modal-content>div>label{
                                    font-weight: 600;
                                }
                                #modal-content>div>button{
                                    width: 75%;
                                }
                                #select-playlist::-webkit-scrollbar {
                                    display: none;
                                  }
                                  #choose-playlist-btn{
                                    border-radius: 6px;
                                    font-weight: 500;
                                    margin: 5px;
                                  }
                                  #choose-playlist-btn:hover{
                                    cursor: pointer;
                                    transition: 0.2s;
                                    color: azure;
                                    background-color: rgb(127,127,127);
                                    border: solid black 2px;
                                  }
                                  #select-playlist{
                                    display: none;
                                    margin-top: 5px;
                                    position: relative;
                                    left: 19.5%;
                                    height: 200px;
                                    overflow: scroll;
                                    text-align: center;
                                }
                                #select-playlist div{
                                    display: block;
                                    width: 75%;
                                    margin-bottom: 5px;
                                    border-radius: 6px;
                                    font-weight: 400;
                                }
                                #select-playlist>div>button{
                                    display: inline-block;
                                    border: solid black 2px;
                                    text-decoration: none;
                                    color: black;
                                    border-radius: 6px;
                                    min-width:  95%;
                                }
                                .playlist{
                                    display: inline-block;
                                    border: solid black 2px;
                                    text-decoration: none;
                                    color: black;
                                    border-radius: 6px;
                                    min-width:  95%;
                                }
                                #select-playlist button:hover{
                                    cursor: pointer;
                                    transition: 0.2s;
                                    color: azure;
                                    background-color: rgb(127,127,127);
                                    border: solid black 2px;
                                }
                                #select-playlist button>div{
                                    height: 25px;
                                    display: flex;
                                    justify-content: center;
                                    gap: 5px;
                                }
                                #select-playlist button a{
                                    text-decoration: none;
                                    color: black;
                                    font-weight: 400;
                                }
                                #select-playlist button a:hover{
                                    color: white;
                                }
                                #select-playlist>div>svg:hover{
                                    cursor: pointer;
                                }
                                .home-nav{
                                    padding: 20px 10px;
                                    display: flex;
                                    background-color: black;
                                    justify-content: space-around;
                                    width: 96vw;
                                }
                                #home-btn{
                                    color: white;
                                    position: relative;
                                    left: -130px;
                                    font-size: 22;
                                }
                                #home-btn:hover{
                                    cursor: pointer;
                                    color: rgb(127,127,127);
                                }
                                #home-video-search-input{
                                    border-radius: 6px;
                                    margin-right: 5px;
                                }
                                #home-search-btn{
                                    border-radius: 6px;
                                    font-weight: 500;
                                }
                                #home-search-btn:hover{
                                    cursor: pointer;
                                    transition: 0.2s;
                                    color: azure;
                                    background-color: rgb(127,127,127);
                                    border: solid black 2px;
                                }
                                #logout-btn{
                                    border-radius: 6px;
                                    font-weight: 500;
                                }
                                #logout-btn:hover{
                                    cursor: pointer;
                                    transition: 0.2s;
                                    color: azure;
                                    background-color: rgb(127,127,127);
                                    border: solid black 2px;
                                }
                                .home-main{
                                    padding: 20px;
                                }
                                .home-results{
                                    border-radius: 6px;
                                    padding: 20px;
                                    background-color: rgb(235, 235, 235);
                                    height: fit-content;
                                    width: 100%;
                                    margin :auto;
                                }
                                #home-results{
                                    display: flex;
                                    flex-flow: row wrap;
                                    justify-content: center;
                                    padding: 10px;
                                    width: 97%;
                                }
                                #home-results a{
                                    text-decoration: none;
                                    color: white;
                                    width: 210px;
                                    border-radius: 6px;
                                    margin: 5px;
                                    background-color: black;
                                    box-shadow: 0 0 1px 2px rgb(77,77,77);
                                    padding: 5px;
                                    min-width: 210px;
                                    max-width: 210px;
                                }
                                #home-results a:hover{
                                    color: rgb(64, 64, 221);
                                }
                                #home-results img{
                                    display: block;
                                    width: 200px;
                                }
                                #search-results-in-playlist{
                                    position: absolute;
                                    left: 18.5%;
                                    top: 50px;
                                    background-color: rgba(49, 49, 49,0.7);
                                    width: 70%;
                                    padding: 8px;
                                    border-radius: 6px;
                                    z-index: 5;
                                }
                                #search-results-in-playlist button{
                                    border-radius: 6px;
                                    display: block;
                                    width: 95%;
                                    margin: auto;
                                    font-weight: 500;
                                    margin-bottom: 5px;
                                }
                                #search-results-in-playlist button:hover{
                                    cursor: pointer;
                                    transition: 0.2s;
                                    color: azure;
                                    background-color: rgb(127,127,127);
                                    border: solid black 2px;
                                }
                                #modal-content{
                                    position: relative;
                                    left: -30%;
                                    width: 150%;
                                }
                                #playlist-items svg:hover{
                                    cursor: pointer;
                                }
                                #playlist-items i:hover{
                                    cursor: pointer;
                                }
                                #already-found-item{
                                    display: none;
                                    position: absolute;
                                    background-color: black;
                                    top: 50px;
                                    z-index: 3;
                                    padding: 5px 10px;
                                    left: 150px;
                                    border-radius: 6px;
                                    color: white !important;
                                    width: 50%;
                                    margin: auto;
                                    opacity: 0;
                                }
                                #already-found-item:hover{
                                    cursor: default;
                                }
                                .animate{
                                    display: block !important;
                                    animation: display;
                                    opacity: 1;
                                    animation-duration:  3s;
                                }
                                @keyframes display {
                                    0%{
                                        opacity: 1;
                                    }
                                    50%{
                                        opacity: 1;
                                    }
                                    100%{
                                        opacity: 0;
                                    }
                                }
                                #confirm-delete-playlist{
                                    display: flex;
                                    flex-direction: column;
                                    justify-content: center;
                                    padding: 50px;
                                }
                                #confirm-playlist-delete button{
                                    border-radius: 6px;
                                    display: block;
                                    width: 95%;
                                    margin: auto;
                                    font-weight: 500;
                                    margin-bottom: 5px;
                                }
                                #confirm-playlist-delete h3{
                                    margin-bottom: 20px;
                                    text-align: center;
                                }
                                #confirm-playlist-delete button:hover{
                                    cursor: pointer;
                                    transition: 0.2s;
                                    color: azure;
                                    background-color: rgb(127,127,127);
                                    border: solid black 2px;
                                }
                            </style>
                        </head>
                        <body>
                            <div class="home-container">
                                <!-- Left container| contains field to create playlist and List of playlist -->
                                <div class="left-container">
                                    <i class="fa-solid fa-bars hamburger"  id="hamburger-icon-home" type="button" data-bs-toggle="offcanvas" data-bs-target="#home-offcanvas" aria-controls="offcanvasTop"></i>
                                </div>
                                <div class="offcanvas offcanvas-start" id="home-offcanvas" tabindex="-1" aria-labelledby="offcanvasTopLabel">
                                    <div class="offcanvas-header">
                                        <i class="fa-solid fa-bars hamburger"  id="hamburger-icon-offcanvas" type="button"  data-bs-toggle="offcanvas" data-bs-target="#home-offcanvas"  aria-label="Close"></i>
                                    </div>
                                    <div class="offcanvas-body">
                                        <div class="create-playlist-div">
                                            <Label for="create-playlist-input-field">Create New PlayList</Label>
                                            <input type="text" placeholder="Enter PlayList Name" id="create-playlist-input-field"> <br>
                                            <button type="button" disabled onclick="requests.createPlayList();checkCreatePlayList()"  id="create-playlist-btn">Create</button>
                                        </div>
                                        <button data-bs-target="#playlist-modal" data-bs-toggle="modal">View PlayLists</button>
                                    </div>
                                </div>   <!--left container ends here-->
                                <!-- modal to display playlist contents -->
                                <div class="modal fade"  id="playlist-modal" tabindex="-1" aria-labelledby="playlist-model" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content" id="modal-content">
                                            <div>
                                                <Label for="choose-playlist-btn">Select A PlayList</Label>
                                                <button id="choose-playlist-btn" onclick="showPlayLists()">Choose A PlayList</button>
                                                    <div name="Select PlayList" id="select-playlist">
                                                       \s
                                                    </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="modal fade"  id="confirm-playlist-delete" tabindex="-1" aria-hidden="true" aria-labelledby="confirm-delete" >
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <h3>Confirm Delete?</h3>
                                            <button data-bs-toggle="modal" data-bs-target="#playlist-modal" onclick="requests.deletePlayList()">Ok</button>
                                            <button data-bs-toggle="modal" data-bs-target="#playlist-modal">Cancel</button>
                                        </div>
                                    </div>
                                </div>
                                        
                                <!-- right container -->
                                <div class="right-container">
                                    <div class="home-nav">
                                        <div id="home-btn">
                                            <i  onclick="goHome()" class="fa-solid fa-house"></i>
                                        </div>
                                        <div class="home-search-div">
                                            <input type="text" id="home-video-search-input">
                                            <button id="home-search-btn" onclick="requests.getHomeVideo()">Search</button>
                                        </div>
                                        <div>
                                            <button id="logout-btn" onclick="requests.logout();
                    ">Logout</button>
                                        </div>
                                    </div>
                                    <div class="home-main">
                                        <div class="home-results" >
                                            <section id="home-results">
                                        
                                            </section>
                                        </div>
                                    </div>
                                </div>
                            </div>
                                        
                            <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/js/all.min.js" integrity="sha512-fD9DI5bZwQxOi7MhYWnnNPlvXdp/2Pj3XSTRrFs5FQa4mizyGLnJcN6tuvUS6LbmgN1ut+XGSABKvjN0H6Aoow==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
                            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
                           <script>
                            let createPlayListInput = document.getElementById("create-playlist-input-field")
                            let createPlayListBtn = document.getElementById("create-playlist-btn")
                            let homeVideoSearchInput = document.getElementById("home-video-search-input")
                            let homeSearchBtn = document.getElementById("home-search-btn")
                            let playListVideoSearchInput = document.getElementById("playlist-video-search-input")
                            let searchResultsInPlayList = document.getElementById("search-results-in-playlist")
                            let playListModal = document.getElementById("playlist-modal")
                            let logout = document.getElementById("logout-btn")
                            let deletePlayListBtn = document.getElementById("delete-playlist-btn")
                            let playLists = [];
                            let currentPlayListName = "";
                            let currentPlayList= [];
                            let playListSearchResults = [];
                            function changeCurrentPlayList(playListName){
                                currentPlayListName = playListName
                            }
                            function goHome(){
                                window.location.href = `${url}`
                            }
                            createPlayListInput.addEventListener('keyup',checkCreatePlayList)
                            createPlayListBtn.addEventListener('click',function(){
                                createPlayListInput.value = ""
                            })
                            function showPlayLists(){
                                let playLists = document.getElementById("select-playlist")
                                if(window.getComputedStyle(playLists).display == "block"){
                                    playLists.style.display = "none"
                                }else{
                                    playLists.style.display = "block"
                                }
                            }
                            async function checkAndAddItemToPlayList(videoTitle){
                                console.log(videoTitle,currentPlayList)
                                if(currentPlayList.length == 0 ) {
                                    requests.addItemToPlayList(videoTitle)
                                }else{
                                    for(x in currentPlayList){
                                        console.log(currentPlayList[x].videoTitle.toString(), videoTitle.toString())
                                        if(currentPlayList[x].videoTitle == videoTitle){
                                            console.log("saf")
                                            animateAlreadyFound()
                                            return;
                                        }
                                     }
                                     requests.addItemToPlayList(videoTitle)
                                     return new Promise(resolve => resolve())
                                }
                            }
                            function animateAlreadyFound(){
                                let element = document.getElementById("already-found-item")
                                element.setAttribute("class","animate")
                                // element.classList.add("animate")
                                setTimeout(removeAnimate,4000,element)
                            }
                            function removeAnimate(element){
                                element.classList.remove("animate")  \s
                            }
                            function removeItem(videoTitle){
                                for(x in currentPlayList){
                                    if(currentPlayList[x].videoTitle == videoTitle){
                                        console.log("removing ",currentPlayList[x].videoTitle)
                                        currentPlayList.splice(x,1)
                                    }
                                }
                                return currentPlayList
                            }
                            function addItem(videoTitle){
                                for(x in playListSearchResults){
                                    if(playListSearchResults[x].videoTitle == videoTitle){
                                        currentPlayList.push(playListSearchResults[x])
                                    }
                                }
                                return currentPlayList
                            }
                            function checkCreatePlayList(){
                                if(createPlayListInput.value.length >= 3 && !containsSamePlayList()) createPlayListBtn.disabled = false
                                else createPlayListBtn.disabled = true
                            }
                            function containsSamePlayList(){
                                if(playLists.includes(createPlayListInput.value.toString().trim())) return true;
                                else return false
                            }
                            homeVideoSearchInput.addEventListener('keyup',function(e){
                                if(e.key == "Enter") requests.getHomeVideo()
                            })
                            const writeFunctions = {
                                writeHomeVideo : async function(data,element){
                                    let writeData = "";
                                    let newFrag = document.createDocumentFragment()
                                    data.forEach(obj => {
                                        let aTag = document.createElement("a");
                                        let imgTag = document.createElement("img")
                                        let text = document.createElement("p")
                                        aTag.setAttribute("href",`${obj.videoLink}`)
                                        imgTag.setAttribute("src",`${obj.videoThumbnail}`)
                                        text.textContent = `${obj.videoTitle}`;
                                        aTag.append(imgTag,text)
                                        newFrag.append(aTag)
                                    })
                                    element.append(newFrag)
                                },
                                writeHomeVideoNotFound : function(element){
                                    let writeData = "<h3>No Video Found</h3>";
                                    element.innerHTML = writeData
                                },
                                writePlayList : function(){
                                    let writeDocument = document.getElementById("select-playlist")
                                    let writeData = "";
                                    for(x in playLists) {
                                        writeData = writeData+`<div><button  class="playlists"  onclick="switchPlayList('${playLists[x]}')">${playLists[x]}</button> <i data-bs-toggle="modal" data-bs-target="#confirm-playlist-delete" onclick="changeCurrentPlayList('${playLists[x]}')" class="fa fa-circle-xmark delete-video"></i></div>`
                                    }
                                    writeDocument.innerHTML = writeData
                                },
                                writePlayListContent : function(playListName,data,element){
                                    let writeData = `<input type="hidden" id=playListName value="${playListName}">`
                                    for(x in data){
                                        writeData = writeData+`<div>
                                            <a href="${data[x].videoLink}">
                                                <div>
                                                    <img src="${data[x].videoThumbnail}">
                                                    <h6>${data[x].videoTitle}</h6>
                                                </div>
                                            </a>
                                            <i onclick="requests.removeItemFromPlayList('${data[x].videoTitle}')" class="fa fa-circle-xmar
                                            k delete-video"></i>
                                        </div>`
                                    }
                                    element.innerHTML = writeData;
                                },
                                writePlayListVideo : function(data){
                                    let writeDocument = document.getElementById("search-results-in-playlist")
                                    let writeData = '<h6 id="already-found-item">Video Already Found In PlayList</h6>';
                                    for(x in data){
                                        writeData = writeData+`<div><button  onclick='clearPlayListSearchInput();checkAndAddItemToPlayList(\\"${data[x].videoTitle}\\")'  value="" >${data[x].videoTitle}</button></div>`
                                    }
                                    writeDocument.innerHTML = writeData
                                }
                            }
                            function switchPlayList(playListName){
                                let loc = window.location.pathname;
                                let arr = loc.split('/')
                               window.location.href = window.location.origin+`/playlist?playListName=${playListName}`
                            }
                            const requests = {
                                getHomeVideo : async function(){
                                    let element = document.getElementById("home-results")
                                    element.innerHTML = "";
                                    let searchKeyword = homeVideoSearchInput.value
                                    let response = await fetch(`${url}video/search?searchKeyword=${searchKeyword}`,{
                                        headers : {
                                            "Content-Type" : "application/json",
                                            "Authorization" : `bearer ${jwtToken}`,
                                            "Accept":"application/json"
                                        },
                                        method : "Get",
                                    })
                                    if(response.status == 404){
                                        writeFunctions.writeHomeVideoNotFound(element)
                                    }else{
                                        let data = await response.json();
                                        console.log(data.model)
                                        let start = performance.now()
                                        writeFunctions.writeHomeVideo(data.modelMap.YTLinkList,element)
                                        let timetook = performance.now()-start
                                        console.log(timetook,"ms")
                                    }
                                },
                                createPlayList : async function(){
                                    let playListName = createPlayListInput.value
                                    playLists.push(playListName)
                                    writeFunctions.writePlayList()
                                    let response = await fetch(`${url}playlist/create`,{
                                        headers: {
                                            contentType: 'application/json',
                                            Authorization: `bearer ${(localStorage.getItem("jwtToken"))}`,
                                            Accept : "/*"
                                        },
                                        method:"POST",
                                        body : JSON.stringify({
                                            playListName : `${playListName}`
                                        })
                                    })
                                    let data = await response.json();
                                    playLists = data.model.playLists;
                                },
                                getPlayLists : async function(){
                                    let response = await fetch(`${url}playlist/get`,{
                                        headers: { "Content-Type": "application/json",
                                        "Authorization" : `Bearer ${jwtToken}`,
                                        "Accept":"application/json"
                                            },
                                        method : "GET",
                                        }).then(res => res.json())
                                        console.log(response)
                                    playLists = response.modelMap.playLists;
                                    writeFunctions.writePlayList()
                                },
                                viewPlayList : async function(playListName){
                                    currentPlayListName = playListName;
                                    let element = document.getElementById("playlist-items")
                                    currentPlayList = [];
                                    writeFunctions.writePlayListContent(playListName,currentPlayList,element);
                                    let response = await fetch(`${url}playlist/view?playListName=${playListName}`,{
                                        headers: { "Content-Type": "application/json",
                                        "Authorization" : `Bearer ${jwtToken}`,
                                        "Accept":"/*"
                                            },
                                        method : "GET",
                                        Accept:"/*",
                                    }).then(res => res.json())
                                    currentPlayList = response
                                    writeFunctions.writePlayListContent(playListName,response,element);
                                },
                                deletePlayList :async function(){
                                    let playListName = currentPlayListName
                                    console.log(playLists)
                                    let idx = playLists.indexOf(playListName)
                                    playLists.splice(idx,1)
                                    console.log(playLists)
                                    writeFunctions.writePlayList()
                                    let response = await fetch(`${url}playlist/delete`,{
                                        headers: { "Content-Type": "application/json",
                                        "Authorization" : `Bearer ${jwtToken}`,
                                        "Accept":"/*"
                                            },
                                        body: JSON.stringify({
                                            playListName\s
                                        }),
                                        method : "POST",
                                        Accept:"/*",
                                    }).then(res => res.json())
                                },
                                getPlayListVideo : async function(){
                                    let searchKeyword = document.getElementById("playlist-video-search-input").value
                                    let response = await fetch(`${url}video/search`,{
                                        headers: { "Content-Type": "application/json",
                                        "Authorization" : `Bearer ${jwtToken}`,
                                        "Accept":"/*"
                                            },
                                        body:JSON.stringify({
                                            searchKeyword : `${searchKeyword}`
                                        }),
                                        method : "POST",
                                        Accept:"/*",
                                    }).then(res => res.json())
                                    playListSearchResults = response
                                    writeFunctions.writePlayListVideo(response)
                                },
                                addItemToPlayList : async function(videoTitle){
                                    let playListName = document.getElementById("playListName").value
                                    let element = document.getElementById("playlist-items")
                                    currentPlayList = addItem(videoTitle);
                                    writeFunctions.writePlayListContent(playListName,currentPlayList,element)
                                    await fetch(`${url}playlist/add`,{
                                        headers : {
                                            "Content-Type" : "application/json",
                                            "Authorization" : `Bearer ${jwtToken}`,
                                            "Accept":"/*"
                                        },
                                        method : "POST",
                                        Accept : "/*",
                                        body : JSON.stringify({
                                            "playListName" : `${playListName}`,
                                            "videoTitle" : `${videoTitle}`
                                        })
                                    }).then(res => res.json())
                                },
                                removeItemFromPlayList : async function(videoTitle){
                                    let playListName = document.getElementById("playListName").value
                                    let element = document.getElementById("playlist-items")
                                    currentPlayList = removeItem(videoTitle)
                                    writeFunctions.writePlayListContent(playListName,currentPlayList,element)
                                    let response = await fetch(`${url}playlist/remove`,{
                                        headers: {\s
                                            "Content-Type": "application/json",
                                            "Authorization" : `Bearer ${jwtToken}`,
                                            "Accept":"/*"
                                            },
                                        method : "POST",
                                        Accept:"/*",
                                        body: JSON.stringify({
                                            "playListName": `${playListName}`,
                                            "videoTitle" : `${videoTitle}`
                                          })  \s
                                    }).then(res => res.json())
                                },
                                logout : function(){
                                    fetch(`${url}user/logout`,{
                                        method: "GET"
                                    })
                                    window.location.reload()
                                }
                            }
//                            requests.getHomeVideo()
//                            requests.getPlayLists()
                           </script>
                        </body>
                    </html>
                    """;
        }
        out.print(str);
        out.close();
    }
}

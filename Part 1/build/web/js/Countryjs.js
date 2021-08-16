function emailvalidation(){
    //alert("Hello");
    var a=document.getElementById('emailid').value; 
    
    
    if(a.indexOf('@')<=0)
    {
        document.getElementById('Message').innerHTML="**Invalid Email Id**";
        return false;
    }
    
    

    
    
}
function phonenovalidation()
{
    //alert("Hello");
    var b=document.getElementById('phoneid').value;
    if(b.length<10)
    {
        document.getElementById('Message1').innerHTML="**Please fill 10 Digit Mobile Number**";
        return false;
    }
    if(b.length>10)
    {
        document.getElementById('Message1').innerHTML="**Please fill 10 Digit Mobile Number**";
        return false;
    }
    if(isNaN(b))
    {
        document.getElementById('Message1').innerHTML="**only Number**";
        return false;
    }
        
}


function setcountrycode()
{
    //alert('code');
    var a = document.getElementById('countryid').value;
    if (a === "India")
    {
        document.getElementById('codeid').value="+91"
       
    }
    if (a === "Australia")
    {
        document.getElementById('codeid').value="+64"
       
    }
    if (a === "United States")
    {
        document.getElementById('codeid').value="+1"
       
    }
    
}




function setstate()
{
    var a = document.getElementById('countryid').value;
    if (a === "India")
    {
        var array = ["Maharashtra", "New Delhi", "Temilnadu"];
        
        
    }
    else if (a === "Australia")
    {
        var array = ["Sydney", "Victoria", "Queensland"];
    }
    else if (a === "United States")
    {
        var array = ["California", "Florida", "New York"];
    }
    else
    {
        var array = [];
    }
    var string = "";
    for (i = 0; i < array.length; i++)
    {
        string = string +"<option>"+array[i]+"<option>";
    }
    string = "<select>" + string + "</select>";
    document.getElementById('stateid').innerHTML = string;
    
}




function setcityyw()
{

    var a = document.getElementById('stateid').value;
    if (a === "Maharashtra")
    {
        var array = ["Mumbai", "Pune", "Dhule"];
    }
    else if (a === "New Delhi")
    {
        var array = ["Mustafabad", "KishanGanj"];
    }
    else if (a === "Temilnadu")
    {
        var array = ["Chennai", "Coimbatore"];
    }
    else if (a === "Sydney")
    {
        var array = ["New South Wales", "Dubbo"];
    }
    else if (a === "Victoria")
    {
        var array = ["Melborne", "Benalla"];
    }
    else if (a === "Queensland")
    {
        var array = ["Brisbane", "Cairns"];
    }
    else if (a === "California")
    {
        var array = ["Los Angeles", "San Francisco"];
    }
    else if (a === "Florida")
    {
        var array = ["Miami", "Orlando"];
    }
    else if (a === "New York")
    {
        var array = ["Buffalo", "New York"];
    }

    else
    {
        var array = [];
    }
    var string = "";
    for (i = 0; i < array.length; i++)
    {
        string = string + "<option>"+array[i]+"<option>";
    }
    string = "<select>"+string+"</select>";
    document.getElementById('cityid').innerHTML = string;
}

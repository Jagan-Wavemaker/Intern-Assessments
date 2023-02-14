//Tasks that are added as objects
let lst_data = {
    Exercising: 'done',
    GoingToBank: 'pending',
    Breakfast: 'done',
    AttendBirthdayParty: 'pending'
};
var pending_tag = document.querySelector('#pendingtask'); //returns the first element that matches the document
var done_tag = document.querySelector('#donetask');
var pendingtask = pending_tag.innerHTML; //used to write the dynamic html content..it also returns the text content of the element
var done = done_tag.innerHTML;
var list = document.querySelector('ul');
var counter = document.querySelector('#count');
var total_count = counter.innerHTML;
//adding list items
Object.keys(lst_data).forEach((item)=>{
    let li = document.createElement("li");
    li.innerText = item; //used to generate the dynamic content 
    list.appendChild(li);
    if(item == "Exercising"){
        li.classList.toggle('checked'); //classList JavaScript is a read-only property that is used to return CSS classes in the form of an array
    }
    if(item == "Breakfast"){
        li.classList.toggle('checked');  //toggle is used to check and uncheck the li items
    }
})
//done and pending task count calculation
list.addEventListener('click', function(val){
    if(val.target.tagName === 'LI'){
        val.target.classList.toggle('checked');
        done = document.querySelectorAll('.checked').length;
        done_tag.innerHTML = done;
        pending_tag.innerHTML = total_count - done;
    }
}
, false);
function newElement(){
    var li = document.createElement("li");
    var input_value = document.getElementById("inputtext").value; //reading value from the text box
    var txt = document.createTextNode(input_value); //used to create a TextNode which contains element node and a text node. It is used to provide text to an element.
    li.appendChild(txt); //adds a node to the end of the list of children of a specified parent node
    if(input_value === ''){
        alert("No input task is entered by user");
    } else{
        document.getElementById("ullist").appendChild(li);
        total_count++;
        counter.innerHTML = total_count;
        pending_tag.innerHTML = total_count - done;
    }
    document.getElementById("inputtext").value = "";
}
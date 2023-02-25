const display1E1 = document.querySelector('.display-1');
const display2E1 = document.querySelector('.display-2');
const result = document.querySelector('.result');
const numE1 = document.querySelectorAll('.number');
const operationE1 = document.querySelectorAll('.operation');
const equalE1 = document.querySelector('.equal');
const clearAllE1 = document.querySelector('.all-clear');
const lastClearE1 = document.querySelector('.last-clear');

let dis1Num = '';
let dis2Num = '';
let Result = null;
let lastOperation = '';
let haveDot = false;

numE1.forEach(number => {
    number.addEventListener('click', (e)=> {
        if(e.target.innerText === '.' && !haveDot){
            haveDot = true;
        } else if(e.target.innerText === '.' && haveDot){
            return;
        }
        dis2Num += e.target.innerText;
        display2E1.innerText = dis2Num;
    })
});

operationE1.forEach(operation =>{
    operation.addEventListener('click', (e)=>{
        if(!dis2Num) result;
        haveDot = false;
        const operationName = e.target.innerText;
        if(dis1Num && dis2Num && lastOperation){
            mathOperation();
        } else{
            Result = parseFloat(dis2Num);
        }
        clearVal(operationName);
        lastOperation = operationName;
        console.log(Result);
    })
});
function clearVal(name = ' '){
    dis1Num += dis2Num  + ' ' + name + ' '; 
    display1E1.innerText = dis1Num;
    display2E1.innerText = ' ';
    dis2Num = ' ';
    result.innerText = Result;
}
function mathOperation(){
    if(lastOperation === 'x'){
        Result = parseFloat(Result) * parseFloat(dis2Num);
    }else if(lastOperation === '+'){
        Result = parseFloat(Result) + parseFloat(dis2Num);
    } else if(lastOperation === '-'){
        Result = parseFloat(Result) - parseFloat(dis2Num);
    } else if(lastOperation === '%'){
        Result = parseFloat(Result) % parseFloat(dis2Num);
    }
} 

equalE1.addEventListener('click', (e)=>{
    if(!dis2Num && !dis1Num) return;
    haveDot = false;
    mathOperation();
    clearVal();
    display2E1.innerText = Result;
    result.innerText = ' ';
    dis2Num = Result;
    dis1Num = ' ';
})
clearAllE1.addEventListener('click', (e)=>{
    display1E1.innerText = '0';
    display2E1.innerText = '0';
    dis1Num = ' ';
    dis2Num = ' ';
    Result = ' ';
    Result.innerText = '0';
})

lastClearE1.addEventListener('click', (e)=>{
    display2E1.innerText = ' ';
    dis2Num = ' ';
});

window.addEventListener('keydown', (e)=>{
    if(e.key === '0' ||
       e.key === '1' ||     
       e.key === '2' ||     
       e.key === '3' ||     
       e.key === '4' ||     
       e.key === '5' ||     
       e.key === '6' ||     
       e.key === '7' ||     
       e.key === '8' ||     
       e.key === '9' ||     
       e.key === '.'   
    ){
        clickButton(e.key)
    }else if(
        e.key === '+' ||
        e.key === '-' ||
        e.key === '%'
    ){
        clickOperand(e.key);
    }else if(e.key === '*'){
        clickOperand('x');
    } else if(e.key === 'Enter' || e.key === "="){
        clickEqual();
    }
});

function clickButton(key){
    numE1.forEach(button =>{
        if(button.innerText === key){
            // allows to click any elements of dom
           button.click();
        }
    })
}

function clickOperand(key){
    operationE1.forEach(button =>{
        if(button.innerText === key){
        button.click();
    }
  })
}

function clickEqual(key){
    equalE1.click();
}
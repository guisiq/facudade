var paciente = document.querySelectorAll('.pasiente');
console.log(paciente);
var tdPeso
var tdAltura
var tdIMC
var imc;

for (let i = 0; i < paciente.length; i++) {
    
    tdPeso = paciente[i].querySelector('.info-peso').textContent;
    console.log(tdPeso);  
    
    tdAltura = paciente[i].querySelector('.info-altura' ).textContent;
    console.log(tdAltura); 
    
    tdIMC = paciente[i].querySelectorAll('.info-imc' ).textContent;
    console.log(tdIMC); 

    imc = tdPeso / tdAltura ** 2;
    console.log(imc)
    
    paciente[i].querySelector(".info-imc").textContent = imc.toFixed(2);

}

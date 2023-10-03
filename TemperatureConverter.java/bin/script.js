document.getElementById('convert').addEventListener('click', function() {
    var celsius = parseFloat(document.getElementById('celsius').value);
    var fahrenheit = (celsius * 9 / 5) + 32;
    document.getElementById('fahrenheit').textContent = fahrenheit.toFixed(2);
});

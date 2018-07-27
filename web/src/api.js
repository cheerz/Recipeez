module.exports = {
    areas: () => fetch('/api/areas').then(response => response.json()),
    brand: content => fetch('/api/brands', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(content)    
    })
}
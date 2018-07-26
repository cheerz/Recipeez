module.exports = {
    areas: () => fetch('/api/areas').then(response => response.json()),
    brand: id => fetch(`/api/brands/${id}`).then(response => response.json())
}
module.exports = {
    assetsDir: "static",
    devServer: {
        proxy: 'http://localhost:8080'
    },
    pages: {
        index: {
            entry: "web/src/main.js",
            template: "web/public/index.html"
        },
        brand: {
            entry: "web/src/brand/brand.js",
            template: "web/public/brand.html"
        }
    }
}
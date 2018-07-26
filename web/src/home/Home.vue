<template>
    <brand-listing :brand-areas="brandAreas" />
</template>
<script>
import BrandListing from './BrandListing'
import api from '../api.js'

const convertAreas = (areas) => {
    return Object.keys(areas).map(area => {
        return {
            id: area,
            name: area.toLowerCase(),
            brands: areas[area].map(brand => {
                return {
                    id: brand.id
                }
            })
        }
    })
} 

export default {
    created() {
        api.areas().then(data => this.brandAreas = convertAreas(data))
    },
    data() {
        return {
            brandAreas: []
        }
    },
    components: { BrandListing }
}
</script>


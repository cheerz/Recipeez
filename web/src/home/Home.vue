<template>
    <div>
        <home-header />
        <brand-listing :brand-areas="brandAreas" />
    </div>
</template>
<script>
import BrandListing from './BrandListing'
import HomeHeader from './HomeHeader'
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
    components: { BrandListing, HomeHeader }
}
</script>


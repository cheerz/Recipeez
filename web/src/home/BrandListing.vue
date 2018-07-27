<template>
    <div class="brand-listing-container">
        <!-- <brand-filter-bar :filters="filters" @filter="applyFilter" /> -->
        <brand-area v-for="area in brandAreas"
            :key="area.id"
            :brands="area.brands"
            @show-details="showDetails"
            :name="area.name"
            class="brandArea"/>
    </div>
</template>
<script>
import BrandArea from './BrandArea'

const filters = {
    'industry': ['travel', 'food', 'services'],
    'budget': [{ key: 'less_than_1k', name: '< 1k' },
               { key: 'from_1k_to_10k', name: '< 10k' },
               { key: 'from_10k_to_100k', name: '< 100k' },
               { key: 'above_100k', name: '>= 100k' }]
}

export default {
    props: ['brandAreas'],
    methods: {
        showDetails(brandId) {
            this.$emit('show-details', brandId)
        },
        applyFilter(filter) {
            this.filterMethod = brand => filter.budget && (brand.budget == filter.budget)
        }
    },
    components: { BrandArea }
}
</script>
<style scoped>
.brandArea {
    margin-top: 150px;
}
.brand-listing-container {
    display: flex;
    flex-direction: column;
    background-color: #f7f7fb;
    padding-left: 4%;
    padding-right: 4%;
    padding-bottom: 40px;
}
</style>


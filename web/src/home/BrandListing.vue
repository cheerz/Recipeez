<template>
    <div class="brand-listing-container">
        <!-- <brand-filter-bar :filters="filters" @filtered="applyFilter" /> -->
        <brand-area v-for="area in brandAreas"
            :key="area.id"
            :brands="area.brands"
            :name="area.name"/>
    </div>
</template>
<script>
import BrandFilterBar from './BrandFilterBar'
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
    data() {
        return {
            filters: filters,
            filterMethod: b => b
        }
    },
    computed: {
        filteredBrandAreas() {
            return this.brandAreas.reduce((acc, area) => {
                const newArea = {

                }
                acc.push(newArea)
                return acc
            }, [])
        }
    },
    methods: {
        applyFilter(filter) {
            const filterType = filter.type
        }
    },
    components: { BrandArea, BrandFilterBar }
}
</script>
<style scoped>
.brand-listing-container {
    display: flex;
    flex-direction: column;
    background-color: #f7f7fb;
    padding-left: 4%;
    padding-right: 4%;
}
</style>


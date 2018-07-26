<template>
    <div class="brand-listing-container">
        <brand-area v-for="area in brandAreas"
            :key="area.id"
            :brands="area.brands"
            :name="area.name"/>
    </div>
</template>
<script>
import BrandArea from './BrandArea'
export default {
    props: ['brandAreas'],
    components: { BrandArea }
}
</script>
<style scoped>
.brand-listing-container {
    display: flex;
    flex-direction: column;
}
</style>


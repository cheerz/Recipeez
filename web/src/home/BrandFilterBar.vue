<template>
    <div class="brand-filter-bar-container">
        <brand-filter :options="filters['industry']" />
    </div>
</template>

<script>
import BrandFilter from './BrandFilter'
export default {
    props: ['filters'],
    components: { BrandFilter }
}
</script>
<style scoped>
.brand-filter-bar-container {
    display: flex;
    flex-direction: row;
}
</style>



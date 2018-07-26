<template>
    <div>
        {{ name }}
        <div class="brand-snippets">
            <div v-for="brand in brands" :key="brand.id">
                <brand-snippet :brand-id="brand.id" />
            </div> 
        </div>
    </div>
</template>
<script>
import BrandSnippet from './BrandSnippet'
export default {
    props: ['brands', 'name'],
    components: { BrandSnippet }
}
</script>
<style scoped>
.brand-snippets {
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
}
</style>

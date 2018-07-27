<template>
    <div>
        <div class="brandAreaName"> {{ name }}</div>
        <div class="brand-snippets">
            <div v-for="brand in brands" :key="brand.id">
                <brand-snippet  @show-details="showDetails"
                :brand-id="brand.id"
                :brand-name="brand.name"
                :industry="brand.industry"
                :interests="brand.interests"
                :description="brand.description"
                :budget="brand.budget"
                :image="brand.image"
                class="brandSnippet" />
            </div> 
        </div>
        <span class="brand-show-text brand-show-all">
            SHOW ALL
        </span>
    </div>
</template>
<script>
import BrandSnippet from './BrandSnippet'
export default {
    props: ['brands', 'name'],
    methods: {
        showDetails(brandId) {
            this.$emit('show-details', brandId)
        }
    },
    components: { BrandSnippet }
}
</script>
<style scoped>
.brand-snippets {
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
}

.brandSnippet {
    margin-bottom: 25px;
    margin-right: 50px;
}

.brand-show-all {
    margin-top: 40px;
    border-radius: 24px;
    background-color: #ffffff;
    box-shadow: 0 7px 32px 0 rgba(0, 0, 0, 0.07);
    padding-left: 24px;
    padding-right: 24px;
    padding-bottom: 8px;
    padding-top: 8px
}

.brand-show-text {
    font-family: Rubik;
    font-size: 12px;
    font-weight: 500;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #545dfc;
    cursor: pointer;
}

.brandAreaName {
    width: 80px;
    height: 48px;
    font-family: Rubik;
    font-size: 32px;
    font-weight: bold;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.5;
    letter-spacing: normal;
    color: #0e1554;
    text-transform: capitalize;
}
</style>

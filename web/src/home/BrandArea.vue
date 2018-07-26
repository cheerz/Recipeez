<template>
    <div>
         <div class="brandAreaName"> {{ name }}</div>
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

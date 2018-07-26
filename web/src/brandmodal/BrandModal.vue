<template>
    <div class="container">
        <modal-header :name="brand.name" :website="brand.website"
            :categories="brand.categories"
            :industry="brand.industry" />
        <modal-linkedin :description="brand.description" :recipe="brand.recipe" />
        <modal-details :interests="brand.interests" :budget="brand.budget" />
    </div>
</template>
<script>
import ModalHeader from './BrandModalHeader'
import ModalLinkedin from './BrandModalLinkedin'
import ModalDetails from './BrandModalDetails'
export default {
    props: ['brand'],
    components: { ModalHeader, ModalLinkedin, ModalDetails }
}
</script>
<style scoped>
.container { 
    border-radius: 8px;
    background-color: #ffffff;
    /* box-shadow: 0 2px 66px 0 rgba(0, 0, 0, 0.11); */
    padding: 20px;
}
</style>

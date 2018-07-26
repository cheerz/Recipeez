<template>
    <div class="brand-container">
        <brand-header class="brand-header" :name="name"/>
        <brand-content class="brand-content"/>
        <brand-contact :link="link" />
    </div>
</template>
<script>
import BrandHeader from './BrandHeader'
import BrandContent from './BrandContent'
import BrandContact from './BrandContact'
import api from '../api.js'

// Dirty hack to get brand Id -> should be given by the server
const brandId = parseInt(window.location.href
    .substr(window.location.href.lastIndexOf('/') + 1).replace(".html", ""))
    || 1

export default {
    created() {
        api.brand(brandId).then(response => {
            this.link = response.link
            this.name = response.name
        })
    },
    data() {
        return {
            link: undefined,
            name: undefined
        }
    },
    components: { BrandHeader, BrandContent, BrandContact}
}
</script>

<style scoped>
.brand-container {
    display: flex;
    flex-direction: column;
    position: absolute;
    left: 0;
    top: O;
    width: 100%;
    height: 100%;
}

.brand-content {
    flex-grow: 1;
}

</style>


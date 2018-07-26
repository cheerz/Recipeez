<template>
    <div class="brand-snippet-container" @click="redirectTo">
        Brand {{ brandId }}
    </div>
</template>
<script>
export default {
    props: ['brandId'],
    methods: {
        redirectTo() {
            window.location = `/brands/${this.brandId}`
        }
    }
}
</script>

<style scoped>
.brand-snippet-container {
    width: 200px;
    height: 50px;
    cursor: pointer;
}
</style>


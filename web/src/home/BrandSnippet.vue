<template>
    <div class="brand-snippet-container" @click="redirectTo">
        <img :src="imageSrc" class="brandCard" />
    </div>
</template>
<script>
export default {
    props: ['brandId'],
    computed: {
        imageSrc() {
            const id = this.brandId % 3 +1
            return require(`../assets/area1_brandCard_${id}.png`)
        }
    },
    methods: {
        redirectTo() {
            window.location = `/brands/${this.brandId}`
        }
    }
}
</script>

<style scoped>
.brand-snippet-container {
    cursor: pointer;
}

.brandCard {
  width: 384px;
  height: 357px;
  object-fit: contain;
}
</style>


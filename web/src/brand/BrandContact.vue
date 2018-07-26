<template>
    <div class="contact" @click="openPage">

    </div>
</template>

<script>
export default {
    props: ['link'],
    methods: {
        openPage() {
            window.open(this.link)
        }
    }
}
</script>

<style scoped>
.contact {
    background-color: yellow;
    cursor: pointer;
    height: 15vh;
}
</style>


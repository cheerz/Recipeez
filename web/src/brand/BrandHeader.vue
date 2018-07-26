<template>
    <div class="brand-header-container">
        <div class="brand-name">
            {{ name }}
        </div>
    </div>
</template>
<script>
export default {
    props: ["name"]
}
</script>

<style scoped>
.brand-header-container {
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: blue;
    height: 20vh;
}

.brand-name {
    font-size: 40px;
}

</style>


<template>
    <div class="container">
        <img :src="image" class="img" />
        <div class="caption-1">
            <div class="name">{{ name }}</div>
            <a class="website" :href="website" target="_blank">{{ website }}</a>
        </div>
        <div class="caption-2">
            <div class="industry">{{ industry }}</div>
            <div class="categories">
                <span class="category" v-for="category in categories" :key="category">
                    {{ category }}
                </span>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    props: ['name', 'industry', 'website', 'categories', 'image']
}
</script>


<style scoped>
.container {
    display: flex;
    flex-direction: row;
    align-items: center;
}

.category {
    font-family: Rubik;
    font-size: 12px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #8c9ba5;
}

.website {
    font-family: Rubik;
    font-size: 14px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: normal;
    letter-spacing: normal;
    color: #596772;
}

.name {
    font-family: Rubik;
    font-size: 24px;
    font-weight: 500;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #0e1554;
}

.caption-1 {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    margin-left: 30px;
}

.caption-2 {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    margin-left: 30px;
}

.industry {
    font-family: Rubik;
    font-size: 24px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #0e1554;
}

.img {
    width: 90px;
    height: 90px;
}
</style>

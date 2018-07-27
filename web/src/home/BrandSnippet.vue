<template>
    <div class="brand-snippet-container" @click="showDetails">
        <div class="header">
        </div>
        <div class="image">
            <img  class="img" src="../assets/company-logo3.jpg" />
        </div>
        <div class="content">
            <div class="name-container">
                <div class="name">
                    {{ brandName }}
                </div>
                <img class="star" src="../assets/icon-yellow-star.svg">
            </div>
            <div class="industry">
                {{ industry }}
            </div>
            <div class="interests">
                <img src="../assets/icons-feather-eye.svg" class="icon"/>
                <span v-for="interest in interests" :key="interest" class="interest">
                    {{ interest }}
                </span>
            </div>
            <div class="budget">
                <img src="../assets/icons-feather-mail.svg" class="icon"/>
                <span class="budget-value">
                    {{ budget }}
                </span>
            </div>
            <div class="description">
                {{ description }}
            </div>
        </div>
        <!-- <img :src="imageSrc" class="brandCard" /> -->
    </div>
</template>
<script>
export default {
    props: ['brandId', 'brandName', 'industry', 'interests', 'description', 'budget'],
    computed: {
        imageSrc() {
            const id = this.brandId % 3 +1
            return require(`../assets/area1_brandCard_${id}.png`)
        }
    },
    methods: {
        showDetails() {
            this.$emit('show-details', this.brandId)
        }
    }
}
</script>

<style scoped>
.header {
    height: 88px;
    background: url('../assets/header-food-a.jpg');
}

.image {
    width: 90px;
    height: 90px;
    background-color: #0e1554;
    margin-left: 35px;
    transform: translateY(-50px);
}

.img {
    width: 100%;
}

.star {
    width: 12px;
    height: 12px;
}

.icon {
    width: 24px;
    height: 24px;
}

.budget {
    margin-top: 20px;
    display: flex;
    flex-direction: row;
    align-items: center;
}

.budget-value {
    font-family: Rubik;
    font-size: 14px;
    margin-left: 12px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.43;
    letter-spacing: normal;
    color: #0e1554;
}

.name-container {
    display: flex;
    flex-direction: row;
    align-items: center;
}

.name {
    font-family: Rubik;
    font-size: 20px;
    font-weight: 500;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.4;
    letter-spacing: normal;
    color: #0e1554;
    margin-right: 10px;
}

.interest {
    padding: 8px;
    border-radius: 18px;
    background-color: #f7f7fb;
    font-family: Rubik;
    font-size: 14px;
    margin-left: 12px;  
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.43;
    letter-spacing: normal;
    color: #0e1554;
}

.interests {
    display: flex;
    flex-direction: row;
    align-items: center;
    margin-top: 20px;
}

.industry {
    font-family: Rubik;
    font-size: 12px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #0e1554;
}

.content {
    display: flex;
    flex-direction: column;
    padding: 35px;
    margin-top: -70px;
    align-items: flex-start;
}

.brand-snippet-container {
    width: 360px;
    height: 320px;
    cursor: pointer;
    padding-bottom: 10px;
    border-radius: 8px;
    background-color: #ffffff;
    box-shadow: 0 8px 16px 0 rgba(14, 21, 84, 0.1);
}

.brandCard {
  width: 384px;
  height: 357px;
  object-fit: contain;
}

.description {
    margin-top: 10px;
    text-overflow: ellipsis;
}
</style>


<template>
    <div class="wrapper">
        <div class="container">
            <img class="img" src="../assets/company-owner-pic.jpg" />
            <div class="details">
                <span class="caption">Represented by</span>
                <span class="name">Arnaud Legaignoux</span>
            </div>
        </div>
        <div class="texts">
            <div class="description">
                {{ description }}
            </div>
            <div class="recipe-container">
                <div class="crazy"> CRAZY recipee 🌶️</div>
                <div class="recipe">
                    {{ recipe }}
                </div>
            </div>
        </div>
        <img src="../assets/group-93.png" class="premium">
        <div class="partnerships">
            <div v-for="partnership in partnerships" :key="partnership" class="partnership">
                <span class="p-name">x MyLittleParis</span>
                <span class="p-date">07/2018</span>
            </div>
        </div>
    </div>
</template>
<script>
const partnerships =[0, 1, 2]
export default {
    props: ['description', 'recipe'],
    data() {
        return {
            partnerships: partnerships
        }
    }
}
</script>


<style scoped>
.wrapper {
    display: flex;
    flex-direction: column;
    padding: 28px;
}
.container {
    display: flex;
    flex-direction: row;
}

.premium {
    margin-top: 40px;
    width: 180px;
    height: 28px;
}
.p-name {
    font-family: Rubik;
    font-size: 12px;
    font-weight: 500;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.67;
    letter-spacing: normal;
    color: #0e1554;
}
.p-date {
    font-family: Rubik;
    font-size: 12px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #8c9ba5;
}

.texts {
    display: flex;
    flex-direction: row;
    margin-top: 30px;
    justify-content: flex-start;
}

.description {
    flex: 1;
    text-align: start;
}

.recipe-container {
    flex: 1;
    text-align: start;
}

.crazy {
    font-family: Rubik;
    font-size: 12px;
    font-weight: 500;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.67;
    letter-spacing: normal;
    color: #ed6347;
}

.partnerships {
    margin-top: 15px;
    display: flex;
    flex-direction: row;
}

.partnership {
    display: flex;
    flex-direction: column;
    margin-right: 40px;
    align-items: flex-start;
}

.details {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    margin-left: 20px;
}

.name {
    font-family: Rubik;
    font-size: 14px;
    font-weight: bold;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.43;
    letter-spacing: normal;
    color: #545dfc;
}

.caption {
    font-size: 14px;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.43;
    letter-spacing: normal;
    font-weight: normal;
    color: #596772;
}

.img {
    width: 40px;
    height: 40px;
}
</style>


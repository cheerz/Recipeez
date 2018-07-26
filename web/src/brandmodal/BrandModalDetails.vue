<template>
    <div class="container">
        <div class="item">
            <img src="../assets/icons-feather-target.svg" class="item-img">
            <div class="item-divider"></div>
            <div class="item-name">GOALS</div>
            <div class="item-content">
                <span v-for="interet in interests" :key="interet" class="inte">{{ interet }}</span>
            </div>
        </div>
        <div class="item">
            <img src="../assets/icons-feather-user-check.svg" class="item-img">
            <div class="item-divider"></div>
            <div class="item-name">TARGET</div>
            <div class="item-content-3">
                <span class="sex">Women</span>
                <span class="sex disabled">Men</span>
            </div>
        </div>
        <div class="item">
            <img src="../assets/icons-feather-mail.svg" class="item-img">
            <div class="item-divider"></div>
            <div class="item-name">BUDGET AVAILABLE</div>
            <div class="item-content-3">
                <span class="budget">{{ budget }}+</span>
                <span class="free" v-show="freeProducts">Free Products</span>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    props: ['interests', 'budget'],
    data() {
        return {
            freeProducts: true
        }
    }
}
</script>
<style scoped>
.container {
    display: flex;
    flex-direction: row;
    justify-content: space-between
}

.item-name {
    margin-top: 8px;
    font-family: Rubik;
    font-size: 12px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #0e1554;
    text-align: start;
}

.sex {
    font-family: Rubik;
    font-size: 24px;
    font-weight: 500;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #0e1554;
}

.disabled {
    opacity: 0.12;
}

.item-content {
    margin-top: 15px;
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    justify-content: space-between;
}

.item-content-3 {
    margin-top: 15px;
    display: flex;
    flex-direction: column;
    text-align: start;
    font-family: Rubik;
    font-size: 24px;
    font-weight: 500;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #0e1554;
}

.inte {
    font-family: Rubik;
    font-size: 14px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.43;
    letter-spacing: normal;
    color: #152934;
    border-radius: 18px;
    background-color: #f7f7fb;
    padding: 10px;
}

.item {
    display: flex;
    flex-direction: column;
    width: 180px;
    margin-left: 20px;
    margin-right: 20px;
}

.item-divider {
    width: 100%;
    height: 1px;
    margin-top: 10px;
    opacity: 0.12;
    border-radius: 1px;
    background-color: #0e1554;
}

.item-img {
    width: 24px;
    height: 24px;
}

</style>



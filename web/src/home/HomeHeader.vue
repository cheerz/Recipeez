<template>
    <div class="container">
        <div class="register-container" @click="register">
            <span class="register">Register</span></div>
        <div class="home-header-container">
            <img class="img" src="../assets/recipeez.jpg"/>
            <div class="title">RECIPEEZ</div>
            <div class="caption">Make your partnerships tastier</div>
        </div>
        <img class="filters" src="../assets/filter-box3.png"/>
    </div>
</template>
<script>
export default {
    methods: {
        register() {
            window.location.href="/brands"
        }
    }
}
</script>

<style scoped>
.container {
    display: flex;
    flex-direction: column;
}

.filters {
    margin-top: 64px;
    width: 588px;
    height: 208px;
    align-self: center;
    z-index: 100;
}

.img {
    width: 104px;
    height: 104px;
    margin-bottom: 19px;
}

.register-container {
    align-self: flex-end;
    margin: 32px;
    margin-bottom: 0px;
}
.home-header-container {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    height: 300px;
}

.caption {
    font-family: Rubik;
    font-size: 32px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.13;
    letter-spacing: normal;
    text-align: center;
    color: #6974a5;
    margin-top: 24px;
}

.title {
    font-family: Rubik;
    font-size: 64px;
    font-weight: 900;
    font-style: normal;
    font-stretch: normal;
    line-height: 0.88;
    letter-spacing: normal;
    text-align: center;
    color: #0e1554;
}
.register {
    border-radius: 8px;
    background-color: #545dfc;
    padding-right: 24px;
    padding-left: 24px;
    padding-top: 12px;
    padding-bottom: 12px;
    font-family: Rubik;
    font-size: 18px;
    font-weight: medium;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    margin-top: 20px;
    color: #ffffff;
    align-self: flex-end;
    cursor: pointer;
}

</style>


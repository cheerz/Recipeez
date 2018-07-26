<template>
    <div class="brand-container">
        <span class="title">RECIPEEZ</span>
        <div class="content">
            <div class="fields">
                <span class="content-title">{{title}}</span>
                <div class="content-form">
                    <transition name="fade">
                        <brand-content1 v-if="currentStep == 0" @valid="validBtn" @field="update" />
                        <brand-content2 v-else-if="currentStep == 1" @valid="validBtn" @field="update" />
                        <brand-content3 v-else-if="currentStep == 2" @valid="validBtn" @field="update" />
                        <brand-content4 v-else-if="currentStep == 3" @valid="validBtn" @field="update" />
                        <brand-content5 v-else-if="currentStep == 4" @valid="validBtn" @field="update" />
                        <brand-content6 v-else-if="currentStep == 5" @valid="validBtn" @field="update" />
                        <brand-content7 v-else-if="currentStep == 6" @valid="validBtn" @field="update" />
                    </transition>
                </div>
                <div class="content-footer">
                    <div class="img">
                        <img class="imgburger" :src="burger"/>
                    </div>
                    <div class="btn" :style="{opacity: opacity }" @click="goToNext">
                        <span>NEXT</span>
                        <img src="../assets/icons-feather-arrow-right.svg" class="img-next"/>
                    </div>
                </div>
            </div>
            <div class="images" >
                <img style="width: 100%;" :src="image"/>
            </div>
        </div>
    </div>
</template>
<script>
import api from '../api.js'
import BrandContent1 from './BrandContent1'
import BrandContent2 from './BrandContent2'
import BrandContent3 from './BrandContent3'
import BrandContent4 from './BrandContent4'
import BrandContent5 from './BrandContent5'
import BrandContent6 from './BrandContent6'
import BrandContent7 from './BrandContent7'
import allsteps from './steps'

const steps = allsteps.steps

export default {
    data() {
        return {
            currentStep: 0,
            valid: false,
            info: {
                name: undefined,
                website: undefined,
                linkedin: undefined,
                gender: undefined,
                agerange: undefined,
                industry: undefined,
                purpose: [],
                budget: undefined,
                description: undefined,
                recipe: undefined
            }
        }
    },
    computed: {
        step() {
            return steps[this.currentStep]
        },
        title() {
            return this.step.title
        },
        image() {
            return this.step.image;
        },
        burger() {
            return this.step.burger;
        },
        opacity() {
            return this.valid ? 1 : 0.5
        }
    },
    methods: {
        goToNext() {
            if (this.valid) {
                if (this.currentStep == steps.length - 1) {

                } else {
                    this.currentStep = this.currentStep + 1
                }
            }
        },
        update(field) {
            const key = Object.keys(field)[0]
            this.info[key] = field[key]
        },
        validBtn(valid) {
            this.valid = valid
        }
    },
    components: { BrandContent1, BrandContent2, BrandContent3,
    BrandContent4, BrandContent5, BrandContent6, BrandContent7 }
}
</script>

<style scoped>
.brand-container {
    padding: 40px;
    text-align: start;
}

.content {
    display: flex;
    flex-direction: row;
}

.content-form {
    margin-top: 20px;
}

.img {
    position: relative;
    width: 71px;
    height: 78px;
}
.imgburger {
    width: 100%;
    position: absolute;
    left: 0;
    bottom: 0;
}

.content-title {
    font-family: Rubik;
    font-size: 40px;
    font-weight: bold;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.2;
    letter-spacing: normal;
    color: #0e1554;
}

.img-next {
    width: 24px;
    height: 24px;
}

.btn {
    display: flex;
    flex-direction: row;
    border-radius: 8px;
    background-color: #545dfc;
    padding-right: 15px;
    padding-left: 15px;
    padding-top: 8px;
    padding-bottom: 8px;
    font-family: Nunito;
    font-size: 18px;
    font-weight: bold;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #ffffff;
    align-self: flex-end;
    cursor: pointer;
}

.content-footer {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    margin-top: 18px;
}

.fields {
    flex: 1;
    padding: 20px;
    margin-right: 50px;
}

.images {
    flex: 1;
}

.title {
    font-family: Rubik;
    font-size: 24px;
    font-weight: 900;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    text-align: center;
    color: #0e1554;
}

.content {
    margin-top: 40px;
}

.fade-enter-active, .fade-leave-active {
  transition: opacity .5s;
}
.fade-enter, .fade-leave-to {
  opacity: 0;
}

</style>


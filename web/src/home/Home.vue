<template>
    <div class="home-container">
        <!-- <transition name="fade">
            <div v-show="showModal" class="details-modal" @click="hideModal">
            </div>
        </transition> -->
        <div>
            <home-header />
            <brand-listing :brand-areas="brandAreas" @show-details="showDetails" />
        </div>
    </div>
</template>
<script>
import BrandListing from './BrandListing'
import HomeHeader from './HomeHeader'
import api from '../api.js'

const convertAreas = (areas) => {
    return Object.keys(areas).map(area => {
        return {
            id: area,
            name: area.toLowerCase(),
            brands: areas[area].map(brand => {
                return {
                    id: brand.id,
                    name: brand.name,
                    industry: brand.industries[0],
                    interests: brand.interests,
                    description: brand.description,
                    budget: brand.maxBudget
                }
            })
        }
    })
} 

export default {
    created() {
        api.areas().then(data => this.brandAreas = convertAreas(data))
    },
    data() {
        return {
            brandAreas: [],
            showModal: undefined
        }
    },
    methods: {
        showDetails() {
            this.showModal = true
        },
        hideModal() {
            this.showModal = false
        }
    },
    components: { BrandListing, HomeHeader }
}
</script>
<style>
.home-container {
    position: absolute;
    top: 0;
    left: 0;
    bottom: 0;
    right: 0;
    width: 100%;
    height: 100%;
    overflow: auto;
}
.details-modal {
    position: absolute;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    width: 100%;
    height: 100%;
    background-color: blueviolet;
    overflow:auto;
    opacity: 0.5;
}

.fade-enter-active, .fade-leave-active {
  transition: opacity .5s;
}
.fade-enter, .fade-leave-to {
  opacity: 0;
}
</style>


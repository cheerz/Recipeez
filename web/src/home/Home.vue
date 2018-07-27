<template>
    <div class="home-container">
        <transition name="fade">
            <div v-if="showModal && currentBrand" class="details-modal" @click="hideModal">
                <brand-modal :brand="currentBrand" style="background-color: white;"/>
            </div>
        </transition>
        <div>
            <home-header style="z-index: 5" @filter="applyFilter" />
            <brand-listing :brand-areas="filteredBrandAreas" @show-details="showDetails" class="listing" />
        </div>
    </div>
</template>
<script>
import BrandListing from './BrandListing'
import HomeHeader from './HomeHeader'
import BrandModal from '../brandmodal/BrandModal'
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
                    budget: brand.maxBudget,
                    website: brand.website,
                    categories: brand.targets,
                    recipe: brand.recipe,
                    link: brand.link,
                    tags: brand.tags,
                    image: brand.imagePath || require('../assets/company-logo3.jpg')
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
            showModal: true,
            currentBrand: undefined,
            filterMethod: undefined
        }
    },
    computed: {
        filteredBrandAreas() {
            if (!this.filterMethod) {
                return this.brandAreas
            }
            return this.brandAreas.reduce((acc, area) => {
                const newArea = {
                    ...area,
                    brands: area.brands.filter(this.filterMethod)
                }
                if (newArea.brands.length > 0) {
                    acc.push(newArea)
                }
                return acc
            }, [])
        }
    },
    methods: {
        showDetails(brandId) {
            this.showModal = true
            this.currentBrand = Object.values(this.brandAreas).reduce((acc,el) => {
                if (acc) {
                    return acc
                } else {
                    return el.brands.find(brand => brand.id == brandId)
                }
            }, undefined)

        },
        hideModal() {
            this.showModal = false
        },
        applyFilter(filter) {
            this.filterMethod = brand => filter.budget && (brand.budget == filter.budget)
        },
        
    },
    components: { BrandListing, HomeHeader, BrandModal }
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

.listing {
    padding-top: 127;
    transform: translateY(-127px);
    z-index: 0;
}

.details-modal {
    position: fixed;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    width: 100%;
    height: 100%;
    z-index: 200;
    overflow: auto;
    background-color: rgba(14, 21, 84, 0.57);
    display: flex;
    justify-content: center;
    align-items: center;
}

.fade-enter-active, .fade-leave-active {
  transition: opacity .5s;
}
.fade-enter, .fade-leave-to {
  opacity: 0;
}
</style>


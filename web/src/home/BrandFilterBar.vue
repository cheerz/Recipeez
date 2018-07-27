<template>
    <div class="brand-filter-bar-container">
        <div class="header">
            <span class="text">I'm looking for...</span>
        </div>
        <div class="filters-container">
            <img class="img" src="../assets/components-forms-dropdown-target.png" />
            <img class="img" src="../assets/components-forms-dropdown-industry.png" />
            <div class="budget img">
                <div class="text text-budget">Budget</div>
                <budget class="inpput" @budget="updateFilterBudget"/>
            </div>
        </div>
        <span class="search">Search</span>
    </div>
</template>

<script>
import Budget from '../brand/Budget'
export default {
    data() {
        return {
            budget: undefined
        }
    },
    methods: {
        updateFilterBudget(budget) {
            this.$emit('filter', { budget })
        }
    },
    components: { Budget }
}
</script>
<style scoped>
.brand-filter-bar-container {
    display: flex;
    flex-direction: column;
    padding: 48px;
    background-color: #ffffff;
    box-shadow: 0 7px 23px 0 rgba(0, 0, 0, 0.09);
}

.img {
    width: 156px;
    height: 48px;
}

.filters-container {
    display: flex;
    flex-direction: row;
    align-items: center;
    justify-content: space-around;
    flex: 1;
}

.text-budget {
    font-weight: 400;
    align-self: center;
}

.inpput {
    align-self: center;
    margin-left: 15px;
}

.text {
    font-family: Rubik;
    font-size: 20px;
    font-weight: 500;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.2;
    letter-spacing: normal;
    color: #0e1554;
}

.search {
    border-radius: 8px;
    background-color: #545dfc;
    padding-right: 48px;
    padding-left: 48px;
    padding-top: 12px;
    padding-bottom: 12px;
    font-family: Rubik;
    font-size: 18px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.33;
    letter-spacing: normal;
    color: #ffffff;
    cursor: pointer;
    justify-self: center;
    align-self: center;
}

.header {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-content: center;
}

.budget {
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-content: center;
}

</style>



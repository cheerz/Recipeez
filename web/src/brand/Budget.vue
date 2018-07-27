<template>
    <select class="iinput" v-model="budget">
            <option value="" disabled hidden>Budget</option>
            <option>&lt;1k€</option>
            <option>&lt;10k€</option>
            <option>&lt;100k€</option>
            <option>&gt;100k€</option>
        </select>
</template>
<script>
export default {
    data() {
        return {
            budget: undefined,
        }
    },
    watch: {
        budget(budget) {
            this.$emit('budget', budget)
        }
    }
}
</script>


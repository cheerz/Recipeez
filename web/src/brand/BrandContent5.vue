<template>
    <div>
        <select class="iinput" v-model="budget">
            <option value="" disabled hidden>Budget</option>
            <option>&lt;1k€</option>
            <option>&lt;10k€</option>
            <option>&lt;100k€</option>
            <option>&gt;100k€</option>
        </select>
    </div>
    
</template>
<script>
export default {
    data() {
        return {
            budget: undefined,
        }
    },
    watch: {
        isValid(valid) {
            this.$emit('valid', valid)
        },
        budget(budget) {
            this.$emit('field', {budget})
        },
        tags(tags) {
            this.$emit('field', {tags})
        }
    },
    computed: {
        isValid() {
            return this.budget
        }
    }
}
</script>

<style scoped>
.iinput {
    margin-top: 25px;
    width: 100%;
    height: 40px;
    border-radius: 4px;
    box-shadow: inset 0 2px 4px 0 rgba(140, 155, 165, 0.12);
    background-color: #ffffff;
    border: solid 1px rgba(140, 155, 165, 0.54);
    font-family: Rubik;
    padding-left: 15px;
    font-size: 14px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.14;
    letter-spacing: normal;
    color: #152934;
}

textarea {
    overflow: auto;
    outline: none;
}

</style>


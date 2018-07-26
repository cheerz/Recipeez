<template>
    <div>
        <select class="iinput" v-model="gender">
            <option value="" disabled hidden>Gender</option>
            <option>Women</option>
            <option>Men</option>
            <option>Both</option>
        </select>
        <select class="iinput" v-model="agerange">
            <option value="" disabled hidden>Age Range</option>
            <option>10+</option>
            <option>25+</option>
            <option>35+</option>
            <option>50+</option>
        </select>
    </div>
    
</template>
<script>
export default {
    data() {
        return {
            gender: undefined,
            agerange: undefined,
        }
    },
    watch: {
        isValid(valid) {
            this.$emit('valid', valid)
        },
        gender(gender) {
            this.$emit('field', {gender})
        },
        agerange(agerange) {
            this.$emit('field', {agerange})
        }
    },
    computed: {
        isValid() {
            return this.gender && this.agerange
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
    font-family: NunitoSans;
    padding-left: 15px;
    font-size: 14px;
    font-weight: normal;
    font-style: normal;
    font-stretch: normal;
    line-height: 1.14;
    letter-spacing: normal;
    color: #152934;
}

</style>


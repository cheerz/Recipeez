<template>
    <div>
        <select class="iinput" v-model="industry">
            <option value="" disabled hidden>Industry</option>
            <option>Food</option>
            <option>Travel</option>
            <option>Service</option>
            <option>Bank</option>
            <option>Entertainment</option>
        </select>
        <textarea class="iinput" v-model="tags" placeholder="#TAGS to describe your business"/>
    </div>
    
</template>
<script>
export default {
    data() {
        return {
            industry: undefined,
            tags: undefined
        }
    },
    watch: {
        isValid(valid) {
            this.$emit('valid', valid)
        },
        industry(industry) {
            this.$emit('field', {industry})
        },
        tags(tags) {
            this.$emit('field', {tags})
        }
    },
    computed: {
        isValid() {
            return this.industry
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


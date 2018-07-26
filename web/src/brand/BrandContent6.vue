<template>
    <div>
        <textarea class="iinput" v-model="description" placeholder="A small text to describe your brand and the type of partnerships you want to make"/>
    </div>
    
</template>
<script>
export default {
    data() {
        return {
            description: undefined,
        }
    },
    watch: {
        isValid(valid) {
            this.$emit('valid', valid)
        },
        description(description) {
            this.$emit('field', {description})
        },
    },
    computed: {
        isValid() {
            return this.description
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

textarea {
    overflow: auto;
    outline: none;
}

</style>


<template>
    <div>
        <input class="iinput" placeholder="Name" v-model="name" />
        <input class="iinput" placeholder="Website Link" v-model="website" />
        <input class="iinput" placeholder="LinkedIn Profile Link" v-model="linkedin" />
        <input class="iinput" placeholder="Photo" />
        <!-- <input class="iinput" placeholder="Name" v-model="name" /> -->
    </div>
    
</template>
<script>
export default {
    data() {
        return {
            name: undefined,
            website: undefined,
            linkedin: undefined,
        }
    },
    watch: {
        isValid(valid) {
            this.$emit('valid', valid)
        },
        name(name) {
            this.$emit('field', {name})
        },
        website(website) {
            this.$emit('field', {website})
        },
        linkedin(linkedin) {
            this.$emit('field', {linkedin})
        }
    },
    computed: {
        isValid() {
            return this.name && this.website && this.linkedin
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

</style>


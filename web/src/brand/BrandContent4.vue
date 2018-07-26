<template>
    <div class="container">
        <div class="row">
            <input type="checkbox" id="Visibility" value="Visibility" v-model="visibility">
            <label for="Visibility">Visibility</label>
        </div>
        <div class="row">
            <input type="checkbox" id="Acquisition" value="Acquisition" v-model="acquisition">
            <label for="Acquisition">Acquisition</label>
        </div>
        <div class="row">
            <input type="checkbox" id="Loyalty" value="Loyalty" v-model="loyalty">
            <label for="Loyalty">Loyalty</label>
        </div>
    </div>
    
</template>
<script>
export default {
    data() {
        return {
            visibility: false,
            acquisition: false,
            loyalty: false,
        }
    },
    created() {
        this.$emit('valid', true)
    },
    watch: {
        visibility(visibility) {
            this.update()
        },
        acquisition(acquisition) {
            this.update()
        },
        loyalty(loyalty) {
            this.update()
        }
    },
    methods: {
        update() {
            const purpose = []
            if(this.visibility) purpose.push('visibility')
            if(this.acquisition) purpose.push('acquisition')
            if(this.loyalty) purpose.push('loyalty')
            this.$emit('field', {purpose})
        }
    }
}
</script>

<style scoped>
.container {
    display: flex;
    flex-direction: column;
}

.row {
    display: flex;
    flex-direction: row;
    margin-top: 24px;
}

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


<template>
    <div>
        <select v-model="selected">
            <option v-for="option in options" :key="option.name">
                {{ option.name }}
            </option>
        </select>
    </div>
</template>
<script>
export default {
    props: ['options'],
    data() {
        return {
            selected: undefined
        }
    }
}
</script>


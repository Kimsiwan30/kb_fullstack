<script setup>
import ColorEmit from './components/ColorEmit.vue';
</script>

<template>
  <div :style="{ backgroundColor: color }">
    <h1>저의 색상을 정해주세요!!</h1>
    <ColorEmit @colorEmit="ColorChangedHandlerer" />
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      color: '',
    };
  },
  methods: {
    ColorChangedHandlerer(e) {
      console.log(e.color);
      this.color = e.color;
    },
  },
};
</script>

<style scoped></style>

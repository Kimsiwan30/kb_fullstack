<template>
  <div>
    <h1>오늘의 기분은!? {{ msg }}</h1>
    <img :src="imgSrc" :alt="msg" />
  </div>
</template>

<script setup>
import { ref, computed, watch } from 'vue';
import { useRoute } from 'vue-router';


const currentRoute = useRoute();
const mood = ref(currentRoute.params.mood);

watch(
    () => currentRoute.params.mood,
    (newmood)

);

const msg = computed(() =>
  mood.value === 'happy' ? '행복합니다' : '씐납니다!'
);

const imgSrc = computed(() => mood.value === 'happy' ?
? 'https://www.google.com/imgres?q=%ED%96%89%EB%B3%B5%ED%95%98%EB%8B%A4&imgurl=https%3A%2F%2Ft3.daumcdn.net%2Fthumb%2FR720x0%2F%3Ffname%3Dhttp%3A%2F%2Ft1.daumcdn.net%2Fbrunch%2Fservice%2Fuser%2F3dGi%2Fimage%2Fyc1Xffp1JIZWlOWYnxdovvca6OU.jpg&imgrefurl=https%3A%2F%2Fbrunch.co.kr%2F%40%403dGi%2F106&docid=Rp20bUePBYex-M&tbnid=_Yl31h6KPXyoqM&vet=12ahUKEwinuI3_176GAxWPg68BHVG1GT8QM3oECEwQAA..i&w=461&h=252&hcb=2&ved='

: 'https://gongu.copyright.or.kr/gongu/wrt/cmmn/wrtFileImageView.do?wrtSn=13213387&filePath=L2Rpc2sxL25ld2RhdGEvMjAxOS8yMS9DTFMxMDAwNC8xMzIxMzM4N19XUlQyMDE5MTAwOF8x&thumbAt=Y&thumbSe=b_tbumb&wrtTy=10004'
);
</script>

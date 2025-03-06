<template>

    <v-data-table
        :headers="headers"
        :items="phoneRequest"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'PhoneRequestView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            phoneRequest : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/phoneRequests'))

            temp.data._embedded.phoneRequests.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.phoneRequest = temp.data._embedded.phoneRequests;
        },
        methods: {
        }
    }
</script>



import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReportWindowManager from "./components/listers/ReportWindowCards"
import ReportWindowDetail from "./components/listers/ReportWindowDetail"

import ReportRequestView from "./components/ReportRequestView"
import ReportRequestViewDetail from "./components/ReportRequestViewDetail"
import LocationServiceManager from "./components/listers/LocationServiceCards"
import LocationServiceDetail from "./components/listers/LocationServiceDetail"

import PhonePhoneManager from "./components/listers/PhonePhoneCards"
import PhonePhoneDetail from "./components/listers/PhonePhoneDetail"

import PhoneRequestView from "./components/PhoneRequestView"
import PhoneRequestViewDetail from "./components/PhoneRequestViewDetail"
import CancellogCancelLogManager from "./components/listers/CancellogCancelLogCards"
import CancellogCancelLogDetail from "./components/listers/CancellogCancelLogDetail"

import EmailEmailManager from "./components/listers/EmailEmailCards"
import EmailEmailDetail from "./components/listers/EmailEmailDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reports/windows',
                name: 'ReportWindowManager',
                component: ReportWindowManager
            },
            {
                path: '/reports/windows/:id',
                name: 'ReportWindowDetail',
                component: ReportWindowDetail
            },

            {
                path: '/reports/reportRequests',
                name: 'ReportRequestView',
                component: ReportRequestView
            },
            {
                path: '/reports/reportRequests/:id',
                name: 'ReportRequestViewDetail',
                component: ReportRequestViewDetail
            },
            {
                path: '/locations/services',
                name: 'LocationServiceManager',
                component: LocationServiceManager
            },
            {
                path: '/locations/services/:id',
                name: 'LocationServiceDetail',
                component: LocationServiceDetail
            },

            {
                path: '/phones/phones',
                name: 'PhonePhoneManager',
                component: PhonePhoneManager
            },
            {
                path: '/phones/phones/:id',
                name: 'PhonePhoneDetail',
                component: PhonePhoneDetail
            },

            {
                path: '/phones/phoneRequests',
                name: 'PhoneRequestView',
                component: PhoneRequestView
            },
            {
                path: '/phones/phoneRequests/:id',
                name: 'PhoneRequestViewDetail',
                component: PhoneRequestViewDetail
            },
            {
                path: '/cancellogs/cancelLogs',
                name: 'CancellogCancelLogManager',
                component: CancellogCancelLogManager
            },
            {
                path: '/cancellogs/cancelLogs/:id',
                name: 'CancellogCancelLogDetail',
                component: CancellogCancelLogDetail
            },

            {
                path: '/emails/emails',
                name: 'EmailEmailManager',
                component: EmailEmailManager
            },
            {
                path: '/emails/emails/:id',
                name: 'EmailEmailDetail',
                component: EmailEmailDetail
            },



    ]
})

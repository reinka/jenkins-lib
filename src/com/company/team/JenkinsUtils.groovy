package com.company.team

import jenkins.model.Jenkins

def getInstance() {
    Jenkins.get()
}

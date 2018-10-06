import './utils/'

import React, { PureComponent } from 'react'
import { AppRegistry } from 'react-native'
import { View } from 'react-native'

class onesignalissue extends PureComponent {


  render() {
    return (
      <View style={{ flex: 1 }}>
        Test Project
      </View>
    )
  }
}

AppRegistry.registerComponent('onesignalissue', () => onesignalissue)

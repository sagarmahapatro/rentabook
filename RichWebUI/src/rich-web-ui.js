import {Component, View} from 'angular2/core';

@Component({
  selector: 'rich-web-ui'
})

@View({
  templateUrl: 'rich-web-ui.html'
})

export class RichWebUi {

  constructor() {
    console.info('RichWebUi Component Mounted Successfully');
  }

}

import {Component, View} from 'angular2/core';
import {bootstrap} from 'angular2/platform/browser';
import {RichWebUi} from 'rich-web-ui';

@Component({
  selector: 'main'
})

@View({
  directives: [RichWebUi],
  template: `
    <rich-web-ui></rich-web-ui>
  `
})

class Main {

}

bootstrap(Main);

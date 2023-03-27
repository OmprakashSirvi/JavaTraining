import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'grid-ui',
  templateUrl: './app.grid.html',
})
export class GridComponent {
  gridCols: Array<any> = new Array<any>();
  gridData: Array<any> = new Array<any>();

  @Input('grid-cols')
  set setGridCols(_gridCols: Array<any>) {
    this.gridCols = _gridCols;
  }

  @Input('grid-data')
  set setGridData(_gridData: Array<any>) {
    this.gridData = _gridData;
  }

  @Output('grid-selected')
  eventEmitter: EventEmitter<Object> = new EventEmitter<Object>();

  selectGrid(_selected: Object) {
    // send the select object to the ui
    // emit out a event
    this.eventEmitter.emit(_selected);
  }
}

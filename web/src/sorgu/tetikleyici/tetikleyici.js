/**
 * Created by bakar on 7/19/2016.
 */

import React, {Component} from 'react';
import {deepOrange500} from 'material-ui/styles/colors';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import TextField from 'material-ui/TextField';
import FloatingActionButton from 'material-ui/FloatingActionButton';
import ContentAdd from 'material-ui/svg-icons/content/add';
import DropDownMenu from 'material-ui/DropDownMenu';
import MenuItem from 'material-ui/MenuItem';
import IconButton from 'material-ui/IconButton';
import EditorBorderColor from 'material-ui/svg-icons/editor/border-color';

const style = {
    marginRight: 20,
};

const styles = {
    container: {
        textAlign: 'center',
        paddingTop: 200,
    },
};

const muiTheme = getMuiTheme({
    palette: {
        accent1Color: deepOrange500,
    },
});

class Tetikleyici extends Component {
    constructor(props, context) {
        super(props, context);

        this.state = {
            isDisabledTetikleyiciAdi:false,
            tetikleyiciAdi:""
        };
        this.handlerTetikleyiciAdiClick = this.handlerTetikleyiciAdiClick.bind(this);
        this.onChangeHandlerTetikleyiciAdi = this.onChangeHandlerTetikleyiciAdi.bind(this);
    }

    onChangeHandlerTetikleyiciAdi(e){
        this.setState({
            tetikleyiciAdi : e.target.value
        });
    }
    handlerTetikleyiciAdiClick(e){
        this.setState({
            isDisabledTetikleyiciAdi: !(this.state.isDisabledTetikleyiciAdi)
        });
    }


    render() {

        return (

            <MuiThemeProvider muiTheme={muiTheme}>
                <div style={styles.container}>
                    <TextField ref="tetikleyiciadi"
                               hintText="Tetikleyici Adı"
                               floatingLabelText="Tetikleyici Adı"
                               disabled={this.state.isDisabledTetikleyiciAdi}
                               multiLine={true}
                               value={this.state.tetikleyiciAdi}
                               onChange={this.onChangeHandlerTetikleyiciAdi}
                    />
                    <IconButton tooltip="Düzenle" tooltipPosition="top-right" onClick={this.handlerTetikleyiciAdiClick}>
                        <EditorBorderColor />
                    </IconButton>
                    <br/>
                </div>
            </MuiThemeProvider>
        );
    }
}

export default Tetikleyici;



import React, {Component} from 'react';
import RaisedButton from 'material-ui/RaisedButton';
import Dialog from 'material-ui/Dialog';
import {deepOrange500} from 'material-ui/styles/colors';
import FlatButton from 'material-ui/FlatButton';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import Loading from './loading';

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

class Main extends Component {
    constructor(props, context) {
        super(props, context);

        this.handleRequestClose = this.handleRequestClose.bind(this);
        this.handleTouchTap = this.handleTouchTap.bind(this);

        this.state = {
            open: false,
        };
    }

    handleRequestClose() {
        this.setState({
            open: false,
        });
    }

    handleTouchTap() {
        this.setState({
            open: true,
        });
    }

    render() {
        const standardActions = (
            <FlatButton
                label="Close"
                primary={true}
                onTouchTap={this.handleRequestClose}
            />
        );

        return (
            <MuiThemeProvider muiTheme={muiTheme}>
                <div style={styles.container}>
                    <Dialog
                        open={this.state.open}
                        actions={standardActions}
                        onRequestClose={this.handleRequestClose}
                    >
                        Hello World!!
                    </Dialog>
                    <h1>Watcher</h1>
                    <h2>click below!</h2>
                    <RaisedButton
                        label="another try"
                        secondary={true}
                        onTouchTap={this.handleTouchTap}
                    />
                </div>
            </MuiThemeProvider>
        );
    }
}

export default Main;

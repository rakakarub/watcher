import React, {Component} from 'react';
import {deepOrange500} from 'material-ui/styles/colors';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import CircularProgress from 'material-ui/CircularProgress';


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

export default class Loading extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            completed: 0,
        };
    }

    componentDidMount() {
        this.timer = setTimeout(() => this.progress(5), 20);
    }

    componentWillUnmount() {
        clearTimeout(this.timer);
    }

    progress(completed) {
        if (completed > 100) {
            this.setState({completed: 100});
        } else {
            this.setState({completed});
            const diff = Math.random() * 10;
            this.timer = setTimeout(() => this.progress(completed + diff), 20);
        }
    }

    render() {
        return (
            <MuiThemeProvider muiTheme={muiTheme}>
            <div>
                <CircularProgress mode="determinate" value={this.state.completed} size={2} />
            </div>
            </MuiThemeProvider>
        );
    }
}
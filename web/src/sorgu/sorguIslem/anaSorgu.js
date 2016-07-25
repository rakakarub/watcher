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

//TODO anasorgu unmounted gozukuyor

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

class AnaSorgu extends Component {
    constructor(props, context) {
        super(props, context);

        this.state = {
            isNew : false,//yeni kullanıcı mı ekleniyor
            isComboBox :false, // yoksa varolan mı seçiliyor
            userName : "", //Deneme amaçlı username
            userNames: [], // Only Usernames //DropDown
            dropDownNames: [], // <MenuItem ... //DropDown
            errorText : "",
            anaSorgu : "",
            aciklama : "",
            currentUser: "", //DropDown
            menuKey: 0 ,     //DropDown
            menuIndex: 0,
            isDisabledAciklama : false,
            isDisabledAnaSorgu : false,
            isMounted : false
        };
        this.handleUserAdd = this.handleUserAdd.bind(this);
        this.onChangeHandler = this.onChangeHandler.bind(this);
        this.handleDropDownChange = this.handleDropDownChange.bind(this);
        this.onChangeHandlerAciklama = this.onChangeHandlerAciklama.bind(this);
        this.onChangeHandlerAnaSorgu = this.onChangeHandlerAnaSorgu.bind(this);
        this.handleAciklamaClick = this.handleAciklamaClick.bind(this);
        this.handleSorguDuzenleClick = this.handleSorguDuzenleClick.bind(this);
    }
    /*componentDidMount(){
     this.setState({
     isMounted : true
     });
     }*/
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
    handleUserAdd(e){
        var _name = this.state.userName.trim();
        if(_name.length<2){
            this.setState({
                errorText : "Hatalı Kullanıcı Adı"
            });
        }
        else{ // TO DO aynı isimde kullanıcı eklenmemeli
            if(this.state.userNames.indexOf(_name) !== -1){
                this.setState({
                    errorText:"Bu kullanıcı adı önceden alınmış."
                });
            }
            else {
                this.state.userNames.push(_name);
                this.state.dropDownNames.push(<MenuItem value={this.state.menuKey} key={this.state.menuKey}
                                                        primaryText={_name}/>);
                this.setState({
                    userName: _name,
                    errorText: "",
                    userNames: this.state.userNames,
                    dropDownNames: this.state.dropDownNames,
                    menuKey: this.state.menuKey + 1
                });
            }
        }
    }

    handleDropDownChange(event,index,CurrentUser ) {
        this.setState({
            currentUser: this.state.userNames[index],
            menuIndex: index
        });
    }
    onChangeHandler(e){

        this.setState({
            userName : e.target.value
        });
    }
    onChangeHandlerAnaSorgu(e){
        this.setState({
            anaSorgu : e.target.value
        });
    }
    handleSorguDuzenleClick(e){
        // if(this.state.isMounted === true) {
        this.setState({
            isDisabledAnaSorgu: !(this.state.isDisabledAnaSorgu)
        });
        // }
    }
    onChangeHandlerAciklama(e){

        this.setState({
            aciklama : e.target.value
        });
    }
    handleAciklamaClick(e){
        this.setState({
            isDisabledAciklama: !(this.state.isDisabledAciklama)
        });
    }

    render() {

        return (

            <MuiThemeProvider muiTheme={muiTheme}>
                <div style={styles.container}>
                    <TextField ref="username"
                               hintText="Sorgu İsmi"
                               floatingLabelText="Yeni Sorgu"
                               value={this.state.userName}
                               onChange={this.onChangeHandler}
                               errorText={this.state.errorText}
                    />
                    <FloatingActionButton mini={true} style={style} onClick = {this.handleUserAdd}>
                        <ContentAdd />
                    </FloatingActionButton>
                    <br />
                    <DropDownMenu maxHeight={300} value={this.state.menuIndex} onChange={this.handleDropDownChange}>
                        {this.state.dropDownNames}
                    </DropDownMenu>
                    <br/>
                    <TextField ref="aciklama"
                               hintText="Aciklama"
                               floatingLabelText="Açıklama(Opsiyonel)"
                               disabled={this.state.isDisabledAciklama}
                               multiLine={true}
                               value={this.state.aciklama}
                               onChange={this.onChangeHandlerAciklama}
                    />
                    <IconButton tooltip="Düzenle" tooltipPosition="top-right" onClick={this.handleAciklamaClick}>
                        <EditorBorderColor />
                    </IconButton>
                    <br/>
                    <TextField ref="anaSorgu"
                               hintText="Ana Sorgu"
                               floatingLabelText={`${this.state.currentUser} Sorgusu`}
                               disabled={this.state.isDisabledAnaSorgu}
                               multiLine={true}
                               value={this.state.anaSorgu}
                               onChange={this.onChangeHandlerAnaSorgu}

                    />
                    <IconButton tooltip="Düzenle" tooltipPosition="top-right" onClick={this.handleSorguDuzenleClick}>
                        <EditorBorderColor />
                    </IconButton>
                    <br/>
                    <h1>{this.state.menuIndex}</h1>
                </div>
            </MuiThemeProvider>
        );
    }
}

export default AnaSorgu;

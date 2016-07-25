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
import Checkbox from 'material-ui/Checkbox';
import Paper from 'material-ui/Paper';
import {RadioButton, RadioButtonGroup} from 'material-ui/RadioButton';
import Chip from 'material-ui/Chip';
import AvLibraryAdd from 'material-ui/svg-icons/av/library-add';
import Dialog from 'material-ui/Dialog';
import FlatButton from 'material-ui/FlatButton';






const paperStyle = {
    height: 180,
    width: 150,
    margin: 20,
    textAlign: 'center',
    display: 'inline-block',
};
const style = {
    marginRight: 20,
};

const styles = {
    block: {
        maxWidth: 250,
    },
    checkbox: {
        marginBottom: 16,
    },
    radioButton: {
        marginBottom: 16,
    },chip: {
        margin: 4,
    },
    wrapper: {
        display: 'flex',
        flexWrap: 'wrap',
    }
};

const muiTheme = getMuiTheme({
    palette: {
        accent1Color: deepOrange500,
    },
});

class Bildirim extends Component {
    constructor(props, context) {
        super(props, context);

        this.state = {
            isEmailSelected : false,
            isSMSSelected : false,
            emailEktipi : 0, // 0:Hiçbiri, 1: Excel, 2:PDF
            aliciSayisi : 0,
            isOpenEklemeEkrani : false,
            tmpAlici : '',
            alicilar : [],
            emailMetni : '',
            smsMetni : '',
            mesajKalanKarakter : 160,
            mesajSayisi:1,

        };

        this.handleExcelButtonOnChange = this.handleExcelButtonOnChange.bind(this);
        this.handlePDFButtonOnChange = this.handlePDFButtonOnChange.bind(this);
        this.handleHicbiriButtonOnChange = this.handleHicbiriButtonOnChange.bind(this);
        this.handleEmailOnCheck = this.handleEmailOnCheck.bind(this);
        this.handleSMSOnCheck = this.handleSMSOnCheck.bind(this);
        this.handleOpen = this.handleOpen.bind(this);
        this.handleClose = this.handleClose.bind(this);
        this.handleAliciSil = this.handleAliciSil.bind(this);
        this.renderAlicilar = this.renderAlicilar.bind(this);
        this.handleAliciEkle = this.handleAliciEkle.bind(this);
        this.handleAliciOnChange = this.handleAliciOnChange.bind(this);
        this.handleEmailMetniOnChange = this.handleEmailMetniOnChange.bind(this);
        this.handleSMSMetniOnChange = this.handleSMSMetniOnChange.bind(this);
    }
    handleOpen(){
        this.setState({isOpenEklemeEkrani: true});
    }

    handleClose(){
        this.setState({isOpenEklemeEkrani: false});
    }


    handleExcelButtonOnChange(e){ //TODO method yapısı farklı

    }

    handlePDFButtonOnChange(e){ //TODO method yapısı farklı

    }

    handleHicbiriButtonOnChange(e){ //TODO method yapısı farklı

    }

    handleEmailOnCheck(e){ //TODO method yapısı farklı
        this.setState({
            isEmailSelected : e.target.checked
        });
    }
    handleSMSOnCheck(e){ //TODO method yapısı farklı
        this.setState({
            isSMSSelected:e.target.checked
        });
    }

    handleAliciSil(key){

        var _alicilar = this.state.alicilar;
        const silinecekAlici = _alicilar.map((alici) => alici.key).indexOf(key);
        _alicilar.splice(silinecekAlici, 1);
        this.setState({alicilar: this.state.alicilar});

    }
    renderAlicilar(data){
        return(
            <Chip
                key={data.key}
                onRequestDelete={() => this.handleAliciSil(data.key)}
                style={styles.chip}
            >
                {data.label}
            </Chip>
        );
    }

    handleAliciEkle(e){
        var _tmpNumber = this.state.aliciSayisi;
        var _tmpAlici = this.state.tmpAlici;
        var tmp = {key: _tmpNumber, label:_tmpAlici};
        this.state.alicilar.push(tmp);
        this.setState({
            isOpenEklemeEkrani: false,
            alicilar : this.state.alicilar,
            aliciSayisi : this.state.aliciSayisi+1,
            tmpAlici : ''
        });


    }
    handleAliciOnChange(e){

        this.setState({
            tmpAlici : e.target.value
        });
    }
    handleEmailMetniOnChange(e){

        this.setState({
           emailMetni : e.target.value
        });
    }

    handleSMSMetniOnChange(e){
        var len = e.target.value.length;
        var tmp = 1;
        this.state.mesajKalanKarakter = 160- (len%160);
        if(len >160){ // mesaj sayisi artıyor
            var bolum = len/160;
            bolum = parseInt(bolum);
            tmp = tmp+bolum;
            this.state.mesajSayisi = tmp;
            tmp = 1;
        }
        else if(len <= 160)this.state.mesajSayisi = 1;

        this.setState({
            smsMetni : e.target.value,
            mesajSayisi : this.state.mesajSayisi,
            mesajKalanKarakter : this.state.mesajKalanKarakter
        });
    }
    render() {
        const actions = [
            <FlatButton
                label="İptal"
                primary={true}
                onTouchTap={this.handleClose}
            />,
            <FlatButton
                label="Ekle"
                primary={true}
                onTouchTap={this.handleAliciEkle}
            />,
        ];

        return (

            <MuiThemeProvider muiTheme={muiTheme}>
                <div style={styles.block}>
                    <div>
                    <h4>Bildirim Yöntemi:</h4>
                    <Paper style={paperStyle}>
                        <br/>
                    <Checkbox
                        label="Watcher"
                        checked = {true}
                        disabled = {true}
                        style={styles.checkbox}
                    />
                    <br />
                    <Checkbox
                        label="E-mail"
                        checked = {this.state.isEmailSelected}
                        style={styles.checkbox}
                        onCheck = {this.handleEmailOnCheck}
                    />
                    <br />
                    <Checkbox
                        label="SMS"
                        style={styles.checkbox}
                        checked = {this.state.isSMSSelected}
                        onCheck = {this.handleSMSOnCheck}
                    />
                    <br />
                   </Paper>
                        </div>
                    <div>
                    <h4>E-mail Ek Tipi:</h4>
                    <Paper style={paperStyle}>
                        <br/>
                        <RadioButtonGroup name="Email-ek-tipi" defaultSelected="hiçbiri">
                            <RadioButton
                                value="excel"
                                label="Excel"
                                style={styles.radioButton}
                                disabled = {!this.state.isEmailSelected}
                                onChange = {this.handleExcelButtonOnChange}
                            />
                            <RadioButton
                                value="pdf"
                                label="PDF"
                                style={styles.radioButton}
                                disabled = {!this.state.isEmailSelected}
                                onChange = {this.handlePDFButtonOnChange}
                            />
                            <RadioButton
                                value="hiçbiri"
                                label="Hiçbiri"
                                style={styles.radioButton}
                                disabled = {!this.state.isEmailSelected}
                                onChange = {this.handleHicbiriButtonOnChange}
                            />
                            </RadioButtonGroup>
                    </Paper>
                        </div>
                    <div style={styles.wrapper}>
                        {this.state.alicilar.map(this.renderAlicilar, this)}
                        <IconButton tooltip="Alıcı Ekle" tooltipPosition="top-right" onClick={this.handleOpen}>
                            <AvLibraryAdd />
                            <Dialog
                                title="Alıcı Ekle"
                                actions={actions}
                                modal={true}
                                open={this.state.isOpenEklemeEkrani}
                            >
                                <TextField ref="alici"
                                           hintText="Alıcı"
                                           floatingLabelText="Alıcı"
                                           value={this.state.tmpAlici}
                                           onChange={this.handleAliciOnChange}
                                />
                            </Dialog>
                        </IconButton>
                    </div>
                    <TextField
                        hintText="E-mail Metni"
                        floatingLabelText = "E-mail Metni"
                        disabled = {!this.state.isEmailSelected}
                        multiLine = {true}
                        value = {this.state.emailMetni}
                        onChange = {this.handleEmailMetniOnChange}
                    />
                    <br />
                    <TextField
                        hintText="Sms Metni"
                        floatingLabelText = "SMS Metni"
                        disabled = {!this.state.isSMSSelected}
                        multiLine = {true}
                        value = {this.state.smsMetni}
                        onChange = {this.handleSMSMetniOnChange}
                    />
                    <h3>Tahmini Mesaj Sayısı : {this.state.mesajSayisi}</h3>
                    <h3>Kalan Karakter Sayısı : {this.state.mesajKalanKarakter}</h3>
                </div>
            </MuiThemeProvider>
        );
    }
}

export default Bildirim;


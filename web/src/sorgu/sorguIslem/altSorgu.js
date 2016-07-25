/**
 * Created by bakar on 7/19/2016.
 */

import React, {Component} from 'react';
import {deepOrange500} from 'material-ui/styles/colors';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import TextField from 'material-ui/TextField';
import IconButton from 'material-ui/IconButton';
import EditorBorderColor from 'material-ui/svg-icons/editor/border-color';
import AvLibraryAdd from 'material-ui/svg-icons/av/library-add';
import ActionSpellCheck from 'material-ui/svg-icons/action/spellcheck'
import ActionDelete from 'material-ui/svg-icons/action/delete'


const styles = {
    container: {
        textAlign: 'center',
        paddingTop: 200
    }
};

const muiTheme = getMuiTheme({
    palette: {
        accent1Color: deepOrange500
    }
});

class AltSorgu extends Component {
    constructor(props, context) {
        super(props, context);

        this.state = {
            altSorguSayisi: 1,
            isDisabledAltSorgu: true,
            altSorgu: '', ///tmp alt sorgu
            altSorgular: [],
            altSorguHTML: [],
            isDisabledAltSorgular : [],
            deneme:""
        };
        this.handleAltSorguEkle = this.handleAltSorguEkle.bind(this);
        this.onChangeHandlerAltSorgu = this.onChangeHandlerAltSorgu.bind(this);
        this.handleAltSorguDuzenleClick = this.handleAltSorguDuzenleClick.bind(this);
    }

    onChangeHandlerAltSorgu(e) {
        this.setState({
           altSorgu : e.target.value
        });
    }

    handleSorguDuzenleClick(e) {
        // if(this.state.isMounted === true) {
        this.setState({
            isDisabledAnaSorgu: !(this.state.isDisabledAnaSorgu)
        });
        // }
    }

    handleAltSorguEkle(e) {
        var index = this.state.altSorguSayisi;
        this.state.isDisabledAltSorgular.push(true);
        this.setState({
            isDisabledAltSorgular: this.state.isDisabledAltSorgular
        });
        this.state.altSorguHTML.push(<div id={index} key={index}><TextField hintText="Alt Sorgu"
                                                     key={index}
                                                     floatingLabelText="Alt Sorgu"
                                                     disabled={this.state.isDisabledAltSorgular[index-1]}
                                                     multiLine={true}
                                                     value={this.state.altSorgu[index-1]}
                                                     onChange={this.onChangeHandlerAltSorgu}/>
                                                    <IconButton id={index} tooltip="Düzenle" tooltipPosition="top-right" onClick={this.handleAltSorguDuzenleClick.bind(this,index)}>
                                                        <EditorBorderColor />
                                                    </IconButton>
                                                    <IconButton id={index} tooltip="Doğrula" tooltipPosition="top-right" onClick={this.handleAltSorguDogrulaClick.bind(this,index)}>
                                                        <ActionSpellCheck />
                                                    </IconButton>
                                                    <IconButton id={index} tooltip="Sorguyu Sil" tooltipPosition="top-right" onClick={this.handleAltSorguSilClick.bind(this,index)}>
                                                        <ActionDelete />
                                                    </IconButton>
            <br /></div>);

        this.setState({
            altSorguHTML: this.state.altSorguHTML,
            altSorguSayisi: (this.state.altSorguSayisi + 1),
            isDisabledAltSorgular: this.state.isDisabledAltSorgular
        })
    }
    handleAltSorguDuzenleClick(index){ //TODO daha duzgun bir cozum gerekli, kullanilan yontem gecici
            var value = this.state.isDisabledAltSorgular[index-1];
            var result = false;
            var tmp = this.state.isDisabledAltSorgular.slice();
            if(value === true){
                this.state.altSorguHTML[index-1] =<div id={index} key={index}><TextField hintText="Alt Sorgu"
                                                                                    key={index}
                                                                                    floatingLabelText="Alt Sorgu"
                                                                                    disabled={result}
                                                                                    multiLine={true}
                                                                                    value={this.state.altSorgu[index-1]}
                                                                                    onChange={this.onChangeHandlerAltSorgu}/>
                    <IconButton id={index} tooltip="Düzenle" tooltipPosition="top-right" onClick={this.handleAltSorguDuzenleClick.bind(this,index)}>
                        <EditorBorderColor />
                    </IconButton>
                    <IconButton id={index} tooltip="Doğrula" tooltipPosition="top-right" onClick={this.handleAltSorguDogrulaClick.bind(this,index)}>
                        <ActionSpellCheck />
                    </IconButton>
                    <IconButton id={index} tooltip="Sorguyu Sil" tooltipPosition="top-right" onClick={this.handleAltSorguSilClick.bind(this,index)}>
                        <ActionDelete />
                    </IconButton>
                    <br /></div>;
                tmp[index-1] = false;
                this.setState({
                    isDisabledAltSorgular:tmp,
                    altSorguHTML:this.state.altSorguHTML,
                    deneme:this.state.isDisabledAltSorgular[index-1]
                });
            }else{
                result = true;
                this.state.altSorguHTML[index-1] =<div id={index} key={index}><TextField hintText="Alt Sorgu"
                                                                                     key={index}
                                                                                     floatingLabelText="Alt Sorgu"
                                                                                     disabled={result}
                                                                                     multiLine={true}
                                                                                     value={this.state.altSorgu[index-1]}
                                                                                     onChange={this.onChangeHandlerAltSorgu}/>
                    <IconButton id={index} tooltip="Düzenle" tooltipPosition="top-right" onClick={this.handleAltSorguDuzenleClick.bind(this,index)}>
                        <EditorBorderColor />
                    </IconButton>
                    <IconButton id={index} tooltip="Doğrula" tooltipPosition="top-right" onClick={this.handleAltSorguDogrulaClick.bind(this,index)}>
                        <ActionSpellCheck />
                    </IconButton>
                    <IconButton id={index} tooltip="Sorguyu Sil" tooltipPosition="top-right" onClick={this.handleAltSorguSilClick.bind(this,index)}>
                        <ActionDelete />
                    </IconButton>
                    <br /></div>;
                tmp[index-1] = true;
                this.setState({
                    isDisabledAltSorgular:tmp,
                    altSorguHTML:this.state.altSorguHTML,
                    deneme:this.state.isDisabledAltSorgular[index-1]
                });
            }
    }

    handleAltSorguDogrulaClick(e){ //TODO

    }

    handleAltSorguSilClick(index){  //TODO

        this.state.altSorgular[index-1] = '';
        this.state.altSorguHTML[index-1] = '';
        this.setState({
            altSorgular : this.state.altSorgular,
            altSorguHTML : this.state.altSorguHTML
        })
    }

    render() {

        return (

            <MuiThemeProvider muiTheme={muiTheme}>
                <div style={styles.container}>
                    <IconButton tooltip="Alt Sorgu Ekle" tooltipPosition="top-center" onClick={this.handleAltSorguEkle}>
                        <AvLibraryAdd />
                    </IconButton>
                    <br/>
                    {this.state.altSorguHTML}
                    <IconButton tooltip="Düzenle" tooltipPosition="top-right" onClick={this.handleSorguDuzenleClick}>
                        <EditorBorderColor />
                    </IconButton>
                    <br/>
                    <h1>{this.state.altSorguSayisi}</h1>
                    <h2>{`${this.state.deneme}. Alt Sorgu`}</h2>
                </div>
            </MuiThemeProvider>
        );
    }
}

export default AltSorgu;

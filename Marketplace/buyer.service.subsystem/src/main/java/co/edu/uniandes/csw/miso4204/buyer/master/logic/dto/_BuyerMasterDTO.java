/* ========================================================================
 * Copyright 2014 miso4204
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 miso4204

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.qualifier

*/

package co.edu.uniandes.csw.miso4204.buyer.master.logic.dto;

import co.edu.uniandes.csw.miso4204.creditcard.logic.dto.CreditCardDTO;
import co.edu.uniandes.csw.miso4204.address.logic.dto.AddressDTO;
import co.edu.uniandes.csw.miso4204.buyer.logic.dto.BuyerDTO;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public abstract class _BuyerMasterDTO {

 
    protected BuyerDTO buyerEntity;
    protected Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public BuyerDTO getBuyerEntity() {
        return buyerEntity;
    }

    public void setBuyerEntity(BuyerDTO buyerEntity) {
        this.buyerEntity = buyerEntity;
    }
    
    public List<CreditCardDTO> createcreditCard;
    public List<CreditCardDTO> updatecreditCard;
    public List<CreditCardDTO> deletecreditCard;
    public List<CreditCardDTO> listcreditCard;	
    public List<AddressDTO> createaddress;
    public List<AddressDTO> updateaddress;
    public List<AddressDTO> deleteaddress;
    public List<AddressDTO> listaddress;	
	
	
	
    public List<CreditCardDTO> getCreatecreditCard(){ return createcreditCard; };
    public void setCreatecreditCard(List<CreditCardDTO> createcreditCard){ this.createcreditCard=createcreditCard; };
    public List<CreditCardDTO> getUpdatecreditCard(){ return updatecreditCard; };
    public void setUpdatecreditCard(List<CreditCardDTO> updatecreditCard){ this.updatecreditCard=updatecreditCard; };
    public List<CreditCardDTO> getDeletecreditCard(){ return deletecreditCard; };
    public void setDeletecreditCard(List<CreditCardDTO> deletecreditCard){ this.deletecreditCard=deletecreditCard; };
    public List<CreditCardDTO> getListcreditCard(){ return listcreditCard; };
    public void setListcreditCard(List<CreditCardDTO> listcreditCard){ this.listcreditCard=listcreditCard; };	
    public List<AddressDTO> getCreateaddress(){ return createaddress; };
    public void setCreateaddress(List<AddressDTO> createaddress){ this.createaddress=createaddress; };
    public List<AddressDTO> getUpdateaddress(){ return updateaddress; };
    public void setUpdateaddress(List<AddressDTO> updateaddress){ this.updateaddress=updateaddress; };
    public List<AddressDTO> getDeleteaddress(){ return deleteaddress; };
    public void setDeleteaddress(List<AddressDTO> deleteaddress){ this.deleteaddress=deleteaddress; };
    public List<AddressDTO> getListaddress(){ return listaddress; };
    public void setListaddress(List<AddressDTO> listaddress){ this.listaddress=listaddress; };	
	
	
}

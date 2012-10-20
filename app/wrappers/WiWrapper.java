/**
 * Copyright 2012 Winflow Financial Group Corporation.
 *      http://www.winflowfinancial.com
 */
package wrappers;

import com.ib.client.*;

/**
 * @author Jatinder Singh on 2012-10-20 at 12:08 PM
 */
public class WiWrapper implements EWrapper {
    @Override
    public void tickPrice(int i, int i1, double v, int i2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void tickSize(int i, int i1, int i2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void tickOptionComputation(int i, int i1, double v, double v1, double v2, double v3, double v4, double v5, double v6, double v7) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void tickGeneric(int i, int i1, double v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void tickString(int i, int i1, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void tickEFP(int i, int i1, double v, String s, double v1, int i2, String s1, double v2, double v3) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void orderStatus(int i, String s, int i1, int i2, double v, int i3, int i4, double v1, int i5, String s1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void openOrder(int i, Contract contract, Order order, OrderState orderState) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void openOrderEnd() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateAccountValue(String s, String s1, String s2, String s3) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updatePortfolio(Contract contract, int i, double v, double v1, double v2, double v3, double v4, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateAccountTime(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void accountDownloadEnd(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void nextValidId(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void contractDetails(int i, ContractDetails contractDetails) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void bondContractDetails(int i, ContractDetails contractDetails) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void contractDetailsEnd(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void execDetails(int i, Contract contract, Execution execution) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void execDetailsEnd(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateMktDepth(int i, int i1, int i2, int i3, double v, int i4) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateMktDepthL2(int i, int i1, String s, int i2, int i3, double v, int i4) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateNewsBulletin(int i, int i1, String s, String s1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void managedAccounts(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void receiveFA(int i, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void historicalData(int i, String s, double v, double v1, double v2, double v3, int i1, int i2, double v4, boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void scannerParameters(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void scannerData(int i, int i1, ContractDetails contractDetails, String s, String s1, String s2, String s3) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void scannerDataEnd(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void realtimeBar(int i, long l, double v, double v1, double v2, double v3, long l1, double v4, int i1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void currentTime(long l) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void fundamentalData(int i, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deltaNeutralValidation(int i, UnderComp underComp) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void tickSnapshotEnd(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void marketDataType(int i, int i1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void commissionReport(CommissionReport commissionReport) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void error(Exception e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void error(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void error(int i, int i1, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void connectionClosed() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

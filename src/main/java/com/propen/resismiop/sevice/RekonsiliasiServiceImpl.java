package com.propen.resismiop.sevice;

import com.propen.resismiop.model.DataTransaksiModel;
import com.propen.resismiop.model.NOPModel;
import com.propen.resismiop.repository.DataTransaksiDb;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RekonsiliasiServiceImpl implements RekonsiliasiService {
    @Autowired
    private DataTransaksiDb dataTransaksiDb;

    public List<NOPModel> listPermasalahan;

    @Override
    public Boolean rekonsilias(Long nomorTransaksiBank, Long nomorTransaksiBapenda) {
        List<DataTransaksiModel> dataBank = dataTransaksiDb.findByNomorTransaksi(nomorTransaksiBank);
        List<DataTransaksiModel> dataBapenda = dataTransaksiDb.findByNomorTransaksi(nomorTransaksiBapenda);
        boolean flag = true;
        if(dataBank.size() == dataBapenda.size()){
            for(int i=0; i<dataBank.size();i++){
                if (dataBank.get(i).getDenda() != dataBapenda.get(i).getDenda() && dataBank.get(i).getJumlahSetoran() == dataBapenda.get(i).getJumlahSetoran()
                        || dataBank.get(i).getJumlahSetoran() != dataBapenda.get(i).getJumlahSetoran() && dataBank.get(i).getDenda() == dataBapenda.get(i).getDenda()
                        || dataBank.get(i).getJumlahSetoran() != dataBapenda.get(i).getJumlahSetoran() && dataBank.get(i).getDenda() != dataBapenda.get(i).getDenda()){
                    listPermasalahan.add(dataBank.get(i).getNop());
                    flag= false;
                }
            }
        }
        if(dataBank.size() != dataBapenda.size()) {
            if(dataBank.size() > dataBapenda.size()){
                for (int i = dataBapenda.size()-1 ; i< dataBank.size(); i++){
                    listPermasalahan.add(dataBank.get(i).getNop());
                }
            }
            if(dataBank.size() < dataBapenda.size()){
                for (int i = dataBank.size()-1 ; i< dataBapenda.size(); i++){
                    listPermasalahan.add(dataBapenda.get(i).getNop());
                }
            }
            flag = false;
        }
        return flag;
    }

}

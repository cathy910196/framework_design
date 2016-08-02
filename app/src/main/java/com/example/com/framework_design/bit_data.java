package com.example.com.framework_design;

/**
 * Created by KouxuanNB on 2016/7/27.
 */
public class bit_data {

        private int bed_number;
        private String patient_name;
        private String bit_components;
        private String doctor_name;
        public bit_data(int bed_number, String patient_name, String bit_components,String doctor_name) {
            setBed_number(bed_number);
            setBit_components(bit_components);
            setDoctor_name(doctor_name);
            setPatient_name(patient_name);
        }
        public int getBed_number(){
            return bed_number;
        }
        public void setBed_number(int bed_number){
            this.bed_number = bed_number;
        }
        public String getPatient_name(){
            return patient_name;
        }
        public void setPatient_name(String patient_name){
            this.patient_name = patient_name;
        }
        public String getBit_components(){
            return bit_components;
        }
        public void setBit_components(String bit_components) {
            this.bit_components = bit_components;
        }
        public String getDoctor_name(){
            return doctor_name;
        }
        public void setDoctor_name(String doctor_name) {
            this.doctor_name = doctor_name;
        }

}

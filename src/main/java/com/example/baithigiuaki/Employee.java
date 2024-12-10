package com.example.baithigiuaki;

public class Employee {
        private int id;
        private String hoTen;
        private String tuoi;
        private String viTri;
        private String phongBan;
        private double luong;

        public Employee( int id, String hoTen, String tuoi, String viTri, String phongBan, double luong ) {
            this.id = id;
            this.hoTen = hoTen;
            this.tuoi = tuoi;
            this.viTri = viTri;
            this.phongBan = phongBan;
            this.luong = luong;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getLuong() {
            return luong;
        }

        public void setLuong(double luong) {
            this.luong = luong;
        }

        public String getPhongBan() {
            return phongBan;
        }

        public void setPhongBan(String phongBan) {
            this.phongBan = phongBan;
        }

        public String getViTri() {
            return viTri;
        }

        public void setViTri(String viTri) {
            this.viTri = viTri;
        }

        public String getTuoi() {
            return tuoi;
        }

        public void setTuoi(String tuoi) {
            this.tuoi = tuoi;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", hoTen='" + hoTen + '\'' +
                    ", tuoi=" + tuoi +
                    ", viTri='" + viTri + '\'' +
                    ", phongBan='" + phongBan + '\'' +
                    ", luong=" + luong +
                    '}';
        }


}



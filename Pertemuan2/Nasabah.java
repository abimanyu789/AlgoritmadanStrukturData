package Praktikum.Pertemuan2;

public class Nasabah {
    //Program untuk no1&2
    /*
    public String nama,alamat;
    public int id,noHP,noRek,saldo;
    public float jmlHutang;
    public boolean statusAktif;

    public Nasabah(String nama, String alamat, int id) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.noRek = (int)(Math.random() * 1000000); 
        this.saldo = 0; 
        this.jmlHutang = 0; 
        this.statusAktif = false; 
    }

    public int lihatSaldo() {
        return saldo;
    }

    public int menabung(int deposit) {
        if (!statusAktif) {
            if (deposit > 0) {
                saldo += deposit;
                return saldo;
            } else {
                System.out.println("Jumlah yang dimasukkan harus lebih dari 0.");
            }
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
        return -1; 
    }

    public int tarikTunai(int jmlTarik) {
        if (!statusAktif) {
            if (saldo >= jmlTarik) {
                saldo -= jmlTarik;
                return saldo;
            } else {
                System.out.println("Saldo tidak mencukupi untuk melakukan penarikan.");
            }
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
        return -1; 
    }

    public void bukaRekening() {
        if (!statusAktif) {
            this.saldo = 0; 
            this.statusAktif = true;
            System.out.println("Rekening berhasil dibuka. Nomor rekening Anda: " + noRek);
        } else {
            System.out.println("Anda sudah memiliki rekening aktif.");
        }
    }

    public void tutupRekening() {
        if (!statusAktif) {
            this.noRek = 0;
            this.saldo = 0;
            this.statusAktif = false;
            System.out.println("Rekening berhasil ditutup.");
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
    }

    public void berhutang(float jmlHutang) {
        if (!statusAktif) {
            if (jmlHutang >= saldo) {
                System.out.println("Ajuan peminjaman ditolak. Jumlah hutang melebihi saldo.");
            } else {
                this.jmlHutang = jmlHutang;
                float cicilanPerBulan = (float) jmlHutang / 6;
                System.out.println("Pinjaman disetujui.");
                System.out.println("Simulasi skema cicilan per bulan: " + cicilanPerBulan);
            }
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
    }
    public int getNoRek() {
        return noRek;
    }
    */

    private int id,noHP;
    private String nama,alamat;
    private int[] noRek;
    private int[] saldo;
    private float jmlHutang;
    private boolean statusAktif;

    public Nasabah(String nama, String alamat, int id) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = 0;
        this.noRek = new int[5];
        this.saldo = new int[5];
        this.jmlHutang = 0;
        this.statusAktif = false;
    }

    public int lihatSaldo(int noRek) {
        for (int i = 0; i < this.noRek.length; i++) {
            if (this.noRek[i] == noRek) {
                return saldo[i];
            }
        }
        return -1;
    }

    public int menabung(int noRek, int deposit) {
        if (statusAktif) {
            for (int i = 0; i < this.noRek.length; i++) {
                if (this.noRek[i] == noRek) {
                    if (deposit > 0) {
                        saldo[i] += deposit;
                        return saldo[i];
                    } else {
                        System.out.println("Jumlah yang dimasukkan harus lebih dari 0.");
                        return saldo[i];
                    }
                }
            }
            System.out.println("Nomor rekening tidak ditemukan.");
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
        return -1;
    }

    public int tarikTunai(int noRek, int jmlTarik) {
        if (statusAktif) {
            for (int i = 0; i < this.noRek.length; i++) {
                if (this.noRek[i] == noRek) {
                    if (saldo[i] >= jmlTarik) {
                        saldo[i] -= jmlTarik;
                        return saldo[i];
                    } else {
                        System.out.println("Saldo tidak mencukupi untuk melakukan penarikan.");
                        return saldo[i];
                    }
                }
            }
            System.out.println("Nomor rekening tidak ditemukan.");
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
        return -1;
    }

    public void bukaRekening() {
        if (!statusAktif) {
            for (int i = 0; i < this.noRek.length; i++) {
                if (this.noRek[i] == 0) {
                    this.noRek[i] = (int) (Math.random() * 1000000);
                    this.saldo[i] = 0;
                    this.statusAktif = true;
                    System.out.println("Rekening berhasil dibuka. Nomor rekening Anda: " + this.noRek[i]);
                    return;
                }
            }
            System.out.println("Anda sudah memiliki 5 rekening aktif.");
        } else {
            System.out.println("Anda sudah memiliki rekening aktif.");
        }
    }
    
    public void tutupRekening(int noRek) {
        if (statusAktif) {
            for (int i = 0; i < this.noRek.length; i++) {
                if (this.noRek[i] == noRek) {
                    this.noRek[i] = 0;
                    this.saldo[i] = 0;
                    this.statusAktif = false;
                    System.out.println("Rekening berhasil ditutup.");
                    return;
                }
            }
            System.out.println("Nomor rekening tidak ditemukan.");
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
    }

    public void berhutang(float jmlHutang) {
        if (statusAktif) {
            if (jmlHutang >= saldo[0]) {
                System.out.println("Ajuan peminjaman ditolak. Jumlah hutang melebihi saldo.");
            } else {
                this.jmlHutang = jmlHutang;
                float cicilanPerBulan = (float) jmlHutang / 6;
                System.out.println("Pinjaman disetujui.");
                System.out.println("Simulasi skema cicilan per bulan: " + cicilanPerBulan);
            }
        } else {
            System.out.println("Anda tidak memiliki rekening aktif.");
        }
    }

    public int getNoRek(int index) {
        if (index >= 0 && index < this.noRek.length) {
            return this.noRek[index];
        } else {
            return -1;
        }
    }
}

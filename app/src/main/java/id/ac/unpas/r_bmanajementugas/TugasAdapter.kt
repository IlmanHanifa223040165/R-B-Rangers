package id.ac.unpas.r_bmanajementugas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TugasAdapter(private val listTugas: List<Tugas>) : RecyclerView.Adapter<TugasAdapter.TugasViewHolder>() {

    class TugasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val namaTugas: TextView = itemView.findViewById(R.id.tv_nama_tugas)
        val kategoriTugas: TextView = itemView.findViewById(R.id.tv_kategori_tugas)
        val statusTugas: TextView = itemView.findViewById(R.id.tv_status_tugas)
        val deleteButton: ImageView = itemView.findViewById(R.id.iv_delete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TugasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tugas, parent, false)
        return TugasViewHolder(view)
    }

    override fun onBindViewHolder(holder: TugasViewHolder, position: Int) {
        val tugas = listTugas[position]
        holder.namaTugas.text = tugas.nama
        holder.kategoriTugas.text = tugas.kategori
        holder.statusTugas.text = tugas.status
        // Tambahkan fungsi untuk tombol delete jika diperlukan
        // holder.deleteButton.setOnClickListener { ... }
    }

    override fun getItemCount(): Int {
        return listTugas.size
    }
}
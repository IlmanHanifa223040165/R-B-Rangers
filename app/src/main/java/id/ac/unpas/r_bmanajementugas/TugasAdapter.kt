package id.ac.unpas.r_bmanajementugas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView // <-- TAMBAHKAN INI
import id.ac.unpas.r_bmanajementugas.model.Tugas

class TugasAdapter(
    private var listTugas: List<Tugas>,
    private val onDeleteClick: (Tugas) -> Unit
) : RecyclerView.Adapter<TugasAdapter.TugasViewHolder>() {

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
        holder.namaTugas.text = "Judul: ${tugas.judul}"
        holder.kategoriTugas.text = "Kategori: ${tugas.kategori}"
        holder.statusTugas.text = "Tanggal: ${tugas.tanggal}"

        holder.deleteButton.setOnClickListener {
            onDeleteClick(tugas)
        }
    }

    fun setData(newList: List<Tugas>) {
        listTugas = newList
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return listTugas.size
    }
}

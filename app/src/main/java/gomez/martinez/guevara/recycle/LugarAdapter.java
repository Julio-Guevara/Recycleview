package gomez.martinez.guevara.recycle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class LugarAdapter extends RecyclerView.Adapter<LugarAdapter.ViewHolder>{

    private Context context;
    private ArrayList<Lugar> lugares;

    public LugarAdapter(Context context, ArrayList<Lugar> lugares) {
        this.context = context;
        this.lugares = lugares;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaLugar = LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(vistaLugar);
        vistaLugar.setTag(viewHolder);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvNombre.setText(lugares.get(position).getNombre());
        Picasso.get().load(lugares.get(position).getFoto()).into(holder.ivFondo);

    }

    @Override
    public int getItemCount() {
        return lugares.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivFondo,iv2;
        TextView tvNombre;

        public ViewHolder(View itemView) {
            super(itemView);

            ivFondo = itemView.findViewById(R.id.ivFondo);
            iv2 = itemView.findViewById(R.id.iv2);
            tvNombre = itemView.findViewById(R.id.tvLeyenda);
        }
    }
}

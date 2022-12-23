package Adapter;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.demh.tareavolley.R;

import java.util.List;

import models.Producto;


public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder>{
    private Context Ctx;
    private List<Producto> lstproductos;

    public ProductoAdapter(Context mCtx, List<Producto> productos) {
        this.lstproductos = productos;
        Ctx = mCtx;
    }

    @Override
    public ProductoAdapter.ProductoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.layoutproducto, null);
        return new ProductoAdapter.ProductoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductoAdapter.ProductoViewHolder holder, int position) {
        Producto producto = lstproductos.get(position);

        holder.lblidproducto.setText(producto.getIdproducto());
        holder.lblbarcode.setText(producto.getBarcode());
        holder.lblcosto.setText(producto.getCosto());
        holder.lblprecunidad.setText(producto.getPreciounidad());
        holder.lblprecmayorista.setText(producto.getPreciomayorista());



    }

    @Override
    public int getItemCount() {
        return lstproductos.size();
    }

    class ProductoViewHolder extends RecyclerView.ViewHolder {
        TextView lblidproducto, lblbarcode, lblcosto,lblprecunidad,lblprecmayorista;

        public ProductoViewHolder(View itemView) {
            super(itemView);
            lblidproducto = itemView.findViewById(R.id.lblidproducto);
            lblbarcode = itemView.findViewById(R.id.lblbarcode);
            lblcosto = itemView.findViewById(R.id.lblcosto);
            lblprecunidad = itemView.findViewById(R.id.lblprecunidad);
            lblprecmayorista = itemView.findViewById(R.id.lblprecmayorista);
        }
    }
}

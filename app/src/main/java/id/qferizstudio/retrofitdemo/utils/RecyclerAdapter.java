package id.qferizstudio.retrofitdemo.utils;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import id.qferizstudio.retrofitdemo.R;
import id.qferizstudio.retrofitdemo.model.Contact;

/**
 * Created by Qferiz on 24/05/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Contact> contacts;

    public RecyclerAdapter(List<Contact> contacts) {
        this.contacts = contacts;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(contacts.get(position).getName());
        holder.email.setText(contacts.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView name, email;

        public MyViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.txtName);
            email = (TextView) itemView.findViewById(R.id.txtEmail);
        }
    }
}

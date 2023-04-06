package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class useradabter extends RecyclerView.Adapter<useradabter.useradabterVh> {


    public List<username1> username1List = new ArrayList<>();
    public Context context;
    public UserClickListener userClickListenerser;

    public interface UserClickListener{
        void selectedUser(username1 username1);
    }
    public useradabter(List<username1> usernames1, Context context, UserClickListener userClickListener){
     this.username1List = usernames1;
     this.context = context;
     this.userClickListenerser = userClickListener;
    }



    @NonNull
    @Override
    public useradabterVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.row_user,parent,false);
        return new useradabterVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull useradabterVh holder, int position) {
      username1 username1= username1List.get(position);
      String namadepan = username1.getNamadepan();
      String namabelakang = username1.getNamabelakang();
      String nomorhp = username1.getNomorhp();
      String username = namadepan +" "+namabelakang;
      String prefix = namadepan.charAt(0) +""+ namabelakang.charAt(0);

      holder.nomorhp.setText(nomorhp);
      holder.username.setText(username);
      holder.userprefix.setText(prefix);

      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              userClickListenerser.selectedUser(username1);
          }
      });

    }

    @Override
    public int getItemCount() {
        return username1List.size();
    }

    public static class useradabterVh extends RecyclerView.ViewHolder {

        private TextView username;
        private TextView userprefix;
        private TextView nomorhp;

        public useradabterVh(@NonNull View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.tvusername);
            userprefix = itemView.findViewById(R.id.tvprefix);
            nomorhp = itemView.findViewById(R.id.tvnomorhp);
        }
    }


}

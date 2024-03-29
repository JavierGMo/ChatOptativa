package com.morajavier.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatBoxAdapter extends RecyclerView.Adapter<ChatBoxAdapter.MyViewHolder> {
    private List<Mensaje> MessageList;

    public  class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nickname;
        public TextView message;


        public MyViewHolder(View view) {
            super(view);

            nickname = (TextView) view.findViewById(R.id.nickname);
            message = (TextView) view.findViewById(R.id.message);





        }
    }
// in this adaper constructor we add the list of messages as a parameter so that
// we will passe  it when making an instance of the adapter object in our activity
    ChatBoxAdapter(List<Mensaje> MessagesList) {

    this.MessageList = MessagesList;


    }




    @Override
    public int getItemCount() {
        return MessageList.size();
    }
    @Override
    public ChatBoxAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);



        return new ChatBoxAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ChatBoxAdapter.MyViewHolder holder, final int position) {

        //binding the data from our ArrayList of object to the item.xml using the viewholder



        Mensaje m = MessageList.get(position);
        holder.nickname.setText(m.getNickname());

        holder.message.setText(m.getMessage() );




    }

}

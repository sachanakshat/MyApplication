package com.example.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragNotifs.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragNotifs#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragNotifs extends Fragment {

    RecyclerViewAdapterNotif adapter;

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    private OnFragmentInteractionListener mListener;
//
//    public FragNotifs() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment FragNotifs.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static FragNotifs newInstance(String param1, String param2) {
//        FragNotifs fragment = new FragNotifs();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_notifs, container, false);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        ArrayList<String> oname = new ArrayList<>();
        ArrayList<String> ctime = new ArrayList<>();
        animalNames.add("New photo like");
        oname.add("Alex Xander");
        ctime.add("13:54");
        animalNames.add("New purchase request");
        oname.add("Richard Hobbs");
        ctime.add("12:18");
        animalNames.add("Message Arrived!");
        oname.add("Michael Shaw");
        ctime.add("00:00");
        animalNames.add("Shared your photo");
        oname.add("Tom Cruise");
        ctime.add("18:36");
        animalNames.add("New purchase request");
        oname.add("James Bond");
        ctime.add("6:00");
        animalNames.add("Varuni started following you!");
        oname.add("Varuni Behl");
        ctime.add("17:54");
        animalNames.add("New photo like");
        oname.add("John Wick");
        ctime.add("7:15");
        animalNames.add("Shared your photo");
        oname.add("Michael Jordan");
        ctime.add("9:24");
        animalNames.add("Dileep started following you!");
        oname.add("Dileep Singh");
        ctime.add("14:54");
        animalNames.add("Message Arrived!");
        oname.add("Shawn Mendes");
        ctime.add("12:58");
        animalNames.add("Shared your photo");
        oname.add("Sarah O'Brien");
        ctime.add("13:00");
        animalNames.add("New purchase request");
        oname.add("Daisy Hill");
        ctime.add("15:05");
        animalNames.add("New photo like");
        oname.add("Amanda Dans");
        ctime.add("13:54");
        animalNames.add("Message Arrived!");
        oname.add("Oliver Bayes");
        ctime.add("21:23");
        animalNames.add("Message Arrived!");
        oname.add("Louis Thomson");
        ctime.add("23:23");
        animalNames.add("New purchase request");
        oname.add("Richard Branson");
        ctime.add("05:30");
        animalNames.add("Shared your photo");
        oname.add("Elon Musk");
        ctime.add("03:41");
        animalNames.add("New photo like");
        oname.add("Mark Zuckerberg");
        ctime.add("02:16");
        animalNames.add("New purchase request");
        oname.add("Donald Trump");
        ctime.add("01:23");
        animalNames.add("Shared your photo");
        oname.add("Valadimir Putin");
        ctime.add("01:24");
        animalNames.add("New photo like");
        oname.add("Kim Jong");
        ctime.add("19:00");

        // set up the RecyclerView
        RecyclerView recyclerView = view.findViewById(R.id.rview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new RecyclerViewAdapterNotif(getActivity(), animalNames, oname, ctime);
        //adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

//    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
//    /**
//     * This interface must be implemented by activities that contain this
//     * fragment to allow an interaction in this fragment to be communicated
//     * to the activity and potentially other fragments contained in that
//     * activity.
//     * <p>
//     * See the Android Training lesson <a href=
//     * "http://developer.android.com/training/basics/fragments/communicating.html"
//     * >Communicating with Other Fragments</a> for more information.
//     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}

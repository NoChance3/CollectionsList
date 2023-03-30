package practice;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todolist = new ArrayList<>();
    public void add(String todo) {
       todolist.add(todo);}

    public void add(int index, String todo) {
       if(index<todolist.size() && index >= 0){
           todolist.add(index,todo);}
       else todolist.add(todo);
    }

    public void edit(int index, String todo) {
        if(index<todolist.size())
        todolist.set(index,todo);}

    public void delete(int index) {
        if(index<todolist.size())
        todolist.remove(index);}

    public ArrayList<String> getTodos() {

        return todolist;}

}